package UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

import java.awt.FlowLayout;

import javax.swing.SpringLayout;

public class UIActivity extends BaseUI implements ActionListener {

	
	public AbstractPersistenceHandlerFactory factory;
	public User user;

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
		scrollPane.setBounds(6, 46, 560, 259);
		content.add(scrollPane);
		
		JPanel panel = new JPanel();

		
		Activity[] act = new Activity[8];
		act[0] = new Activity("aaaaa","aaaaa","aaaaaa");
		act[1] = new Activity("bbbb","bbbb","bbbb");
		act[2] = new Activity("ccc","ccc","ccc");
		act[3] = new Activity("ddd","ddd","ddd"); 
		act[4] = new Activity("eee","eee","eeeeee");
		act[5] = new Activity("ffff","ffff","ffff");
		act[6] = new Activity("gggg","gggg","gggg");
		act[7] = new Activity("hhhh","hhhh","hhhh"); 
		
		
		for (int i=0; i<act.length; i++){
			JPanel panel_1 = new JPanel();
			panel.add(panel_1);
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JLabel lblNom = new JLabel(act[i].getName());
			lblNom.setMinimumSize(new Dimension(114,28));
			lblNom.setMaximumSize(new Dimension(114,28));
			lblNom.setPreferredSize(new Dimension(114,28));
			//lblNom.setBounds(6,28+39*i,71,24);
			panel_1.add(lblNom);
			
			JButton btnDetails = new JButton("Details");
			//btnDetails.setBounds(66, 26+39*i, 90, 28);
			panel_1.add(btnDetails);
			
			JButton btnContributors = new JButton("Contributors");
			//btnContributors.setBounds(170, 26+39*i, 119, 28);
			panel_1.add(btnContributors);
			
			JButton btnUpdate = new JButton("Update");
			//btnUpdate.setBounds(299, 26+39*i, 90, 28);
			panel_1.add(btnUpdate);
			
			JButton btnDelete = new JButton("Delete");
			//btnDelete.setBounds(401, 26+39*i, 90, 28);
			panel_1.add(btnDelete);
			} 		
		
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		
		
			
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
