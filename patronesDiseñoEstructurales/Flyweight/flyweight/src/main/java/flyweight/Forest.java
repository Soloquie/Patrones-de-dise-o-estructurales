package flyweight;
import java.util.ArrayList;
import java.util.List;


public class Forest {
    private List<Tree> trees = new ArrayList<>();

    // Método para plantar un árbol en el bosque
    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    // Método para dibujar el bosque en un lienzo
    public void draw(Canvas canvas) {
        for (Tree tree : trees) {
            tree.draw(canvas);
        }
    }
}