package UI;

import java.awt.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.FlowLayout;

import BL.DataClasses.User;
import BL.Front.RoomFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;


public class AddAccUI extends JFrame implements ActionListener {
	private AbstractPersistenceHandlerFactory factory;
	private JTextField textField;

	
	/**
	 * Create the frame.
	 */
	public AddAccUI(AbstractPersistenceHandlerFactory maFactory) {
		factory = maFactory;
		
		setBounds(100, 100, 450, 300);
		
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblRoomName = new JLabel("Accessory name :");
		getContentPane().add(lblRoomName);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblRoomName, 3, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, lblRoomName, -6, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField, -92, SpringLayout.EAST, getContentPane());
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnValidate = new JButton("Validate");
		springLayout.putConstraint(SpringLayout.SOUTH, textField, -61, SpringLayout.NORTH, btnValidate);
		btnValidate.addActionListener(this);
		btnValidate.setActionCommand("Validate");
		springLayout.putConstraint(SpringLayout.WEST, btnValidate, 113, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnValidate, -25, SpringLayout.SOUTH, getContentPane());
		getContentPane().add(btnValidate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("Cancel");
		springLayout.putConstraint(SpringLayout.NORTH, btnCancel, 0, SpringLayout.NORTH, btnValidate);
		springLayout.putConstraint(SpringLayout.WEST, btnCancel, 23, SpringLayout.EAST, btnValidate);
		getContentPane().add(btnCancel);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Validate")){
			RoomFacade facade = new RoomFacade(factory);
	    	 boolean result = facade.createAccessory(textField.getText());
	    	
	    	 
	    	 if(result)
	    	 {
	    		 DisplayAccUI frame = new DisplayAccUI(factory);
	    		 frame.setVisible(true);
	    		 OkUI ajoutSalleOK = new OkUI("The room has been added !");
	    		 ajoutSalleOK.setVisible(true);
	    		 dispose();
	    	 }
	    	 else
	    	 {
	    		 EchecUI echec = new EchecUI();
	    		 echec.setVisible(true);	 
	    	 }
		}
	    if (e.getActionCommand().equals("Cancel"))
	    {
	    	 DisplayAccUI frame = new DisplayAccUI(factory);
    		 frame.setVisible(true);
	    	dispose();
	    }
		}
	

}
