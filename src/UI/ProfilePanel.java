package UI;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ProfilePanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public ProfilePanel() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
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
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblFirstName = new JLabel("First Name");
		add(lblFirstName, "2, 4, right, default");
		
		textField = new JTextField();
		add(textField, "4, 4, fill, default");
		textField.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		add(lblUserName, "8, 4, right, default");
		
		textField_7 = new JTextField();
		add(textField_7, "10, 4, fill, default");
		textField_7.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		add(lblLastName, "2, 6, right, default");
		
		textField_1 = new JTextField();
		add(textField_1, "4, 6, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		add(lblPassword, "8, 6, right, default");
		
		JButton btnChangePassword = new JButton("Change Password");
		add(btnChangePassword, "10, 6");
		
		JLabel lblAddress = new JLabel("Address");
		add(lblAddress, "2, 8, right, default");
		
		textField_2 = new JTextField();
		add(textField_2, "4, 8, fill, default");
		textField_2.setColumns(10);
		
		JLabel lblCodePostal = new JLabel("Code Postal");
		add(lblCodePostal, "2, 10, right, default");
		
		textField_3 = new JTextField();
		add(textField_3, "4, 10, fill, default");
		textField_3.setColumns(10);
		
		JLabel lblVille = new JLabel("Ville");
		add(lblVille, "2, 12, right, default");
		
		textField_4 = new JTextField();
		add(textField_4, "4, 12, fill, default");
		textField_4.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone");
		add(lblPhone, "2, 14, right, default");
		
		textField_5 = new JTextField();
		add(textField_5, "4, 14, fill, default");
		textField_5.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		add(lblEmail, "2, 16, right, default");
		
		textField_6 = new JTextField();
		add(textField_6, "4, 16, fill, default");
		textField_6.setColumns(10);
		
		JButton btnModify = new JButton("Modify");
		add(btnModify, "4, 18");

	}

}
