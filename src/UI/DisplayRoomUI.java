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


public class DisplayRoomUI extends BaseUI implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	private ArrayList<Room> rooms;
	
	public DisplayRoomUI(AbstractPersistenceHandlerFactory factory, User currentUser) {
		
		super(currentUser);

		this.factory = factory;
		this.user = currentUser;
		content.setLayout(null);
		
		JButton btnAddCategory = new JButton("Add a room");
		btnAddCategory.setBounds(70, 6, 123, 28);
		content.add(btnAddCategory);
		btnAddCategory.addActionListener(this);
		btnAddCategory.setActionCommand("addRoom");
		

		JButton btnAllAccessories = new JButton("All accessories");
		btnAllAccessories.setBounds(200, 6, 123, 28);
		content.add(btnAllAccessories);
		btnAllAccessories.addActionListener(this);
		btnAllAccessories.setActionCommand("allAccessories");
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(330, 6, 123, 28);
		content.add(btnReturn);
		btnReturn.addActionListener(this);
		btnReturn.setActionCommand("return");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 46, 560, 259);
		content.add(scrollPane);
		
		JPanel panel = new JPanel();
		RoomFacade facade = new RoomFacade(factory);
		this.rooms = facade.getAllRooms();

		for (int i=0; i<rooms.size(); i++){
			JPanel panel_1 = new JPanel();
			panel.add(panel_1);
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JLabel lblNom = new JLabel(rooms.get(i).getId());
			lblNom.setMinimumSize(new Dimension(114,28));
			lblNom.setMaximumSize(new Dimension(114,28));
			lblNom.setPreferredSize(new Dimension(114,28));
			panel_1.add(lblNom);
			
			JLabel lblSup = new JLabel(Float.toString(rooms.get(i).getSuperficy()));
			lblSup.setMinimumSize(new Dimension(114,28));
			lblSup.setMaximumSize(new Dimension(114,28));
			lblSup.setPreferredSize(new Dimension(114,28));
			panel_1.add(lblNom);
			
			JButton btnSubcat = new JButton("Accessories");
			btnSubcat.addActionListener(this);
			btnSubcat.setActionCommand("accessories"+i);
			panel_1.add(btnSubcat);

			JButton btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(this);
			btnUpdate.setActionCommand("update"+i);
			panel_1.add(btnUpdate);
			
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
		if (e.getActionCommand().equals("addRoom")) {
			
			AddRoomUI frame = new AddRoomUI(factory,user);
			frame.setVisible(true);
			this.dispose();
		}
		if (e.getActionCommand().equals("allAccessories")) {
			
		//Todo
		}
		
		if (e.getActionCommand().equals("return")) 
		{
			AdminServiceUI frame = new AdminServiceUI(user,factory);
			frame.setVisible(true);
			this.dispose();
		}
		
		for (int i=0;i<this.rooms.size();i++) {
			if (e.getActionCommand().equals("accessories"+i)) {
				
				DisplayAccRoomUI frame = new DisplayAccRoomUI(factory, rooms.get(i));
				frame.setVisible(true);
			}
			if (e.getActionCommand().equals("delete"+i)) {
				
				RoomFacade facade = new RoomFacade(factory);
				boolean result = facade.removeRoom(rooms.get(i));
				if (result) 
				{
					OkUI frame = new OkUI("The room has been removed");
					DisplayRoomUI roomFrame = new DisplayRoomUI(factory,user);
					roomFrame.setVisible(true);
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
				UpdateRoomUI frame = new UpdateRoomUI(factory,rooms.get(i),user);
				frame.setVisible(true);
				this.dispose();
			}
			
		}
		
	}
}
