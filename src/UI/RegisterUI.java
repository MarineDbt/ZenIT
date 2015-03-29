package UI;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JTextField;

import BL.DataClasses.User;
import BL.Front.UserFacade;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class RegisterUI extends JFrame implements ActionListener{

	UserFacade userFacade;
	
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtStreet;
	private JTextField txtPostalCode;
	private JTextField txtCity;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JPasswordField pwdCheckpassword;
	private JButton btnRegister;
	private JButton btnBack;
	private JLabel lblZenLounge;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblStreet;
	private JLabel lblPostalCode;
	private JLabel lblCity;
	private JLabel lblPhone;
	private JLabel lblUsername;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JLabel lblPassword_1;

	public RegisterUI() {
		
		userFacade=new UserFacade();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 432);
		this.setMinimumSize(new Dimension(600,450));

		Container content=getContentPane();

		content.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("20dlu:grow"),
				ColumnSpec.decode("right:pref"),
				ColumnSpec.decode("10dlu"),
				ColumnSpec.decode("center:default"),
				ColumnSpec.decode("10dlu"),
				FormFactory.DEFAULT_COLSPEC,
				ColumnSpec.decode("10dlu"),
				ColumnSpec.decode("right:default"),
				ColumnSpec.decode("10dlu"),
				FormFactory.DEFAULT_COLSPEC,
				ColumnSpec.decode("20dlu:grow"),},
				new RowSpec[] {
				RowSpec.decode("20dlu:grow"),
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("fill:20dlu:grow"),}));

		lblZenLounge = new JLabel("Zen Lounge");
		lblZenLounge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		getContentPane().add(lblZenLounge, "2, 1, 9, 1, center, default");

		lblFirstName = new JLabel("First name :");
		getContentPane().add(lblFirstName, "2, 2");

		txtFirstName = new JTextField();
		txtFirstName.setText("");
		content.add(txtFirstName, "4, 2, fill, default");
		txtFirstName.setColumns(10);

		lblUsername = new JLabel("Username :");
		getContentPane().add(lblUsername, "8, 2, default, center");

		txtUsername = new JTextField();
		txtUsername.setText("");
		content.add(txtUsername, "10, 2, fill, default");
		txtUsername.setColumns(10);

		lblLastName = new JLabel("Last name :");
		getContentPane().add(lblLastName, "2, 4");

		txtLastName = new JTextField();
		txtLastName.setText("");
		content.add(txtLastName, "4, 4, fill, default");
		txtLastName.setColumns(10);

		lblPassword = new JLabel("Password :");
		getContentPane().add(lblPassword, "8, 4");

		pwdPassword = new JPasswordField();
		pwdPassword.setText("");
		content.add(pwdPassword, "10, 4, fill, default");

		lblStreet = new JLabel("Street :");
		getContentPane().add(lblStreet, "2, 6");

		txtStreet = new JTextField();
		txtStreet.setText("");
		content.add(txtStreet, "4, 6, fill, default");
		txtStreet.setColumns(10);

		lblPassword_1 = new JLabel("Password :");
		getContentPane().add(lblPassword_1, "8, 6");

		pwdCheckpassword = new JPasswordField();
		pwdCheckpassword.setText("");
		content.add(pwdCheckpassword, "10, 6, fill, default");

		lblPostalCode = new JLabel("Postal Code :");
		getContentPane().add(lblPostalCode, "2, 8");

		txtPostalCode = new JTextField();
		txtPostalCode.setText("");
		content.add(txtPostalCode, "4, 8, fill, default");
		txtPostalCode.setColumns(10);

		lblCity = new JLabel("City :");
		getContentPane().add(lblCity, "2, 10");

		txtCity = new JTextField();
		txtCity.setText("");
		content.add(txtCity, "4, 10, fill, default");
		txtCity.setColumns(10);

		lblPhone = new JLabel("Phone :");
		getContentPane().add(lblPhone, "2, 12");

		txtPhone = new JTextField();
		txtPhone.setText("");
		content.add(txtPhone, "4, 12, fill, default");
		txtPhone.setColumns(10);

		lblEmail = new JLabel("E-mail :");
		getContentPane().add(lblEmail, "2, 14");
		
		txtEmail = new JTextField();
		txtEmail.setText("");
		content.add(txtEmail, "4, 14, fill, default");
		txtEmail.setColumns(10);

		btnRegister = new JButton("Register !");
		getContentPane().add(btnRegister, "6, 18");
		btnRegister.addActionListener(this);
		btnRegister.setActionCommand("register");
		
		btnBack = new JButton("back");
		getContentPane().add(btnBack, "6, 20");
		btnBack.addActionListener(this);
		btnBack.setActionCommand("back");
		
		this.pack();
	}

	public void actionPerformed (ActionEvent e) 
	{ 
		if (e.getActionCommand().equals("register")){
			System.out.println(pwdPassword.getText());
			System.out.println(pwdCheckpassword.getText());
			if (pwdPassword.getText().equals(pwdCheckpassword.getText())){
				System.out.println("ok");
				if (!userFacade.isUser(txtUsername.getText())){
					userFacade.register(txtLastName.getText(),txtFirstName.getText(),txtStreet.getText(),txtPostalCode.getText(),txtCity.getText(),txtPhone.getText(),txtEmail.getText(),txtUsername.getText(),pwdPassword.getText());
					LoginUI loginUI=new LoginUI();
					loginUI.setVisible(true);
					this.dispose();
				}
			}
		}
		if (e.getActionCommand().equals("back")){
			LoginUI loginUI=new LoginUI();
			loginUI.setVisible(true);
			this.dispose();
		}
		
	}

}
