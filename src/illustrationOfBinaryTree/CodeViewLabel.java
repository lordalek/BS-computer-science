package illustrationOfBinaryTree;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;

public class CodeViewLabel extends JLabel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Font font;
	public CodeViewLabel(){
		setPreferredSize(new Dimension(400, 250));
		setHorizontalAlignment(JLabel.CENTER);
		setForeground(Color.GREEN);
		font = new Font("Arial", Font.PLAIN, 20);
		setFont(font);
		setText("<html> Welcome to this simple illustration of a binary tree <br>" +
				" <br>" +
				"Use the buttons below to navigate through the application  </html>");
	}

	public void setNewText(int i){
		setFont(font);
		switch(i){
		case 1:
			setText("<html> Welcome to this simple illustration of a binary tree <br>" +
					" <br>" +
					"Use the buttons below to navigate through the application  </html>");
			break;
		case 2:
			setText("<html>" +
					"What is a binary search tree?" +
					"<br>" +
					"<br>" +
					"<b> A binary search tree is a datastructure where the<br> data is sorted by keys organized in<br> a non-linear way resembling a tree-structure.</b> " +
					"<br>" +
					"<br>" +
					"BUT what does that mean!? O.o<br>" +
					"<br>" +
					"<br>" +
					"</html>");
			break;
		case 3:
			setText("<html>In an ordinary list one sorts the data based on keys by organizing them ascending,<br> but in a binary search tree one sorts them in a non-linear way.</html>");
			break;
		case 4:
			setText("<html>Why is it benefical to sort it non-linear?<br>" +
					"<br> Instead of having <b>O(n)</b> as the run time for search, insert, delete<br> and indexing, as one has in a a list/array, <br>" +
					"one achieves <b>O(log n)</b> with a <b>balanced</b> binary tree.<br> If the tree is unbalanced one risks <b>O(n)</b>, <br>" +
					"but that is still more advantageous or equivalent to the other datastructures. </html>");
			break;
		case 5:
			setText("<html>How does one achieve a magnificent tree with <b>O(log n)</b>?<br>" +
					"<br>" +
					"The desireable structure is achieved by always making sure<br> that the childnode's key to the left of its parent is <b>smaller</b> than the parent's key<br>" +
					" and the childnode's key to the right of its parent is <b>larger</b> than the parent's key </html>");
			break;
		case 6:
			setText("<html>Terminology: <br>" +
					"<br>" +
					"Leaf node: a node with no children. Colored blue.<br>" +
					"Root node: the node with no parent and only child nodes. Colored red.<br>" +
					"Fact #1: no node can have more than two children<br>" +
					"</html>");
			break;
		case 7:
			font = new Font("Arial", Font.PLAIN, 15);
			setFont(font);
			setHorizontalAlignment(JLabel.LEFT);
			setText("<html><br>Java implementation of a node:" +
					"<br>" +
					"<blockquote>public class BinaryNode<AnyType>{<br>" +
					"  // Constructor<br>" +
					" BinaryNode( AnyType theElement ){<br>" +
					"  element = theElement;<br> " +
					" left = right = null; <br>" +
					" } <br>" +  
    				"  // Data; accessible by other package routines <br>" +
    				" AnyType             element;  // The data in the node<br> " +
    				" BinaryNode<AnyType> left;     // Left child <br>" +
    				" BinaryNode<AnyType> right;    // Right child <br>"+
					"}</blockquote></html>");
			break;
		}
	}
}
