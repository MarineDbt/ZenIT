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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class CopyOfHomeUI extends BaseUI {
	private JTable table;
	public UserFacade userFacade;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CopyOfHomeUI frame = new CopyOfHomeUI(new User());
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
	public CopyOfHomeUI(User currentUser) {
		super(new User());
		content.setLayout(new MigLayout("", "[][44px][][][][][][]", "[28px][][]"));
		
		textField = new JTextField();
		content.add(textField, "cell 1 0,growx,aligny top");
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		content.add(lblNewLabel, "cell 4 2");
	}
}
