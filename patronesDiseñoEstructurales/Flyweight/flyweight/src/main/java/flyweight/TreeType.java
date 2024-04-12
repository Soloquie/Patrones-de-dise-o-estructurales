package flyweight;

public class TreeType {
    public String name;
    public String color;
    public String texture;

    // Constructor
    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    // Método para dibujar el árbol en un lienzo en las coordenadas especificadas
    public void draw(Canvas canvas, int x, int y) {
        // Implementación de la lógica de dibujo aquí
    }
}