package Quiz_9;

import javax.swing.*;
public class Question_7 {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("My Frame");
		frame.add (new JButton("OK"));
		frame.add (new JButton("Cancel")); // only last added JButton is visible on running the code
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize (200, 200);
		frame.setVisible(true);
	}
}
/*

Only Cancel visible as its the last one added

*/