package modelo;

import java.util.List;

public class Envio {

  public List<String> material;
  public String saludoDirector;

  @Override
  public String toString() {
    return "Envio{" +
        "material=" + material +
        ", saludoDirector='" + saludoDirector + '\'' +
        '}';
  }
}
