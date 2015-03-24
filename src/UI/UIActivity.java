package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import BL.DataClasses.Activity;
import BL.DataClasses.User;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;

import java.awt.SystemColor;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;

public class UIActivity extends BaseUI implements ActionListener {

	
	public AbstractPersistenceHandlerFactory factory;
	public User user;
	private JTable table;

	public UIActivity(AbstractPersistenceHandlerFactory factory, User currentUser) {
		
		//super(factory, currentUser);
		super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
		this.factory = factory;
		this.user = currentUser;
		content.setLayout(null);
		
		JButton btnAddAnActivity = new JButton("Add an activity");
		btnAddAnActivity.setBounds(230, 6, 123, 28);
		content.add(btnAddAnActivity);
		btnAddAnActivity.addActionListener(this);
		btnAddAnActivity.setActionCommand("addActivity");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(6, 46, 560, 259);
		content.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
	
		
		/* Activity a1 = new Activity("Foot","C'est cool","c'est trop cool");
		Activity a2 = new Activity("Coucou","coucoucl","c'est trop cool");
		Activity a3 = new Activity("Ft","C'est cool","c'est trop cool");
		Activity a4 = new Activity("freg","C'est cool","c'est trop cool"); */
		
		
			/* int nbBtn =10;
			JButton[] btn;
			btn = new JButton[nbBtn];
			for (int i=0; i<btn.length; i++){
				JButton bouton = new JButton("Activité "+Integer.toString(i));
				btn[i]=bouton;
				btn[i].setBounds(210, 6+40*i, 150, 28);
				
				} */
			
	}
	
	private void addactivitytable (Activity a) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	if (e.getActionCommand().equals("addActivity")) {
		ActivityCreationUI frame = new ActivityCreationUI(factory, this.user);
		frame.setVisible(true);
		this.dispose();
		
	}
		
	}
}
