package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;

public class ClientUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientUI frame = new ClientUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel ruban = new JPanel();
		contentPane.add(ruban, BorderLayout.NORTH);
		ruban.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnHome = new JButton("Home");
		ruban.add(btnHome);
		
		JButton btnProfile = new JButton("Profile");
		ruban.add(btnProfile);
		
		JButton btnNotifications = new JButton("Notifications");
		ruban.add(btnNotifications);
		
		JButton btnShopping = new JButton("Shopping");
		ruban.add(btnShopping);
		
		JButton btnLogOut = new JButton("Log out");
		ruban.add(btnLogOut);
		
		JPanel content = new JPanel();
		contentPane.add(content, BorderLayout.CENTER);
	}

}
