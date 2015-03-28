package UI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import BL.Front.RoomFacade;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;

public class OkUI extends JFrame implements ActionListener{
	
	OkUI (String message)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450, 300);
		
		Container contentPane = getContentPane();
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel(message);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 64, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -179, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnOk.setActionCommand("Fermer");
		springLayout.putConstraint(SpringLayout.SOUTH, btnOk, -53, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnOk, -185, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnOk);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Fermer")){
	    	 dispose();		
	}
	}
}
