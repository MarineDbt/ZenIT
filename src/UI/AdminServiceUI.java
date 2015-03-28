package UI;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import BL.ModelClasses.*;
import BL.Front.*;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;


public class AdminServiceUI extends BaseUI implements ActionListener {

	protected JPanel contentPane;

	private User currentUser;

	private AbstractPersistenceHandlerFactory myFactory;

	/* Constructor */
	
	public AdminServiceUI (User user, AbstractPersistenceHandlerFactory factory)
	{
		super(user);
		currentUser = user;
		myFactory = factory;
		
		
		content.setLayout(null);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		content.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));;

		JButton btnGestionDesSalles = new JButton("Rooms management");
		btnGestionDesSalles.setFont(new Font("Tahoma", Font.PLAIN, 9));
		content.add(btnGestionDesSalles);
		btnGestionDesSalles.addActionListener(this);
		btnGestionDesSalles.setActionCommand("GestionSalle");
		
		JButton btnGestionsDesCatgories = new JButton("Categories management");
		btnGestionsDesCatgories.setFont(new Font("Tahoma", Font.PLAIN, 9));
		content.add(btnGestionsDesCatgories);
		btnGestionsDesCatgories.addActionListener(this);
		btnGestionsDesCatgories.setActionCommand("GestionCategories");

		JButton btnGestionDesDroits = new JButton("Right management");
		btnGestionDesDroits.setFont(new Font("Tahoma", Font.PLAIN, 9));
		content.add(btnGestionDesDroits);
		btnGestionDesDroits.addActionListener(this);
		btnGestionDesDroits.setActionCommand("GestionDroits");
		content.add(panel);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("GestionSalle"))
		{
			//DisplayRoomUI UI1 = new DisplayRoomUI(myFactory,currentUser);
			//UI1.setVisible(true);
			//this.dispose();
		}
		if (e.getActionCommand().equals("GestionCategories"))
		{
			//DisplayCatUI UI2 = new DisplayCatUI(myFactory,currentUser);
			//UI2.setVisible(true);
			//this.dispose();
		}
		if (e.getActionCommand().equals("GestionDroits"))
		{
			DisplayContributorUI UI3 = new DisplayContributorUI(myFactory,currentUser);
			UI3.setVisible(true);
			this.dispose();
		}
	}
}