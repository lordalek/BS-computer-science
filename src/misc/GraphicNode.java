package misc;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class GraphicNode {
	private int valueOfNode, sizeOfNode = 50;
	private Ellipse2D shape;
	private Color color;
	
	public GraphicNode(int valueOfNode, int posX, int posY){
		this.valueOfNode = valueOfNode;
		shape = new Ellipse2D.Double(posX, posY, sizeOfNode, sizeOfNode);
		color = Color.GREEN;
	}
	
	public Ellipse2D getShape(){
		return shape;
	}
	
	public String getStringForShape(){
		String valueAsString = Integer.toString(valueOfNode);
		return valueAsString;
	}
	
	public void checkIfPointIsInsideNode(Point point){
		if(shape.contains(point)) {
			System.out.println(shape.contains(point));
			if(color == Color.GREEN)color = Color.BLUE;
			else if(color == Color.BLUE) color = Color.GREEN;
		}
	}
	
	public Color getColor(){
		return color;
	}
}
