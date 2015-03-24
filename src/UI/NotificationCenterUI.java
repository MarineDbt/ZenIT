package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

import java.awt.FlowLayout;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;

import BL.DataClasses.Notification;
import BL.DataClasses.User;
import BL.Front.NotificationFacade;
import ConnectionToPersistence.AbstractPersistenceHandlerFactory;
import ConnectionToPersistence.DatabaseQueryHandlerFactory;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCenterUI extends BaseUI {
	private JTable table;

	private NotificationFacade notificationFacade;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 
					DatabaseQueryHandlerFactory.createFactory();
					User currentUser = new User("Elie","a");
					NotificationCenterUI frame = new NotificationCenterUI(new User());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NotificationCenterUI(User currentUser) {
		
		super(new User());
		//super(currentUser);
		
		this.notificationFacade=new NotificationFacade();
		Object[][] tableModel = getTableModel();
		
		
		content.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		content.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setCellSelectionEnabled(true);
		table.setRowSelectionAllowed(false);
		table.setModel(new DefaultTableModel(
			tableModel,
			new String[] {
				"Source", "Message"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(500);
		table.getColumnModel().getColumn(1).setMinWidth(100);
		scrollPane.setViewportView(table);
		
		JPanel buttons = new JPanel();
		content.add(buttons, BorderLayout.SOUTH);
		
		JButton btnClear = new JButton("Clear");
		buttons.add(btnClear);
		
		
		
	}

	private	String[][] getTableModel() {
		ArrayList<Notification> notifications = notificationFacade.notificationManager.readNotifications(currentUser);
		Iterator<Notification> it = notifications.iterator();
		String[][] tableModel = new String[2][notifications.size()];
		Notification currentNotification;
		int i = 0;
		while(it.hasNext()){
			currentNotification=it.next();
			
			tableModel[1][i]=currentNotification.getId_user_send();
			tableModel[2][i]=currentNotification.getLabel();
			i++;
			
		}
		
		return null;
	}
}
