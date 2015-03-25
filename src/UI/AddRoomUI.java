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


public class AddRoomUI extends JFrame implements ActionListener {
	private AbstractPersistenceHandlerFactory factory;
	private JTextField textField;
	private User currentUser;
	private JTextField textField_1;

	
	/**
	 * Create the frame.
	 */
	public AddRoomUI(AbstractPersistenceHandlerFactory maFactory, User user) {
		super("Ajout Salle");
		factory = maFactory;
		currentUser = user;
		
		setBounds(100, 100, 450, 300);
		
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblRoomName = new JLabel("Room name :");
		springLayout.putConstraint(SpringLayout.NORTH, lblRoomName, 74, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblRoomName, 87, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblRoomName);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, -3, SpringLayout.NORTH, lblRoomName);
		springLayout.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, lblRoomName);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnValidate = new JButton("Validate");
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
		
		JLabel lblSuperficy = new JLabel("Surface :");
		springLayout.putConstraint(SpringLayout.NORTH, lblSuperficy, 23, SpringLayout.SOUTH, lblRoomName);
		springLayout.putConstraint(SpringLayout.WEST, lblSuperficy, 101, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblSuperficy);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, lblSuperficy);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		//this.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Validate")){
			RoomFacade facade = new RoomFacade(factory);
	    	 boolean result = facade.createRoom(textField.getText(), textField_1.getText());
	    	
	    	 
	    	 if(result)
	    	 {
	    		 DisplayRoomUI frame = new DisplayRoomUI(factory,currentUser);
	    		 frame.setVisible(true);
	    		 OkUI ajoutSalleOK = new OkUI("La salle a bien été ajoutée !");
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
	    	 DisplayRoomUI frame = new DisplayRoomUI(factory,currentUser);
    		 frame.setVisible(true);
	    	dispose();
	    }
		}
	

}
