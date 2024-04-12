package co.edu.uniquindio.poo;

// Abstracción para los dispositivos de reproducción
public interface DispositivoReproduccion {

    //se declara un atributo llamado implementacion del tipo ImplementacionReproduccion(almacena referencia)
    protected ImplementacionReproduccion implementacion;
    
    //Constructor
    public DispositivoReproduccion(ImplementacionReproduccion implementacion) {   //<--inicializa atributo
        this.implementacion = implementacion;
    }
    
    //metodo abstracto
    abstract String reproducirContenido();      //<--Debe ser implementado por clases que extiendan

    
}
