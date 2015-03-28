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

public class AddSubCatUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnValider;
	private AbstractPersistenceHandlerFactory factory;
	private Category category;


	/**
	 * Create the frame.
	 */
	public AddSubCatUI(AbstractPersistenceHandlerFactory myFactory, Category myCategory) {
		
		factory = myFactory;
		category = myCategory;
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblSubcategoryName = new JLabel("Subcategory name :");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblSubcategoryName, 46, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblSubcategoryName, -106, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblSubcategoryName);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblSubcategoryName);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 33, SpringLayout.EAST, lblSubcategoryName);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnValider = new JButton("Validate");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnValider, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnValider, -161, SpringLayout.EAST, contentPane);
		btnValider.addActionListener(this);
		btnValider.setActionCommand("Validate");
		contentPane.add(btnValider);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Validate"))
		{
			CategoryFacade facade = new CategoryFacade(factory);
			boolean result = facade.createSubCategory(category, textField.getText());
			if (result) 
			{
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
