import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Testenginesplashscreen extends JFrame {

	JLabel testenginelbl = new JLabel();

	public static void main(String[] args) {
			Testenginesplashscreen frame = new Testenginesplashscreen();
					frame.setVisible(true);
				} 
	

	/**
	 * Create the frame.
	 */
	public Testenginesplashscreen() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1, 1, 900,700);
		getContentPane().setLayout(null);
		Icon icon = new ImageIcon(Testenginesplashscreen.class.getResource("test.gif"));
		
		/*testenginelbl.setForeground(Color.RED);
		testenginelbl.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		testenginelbl.setHorizontalAlignment(SwingConstants.CENTER);
		 	*/
		
		testenginelbl.setBounds(247, 84, 300, 300);
		getContentPane().add(testenginelbl);
	}
}
