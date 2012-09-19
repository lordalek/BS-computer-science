package excerciseBinaryTree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import leafExcercise.LeafLogic;
import leafExcercise.LeafPanel;

public class CreateAndSetUpGUI extends JPanel implements MouseListener{
	private BorderLayout borderLayout;
	private JPanel buttonPanel, mainPanel;
	private LeafLogic logic;
	
	public CreateAndSetUpGUI(){
		setFocusable(true);
		createAndSetUpDefaultGUI();
	}
	
	private void updateGUI(int i){
		switch(i) {
		case 1:
		mainPanel = new LeafPanel(logic = new LeafLogic());
		break;
		default:
			createAndSetUpDefaultGUI();
		}
	}
	
	private void createAndSetUpDefaultGUI(){
		buttonPanel = new ButtonPanel();
		borderLayout = new BorderLayout(15, 10);
		mainPanel= new LeafPanel(logic = new LeafLogic());
		
		setLayout(borderLayout);
		add(mainPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.PAGE_END);
		setBackground(Color.BLACK);
		setVisible(true);
	}
	
	
	private class ButtonPanel extends JPanel {
		JButton depthAndSizeButton, leafButton, balanceTheTreButton ;
		public ButtonPanel(){

			setLayout(new FlowLayout());
			leafButton = new JButton("Mark the leaves");
			leafButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				updateGUI(1);
				}
			});

			depthAndSizeButton = new JButton("Depth and Size");
			depthAndSizeButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("DepthAndSizeWorks");
					updateGUI(2);
				}
			});
			
			balanceTheTreButton = new JButton("Balance the tree");
			balanceTheTreButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("balanceTheTreButtonWORKS");
					updateGUI(3);
				}
			});
			
			JLabel simpleInfoLabel = new JLabel("Choose one of the three excercises. Clicking a button will change excercise      ");
			
			
			add(simpleInfoLabel);
			add(depthAndSizeButton);
			add(leafButton);
			add(balanceTheTreButton);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + e.getY());
//		checkWhichNodeIsSelected(e);
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println(e.getX() + e.getY());
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println(e.getX() + e.getY());
//		checkWhichNodeIsSelected(e);
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getX() + e.getY());
//		checkWhichNodeIsSelected(e);
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println(e.getX() + e.getY());
//		checkWhichNodeIsSelected(e);
		
	}
}

