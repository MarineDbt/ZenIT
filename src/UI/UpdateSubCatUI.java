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

import BL.DataClasses.*;
import BL.Front.CategoryFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

public class UpdateSubCatUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private SubCategory oldSubCategory;
	private AbstractPersistenceHandlerFactory factory;
	private User currentUser;
	
	/**
	 * Create the frame.
	 */
	
	public UpdateSubCatUI(SubCategory theOldSubCategory, AbstractPersistenceHandlerFactory myFactory) {
		
		oldSubCategory = theOldSubCategory;
		factory = myFactory;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblNewName = new JLabel("New name :");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewName, 66, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewName, 30, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewName);
		
		textField = new JTextField(oldSubCategory.getName());
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblNewName);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 75, SpringLayout.EAST, lblNewName);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnValidate = new JButton("Validate");
		btnValidate.addActionListener(this);
		btnValidate.setActionCommand("Valider");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnValidate, -30, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnValidate, -163, SpringLayout.EAST, contentPane);
		contentPane.add(btnValidate);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Valider"))
		{
			CategoryFacade facade = new CategoryFacade(factory);
			boolean result = facade.modifySubCategory(oldSubCategory, textField.getText());
			if (result) 
			{
				DisplayCatUI catFrame = new DisplayCatUI(factory, currentUser);
				catFrame.setVisible(true);
				OkUI frame = new OkUI("The subcategory has been updated !");
				frame.setVisible(true);
				this.dispose();		
			}
			else
			{
				EchecUI echec = new EchecUI();
				echec.setVisible(true);
			}
		}
		
	}
}
