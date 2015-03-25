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
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfileUI extends BaseUI{
	
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtStreet;
	private JTextField txtPostalCode;
	private JTextField txtCity;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JPasswordField pwdNewPassword;
	private JPasswordField pwdCheckPassword;
	private JButton btnChangePassword;
	private JButton btnValidate;
	private JButton btnModify;
	private JButton btnDiscard;
	private JButton btnCancel;
	private JButton btnDelete;
	private JLabel lblPassword;
	private JLabel lblNewPassword;
	private JLabel lblCheckPassword;
		
	public ProfileUI(UserFacade userFacade) {
		super(userFacade);
		content.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("20dlu:grow"),
				ColumnSpec.decode("default"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("70dlu"),
				ColumnSpec.decode("20dlu"),
				ColumnSpec.decode("default"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("70dlu"),
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
				RowSpec.decode("20dlu:grow"),
				}));
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		content.add(txtFirstName, "4, 2, fill, default");
		txtFirstName.setColumns(20);
		
		JLabel lblFirstName = new JLabel();
		lblFirstName.setText("First Name :");
		content.add(lblFirstName, "2, 2, right, default");
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		content.add(txtLastName, "4, 4, fill, default");
		txtLastName.setColumns(20);
		
		JLabel lblLastName = new JLabel();
		lblLastName.setText("Last Name :");
		content.add(lblLastName, "2, 4, right, default");
		
		txtStreet = new JTextField();
		txtStreet.setText("Street");
		content.add(txtStreet, "4, 6, fill, default");
		txtStreet.setColumns(20);
		
		JLabel lblStreet = new JLabel();
		lblStreet.setText("Street :");
		content.add(lblStreet, "2, 6, right, default");

		txtPostalCode = new JTextField();
		txtPostalCode.setText("Postal Code");
		content.add(txtPostalCode, "4, 8, fill, default");
		txtPostalCode.setColumns(20);
		
		JLabel lblPostalCode = new JLabel();
		lblPostalCode.setText("Postal Code :");
		content.add(lblPostalCode, "2, 8, right, default");
		
		txtCity = new JTextField();
		txtCity.setText("City");
		content.add(txtCity, "4, 10, fill, default");
		txtCity.setColumns(20);
		
		JLabel lblCity = new JLabel();
		lblCity.setText("City :");
		content.add(lblCity, "2, 10, right, default");
		
		txtPhone = new JTextField();
		txtPhone.setText("Phone");
		content.add(txtPhone, "4, 12, fill, default");
		txtPhone.setColumns(20);
		
		JLabel lblPhone = new JLabel();
		lblPhone.setText("Phone :");
		content.add(lblPhone, "2, 12, right, default");
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail");
		content.add(txtEmail, "4, 14, fill, default");
		txtEmail.setColumns(20);
		
		JLabel lblEmail = new JLabel();
		lblEmail.setText("E-mail :");
		content.add(lblEmail, "2, 14, right, default");
		
		btnModify = new JButton("Modify");
		content.add(btnModify, "4, 18");
		btnModify.addActionListener(this);
		btnModify.setActionCommand("modify");
		
		btnDiscard = new JButton("Discard Changes");
		content.add(btnDiscard, "4, 20");
		btnDiscard.addActionListener(this);
		btnDiscard.setActionCommand("cancel");
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		content.add(txtUsername, "8, 2, fill, default");
		txtUsername.setColumns(20);
		
		JLabel lblUsername = new JLabel();
		lblUsername.setText("Username :");
		content.add(lblUsername, "6, 2, right, default");
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("");
		content.add(pwdPassword, "8, 4, fill, default");
		
		lblPassword = new JLabel();
		lblPassword.setText("Current Password :");
		content.add(lblPassword, "6, 4, right, default");
		
		pwdNewPassword = new JPasswordField();
		pwdNewPassword.setText("");
		content.add(pwdNewPassword, "8, 6, fill, default");
		
		lblNewPassword = new JLabel();
		lblNewPassword.setText("New Password :");
		content.add(lblNewPassword, "6, 6, right, default");
		
		pwdCheckPassword = new JPasswordField();
		pwdCheckPassword.setText("");
		content.add(pwdCheckPassword, "8, 8, fill, default");
		
		lblCheckPassword = new JLabel();
		lblCheckPassword.setText("Check New Password :");
		content.add(lblCheckPassword, "6, 8, right, default");
		
		btnChangePassword = new JButton("Change Password");
		content.add(btnChangePassword, "8, 10");
		btnChangePassword.addActionListener(this);
		btnChangePassword.setActionCommand("changePassword");
		
		btnValidate = new JButton("Validate");
		content.add(btnValidate, "8, 12");
		btnValidate.addActionListener(this);
		btnValidate.setActionCommand("validate");
		
		btnCancel = new JButton("Cancel");
		content.add(btnCancel, "8, 14");
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("cancel");
		
		btnDelete = new JButton("Delete Account");
		content.add(btnDelete, "8, 18");
		btnDelete.addActionListener(this);
		btnDelete.setActionCommand("delete");
		
		initializeProfile();
		unableModif();
	}
	private void initializeProfile(){
		
		User u=userFacade.userManager.currentUser;
		txtFirstName.setText(u.getFirstname());
		txtLastName.setText(u.getLastname());
		txtStreet.setText(u.getStreet());
		txtPostalCode.setText(u.getPc());
		txtCity.setText(u.getCity());
		txtPhone.setText(u.getPhone());
		txtEmail.setText(u.getEmail());
		txtUsername.setText(u.getId());
	}

	private void unableModif() {
		txtFirstName.setEditable(false);
		txtLastName.setEditable(false);
		txtStreet.setEditable(false);
		txtPostalCode.setEditable(false);
		txtCity.setEditable(false);
		txtPhone.setEditable(false);
		txtEmail.setEditable(false);
		txtUsername.setEditable(false);
		lblPassword.setVisible(false);
		lblNewPassword.setVisible(false);
		lblCheckPassword.setVisible(false);
		pwdPassword.setVisible(false);
		pwdPassword.setText("");
		pwdNewPassword.setVisible(false);
		pwdNewPassword.setText("");
		pwdCheckPassword.setVisible(false);
		pwdCheckPassword.setText("");
		btnValidate.setVisible(false);
		btnChangePassword.setVisible(true);
		btnModify.setText("Modify");
		btnModify.setVisible(true);
		btnModify.setActionCommand("modify");
		btnDiscard.setVisible(false);
		btnCancel.setVisible(false);
	}
	private void ableModif() {
		txtFirstName.setEditable(true);
		txtLastName.setEditable(true);
		txtStreet.setEditable(true);
		txtPostalCode.setEditable(true);
		txtCity.setEditable(true);
		txtPhone.setEditable(true);
		txtEmail.setEditable(true);
		pwdPassword.setVisible(true);
		lblPassword.setVisible(true);
		btnValidate.setVisible(false);
		btnChangePassword.setVisible(false);
		btnModify.setText("Save modifications");
		btnModify.setActionCommand("save");
		btnDiscard.setVisible(true);
	}
	private void changePassword() {
		
		btnModify.setVisible(false);
		pwdPassword.setVisible(true);
		lblPassword.setVisible(true);
		pwdNewPassword.setVisible(true);
		lblNewPassword.setVisible(true);
		pwdCheckPassword.setVisible(true);
		lblCheckPassword.setVisible(true);
		btnChangePassword.setVisible(false);
		btnValidate.setVisible(true);
		btnCancel.setVisible(true);
	}
