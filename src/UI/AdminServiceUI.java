package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import BL.DataClasses.User;
import BL.Front.*;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

public class AdminServiceUI extends BaseUI implements ActionListener {
	
			protected JPanel contentPane;
			private User currentUser;
			private AbstractPersistenceHandlerFactory myFactory;
			
				
			public AdminServiceUI (User user, AbstractPersistenceHandlerFactory factory)
			{
				super(user);
				
				currentUser = user;
				myFactory = factory;
				//roleManagementFacade = new RoleManagementFacade(factory);
				
				
				
				content.setLayout(new FormLayout(new ColumnSpec[] {
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,},
					new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,}));
				
				JButton btnGestionDesSalles = new JButton("Gestion des salles");
				btnGestionDesSalles.setFont(new Font("Tahoma", Font.PLAIN, 9));
				content.add(btnGestionDesSalles, "2, 2, center, top");
				btnGestionDesSalles.addActionListener(this);
				btnGestionDesSalles.setActionCommand("GestionSalle");
				
				JButton btnGestionsDesCatgories = new JButton("Gestions des categories");
				btnGestionsDesCatgories.setFont(new Font("Tahoma", Font.PLAIN, 9));
				content.add(btnGestionsDesCatgories, "4, 2, center, top");
				btnGestionsDesCatgories.addActionListener(this);
				btnGestionsDesCatgories.setActionCommand("GestionCategories");
				
				JButton btnGestionDesDroits = new JButton("Gestion des droits");
				btnGestionDesDroits.setFont(new Font("Tahoma", Font.PLAIN, 9));
				content.add(btnGestionDesDroits, "6, 2, center, top");
				btnGestionDesDroits.addActionListener(this);
				btnGestionDesDroits.setActionCommand("GestionDroit");
				
				contentPane = new JPanel();
				content.add(contentPane, "2, 4, fill, fill");
				
				
				
				
		

	}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			if (e.getActionCommand().equals("GestionSalle"))
			{
		    	AdminGestionSalle UI1 = new AdminGestionSalle(currentUser,myFactory);
		    	
		    	this.dispose();
		    	UI1.setVisible(true);
		    }
			if (e.getActionCommand().equals("GestionCategories"))
			{
				//Todo
			}
			if (e.getActionCommand().equals("GestionDroits"))
			{
				//Todo
			}
			
		}

}
