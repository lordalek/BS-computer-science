package illustrationOfBinaryTree;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import java.awt.geom.*;

import misc.GraphicNode;

public class IllustrationPanel extends Container {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int iteration;
	private IllustrationLogic logic;
	public IllustrationPanel(){
		super();
		setPreferredSize(new Dimension(400, 250));
		logic = new IllustrationLogic();
		iteration = 1;
	}
	public void updateIllustrationPanel(int iterationOfIllustration){
		iteration = iterationOfIllustration;
		System.out.println(iteration + "trying to call paint");
		invalidate();
		repaint();
	}
	public void paint(Graphics g) {
		super.paintComponents(g);
		Graphics2D g2d;
		g2d = (Graphics2D) g;
		Font font = new Font("Arial", Font.PLAIN, 20);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setFont(font);
		System.out.println(iteration + "inside paint");
		g2d.setColor(Color.GREEN);
		if(iteration  == 2 || iteration == 1)	{ paintUnbalancedBinaryTree(g2d); }
		if(iteration == 3 || iteration == 4)	{ paintLinearArray(g2d); }
		if(iteration == 5 || iteration == 6)	{ paintSmallerAndLargerChildNodes(g2d); }
		if(iteration == 7)						{ paintStringExplainingNode(g2d); }

		g.dispose();
	}

	private void paintStringExplainingNode(Graphics2D g2d){
		String text = new String("Since a node is aware of its own children, but not of its own parent,");
		g2d.drawString(text, 50, 50);
		text = new String("recursion has proved to be easy to implement and simple in code.");
		g2d.drawString(text, 50, 100);
		text = new String("Next you will learn how a tree a constructed.");
		g2d.drawString(text, 50, 150);
	}
	
	private void paintSmallerAndLargerChildNodes(Graphics2D g2d){
		System.out.println("inside arrat");
		g2d.setColor(Color.GREEN);
		if(iteration == 6) g2d.setColor(Color.RED);
		g2d.fillOval(350, 0, 50, 50);
		g2d.setColor(Color.GREEN);
		g2d.fillOval(275, 75, 45, 45);
		g2d.fillOval(425, 75, 60, 60);
		if(iteration == 6) g2d.setColor(Color.BLUE);
		g2d.fillOval(200, 150, 40, 40);
		g2d.fillOval(500, 150, 65, 65);
		g2d.fillOval(350, 150, 55, 55);
		
		g2d.setColor(Color.GREEN);
		g2d.drawLine(375, 50, 300, 75);
		g2d.drawLine(375, 50, 450, 75);
		g2d.drawLine(300, 115, 225, 150);
		g2d.drawLine(450, 130, 375, 150);
		g2d.drawLine(450, 130, 525, 150);
		
		g2d.setColor(Color.WHITE);
		g2d.drawString("1", 215, 175);
		g2d.drawString("5", 295, 100);
		g2d.drawString("10", 365, 35);
		g2d.drawString("75", 440, 110);
		g2d.drawString("50", 365, 185);
		g2d.drawString("100", 510, 185);		
	}

	private void paintLinearArray(Graphics2D g2d){
		g2d.draw(new Rectangle2D.Double(100, 0, 200, 200));
		int x = 0;
		for(int i = 0; i < 200 ; i+= 25){
			g2d.setColor(Color.GREEN);
			g2d.drawLine(100, i, 300, i);
			if(i < 175){
				g2d.setColor(Color.WHITE);
				g2d.drawString(Integer.toString(x), 150, 45+i);
				x++;
			}
		}
		g2d.drawLine(200, 0, 200, 200);
		g2d.setColor(Color.WHITE);
		g2d.drawString("Key", 130, 20);
		g2d.drawString("Data", 220, 20);
		g2d.drawString("Peach", 220, 45);
		g2d.drawString("Bowser", 220, 45+25);
		g2d.drawString("Larry", 220, 45+50);
		g2d.drawString("crazy guy", 210, 45+75);
		g2d.drawString("Zelda", 220, 45+100);
		g2d.drawString("Link", 220, 45+125);
		g2d.drawString("Mario", 220, 45+150);
		g2d.drawString("Linear", 130, 250);
		g2d.drawLine(150, 230, 150, 210);
		g2d.drawLine(140, 223, 150, 210);
		g2d.drawLine(160, 223, 150, 210);

		g2d.setColor(Color.GREEN);
		g2d.fillOval(500, 0, 50, 50);
		g2d.fillOval(425, 75, 50, 50);
		g2d.fillOval(575, 75, 50, 50);
		g2d.fillOval(475, 150, 50, 50);
		g2d.fillOval(350, 150, 50, 50);
		g2d.drawLine(525, 50, 450, 75);
		g2d.drawLine(450, 125, 500, 150);
		g2d.drawLine(450, 125, 375, 150);
		g2d.drawLine(525, 50, 600, 75);

		g2d.setColor(Color.WHITE);
		g2d.drawString("4", 520, 30);
		g2d.drawString("3", 445, 105);
		g2d.drawString("5", 595, 105);
		g2d.drawString("1", 495, 180);
		g2d.drawString("2", 370, 180);
		g2d.drawString("Non-Linear", 500, 250);
		g2d.drawLine(550, 230, 550, 210);
		g2d.drawLine(540, 223, 550, 210);
		g2d.drawLine(560, 223, 550, 210);

	}

	private void paintUnbalancedBinaryTree(Graphics2D g2d){
		for(int i = 0; i < 5; i++) 
		{
			g2d.setColor(logic.nodes[i].getColor());
			g2d.fill(logic.nodes[i].getShape());

			//Paint values	
			g2d.setColor(Color.WHITE);
			g2d.drawString(logic.nodes[i].getStringForShape(),  (int) logic.listOverPositionForBoxes[i].getX()+20, (int) logic.listOverPositionForBoxes[i].getY()+30);
		}

		g2d.setColor(Color.GREEN);
		g2d.drawLine(375, 50, 290, 80);
		g2d.drawLine(275, 125, 350, 150);
		g2d.drawLine(275, 125, 175, 150);
		g2d.drawLine(375, 50, 460, 80);

	}

	private class IllustrationLogic{
		private GraphicNode[] nodes;
		private Point2D[] listOverPositionForBoxes;
		private Integer[] numbers;
		public IllustrationLogic(){
			nodes = new GraphicNode[5];
			setUpPositionsForBoxes();
			setUpNumbers();
			for(int i = 0; i < 5; i++){
				nodes[i] = new GraphicNode(numbers[i], (int) listOverPositionForBoxes[i].getX(), (int) listOverPositionForBoxes[i].getY());
			}
		}

		private void setUpPositionsForBoxes(){
			listOverPositionForBoxes = new Point2D[5];
			listOverPositionForBoxes[0] = new Point2D.Double(350, 0);
			listOverPositionForBoxes[1] = new Point2D.Double(250, 75);
			listOverPositionForBoxes[2] = new Point2D.Double(150, 150);
			listOverPositionForBoxes[3] = new Point2D.Double(323, 150);
			listOverPositionForBoxes[4] = new Point2D.Double(450, 75);
		}

		private void setUpNumbers(){
			numbers = new Integer[5];
			numbers[0] = 2;
			numbers[1] = 7;
			numbers[2] = 6;
			numbers[3] = 5;
			numbers[4] = 9;
		}
	}
}