package UI;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import BL.DataClasses.Product;
import BL.DataClasses.User;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;

public class UIOrderPayment extends BaseUI implements ActionListener {
	private JTextField cardNumberText;
	private JTextField expirationMonthText;
	private JTextField expirationDayText;
	private JTextField expirationYearText;
	private JTextField cryptogramText;
	
	private AbstractPersistenceHandlerFactory factory;
	private User currentUser;
	private ArrayList<Product> products;
	private JTable table;
	private JTextField aPayerTExt;
	
	public UIOrderPayment(AbstractPersistenceHandlerFactory factory, User currentUser, ArrayList<Product> products) {
		
		this.factory = factory;
		this.currentUser = currentUser;
		this.products = products;
		
		JLabel paymentTitleLabel = new JLabel("Paiement en ligne");
		paymentTitleLabel.setBounds(363, 13, 108, 16);
		content.add(paymentTitleLabel);
		
		JLabel paymentMeanLabel = new JLabel("Type de carte");
		paymentMeanLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		paymentMeanLabel.setBounds(363, 42, 79, 16);
		content.add(paymentMeanLabel);
		
		JComboBox paymentMeanComboBox = new JComboBox();
		paymentMeanComboBox.addItem("Visa");
		paymentMeanComboBox.addItem("MasterCard");
		paymentMeanComboBox.addItem("AmericanExpress");
		paymentMeanComboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		paymentMeanComboBox.setBounds(450, 40, 135, 18);
		content.add(paymentMeanComboBox);
		
		JLabel expirationDateLabel = new JLabel("Expiration (JJ/MM/AAAA)");
		expirationDateLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationDateLabel.setBounds(363, 100, 124, 16);
		content.add(expirationDateLabel);
		
		cardNumberText = new JTextField();
		cardNumberText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cardNumberText.setBounds(450, 71, 135, 18);
		content.add(cardNumberText);
		cardNumberText.setColumns(10);
		
		JLabel cardNumberLabel = new JLabel("Numero de carte");
		cardNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cardNumberLabel.setBounds(363, 71, 80, 16);
		content.add(cardNumberLabel);
		
		expirationMonthText = new JTextField();
		expirationMonthText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationMonthText.setColumns(2);
		expirationMonthText.setBounds(521, 98, 22, 18);
		content.add(expirationMonthText);
		
		expirationDayText = new JTextField();
		expirationDayText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationDayText.setColumns(2);
		expirationDayText.setBounds(495, 98, 22, 18);
		content.add(expirationDayText);
		
		expirationYearText = new JTextField();
		expirationYearText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationYearText.setColumns(4);
		expirationYearText.setBounds(547, 98, 38, 18);
		content.add(expirationYearText);
		
		JLabel cryptogramLabel = new JLabel("Cryptogramme visuel (3 chiffres)");
		cryptogramLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cryptogramLabel.setBounds(363, 129, 157, 16);
		content.add(cryptogramLabel);
		
		cryptogramText = new JTextField();
		cryptogramText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cryptogramText.setBounds(547, 129, 38, 18);
		content.add(cryptogramText);
		
		JButton returnButton = new JButton("Annuler");
		returnButton.setBounds(363, 178, 97, 25);
		content.add(returnButton);
		returnButton.addActionListener(this);
		returnButton.setActionCommand("return");
		
		JButton validateButton = new JButton("Valider");
		validateButton.setBounds(488, 178, 97, 25);
		content.add(validateButton);
		validateButton.addActionListener(this);
		validateButton.setActionCommand("validate");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 323, 132);
		content.add(scrollPane);
		
		table = new JTable();
		table.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Produit", "Prix", "Remise"
			}
		));
		scrollPane.setViewportView(table);
		
		// Fill the table
		double topay = 0;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		for (int i =0; (i<products.size()); i++) {
		// Get currentProduct
		Product currentProduct = products.get(i);
		// Transform currentEvent to array
		String[] currentProductArray = new String[3];
		currentProductArray[0] = currentProduct.getName();
		currentProductArray[1] = (String.valueOf(currentProduct.getPrice()));
		currentProductArray[2] = (String.valueOf(currentProduct.getDiscount()));
		// Add Array to JTable
		model.addRow(currentProductArray);
		// Amount to pay
		topay = topay + currentProduct.getPrice() - currentProduct.getPrice() * (currentProduct.getDiscount()/100);
		}
		
		JLabel lblNewLabel = new JLabel("\u00C0 Payer (\u20AC)");
		lblNewLabel.setBounds(12, 158, 79, 16);
		content.add(lblNewLabel);
		
		aPayerTExt = new JTextField();
		aPayerTExt.setEditable(false);
		aPayerTExt.setBounds(90, 158, 91, 16);
		content.add(aPayerTExt);
		aPayerTExt.setColumns(10);
		aPayerTExt.setText(String.valueOf(topay));
		
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("validate")) {
			
			//Créer une commande à partir des produits
			
			UIOrderPaymentConfirmation frame = new UIOrderPaymentConfirmation(this.currentUser);
			frame.setVisible(true);
			this.dispose();
			}
		if (e.getActionCommand().equals("return")) {
			//  Retourner vers cartUI
			}
	}
}
