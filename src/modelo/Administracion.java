package modelo;

import java.util.Arrays;
import java.util.List;

public class Administracion implements ICarrera {
    @Override
    public List<String> getMateriales() {
        return Arrays.asList("Computador", "Cuaderno", "Mouse");
    }

    @Override
    public String getSaludoDirector() {
        return "Alberto envia saludos";
    }

    @Override
    public String getMaterias() {
        return "Negocios, Administracion I, Historia de la Administracion";
    }
}
