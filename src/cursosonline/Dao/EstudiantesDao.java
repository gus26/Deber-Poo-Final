/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosonline.Dao;

import cursosonline.entidades.Estudiantes;
import java.util.List;

/**
 *
 * @author SafeComputer
 */
public interface EstudiantesDao {
      List<Estudiantes> getEstudiantes();
    public void ingresarE(Estudiantes estudiantes);

    public void actualizarE(Estudiantes estudiantes);

    public void eliminarE(int id);
}
