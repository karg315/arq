package main;

import modelo.Estudiante;
import service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Estudiante("Daniel", "Informatica"),
                new Estudiante("Monica", "Administracion"),
                new Estudiante("Liliana", "Industrial")
        };
        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new Estudiante("Daniel", "Informatica"));
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.carrera.equals("Informatica")) {
                System.out.println("Programacion, Arquitectura, Base de datos");
            }
            if (estudiante.carrera.equals("Administracion")) {
                System.out.println("Negocios, Administracion I, Historia de la Administracion");
            }
            if (estudiante.carrera.equals("Industrial")) {
                System.out.println("Procesos, Analitica de datos, Gestion de Calidad");
            }
        }
    }
}

/* No se cumple la Responsabilidad Unica debido a que EnvioMaterial manejaba el envío de materiales
 * y la lógica para decidir que enviar, la responsabilidad se separa al crear las clases de las 
 * carreras y la interfaz ICarrera.
 * 
 * Tampoco se cumplía el principio de Abierto/Cerrado debido a que si se quería agregar una nueva carrera
 * se tenía que modificar la lógica en la clase de EnvioMaterial, la solución se da con la interfaz ICarrera
 * y que ahora se pueden agregar o eliminar carreras con las implementaciones de ICarrera sin cambiar la 
 * lógica del programa.
 * 
 * Se moficica el atributo de estudiante "carrera" para que pase de String a ICarrera, debido a la interfaz
 * ICarrera y las carreras como sus implementaciones, esto para evitar definir la lógica por carrera en 
 * diferentes partes del programa, se obtiene de forma consistente los datos de la carrera sin importar cual
 * sea la del estudiante, cumpliendo con el principio de sustiución de Liskov.
 * 
 * Se crea la interfaz ICarrera y las carreras como sus implementaciones para que EnvioMaterial siendo
 * categorizado como de bajo nivel, sea quien dependa de las carreras realizando así el principio de inversión
 * de dependencias.
 */