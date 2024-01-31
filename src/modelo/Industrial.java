package modelo;

import java.util.Arrays;
import java.util.List;

public class Industrial implements ICarrera {
    @Override
    public List<String> getMateriales() {
        return Arrays.asList("Computador", "Graficadora", "Mouse");
    }

    @Override
    public String getSaludoDirector() {
        return "Liliam envia saludos";
    }

    @Override
    public String getMaterias() {
        return "Procesos, Analitica de datos, Gestion de Calidad";
    }
}
