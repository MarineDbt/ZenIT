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


public class DisplaySubCatUI extends JFrame implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	private Category category;
	private ArrayList<SubCategory> subcat;
	
	public DisplaySubCatUI(AbstractPersistenceHandlerFactory factory, Category myCategory) {

		this.factory = factory;
		this.category = myCategory;
		
		setBounds(100, 100, 600, 450);
		getContentPane().setLayout(null);
		JButton btnAddSubCategory = new JButton("Add a subcategory");
		btnAddSubCategory.setBounds(230, 6, 150, 28);
		getContentPane().add(btnAddSubCategory);
		btnAddSubCategory.addActionListener(this);
		btnAddSubCategory.setActionCommand("addSubCategory");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 46, 560, 259);
		getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		CategoryFacade facade = new CategoryFacade(factory);
		this.subcat = facade.selectSubCategories(category);

		for (int i=0; i<subcat.size(); i++){
			JPanel panel_1 = new JPanel();
			panel.add(panel_1);
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JLabel lblNom = new JLabel(subcat.get(i).getName());
			lblNom.setMinimumSize(new Dimension(114,28));
			lblNom.setMaximumSize(new Dimension(114,28));
			lblNom.setPreferredSize(new Dimension(114,28));
			//lblNom.setBounds(6,28+39*i,71,24);
			panel_1.add(lblNom);

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
		if (e.getActionCommand().equals("addSubCategory")) {
			
			AddSubCatUI frame = new AddSubCatUI(factory,category);
			frame.setVisible(true);
			this.dispose();
		}
		
		for (int i=0;i<this.subcat.size();i++) {
			
			if (e.getActionCommand().equals("delete"+i)) {
				
				CategoryFacade facade = new CategoryFacade(factory);
				boolean result = facade.removeSubCategory(subcat.get(i));
				if (result) 
				{
					OkUI frame = new OkUI("The subcategory has been removed");
					DisplaySubCatUI subcatFrame = new DisplaySubCatUI(factory,category);
					subcatFrame.setVisible(true);
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
				UpdateSubCatUI frame = new UpdateSubCatUI(subcat.get(i),factory);
				frame.setVisible(true);
				this.dispose();
			}
		}
		
	}
}