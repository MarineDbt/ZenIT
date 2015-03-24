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
import BL.Front.UserFacade;
import ConnectionToPersistence.AbstractPersistenceHandlerFactory;
import ConnectionToPersistence.DatabaseQueryHandlerFactory;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCenterUI extends BaseUI implements ActionListener {
	private JTable table;

	private NotificationFacade notificationFacade;
	

	/**
	 * Create the frame.
	 */
	public NotificationCenterUI(UserFacade userFacade) {
			super(userFacade);
		//super(currentUser);
		
		this.notificationFacade=new NotificationFacade();
		String[][] data = getdata();
		System.out.print(" TEEEEEEEEEEEEEEST ");
		System.out.println(data==null);
		String[] colnames = new String[] {"Source", "Message"};
		
		
		content.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		content.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setCellSelectionEnabled(true);
		table.setRowSelectionAllowed(false);
		table.setModel(new DefaultTableModel(data,colnames));
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(500);
		table.getColumnModel().getColumn(1).setMinWidth(100);
		scrollPane.setViewportView(table);
		
		JPanel buttons = new JPanel();
		content.add(buttons, BorderLayout.SOUTH);
		
		JButton btnClear = new JButton("Clear");
		buttons.add(btnClear);
		btnClear.addActionListener(this);
		btnClear.setActionCommand("clear");
		
		
		
	}

	private	String[][] getdata() {
		ArrayList<Notification> notifications = notificationFacade.notificationManager.readNotifications(userFacade.userManager.currentUser);
		Iterator<Notification> it = notifications.iterator();
		System.out.println(notifications.size());
		String[][] data = new String[notifications.size()][2];
		Notification currentNotification;
		int i = 0;
		
		while(it.hasNext()){
			currentNotification=it.next();
			System.out.print("from " + currentNotification.getId_user_send());
			System.out.println(" say " + currentNotification.getLabel());
			data[i][0]=currentNotification.getId_user_send();
			data[i][1]=currentNotification.getLabel();
			i++;
		}
		
		return data;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		super.actionPerformed(arg0);
		
		if (arg0.getActionCommand().equals("clear")){
			notificationFacade.deleteNotifications(userFacade.userManager.currentUser);
			HomeUI homeUI = new HomeUI(userFacade);
    		homeUI.userFacade=this.userFacade;
    		homeUI.setVisible(true);
	    	this.dispose();
		}
	}
}
