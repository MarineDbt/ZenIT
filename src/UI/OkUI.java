package UI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import BL.Front.RoomFacade;
import javax.swing.GroupLayout.Alignment;

public class OkUI extends JFrame implements ActionListener{
	
	OkUI (String message)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450, 300);
		
		Container contentPane = getContentPane();
		JPanel panel1 = new JPanel();
		
		JLabel label = new JLabel(message);
		panel1.add(label);
		contentPane.add(panel1,BorderLayout.CENTER);
		
		JPanel panel2 = new JPanel();
		JButton boutonOK = new JButton("OK");
		boutonOK.addActionListener(this);
		boutonOK.setActionCommand("Fermer");
		panel2.add(boutonOK);
		contentPane.add(panel2,BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Fermer")){
	    	 dispose();		
	}
	}
}
