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

public class AddSupervisorUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private AbstractPersistenceHandlerFactory factory;
	private User currentUser;

	
	/**
	 * Create the frame.
	 */
	public AddSupervisorUI(AbstractPersistenceHandlerFactory myFactory, User user) {
		
		factory = myFactory;
		currentUser = user;
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblUserId = new JLabel("User id :");
		contentPane.add(lblUserId);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 189, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -31, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblUserId, 3, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblUserId, -35, SpringLayout.WEST, textField);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnValidate = new JButton("Validate");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -67, SpringLayout.NORTH, btnValidate);
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
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Valider"))
		{
			RoleManagementFacade facade = new RoleManagementFacade(factory);
			User user = new User (textField.getText());
			boolean result = facade.createSupervisor(user);
			
			if(result)
			{
				DisplaySupervisorUI frame = new DisplaySupervisorUI(factory,currentUser);
				frame.setVisible(true);
				//OkUI frame2 = new OkUI frame2("The supervisor has been added !");
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
			DisplaySupervisorUI frame = new DisplaySupervisorUI(factory,currentUser);
			frame.setVisible(true);
			this.dispose();
		}
	}

}
