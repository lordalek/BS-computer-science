package illustrationOfBinaryTree;


import javax.swing.JApplet;
import javax.swing.JFrame;


public class IllustrationOfBinaryTree extends JApplet{
	/**
	 * First version. alpha.
	 */
	private static final long serialVersionUID = 1L;
	CreateAndSetUpGUI gui = new CreateAndSetUpGUI();
	
	public static void main(String s[]){
		JFrame frame = new JFrame();
		frame.setTitle("Illustration of Binary Tree");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JApplet applet = new IllustrationOfBinaryTree();
		applet.init();
		frame.getContentPane().add(applet);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
	
	public void init(){
	getContentPane().add(gui);
	}
	
	
}
