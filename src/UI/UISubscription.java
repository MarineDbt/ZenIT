package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class UISubscription extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UISubscription frame = new UISubscription();
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
	public UISubscription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(157, 299, 115, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Zen Lounge");
		lblNewLabel.setBounds(172, 16, 100, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomDeFamille = new JLabel("Nom :");
		lblNomDeFamille.setBounds(75, 41, 69, 20);
		contentPane.add(lblNomDeFamille);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom :");
		lblPrnom.setBounds(75, 64, 69, 20);
		contentPane.add(lblPrnom);
		
		JLabel lblLogin = new JLabel("Login :");
		lblLogin.setBounds(75, 87, 69, 20);
		contentPane.add(lblLogin);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setBounds(75, 114, 100, 20);
		contentPane.add(lblMotDePasse);
		
		JLabel lblAdresseMail = new JLabel("Adresse mail :");
		lblAdresseMail.setBounds(75, 139, 120, 20);
		contentPane.add(lblAdresseMail);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(172, 161, 100, 20);
		contentPane.add(lblAdresse);
		
		JLabel lblNumro = new JLabel("Num\u00E9ro :");
		lblNumro.setBounds(24, 195, 120, 20);
		contentPane.add(lblNumro);
		
		JLabel lblRue = new JLabel("Rue :");
		lblRue.setBounds(231, 197, 120, 20);
		contentPane.add(lblRue);
		
		JLabel lblCodePostale = new JLabel("Code Postal :");
		lblCodePostale.setBounds(24, 231, 120, 20);
		contentPane.add(lblCodePostale);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setBounds(231, 231, 120, 20);
		contentPane.add(lblVille);
		
		JLabel lblNumroDeTlphone = new JLabel("Num\u00E9ro de t\u00E9l\u00E9phone :");
		lblNumroDeTlphone.setBounds(24, 267, 170, 20);
		contentPane.add(lblNumroDeTlphone);
		
		textField = new JTextField();
		textField.setBounds(168, 38, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 81, 146, 26);
		contentPane.add(textField_1);
	}
}
