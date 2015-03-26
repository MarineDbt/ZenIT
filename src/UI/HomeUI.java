package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

import java.awt.FlowLayout;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;

import BL.DataClasses.User;
import BL.Front.UserFacade;

import java.awt.Color;

public class HomeUI extends BaseUI {
	private JTable table;


	/**
	 * Create the frame.
	 */
	public HomeUI(User user) {
		super(user);
		content.setLayout(new FlowLayout());
		content.add(new JLabel("Home sweet home"));
	}
}
