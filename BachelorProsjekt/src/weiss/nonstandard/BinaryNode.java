package weiss.nonstandard;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

// Basic node stored in unbalanced binary search trees
// Note that this class is not accessible outside
// of this package.

class BinaryNode<AnyType>
{
	private Ellipse2D ellipseOfNode;
	private int sizeOfNode = 50;
        // Constructor
    BinaryNode( AnyType theElement )
    {
        element = theElement;
        left = right = null;
        ellipseOfNode = new Ellipse2D.Double(sizeOfNode, sizeOfNode, sizeOfNode, sizeOfNode);
    }

    public Ellipse2D getShape(){
		return ellipseOfNode;
	}
    
      // Data; accessible by other package routines
    AnyType             element;  // The data in the node
    BinaryNode<AnyType> left;     // Left child
    BinaryNode<AnyType> right;    // Right child
}
