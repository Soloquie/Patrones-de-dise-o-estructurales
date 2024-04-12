package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;


// Clase Compuesta (Composite)
class Departamento implements ComponenteOrganizacional {
    private String nombre;
    private List<ComponenteOrganizacional> subordinados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        subordinados = new ArrayList<>();
    }

    public void agregarSubordinado(ComponenteOrganizacional subordinado) {
        subordinados.add(subordinado);
    }

    public void eliminarSubordinado(ComponenteOrganizacional subordinado) {
        subordinados.remove(subordinado);
    }

    public void mostrarNombre() {
        System.out.println(nombre + ":");
        for (ComponenteOrganizacional subordinado : subordinados) {
            subordinado.mostrarNombre();
        }
    }
}
