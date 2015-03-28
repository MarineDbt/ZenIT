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


public class DisplayAccUI extends JFrame implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	private ArrayList<Accessory> accessories;
	
	public DisplayAccUI(AbstractPersistenceHandlerFactory factory) {

		this.factory = factory;
		
		
		setBounds(100, 100, 600, 450);
		getContentPane().setLayout(null);
		JButton btnAddAcc = new JButton("Add an accessory");
		btnAddAcc.setBounds(230, 6, 150, 28);
		getContentPane().add(btnAddAcc);
		btnAddAcc.addActionListener(this);
		btnAddAcc.setActionCommand("addAcc");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 46, 560, 259);
		getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		RoomFacade facade = new RoomFacade(factory);
		this.accessories = facade.getAllAccessories();

		for (int i=0; i<accessories.size(); i++){
			JPanel panel_1 = new JPanel();
			panel.add(panel_1);
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JLabel lblNom = new JLabel(accessories.get(i).getName());
			lblNom.setMinimumSize(new Dimension(114,28));
			lblNom.setMaximumSize(new Dimension(114,28));
			lblNom.setPreferredSize(new Dimension(114,28));
			panel_1.add(lblNom);

			JButton btnUpdate = new JButton("Update");
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
		if (e.getActionCommand().equals("addAcc")) {
			
			AddAccUI frame = new AddAccUI(factory);
			frame.setVisible(true);
			this.dispose();
		}
		
		for (int i=0;i<this.accessories.size();i++) {
			
			if (e.getActionCommand().equals("delete"+i)) {
				
				RoomFacade facade = new RoomFacade(factory);
				boolean result = facade.removeAccessory(accessories.get(i));
				if (result) 
				{
					OkUI frame = new OkUI("The accessory has been removed !");
					DisplayAccUI accFrame = new DisplayAccUI(factory);
					accFrame.setVisible(true);
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
				UpdateAccUI frame = new UpdateAccUI(factory,accessories.get(i));
				frame.setVisible(true);
				this.dispose();
			}
		}
		
	}
}