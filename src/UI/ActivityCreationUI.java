
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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import BL.DataClasses.User;
import BL.Front.ActivityFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;

import javax.swing.JTextField;
import javax.swing.JTextArea;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.ScrollPaneConstants;

/**
 * 
 * 
 * @poseidon-object-id [I97bf540m14c21da4a12mm1cf9]
 */
public class ActivityCreationUI extends BaseUI implements ActionListener{
	
	User user;
	
	public AbstractPersistenceHandlerFactory factory;
	private JTextField textField_1;
	private JTextField shorttext;
	private JTextField detailledtext;
	
	
	public ActivityCreationUI(AbstractPersistenceHandlerFactory factory, User currentUser) {
		
		//super(factory, currentUser);
				super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
				this.factory = factory;
				this.user = currentUser;
				content.setLayout(null);
				
				JLabel lblName = new JLabel("Name : ");
				lblName.setBounds(125, 40, 55, 16);
				content.add(lblName);
				
				JLabel lblShortDescription = new JLabel("Short description :");
				lblShortDescription.setBounds(125, 97, 115, 16);
				content.add(lblShortDescription);
				
				JLabel lblDetailledDescription = new JLabel("Detailled description :");
				lblDetailledDescription.setBounds(125, 171, 126, 16);
				content.add(lblDetailledDescription);
				
				textField_1 = new JTextField();
				textField_1.setBounds(262, 34, 208, 28);
				content.add(textField_1);
				textField_1.setColumns(10);
				
				
				JButton btnSend = new JButton("Send");
				btnSend.setBounds(323, 276, 90, 28);
				content.add(btnSend);
				btnSend.addActionListener(this);
				btnSend.setActionCommand("send");
				
				shorttext = new JTextField();
				shorttext.setBounds(262, 91, 208, 28);
				content.add(shorttext);
				shorttext.setColumns(10);
				
				detailledtext = new JTextField();
				detailledtext.setBounds(263, 165, 207, 28);
				content.add(detailledtext);
				detailledtext.setColumns(10);
 }


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("send")) {
			
			// a enlever apres
			User usertropcool = new User("Marine", "Dubédat", "rue trop cool", "34000", "Montpellier", "0603899427", "mailtropcool", "marinedbt", "marine");
			
			ActivityFacade facade = new ActivityFacade(factory);
			boolean result = facade.addActivity(this.textField_1.getText(),usertropcool, this.shorttext.getText(), this.detailledtext.getText());
			
			
			if (result ==true) {
			UIActivity frame = new UIActivity(factory, user);
			frame.setVisible(true); 
			this.dispose();
			}
			
			if (result ==false) {
				UIActivity frame = new UIActivity(factory, user);
				frame.setVisible(true); 
				this.dispose();
			}
		}
		
	}
}