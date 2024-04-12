package co.edu.uniquindio.poo;

// Implementación concreta de la abstracción DispositivoReproduccion
public class Celular extends DispositivoReproduccion{

    public Celular(ImplementacionReproduccion implementacion) {
        super(implementacion);
    }

    @Override
    String reproducirContenido() {
        return "Celular: " + implementacion.reproducir();
    }

    
}
