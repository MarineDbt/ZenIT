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

import BL.DataClasses.User;

import java.awt.Color;

public class NotificationCenterUI extends BaseUI {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		super(currentUser);
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
			new Object[][] {
				{"Jules", "salut salut salut salut salut salut salut salut salut salut salut ezrgbzertgbehrtbrthergbertergbrgbhd"},
				{"Elie", "hey"},
			},
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
		content = new JPanel();
		
	}
}
