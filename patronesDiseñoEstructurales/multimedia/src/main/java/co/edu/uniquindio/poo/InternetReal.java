package co.edu.uniquindio.poo;

// Implementación real de la interfaz Internet
class InternetReal implements Internet {
    @Override
    public void conectar(String sitioWeb) {
        System.out.println("Conectando a " + sitioWeb);
    }
}
