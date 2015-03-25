package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import BL.DataClasses.Category;
import BL.DataClasses.User;
import BL.Front.CategoryFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

public class AddCategoryUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnValider;
	private AbstractPersistenceHandlerFactory factory;
	private User currentUser;
	private JButton btnCancel;

	/**
	 * Create the frame.
	 */
	public AddCategoryUI(AbstractPersistenceHandlerFactory myFactory, User user) {
		
		factory = myFactory;
		currentUser = user;
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblSubcategoryName = new JLabel("Category name :");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblSubcategoryName, 46, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblSubcategoryName, -106, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblSubcategoryName);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblSubcategoryName);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 33, SpringLayout.EAST, lblSubcategoryName);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnValider = new JButton("Validate");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnValider, 111, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnValider, -10, SpringLayout.SOUTH, contentPane);
		btnValider.addActionListener(this);
		btnValider.setActionCommand("Validate");
		contentPane.add(btnValider);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("Cancel");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCancel, 0, SpringLayout.NORTH, btnValider);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCancel, 23, SpringLayout.EAST, btnValider);
		contentPane.add(btnCancel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Validate"))
		{
			CategoryFacade facade = new CategoryFacade(factory);
			boolean result = facade.createCategory(textField.getText());
			if (result) 
			{
				DisplayCatUI cat = new DisplayCatUI(factory, currentUser);
				cat.setVisible(true);
				OkUI frame = new OkUI("The Category has been created !");
				frame.setVisible(true);
				this.dispose();		
			}
			else
			{
				EchecUI echec = new EchecUI();
				echec.setVisible(true);
			}
		}
		if (e.getActionCommand().equals("Cancel"))
		{
			DisplayCatUI cat = new DisplayCatUI(factory, currentUser);
			cat.setVisible(true);
			this.dispose();	
		}
	}

}