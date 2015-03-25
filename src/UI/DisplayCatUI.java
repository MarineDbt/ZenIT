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

import BL.DataClasses.*;
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


public class DisplayCatUI extends BaseUI implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	private ArrayList<Category> cat;
	
	public DisplayCatUI(AbstractPersistenceHandlerFactory factory, User currentUser) {
		
		super(new User());

		this.factory = factory;
		this.user = currentUser;
		content.setLayout(null);
		JButton btnAddCategory = new JButton("Add a category");
		btnAddCategory.setBounds(130, 6, 123, 28);
		content.add(btnAddCategory);
		btnAddCategory.addActionListener(this);
		btnAddCategory.setActionCommand("addCategory");
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(300, 6, 123, 28);
		content.add(btnReturn);
		btnReturn.addActionListener(this);
		btnReturn.setActionCommand("return");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 46, 560, 259);
		content.add(scrollPane);
		
		JPanel panel = new JPanel();
		CategoryFacade facade = new CategoryFacade(factory);
		this.cat = facade.selectAllCategories();

		for (int i=0; i<cat.size(); i++){
			JPanel panel_1 = new JPanel();
			panel.add(panel_1);
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JLabel lblNom = new JLabel(cat.get(i).getName());
			lblNom.setMinimumSize(new Dimension(114,28));
			lblNom.setMaximumSize(new Dimension(114,28));
			lblNom.setPreferredSize(new Dimension(114,28));
			//lblNom.setBounds(6,28+39*i,71,24);
			panel_1.add(lblNom);
			
			JButton btnSubcat = new JButton("Subcategories");
			//btnDetails.setBounds(66, 26+39*i, 90, 28);
			btnSubcat.addActionListener(this);
			btnSubcat.setActionCommand("subcat"+i);
			panel_1.add(btnSubcat);

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
		if (e.getActionCommand().equals("addCategory")) {
			
			AddCategoryUI frame = new AddCategoryUI(factory,user);
			frame.setVisible(true);
			this.dispose();
		}
		
		if (e.getActionCommand().equals("return")) 
		{
			AdminServiceUI frame = new AdminServiceUI(user,factory);
			frame.setVisible(true);
			this.dispose();
		}
		
		for (int i=0;i<this.cat.size();i++) {
			if (e.getActionCommand().equals("subcat"+i)) {
				DisplaySubCatUI frame = new DisplaySubCatUI(factory, cat.get(i));
				frame.setVisible(true);
			}
			if (e.getActionCommand().equals("delete"+i)) {
				
				CategoryFacade facade = new CategoryFacade(factory);
				boolean result = facade.removeCategory(cat.get(i));
				if (result) 
				{
					OkUI frame = new OkUI("The category has been removed");
					DisplayCatUI catFrame = new DisplayCatUI(factory,user);
					catFrame.setVisible(true);
					this.dispose();
					frame.setVisible(true);
				}
				else
				{
					EchecUI echec = new EchecUI();
					echec.setVisible(true);
				}
			}
			if (e.getActionCommand().equals("update"+i)) 
			{
				UpdateCatUI frame = new UpdateCatUI(cat.get(i),factory,user);
				frame.setVisible(true);
				this.dispose();
			}
			
		}
		
	}
}
