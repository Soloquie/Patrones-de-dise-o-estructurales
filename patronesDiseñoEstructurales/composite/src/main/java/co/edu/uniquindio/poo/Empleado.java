package co.edu.uniquindio.poo;

// Clase Hoja (Leaf)
class Empleado implements ComponenteOrganizacional {
    private String nombre;
    private String puesto;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public void mostrarNombre() {
        System.out.println(nombre + " - " + puesto);
    }
}
