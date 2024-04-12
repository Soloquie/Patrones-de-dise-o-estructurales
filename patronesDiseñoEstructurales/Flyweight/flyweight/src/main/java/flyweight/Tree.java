package flyweight;

public class Tree {
    private int x;
    private int y;
    private TreeType type;

    // Constructor
    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    // Método para dibujar el árbol en un lienzo
    public void draw(Canvas canvas) {
        type.draw(canvas, x, y);
    }
}