/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosonline.entidades;


public class CursosEstudiantes {
    int id;
    int cursoId;
    int estudianteid;

    public CursosEstudiantes(int id, int cursoId, int estudianteid) {
        this.id = id;
        this.cursoId = cursoId;
        this.estudianteid = estudianteid;
    }
    
    

    public CursosEstudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public int getEstudianteid() {
        return estudianteid;
    }

    public void setEstudianteid(int estudianteid) {
        this.estudianteid = estudianteid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CursosEstudiantes other = (CursosEstudiantes) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.cursoId != other.cursoId) {
            return false;
        }
        if (this.estudianteid != other.estudianteid) {
            return false;
        }
        return true;
    }
    
    public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cursoId;
		result = prime * result + estudianteid;
		result = prime * result + id;
		return result;
	}
    
    @Override
    public String toString() {
		return "cursos_estudiantes [id=" + id + ", cursos_id=" + cursoId + ", esudiantes_id=" + estudianteid + "]";
	}
}
