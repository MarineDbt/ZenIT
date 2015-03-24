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
import BL.Front.ActivityFacade;
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
import java.util.ArrayList;

import javax.swing.SpringLayout;

public class UIActivity extends BaseUI implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	ArrayList<Activity> act;
		
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

		
		
		ActivityFacade facade = new ActivityFacade(factory);
		this.act = facade.getActivities(this.user);
		
		
		for (int i=0; i<act.size(); i++){
			JPanel panel_1 = new JPanel();
			panel.add(panel_1);
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JLabel lblNom = new JLabel(act.get(i).getName());
			lblNom.setMinimumSize(new Dimension(114,28));
			lblNom.setMaximumSize(new Dimension(114,28));
			lblNom.setPreferredSize(new Dimension(114,28));
			//lblNom.setBounds(6,28+39*i,71,24);
			panel_1.add(lblNom);
			
			JButton btnDetails = new JButton("Details");
			//btnDetails.setBounds(66, 26+39*i, 90, 28);
			btnDetails.addActionListener(this);
			btnDetails.setActionCommand("details"+i);
			panel_1.add(btnDetails);
			
			JButton btnContributors = new JButton("Contributors");
			//btnContributors.setBounds(170, 26+39*i, 119, 28);
			btnContributors.addActionListener(this);
			btnContributors.setActionCommand("contributors"+i);
			panel_1.add(btnContributors);
			
			JButton btnUpdate = new JButton("Update");
			//btnUpdate.setBounds(299, 26+39*i, 90, 28);
			btnUpdate.addActionListener(this);
			btnUpdate.setActionCommand("update"+i);
			panel_1.add(btnUpdate);
			
			JButton btnDelete = new JButton("Delete");
			//btnDelete.setBounds(401, 26+39*i, 90, 28);
			btnDelete.addActionListener(this);
			btnDelete.setActionCommand("delete"+i);
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
	//actions du bouton détail
	for (int i=0;i<this.act.size();i++) {
	if (e.getActionCommand().equals("details"+i)) {
		DescActivityUI frame = new DescActivityUI(factory, this.user, act.get(i));
		frame.setVisible(true);
		this.dispose();
	}
	
	if (e.getActionCommand().equals("delete"+i)) {
		UIActivity frame = new UIActivity(factory, this.user);
		ActivityFacade facade = new ActivityFacade(factory);
		facade.deleteActivity(this.act.get(i));
		frame.setVisible(true);
		this.dispose();
		
	}
	
	if (e.getActionCommand().equals("update"+i)) {
		UpdateActivityUI frame = new UpdateActivityUI(this.factory,this.user,this.act.get(i));
		frame.setVisible(true);
		this.dispose();
	}
	
	if (e.getActionCommand().equals("contributors"+i)) {
		
	}
	
	
	
	}
		
	}
}
