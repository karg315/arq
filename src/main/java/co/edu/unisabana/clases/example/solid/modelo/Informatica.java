package modelo;

import java.util.Arrays;
import java.util.List;

public class Informatica implements ICarrera {
    @Override
    public List<String> getMateriales() {
        return Arrays.asList("Computador", "Teclado", "Mouse");
    }

    @Override
    public String getSaludoDirector() {
        return "Jenny envia saludos";
    }

    @Override
    public String getMaterias() {
        return "Programacion, Arquitectura, Base de datos";
    }
}