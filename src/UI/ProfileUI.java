package UI;

import java.awt.EventQueue;

import javax.swing.JTextField;

import BL.DataClasses.User;
import BL.Front.UserFacade;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfileUI extends BaseUI{
	

	public UserFacade userFacade;
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
	private JButton btnChangePassword;
	private JButton btnValidate;
		
	public ProfileUI(UserFacade userFacade) {
		super(userFacade);
		content.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("20dlu"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("50dlu"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("20dlu"),},
			new RowSpec[] {
				RowSpec.decode("20dlu"),
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
				FormFactory.RELATED_GAP_ROWSPEC,}));
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		content.add(txtFirstName, "2, 2, fill, default");
		txtFirstName.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		content.add(txtUsername, "4, 2, fill, default");
		txtUsername.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		content.add(txtLastName, "2, 4, fill, default");
		txtLastName.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		content.add(pwdPassword, "4, 4, fill, default");
		
		txtStreet = new JTextField();
		txtStreet.setText("Street");
		content.add(txtStreet, "2, 6, fill, default");
		txtStreet.setColumns(10);
		
		pwdCheckpassword = new JPasswordField();
		pwdCheckpassword.setText("checkPassword");
		content.add(pwdCheckpassword, "4, 6, fill, default");
		
		txtPostalCode = new JTextField();
		txtPostalCode.setText("Postal Code");
		content.add(txtPostalCode, "2, 8, fill, default");
		txtPostalCode.setColumns(10);
		
		btnChangePassword = new JButton("Change Password");
		content.add(btnChangePassword, "4, 8");
		
		txtCity = new JTextField();
		txtCity.setText("City");
		content.add(txtCity, "2, 10, fill, default");
		txtCity.setColumns(10);
		
		btnValidate = new JButton("Validate");
		content.add(btnValidate, "4, 10");
		
		txtPhone = new JTextField();
		txtPhone.setText("Phone");
		content.add(txtPhone, "2, 12, fill, default");
		txtPhone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail");
		content.add(txtEmail, "2, 14, fill, default");
		txtEmail.setColumns(10);
		
		JButton btnModify = new JButton("Modify");
		content.add(btnModify, "2, 18");
		// TODO Auto-generated constructor stub
	}

}
