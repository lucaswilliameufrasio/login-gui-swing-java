import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton signinButton;
	private static JLabel successLoginLabel;

	public static void main(String[] args) {
		JPanel panel = new JPanel();

		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);

		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);

		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);

		signinButton = new JButton("Login");
		signinButton.setBounds(10, 80, 80, 25);
		signinButton.addActionListener(new GUI());
		panel.add(signinButton);

		successLoginLabel = new JLabel("");
		successLoginLabel.setBounds(10, 110, 300, 25);
		panel.add(successLoginLabel);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String user = userText.getText();
		char[] password = passwordText.getPassword();

		if(user.equals("user") && new String(password).equals("user")) {
			successLoginLabel.setText("Login Successful");
		} else {
			successLoginLabel.setText("Invalid credentials");
			passwordText.setText("");
		}
	}

}
