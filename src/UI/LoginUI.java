package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class LoginUI extends JFrame {
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("10dlu:grow"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("10dlu:grow"),},
			new RowSpec[] {
				RowSpec.decode("10dlu:grow"),
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("10dlu"),
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("10dlu"),
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("10dlu:grow"),}));
		
		JLabel lblZenLounge = new JLabel("Zen Lounge");
		lblZenLounge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		getContentPane().add(lblZenLounge, "2, 1, center, center");
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		getContentPane().add(txtUsername, "2, 2, fill, default");
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		getContentPane().add(pwdPassword, "2, 4, fill, default");
		
		JButton btnLogIn = new JButton("Log in !");
		getContentPane().add(btnLogIn, "2, 6");
		
	}

}
