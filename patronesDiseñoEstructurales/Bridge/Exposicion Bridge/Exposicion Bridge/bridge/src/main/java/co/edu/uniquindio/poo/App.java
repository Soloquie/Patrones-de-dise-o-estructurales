package co.edu.uniquindio.poo;


public class App {
    public static void main(String[] args) {

        ImplementacionReproduccion mp4 = new ImplementacionReproduccionMP4();
        ImplementacionReproduccion mp3 = new ImplementacionReproduccionMP3();

        DispositivoReproduccion televisor = new Televisor(mp4);
        DispositivoReproduccion radio = new Radio(mp3);
        //DispositivoReproduccion celular = new Celular(mp3);

        System.out.println(televisor.reproducirContenido());
        System.out.println(radio.reproducirContenido());
        //System.out.println(celular.reproducirContenido());
    
    
    }
}
