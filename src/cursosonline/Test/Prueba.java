/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosonline.Test;

import cursosonline.Dao.CursoDao;
import cursosonline.Dao.cursoDaoImp;
import cursosonline.entidades.Curso;

/**
 *
 * @author SafeComputer
 */
public class Prueba {
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Ingresar
        CursoDao  cursoD = new cursoDaoImp();
        Curso cursos=new Curso(0,"ingles V");
        cursoD.ingresar(cursos);
        //Actualizar
        //Curso cursos1=new Curso(3,"marketing digital");
        //cursoD.actualizar(cursos1);
        // Eliminar 
        //Curso cursos2=new Curso(3,"fundamentos de java");
        //cursoD.eliminar(3);
        for (Curso e : cursoD.getCursos()){
            System.out.println(e.getId() + "-" + e.getNombre());
            
    }
    }
}

