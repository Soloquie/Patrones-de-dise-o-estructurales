package flyweight;

import java.util.ArrayList;
import java.util.List;


public class TreeFactory {
    private static List<TreeType> treeTypes = new ArrayList<>();

    // Método para obtener un tipo de árbol dado su nombre, color y textura
    public TreeType getTreeType(String name, String color, String texture) {
        TreeType type = treeTypes.stream()
                                 .filter(t -> t.name.equals(name) && t.color.equals(color) && t.texture.equals(texture))
                                 .findFirst()
                                 .orElse(null);
        if (type == null) {
            type = new TreeType(name, color, texture);
            treeTypes.add(type);
        }
        return type;
    }
}
