package leftOvers;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Node<AnyType>{
	private Ellipse2D ellipseOfNode;
	private int sizeOfNode = 50;
	private Integer valueOfNode;
	private Point2D position;
	Node<AnyType> leftChild, rightChild;
	public Node( Integer valueOfNode, Node<AnyType> rightChild, Node<AnyType> leftChild){
		this.valueOfNode = valueOfNode;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		ellipseOfNode = new Ellipse2D.Double(sizeOfNode, sizeOfNode, sizeOfNode, sizeOfNode);
	}
	
	public Node( Integer valueOfNode){
		this(valueOfNode, null, null);
	}
	
	public Point2D getPosition(){
		return position;
	}
	
	public void setLocation(Point2D newPosition){
		position = newPosition;
	}
	
	public void setLocation(int posX, int posY){
		position = new Point2D.Double(posX, posY);
	}
	
	public Integer getValue(){
		return valueOfNode;
	}
	
	public Ellipse2D getShape(){
		return ellipseOfNode;
	}
	
	public String toString(){
		return "Node with value: " + getValue();
		
	}
}
