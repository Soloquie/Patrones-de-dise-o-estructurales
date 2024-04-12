package co.edu.uniquindio.poo;

// Implementación concreta de la abstracción DispositivoReproduccion
public class Televisor extends DispositivoReproduccion {

    public Televisor(ImplementacionReproduccion implementacion) {
        super(implementacion);
    }

    @Override
    String reproducirContenido() {
        return "Televisor: " + implementacion.reproducir();
    }
    
}
