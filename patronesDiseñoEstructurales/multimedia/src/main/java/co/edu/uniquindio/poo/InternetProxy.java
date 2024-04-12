package co.edu.uniquindio.poo;

// Proxy para controlar el acceso a InternetReal
class InternetProxy implements Internet {
    private Internet internetReal;

    @Override
    public void conectar(String sitioWeb) {
        // Se crea una instancia de InternetReal solo cuando sea necesario
        if (internetReal == null) {
            internetReal = new InternetReal();
        }
        // Antes de permitir el acceso real, se realiza alguna validación o acción adicional
        System.out.println("Verificando el acceso a " + sitioWeb);
        // Se delega la solicitud al objeto real
        internetReal.conectar(sitioWeb);
    }
}
