
package UI;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import BL.Front.ActivityFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

import javax.swing.JTextField;
import javax.swing.JTextArea;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1cf9]
 */
public class ActivityModificationUI extends JFrame implements ActionListener {
	
	private JPanel contentPane; 
	private JTextField textField;
	
	public ActivityModificationUI(AbstractPersistenceHandlerFactory factory) {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(200, 100, 695, 500);
	
	contentPane = new JPanel();
	//contentPane.setBackground(Color.PINK);
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	
	JPanel panel = new JPanel();
	panel.setBounds(10, 11, 659, 91);
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
	btnNewButton.setBounds(180, 63, 92, 23);
	panel.add(btnNewButton);
	
	JButton button = new JButton("Mes activités");
	//button.addActionListener(this);
	//button.setActionCommand("activity");	
	button.setFont(new Font("Tahoma", Font.PLAIN, 9));
	button.setBounds(282, 63, 92, 23);
	panel.add(button);
	
	JButton button_1 = new JButton("Magasin");
	button_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
	button_1.setBounds(384, 63, 76, 23);
	panel.add(button_1);
	
	JButton button_2 = new JButton("Panier");
	button_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
	button_2.setBounds(470, 63, 76, 23);
	panel.add(button_2);
	
	JButton button_3 = new JButton("Deconnexion");
	
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button_3.setBounds(556, 63, 93, 23);
		panel.add(button_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 113, 659, 313);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNomDeLactivit = new JLabel("Nom de l'activit\u00E9 : ");
		lblNomDeLactivit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomDeLactivit.setBounds(131, 13, 116, 14);
		panel_1.add(lblNomDeLactivit);
		
		textField = new JTextField();
		textField.setBounds(257, 11, 200, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescriptionCourte = new JLabel("Description courte :");
		lblDescriptionCourte.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDescriptionCourte.setBounds(131, 62, 116, 14);
		panel_1.add(lblDescriptionCourte);
		
		JLabel lblDescriptionDtaille = new JLabel("Description détaillée :");
		lblDescriptionDtaille.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDescriptionDtaille.setBounds(131, 131, 127, 14);
		
		panel_1.add(lblDescriptionDtaille);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(321, 252, 89, 23);
		panel_1.add(btnValider);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(257, 58, 200, 63);
		panel_1.add(textArea);
		textArea.setLineWrap(true);
		//JScrollPane scroll1 = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//panel_1.add(scroll1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(257, 127, 200, 114);
		panel_1.add(textArea_1);
 }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
