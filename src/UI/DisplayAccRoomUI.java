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


public class DisplayAccRoomUI extends JFrame implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	private Room room;
	private ArrayList<ContainsAcc> accessories;
	
	public DisplayAccRoomUI(AbstractPersistenceHandlerFactory factory, Room myRoom) {

		this.factory = factory;
		this.room = myRoom;
		
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
		this.accessories = facade.getAllContainsAcc(room);

		for (int i=0; i<accessories.size(); i++){
			JPanel panel_1 = new JPanel();
			panel.add(panel_1);
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JLabel lblNom = new JLabel(accessories.get(i).getAcc().getName());
			lblNom.setMinimumSize(new Dimension(114,28));
			lblNom.setMaximumSize(new Dimension(114,28));
			lblNom.setPreferredSize(new Dimension(114,28));
			panel_1.add(lblNom);
			
			JLabel lblQty = new JLabel(Integer.toString(accessories.get(i).getQty()));
			lblQty.setMinimumSize(new Dimension(114,28));
			lblQty.setMaximumSize(new Dimension(114,28));
			lblQty.setPreferredSize(new Dimension(114,28));
			panel_1.add(lblQty);

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
			
			AddAccRoomUI frame = new AddAccRoomUI(factory,room);
			frame.setVisible(true);
			this.dispose();
		}
		
		for (int i=0;i<this.accessories.size();i++) {
			
			if (e.getActionCommand().equals("delete"+i)) {
				
				RoomFacade facade = new RoomFacade(factory);
				boolean result = facade.removeAccessoryRoom(room,accessories.get(i).getAcc());
				if (result) 
				{
					OkUI frame = new OkUI("The accessory has been removed !");
					DisplayAccRoomUI accFrame = new DisplayAccRoomUI(factory,room);
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
				UpdateAccRoomUI frame = new UpdateAccRoomUI(factory,room,accessories.get(i));
				frame.setVisible(true);
				this.dispose();
			}
		}
		
	}
}