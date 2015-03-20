package UI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;

import javax.swing.JSplitPane;

import java.awt.FlowLayout;

import javax.swing.JTextField;

import BL.Front.UserFacade;

public class RegisterPanel extends JFrame implements ActionListener {

	private JTextField tNom;
	private JTextField tPrenom;
	private JTextField tLogin;
	private JTextField tMotDePasse;
	private JTextField tMail;
	private JTextField tNumero;
	private JTextField tRue;
	private JTextField tCodePostal;
	private JTextField tVille;
	private JTextField tTelephone;
	public UserFacade userFacade;

	/**
	 * Create the frame.
	 * @
	 */
	// Constructor
	public RegisterPanel() {
		super("Subscription");
		Container contentPane = getContentPane();
		setSize(500,500);
		
		
		//Création de la première zone
		JPanel panel1 = new JPanel();
		
		JLabel titre = new JLabel("Zen Lounge");
		titre.setBounds(172, 16, 100, 20);
		panel1.add(titre);
		contentPane.add(panel1, BorderLayout.NORTH);
		
		//Création zone centrale
		JPanel panelCentral = new JPanel();
		panelCentral.setLayout(new BoxLayout(panelCentral, BoxLayout.Y_AXIS));
		contentPane.add(panelCentral, BorderLayout.CENTER);
		
		//Création de la deuxième zone
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(5,0));
		panelCentral.add(panel2);
		
		//Ajout du label nom
		JLabel nom = new JLabel("Nom :");
		nom.setBounds(75, 41, 69, 20);
		panel2.add(nom);
		
		//Ajout du text field nom
		tNom = new JTextField();
		panel2.add(tNom);
		
		//Ajout du label prénom
		JLabel prenom = new JLabel("Prénom :");
		prenom.setBounds(75, 64, 69, 20);
		panel2.add(prenom);
		
		//Ajout du text field prénom
		tPrenom = new JTextField();
		panel2.add(tPrenom);
				
		//Ajout du label login
		JLabel login = new JLabel("Login :");
		login.setBounds(75, 87, 69, 20);
		panel2.add(login);
		
		
		//Ajout du text field login
		tLogin = new JTextField();
		panel2.add(tLogin);
		
		//Ajout du label mot de passe
		JLabel motDePasse = new JLabel("Mot de passe :");
		motDePasse.setBounds(75, 114, 100, 20);
		panel2.add(motDePasse);
		
		//Ajout du text field mot de passe
		tMotDePasse = new JTextField();
		panel2.add(tMotDePasse);
		
		//Ajout du label mail
		JLabel adresseMail = new JLabel("Adresse mail :");
		adresseMail.setBounds(75, 139, 120, 20);
		panel2.add(adresseMail);
		
		//Ajout du text field mail
		tMail = new JTextField();
		panel2.add(tMail);
		
		//Création de la troisième zone
		JPanel panel3 = new JPanel();
		JLabel adresse = new JLabel("Adresse");
		adresse.setBounds(172, 16, 100, 20);
		panel3.add(adresse);
		panelCentral.add(panel3);
		
		//Création de la quatrième zone
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(5,0));
		panelCentral.add(panel4);
		
		//Ajout du label numéro
		//JLabel numero = new JLabel("Numéro :");
		//numero.setBounds(24, 195, 120, 20);
		//panel4.add(numero);
		
		//Ajout du text field numéro
		//tNumero = new JTextField();
		//panel4.add(tNumero);
		
		//Ajout du label rue
		JLabel rue = new JLabel("Rue :");
		rue.setBounds(231, 197, 120, 20);
		panel4.add(rue);
		
		//Ajout du text field rue
		tRue = new JTextField();
		panel4.add(tRue);
		
		//Ajout du label code postal
		JLabel codePostale = new JLabel("Code Postal :");
		codePostale.setBounds(24, 231, 120, 20);
		panel4.add(codePostale);
		
		//Ajout du text field code postal
		tCodePostal = new JTextField();
		panel4.add(tCodePostal);
				
		//Ajout du label ville
		JLabel ville = new JLabel("Ville :");
		ville.setBounds(231, 231, 120, 20);
		panel4.add(ville);
		
		//Ajout du text field ville
		tVille = new JTextField();
		panel4.add(tVille);
		
		//Ajout du label téléphone
		JLabel telephone = new JLabel("Numéro de téléphone :");
		telephone.setBounds(24, 267, 170, 20);
		panel4.add(telephone);
		
		//Ajout du text field téléphone
		tTelephone = new JTextField();
		panel4.add(tTelephone);

		//Création de la première zone
		JPanel panel5 = new JPanel();
		contentPane.add(panel5, BorderLayout.SOUTH);		
				
		JButton bouton = new JButton("Valider");
		bouton.addActionListener(this);
		bouton.setActionCommand("valid");
		
		bouton.setBounds(157, 299, 115, 29);
		panel5.add(bouton);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setVisible(true);
		
	}
	public void actionPerformed (ActionEvent e) 
	{ 
	     if (e.getActionCommand().equals("valid")){
	    	 userFacade.register(tNom.getText(),tPrenom.getText(),tRue.getText(),
	    			 tCodePostal.getText(),tVille.getText(),tTelephone.getText(),
	    			 tMail.getText(),tLogin.getText(),tMotDePasse.getText());
	     }
	}

	
}
