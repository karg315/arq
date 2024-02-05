package service;

import modelo.Envio;

public class EmailOutlook {

  void enviarEmail(Envio envio) {
    System.out.println("ESTABLECIENDO CONEXION CON EL SERVIDOR");
    System.out.println("EMAIL ENVIADO y correspondencia " + envio);
  }
}