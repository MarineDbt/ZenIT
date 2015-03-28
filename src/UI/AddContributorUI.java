package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import BL.Front.RoleManagementFacade;
import BL.ModelClasses.User;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddContributorUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private AbstractPersistenceHandlerFactory factory;
	private JTextField textField_1;
	private User currentUser;

	
	/**
	 * Create the frame.
	 */
	public AddContributorUI(AbstractPersistenceHandlerFactory myFactory, User user) {
		
		factory = myFactory;
		currentUser = user;
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblUserId = new JLabel("User id :");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblUserId, 50, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblUserId, 87, SpringLayout.WEST, contentPane);
		contentPane.add(lblUserId);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, -3, SpringLayout.NORTH, lblUserId);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 40, SpringLayout.EAST, lblUserId);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -32, SpringLayout.EAST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnValidate = new JButton("Validate");
		btnValidate.addActionListener(this);
		btnValidate.setActionCommand("Valider");
		contentPane.add(btnValidate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("Cancel");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCancel, 231, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCancel, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnValidate, 0, SpringLayout.NORTH, btnCancel);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnValidate, -25, SpringLayout.WEST, btnCancel);
		contentPane.add(btnCancel);
		
		JLabel lblDescription = new JLabel("Description:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDescription, 52, SpringLayout.SOUTH, lblUserId);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDescription, 0, SpringLayout.WEST, lblUserId);
		contentPane.add(lblDescription);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, -3, SpringLayout.NORTH, lblDescription);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, 219, SpringLayout.EAST, lblDescription);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Valider"))
		{
			RoleManagementFacade facade = new RoleManagementFacade(factory);
			User user = new User (textField.getText());
			boolean result = facade.createContributor(user, textField_1.getText());
			
			if(result)
			{
				DisplayContributorUI frame = new DisplayContributorUI(factory,currentUser);
				frame.setVisible(true);
				//OkUI frame2 = new OkUI frame2("The contributor has been added !");
				//frame2.setVisible(true);
				this.dispose();
			}
			else
			{
				//EchecUI echec = new EchecUI();
				//echec.setVisible(true);
			}
			
		}
		if (e.getActionCommand().equals("Cancel"))
		{
			DisplayContributorUI frame = new DisplayContributorUI(factory,currentUser);
			frame.setVisible(true);
			this.dispose();
		}
	}

}
