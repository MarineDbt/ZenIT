package UI;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JTextField;

import BL.Front.UserFacade;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame implements ActionListener{
	
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Create the frame.
	 */
	public LoginUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 432);
		this.setMinimumSize(new Dimension(600,450));
		
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("10dlu:grow"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("10dlu:grow"),},
			new RowSpec[] {
				RowSpec.decode("10dlu:grow"),
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("10dlu"),
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("10dlu:grow"),}));
		
		JLabel lblZenLounge = new JLabel("Zen Lounge");
		lblZenLounge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		getContentPane().add(lblZenLounge, "2, 1, center, center");
		
		txtUsername = new JTextField();
		txtUsername.setText("Elie");
		getContentPane().add(txtUsername, "2, 2, fill, default");
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("a");
		getContentPane().add(pwdPassword, "2, 4, fill, default");
		
		JButton btnLogIn = new JButton("Log in !");
		getContentPane().add(btnLogIn, "2, 6");
		btnLogIn.addActionListener(this);
		btnLogIn.setActionCommand("login");
		
		JButton btnRegister = new JButton("Register");
		getContentPane().add(btnRegister, "2, 8");
		btnRegister.addActionListener(this);
		btnRegister.setActionCommand("register");
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getActionCommand().equals("login")){
			 UserFacade userFacade = new UserFacade();
			 boolean isLogged = userFacade.login(txtUsername.getText(),pwdPassword.getText());
	    	 if(isLogged){
	    		System.out.println("H " + userFacade.getCurrentUser().getId());
	    		HomeUI homeUI = new HomeUI(userFacade);
	    		homeUI.userFacade=userFacade;
	    		homeUI.setVisible(true);
		    	this.dispose();
	    	 };
	     }
		 if (e.getActionCommand().equals("register")){
			 RegisterUI registerUI = new RegisterUI();
			 registerUI.setVisible(true);
	    	 this.dispose();
	     }
		
	}

}
