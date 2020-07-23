/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosonline.Dao;

import cursosonline.entidades.CursosEstudiantes;
import java.util.List;
import cursosonline.entidades.Estudiantes;

/**
 *
 * @author SafeComputer
 */
public interface CursoEstudianteDao {
    List<CursosEstudiantes> getCursEstudiantes();
    public void ingresarCE(CursosEstudiantes cestudiantes);

    public void actualizarCE(CursosEstudiantes cestudiantes);

    public void eliminarCE(int id);
    
    
}
