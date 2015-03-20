package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UISupervisor extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public UISupervisor(AbstractPersistenceHandlerFactory factory) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 659, 97);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblZenLounge = new JLabel("Zen Lounge");
		lblZenLounge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblZenLounge.setBounds(274, 11, 110, 31);
		panel.add(lblZenLounge);
		
		JButton btnProfil = new JButton("Profil");
		btnProfil.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnProfil.setBounds(10, 63, 62, 23);
		panel.add(btnProfil);
		
		JButton btnActivits = new JButton("Responsable");
		btnActivits.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnActivits.setBounds(82, 63, 92, 23);
		panel.add(btnActivits);
		
		JButton btnNewButton = new JButton("Notifications");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(180, 63, 92, 23);
		panel.add(btnNewButton);
		
		JButton button = new JButton("Mes activités");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button.setBounds(282, 63, 92, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Magasin");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_1.setBounds(384, 63, 76, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Panier");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_2.setBounds(470, 63, 76, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Deconnexion");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_3.setBounds(556, 63, 93, 23);
		panel.add(button_3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
