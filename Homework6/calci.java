package HomeWorkOOP.Homework6;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class calci {
	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public calci() {
		frame = new JFrame();
		Initialize calculator = new Initialize(frame);
		calculator.initial();
	}
}
