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
import BL.ModelClasses.*;
import BL.Front.*;
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

public class DisplayContributorUI extends BaseUI implements ActionListener {
	
	public AbstractPersistenceHandlerFactory factory;
	public User user;
	private ArrayList<User> contributors;
	
	public DisplayContributorUI(AbstractPersistenceHandlerFactory factory, User currentUser) {
		super(currentUser);
		this.factory = factory;
		this.user = currentUser;

		content.setLayout(null);
		
		JButton btnAddContributor = new JButton("Add a contributor");
		btnAddContributor.setBounds(70, 6, 135, 28);
		content.add(btnAddContributor);
		btnAddContributor.addActionListener(this);
		btnAddContributor.setActionCommand("addContributor");

		JButton btnAllSupervisor = new JButton("Display supervisors");
		btnAllSupervisor.setBounds(212, 6, 150, 28);
		content.add(btnAllSupervisor);
		btnAllSupervisor.addActionListener(this);
		btnAllSupervisor.setActionCommand("allSupervisors");

		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(369, 6, 123, 28);
		content.add(btnReturn);
		btnReturn.addActionListener(this);
		btnReturn.setActionCommand("return");

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 46, 560, 259);
		content.add(scrollPane);

		JPanel panel = new JPanel();
		
		RoleManagementFacade facade = new RoleManagementFacade(factory);
		this.contributors = facade.getAllContributors();
		for (int i=0; i<contributors.size(); i++){
			JPanel panel_1 = new JPanel();
			panel.add(panel_1);
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			JLabel lblPrenom = new JLabel(contributors.get(i).getFirstname());
			lblPrenom.setMinimumSize(new Dimension(114,28));
			lblPrenom.setMaximumSize(new Dimension(114,28));
			lblPrenom.setPreferredSize(new Dimension(114,28));
			panel_1.add(lblPrenom);

			JLabel lblSurname = new JLabel(contributors.get(i).getSurname());
			lblSurname.setMinimumSize(new Dimension(114,28));
			lblSurname.setMaximumSize(new Dimension(114,28));
			lblSurname.setPreferredSize(new Dimension(114,28));
			panel_1.add(lblSurname);

			JButton btnDelete = new JButton("Delete");
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
		if (e.getActionCommand().equals("addContributor")) {
			AddContributorUI frame = new AddContributorUI(factory,user);
			frame.setVisible(true);
			this.dispose();
		}
		if (e.getActionCommand().equals("allSupervisors")) {
			DisplaySupervisorUI frame = new DisplaySupervisorUI(factory,user);
			frame.setVisible(true);
		}
		if (e.getActionCommand().equals("return"))
		{
			AdminServiceUI frame = new AdminServiceUI(user,factory);
			frame.setVisible(true);
			this.dispose();
		}
		for (int i=0;i<this.contributors.size();i++) {

			if (e.getActionCommand().equals("delete"+i)) {
				RoleManagementFacade facade = new RoleManagementFacade(factory);
				boolean result = facade.removeContributor(contributors.get(i));
				if (result)
				{
					//OkUI frame = new OkUI("The contributor has been removed !");
					DisplayContributorUI contributorFrame = new DisplayContributorUI(factory,user);
					contributorFrame.setVisible(true);
					this.dispose();
					//frame.setVisible(true);
				}
				else
				{
					//EchecUI echec = new EchecUI();
					//echec.setVisible(true);
				}
			}
			
		}
	}	
}