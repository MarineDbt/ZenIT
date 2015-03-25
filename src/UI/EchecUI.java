package UI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class EchecUI extends JFrame implements ActionListener {
	
	public EchecUI ()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450, 300);
		
		Container contentPane = getContentPane();
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblUneErreurEst = new JLabel("Une erreur est survenue ! Vérifiez les informations saisies");
		springLayout.putConstraint(SpringLayout.NORTH, lblUneErreurEst, 55, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblUneErreurEst, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblUneErreurEst);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(this);
		btnOk.setActionCommand("Fermer");
		springLayout.putConstraint(SpringLayout.SOUTH, btnOk, -29, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnOk, -186, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnOk);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Fermer")){
		    	 dispose();		
		}
		
	}
}
