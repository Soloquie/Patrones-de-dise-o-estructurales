package flyweight;

public class App {
    public static void main(String[] args) {
        // Creamos un lienzo
        Canvas canvas = new Canvas();

        // Creamos una fábrica de árboles
        TreeFactory treeFactory = new TreeFactory();

        // Creamos un bosque
        Forest forest = new Forest();

        // Plantamos algunos árboles
        forest.plantTree(10, 20, "Pino", "Verde", "Textura1");
        forest.plantTree(50, 30, "Roble", "Marrón", "Textura2");
        forest.plantTree(100, 50, "Pino", "Verde", "Textura1");

        // Dibujamos el bosque en el lienzo
        forest.draw(canvas);
        treeFactory.getTreeType("Pino", "Verde", "Textura1");
    }
}