package aylacar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class p1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton commentbtn = new JButton("New button");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p1 frame = new p1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public p1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		contentPane.add(commentbtn);
	}

	public static void addToCart() {
		// TODO Auto-generated method stub
		
	}
	
	
	 public JButton getCommentButton() {
	        return commentbtn;
	    }

}
