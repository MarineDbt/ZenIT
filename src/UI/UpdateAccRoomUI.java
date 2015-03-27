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


public class UpdateAccRoomUI extends JFrame implements ActionListener {
	private AbstractPersistenceHandlerFactory factory;
	private JTextField textField;
	private Room room;
	private ContainsAcc acc;
	private User currentUser;
	
	/**
	 * Create the frame.
	 */
	public UpdateAccRoomUI(AbstractPersistenceHandlerFactory maFactory, Room myRoom, ContainsAcc myAcc) {
			
		factory = maFactory;
		room = myRoom;
		acc = myAcc;
		
		setBounds(100, 100, 450, 300);
		
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblRoomName = new JLabel("Quantity :");
		getContentPane().add(lblRoomName);
		
		textField = new JTextField(acc.getQty());
		springLayout.putConstraint(SpringLayout.NORTH, textField, 107, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblRoomName, 3, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, lblRoomName, -37, SpringLayout.WEST, textField);
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
	    	 boolean result = facade.modifyAccessoryRoom(acc.getAcc(),room,textField.getText());
	    	
	    	 if(result)
	    	 {
	    		 DisplayAccRoomUI frame = new DisplayAccRoomUI(factory,room);
	    		 frame.setVisible(true);
	    		 OkUI modifAccOK = new OkUI("The number of accessory has been updated !");
	    		 modifAccOK.setVisible(true);
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
	    	dispose();
	    }
		}

}
