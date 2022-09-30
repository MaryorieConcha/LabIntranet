public class Alumno {

    private String nombre;

    private String apellido;

    private String rut;

    private int matricula;

    public Alumno (String nombre, String apellido, String rut, int matricula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {return nombre;}

    public String getApellido() {return  apellido;}

    public String getRut() {return rut;}

    @Override
    public String toString() {return (nombre + " " + apellido + ", " + rut);}

}