private void confirmDeletion() {
		
		btnModify.setVisible(false);
		pwdPassword.setVisible(true);
		lblPassword.setVisible(true);
		btnChangePassword.setVisible(false);
		btnDelete.setText("Confirm Deletion");
		btnDelete.setActionCommand("confirmDeletion");

	}
	
	public void actionPerformed(ActionEvent arg0) {
		super.actionPerformed(arg0);
		if (arg0.getActionCommand()=="modify"){
			ableModif();
		}
		if (arg0.getActionCommand()=="cancel"){
			unableModif();
		}
		if (arg0.getActionCommand()=="changePassword"){
			changePassword();
		}
		if (arg0.getActionCommand()=="validate"){
			if (pwdPassword.getText()!= "" && pwdNewPassword.getText().equals(pwdCheckPassword.getText())){
				if (userFacade.userManager.checkPassword(userFacade.userManager.currentUser.getId(),pwdPassword.getText())){
					userFacade.userManager.modifyProfile(txtFirstName.getText(),txtLastName.getText(), txtStreet.getText(),txtPostalCode.getText(),txtCity.getText(),txtPhone.getText(),txtEmail.getText(),txtUsername.getText(),pwdNewPassword.getText());
					unableModif();
				}
			}
			
		}
		if (arg0.getActionCommand()=="save"){
			if (userFacade.userManager.checkPassword(userFacade.userManager.currentUser.getId(),pwdPassword.getText())){
				userFacade.userManager.modifyProfile(txtFirstName.getText(),txtLastName.getText(), txtStreet.getText(),txtPostalCode.getText(),txtCity.getText(),txtPhone.getText(),txtEmail.getText(),txtUsername.getText(),pwdPassword.getText());
				unableModif();
			}
		}
		if (arg0.getActionCommand()=="delete"){
			confirmDeletion();
		}
		if (arg0.getActionCommand()=="confirmDeletion"){
			System.out.println("hello");
			if (userFacade.userManager.checkPassword(userFacade.userManager.currentUser.getId(),pwdPassword.getText())){
				userFacade.userManager.deleteProfile(userFacade.userManager.currentUser);
			}
		}
	}
}
