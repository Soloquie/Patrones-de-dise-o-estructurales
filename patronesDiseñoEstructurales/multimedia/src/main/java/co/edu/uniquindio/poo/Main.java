package co.edu.uniquindio.poo;

// Clase de prueba
public class Main {
    public static void main(String[] args) {
        // Crear un proxy de Internet
        Internet internet = new InternetProxy();

        // Conectar a sitios web utilizando el proxy
        internet.conectar("www.ejemplo.com");
        internet.conectar("www.openai.com");
    }
}   