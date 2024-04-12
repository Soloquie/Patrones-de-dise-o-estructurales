package co.edu.uniquindio.poo;


// Ejemplo de uso
public class App {
    public static void main(String[] args) {
        // Crear empleados
        Empleado emp1 = new Empleado("Juan", "Desarrollador");
        Empleado emp2 = new Empleado("María", "Gerente de Proyecto");
        Empleado emp3 = new Empleado("Pedro", "Analista de Negocios");

        // Crear departamentos
        Departamento departamentoIT = new Departamento("Departamento de TI");
        Departamento departamentoVentas = new Departamento("Departamento de Ventas");

        // Agregar empleados a los departamentos
        departamentoIT.agregarSubordinado(emp1);
        departamentoIT.agregarSubordinado(emp2);
        departamentoVentas.agregarSubordinado(emp3);

        // Agregar un departamento como subordinado de otro
        Departamento empresa = new Departamento("Nuestra Empresa");
        empresa.agregarSubordinado(departamentoIT);
        empresa.agregarSubordinado(departamentoVentas);

        // Mostrar la estructura organizacional completa
        empresa.mostrarNombre();
    }
}