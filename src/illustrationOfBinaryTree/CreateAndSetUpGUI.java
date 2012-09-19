package illustrationOfBinaryTree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CreateAndSetUpGUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BorderLayout borderLayout;
	private IllustrationPanel illustrationPanel;
	private ButtonPanel buttonPanel;
	private CodeViewLabel codeViewLabel;
	private int iterationStep = 1;
	
	
	public CreateAndSetUpGUI(){
		createAndSetUpDefaultGUI();
	}
	
	private void updateGUI(int i){
		System.out.println("updateGUIisCalled" + i);
		codeViewLabel.setNewText(i);
		illustrationPanel.updateIllustrationPanel(i);
	}
	
	private void createAndSetUpDefaultGUI(){
		illustrationPanel = new IllustrationPanel();
		codeViewLabel = new CodeViewLabel();
		buttonPanel = new ButtonPanel();
		borderLayout = new BorderLayout(15, 10);
		
		
		setLayout(borderLayout);
		add(illustrationPanel, BorderLayout.CENTER);
		add(codeViewLabel, BorderLayout.PAGE_START);
		add(buttonPanel, BorderLayout.PAGE_END);
		setBackground(Color.BLACK);
		setVisible(true);
	}
	
	private class ButtonPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		JButton reverseButton, forwardButton;
		public ButtonPanel(){

			setLayout(new FlowLayout());
			forwardButton = new JButton("Next");
			forwardButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("ForwardButtonWorks");
				updateGUI(++iterationStep);
				}
			});

			reverseButton = new JButton("Previous");
			reverseButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("ReverseButtonWorks");
					if(iterationStep > 1) updateGUI(--iterationStep);
				}
			});

			add(reverseButton);
			add(forwardButton);
		}
	}

}

