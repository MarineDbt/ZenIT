package UI;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.ScrollPaneConstants;

public class UIPaymentConfirmation extends BaseUI{
	private JTextField paymentMeanText;
	private JTextField expirationMonthText;
	private JTextField expirationDayText;
	private JTextField expirationYearText;
	private JTextField cryptogramText;
	private JTextField numCardText;
	private JTable table;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTextField textField;
	public UIPaymentConfirmation() {
		
		JLabel paymentTitleLabel = new JLabel("Confirmation Paiement");
		paymentTitleLabel.setBounds(12, 13, 154, 16);
		content.add(paymentTitleLabel);
		
		JLabel paymentMeanLabel = new JLabel("Type de carte");
		paymentMeanLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		paymentMeanLabel.setBounds(12, 42, 79, 16);
		content.add(paymentMeanLabel);
		
		JLabel expirationDateLabel = new JLabel("Expiration (JJ/MM/AAAA)");
		expirationDateLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationDateLabel.setBounds(12, 100, 124, 16);
		content.add(expirationDateLabel);
		
		paymentMeanText = new JTextField();
		paymentMeanText.setEditable(false);
		paymentMeanText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		paymentMeanText.setBounds(99, 40, 135, 18);
		content.add(paymentMeanText);
		paymentMeanText.setColumns(10);
		
		JLabel cardNumberLabel = new JLabel("Numero de carte");
		cardNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cardNumberLabel.setBounds(12, 71, 80, 16);
		content.add(cardNumberLabel);
		
		expirationMonthText = new JTextField();
		expirationMonthText.setEditable(false);
		expirationMonthText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationMonthText.setColumns(2);
		expirationMonthText.setBounds(170, 98, 22, 18);
		content.add(expirationMonthText);
		
		expirationDayText = new JTextField();
		expirationDayText.setEditable(false);
		expirationDayText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationDayText.setColumns(2);
		expirationDayText.setBounds(144, 98, 22, 18);
		content.add(expirationDayText);
		
		expirationYearText = new JTextField();
		expirationYearText.setEditable(false);
		expirationYearText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationYearText.setColumns(4);
		expirationYearText.setBounds(196, 98, 38, 18);
		content.add(expirationYearText);
		
		JLabel cryptogramLabel = new JLabel("Cryptogramme visuel (3 chiffres)");
		cryptogramLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cryptogramLabel.setBounds(12, 129, 157, 16);
		content.add(cryptogramLabel);
		
		cryptogramText = new JTextField();
		cryptogramText.setEditable(false);
		cryptogramText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cryptogramText.setBounds(196, 128, 38, 18);
		content.add(cryptogramText);
		
		JButton returnButton = new JButton("Annuler");
		returnButton.setBounds(12, 188, 97, 25);
		content.add(returnButton);
		
		JButton validateButton = new JButton("Confirmer");
		validateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		validateButton.setBounds(538, 188, 97, 25);
		content.add(validateButton);
		
		numCardText = new JTextField();
		numCardText.setEditable(false);
		numCardText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		numCardText.setColumns(10);
		numCardText.setBounds(99, 69, 135, 18);
		content.add(numCardText);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(278, 40, 350, 105);
		content.add(scrollPane);
		
		table = new JTable();
		table.setShowGrid(false);
		table.setFillsViewportHeight(true);
		table.setBackground(new Color(240, 248, 255));
		table.setRowSelectionAllowed(false);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Produit 1", new Float(100.0f), new Float(15.0f)},
				{"Produit 2", new Float(50.0f), new Float(10.0f)},
				{"Adhesion", "65.0", "0"},
				{"Event", "20.0", "0"},
			},
			new String[] {
				"Produit", "Prix (\u20AC)", "Reduc (%)"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(142);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(57);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(74);
		
		JLabel lblTotal = new JLabel("Total \u00E0 payer (\u20AC)");
		lblTotal.setBounds(278, 136, 97, 50);
		content.add(lblTotal);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setBounds(387, 152, 56, 18);
		content.add(textField);
		textField.setColumns(10);
	}
}
