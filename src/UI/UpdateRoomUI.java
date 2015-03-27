package UI;

import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.FlowLayout;

import BL.DataClasses.*;
import BL.Front.RoomFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;


public class UpdateRoomUI extends JFrame implements ActionListener {
	private AbstractPersistenceHandlerFactory factory;
	private JTextField textField;
	private Room room;
	private User currentUser;
	
	/**
	 * Create the frame.
	 */
	public UpdateRoomUI(AbstractPersistenceHandlerFactory maFactory, Room myRoom, User user) {
			
		factory = maFactory;
		room = myRoom;
		currentUser = user;
		
		setBounds(100, 100, 450, 300);
		
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblRoomName = new JLabel("Room name :");
		springLayout.putConstraint(SpringLayout.NORTH, lblRoomName, 107, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblRoomName, 50, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblRoomName);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, lblRoomName);
		springLayout.putConstraint(SpringLayout.EAST, textField, -68, SpringLayout.EAST, getContentPane());
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnValidate = new JButton("Validate");
		btnValidate.addActionListener(this);
		btnValidate.setActionCommand("Validate");
		getContentPane().add(btnValidate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("Cancel");
		springLayout.putConstraint(SpringLayout.WEST, btnCancel, 231, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnCancel, -30, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnValidate, 0, SpringLayout.NORTH, btnCancel);
		springLayout.putConstraint(SpringLayout.EAST, btnValidate, -34, SpringLayout.WEST, btnCancel);
		getContentPane().add(btnCancel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Validate")){
			RoomFacade facade = new RoomFacade(factory);
	    	 boolean result = facade.modifyRoom(room, textField.getText());
	    	
	    	 if(result)
	    	 {
	    		 DisplayRoomUI frame = new DisplayRoomUI(factory,currentUser);
	    		 frame.setVisible(true);
	    		 OkUI modifSalleOK = new OkUI("The room has been updated !");
	    		 modifSalleOK.setVisible(true);
	    		 dispose();
	    	 }
	    	 else
	    	 {
	    		 EchecUI echec = new EchecUI();
	    		 echec.setVisible(true);	 
	    	 }
		}
	    if (e.getActionCommand().equals("cancel"))
	    {
	    	dispose();
	    }
		}

}