package modelo;
public class Estudiante {
    public String nombre;
    public ICarrera carrera;

    public Estudiante(String nombre, ICarrera carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }

}
