package co.edu.uniquindio.poo;

// Implementación concreta de la abstracción DispositivoReproduccion
public class Radio extends DispositivoReproduccion {

    public Radio(ImplementacionReproduccion implementacion) {
        super(implementacion);
    }

    @Override
    String reproducirContenido() {
        return "Radio: " + implementacion.reproducir();
    }
    
}
