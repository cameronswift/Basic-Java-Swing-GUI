import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
	private int count = 0;
	private JLabel label = new JLabel("Number of clicks: 0 ");
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();

	public GUI() {

		JButton button = new JButton("Click me!");
		button.addActionListener(this);

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100, 200, 100, 200));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks:  " + count);
	}

	public static void main(String[] args) {
		new GUI();
	}
}