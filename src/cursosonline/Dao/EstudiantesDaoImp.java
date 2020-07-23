/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosonline.Dao;

import ConexionesA.conexion;
import cursosonline.entidades.Curso;
import cursosonline.entidades.Estudiantes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class EstudiantesDaoImp implements EstudiantesDao{
    @Override
    public List<Estudiantes> getEstudiantes() {
        
          List<Estudiantes> estudiante=new ArrayList<>();
       Connection conn;
        try {
           conn = conexion.conector();
           String sql="select id, nombre,apellidos, email from public.estudiantes;";
           PreparedStatement stm= conn.prepareStatement(sql);
           ResultSet rs=stm.executeQuery();
           while(rs.next()){
               Estudiantes estudiantes =new Estudiantes();
               estudiantes.setId(rs.getInt(1));
               estudiantes.setNombre(rs.getString(2));
               estudiantes.setApellido(rs.getString(3));
               estudiantes.setEmail(rs.getString(4));
               estudiante.add(estudiantes);
               

                       }
        
      }catch (SQLException ex) {
            
              ex.printStackTrace();
         }
        return estudiante;
    }

    @Override
    public void ingresarE(Estudiantes estudiantes) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         try {
            conexion conexion = new conexion();
            Connection conn = null;
            conn = conexion.conector();
            String sql = "INSERT INTO  public.estudiantes(nombre, apellidos, email) values (?, ?, ?);";
            PreparedStatement psta = conn.prepareStatement(sql);
            psta.setString(1, estudiantes.getNombre());
            psta.setString(2, estudiantes.getApellido());
            psta.setString(3, estudiantes.getEmail());
            psta.execute();
         
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    
    }

    @Override
    public void actualizarE(Estudiantes estudiantes) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         try {
            conexion conexion = new conexion();
            Connection conn = null;
            conn =conexion.conector();
            String sqlinsertar = "Update  public.estudiantes set email=? where id=?";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setString(1, estudiantes.getEmail());
            psta.setInt(2, estudiantes.getId());
            psta.execute();
            
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    
    }

    @Override
    public void eliminarE(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         try {
            conexion coneccion = new conexion();
            Connection conn = null;
            conn = conexion.conector();
            String sqldelete = "Delete From  public.estudiantes where id=?";
            PreparedStatement psta = conn.prepareStatement(sqldelete);
            psta.setInt(1, id);
            psta.execute();
           // conn.commit();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    
    }

    @Override
    public List<Curso> getCursosPorEstudiante(int estudianteId) {
         String query = "SELECT cursos.id,cursos.nombre\n" +
"	FROM public.cursos\n" +
"	inner join cursos_estudiantes on cursos.id = cursos_estudiantes.curso_id\n" +
"	where estudiante_id=?;";
        List<Curso> cursos = new ArrayList<Curso>();
        Connection conn = null;
        try {
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1, estudianteId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Curso curso = new Curso(rs.getInt(1), rs.getString(2));
                cursos.add(curso);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EstudiantesDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return null;
        
    }

    @Override
    public List<Estudiantes> getEstudiante() {
         String query = "SELECT id, nombres, apellidos, email FROM estudiantes";
        List<Estudiantes> estudiante = new ArrayList<>();
        Connection conn = null;

        try {
           PreparedStatement stm = conn.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Estudiantes estudiant = new Estudiantes(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                estudiante.add(estudiant);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
        
    }
      
}

    

