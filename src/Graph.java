import java.util.HashSet;
import java.util.Set;

public class Graph{
    private Set<Node> nodes=new HashSet<>();

    public void addNode(Node node){
        nodes.add(node);
    }

    public Node getNode(String name){
        for(Node node : nodes){
            if(node.getName().equals(name))
                return node;
        }

        return null;
    }
}