
import java.util.Vector;

enum NODETYPE {
	FUNCTION, OBJECT;
}

public class Node {

	// local variables
	Vector<Node> children = new Vector<Node>();
	NODETYPE nodeType;
	String name;

	//Constructor with type.
	public Node(NODETYPE nodeType) {
		this.nodeType = nodeType;
	}
	
	//Constructor with type and node name
	public Node(NODETYPE nodeType, String name) {
		this.nodeType = nodeType;
		this.name = name;
	}

}
