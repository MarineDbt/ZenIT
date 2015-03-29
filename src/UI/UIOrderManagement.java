
package UI;
import javax.swing.JFrame;

import BL.Front.OrderFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.OrderManager;
import BL.DataClasses.*;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * 
 * @poseidon-object-id [I7e6badf8m14c21c9ffdfmm7e13]
 */
public class UIOrderManagement extends BaseUI implements ActionListener {

	private JScrollPane orderPanel;
	private JList orderList;
	private JPanel buttonPanel;
	private JPanel infoPanel;
	private JButton cancelOrder;
	private JButton validateOrder;
	private JLabel infoComplementaires;
	private JLabel numOrderLabel;
	private JLabel buyerLabel;
	private JLabel paymentMeanLabel;
	private JTextField numOrderText;
	private JTextField buyerText;
	private JTextField paymentMeanText;
	private JLabel lblCommandesValider;

	private OrderFacade orderFacade;
	public AbstractPersistenceHandlerFactory factory;
	private Member currentMember;
	private ArrayList<Order> myOrders;

	public UIOrderManagement(AbstractPersistenceHandlerFactory factory) {

		// Declarations
		this.factory = factory;
		this.orderFacade = new OrderFacade(factory);
		this.currentMember = currentMember;

		
		lblCommandesValider = new JLabel("Commandes \u00E0 Valider");
		lblCommandesValider.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCommandesValider.setBounds(12, 13, 149, 16);
		content.add(lblCommandesValider);

		// Display Member's Products
		myOrders = orderFacade.getOrders();

		if (myOrders.size()!=0) {

			String[] orders = new String[myOrders.size()];

			for(int i = 0; i < myOrders.size(); i++) {
				orders[i] = "Commande n°" + String.valueOf(myOrders.get(i).getID());
			}

			orderList = new JList(orders);
		}
		else {
			orderList = new JList();
		}
		// Display Informations
		orderList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if (!arg0.getValueIsAdjusting()) {
					int index = orderList.getSelectedIndex();
					numOrderText.setText(String.valueOf(myOrders.get(index).getID()));
					buyerText.setText(myOrders.get(index).getUser());
					if (myOrders.get(index).getPaymentMean() == 1) {
						paymentMeanText.setText("Visa");}
					else if (myOrders.get(index).getPaymentMean() == 2) {
						paymentMeanText.setText("MasterCard");}
					else if (myOrders.get(index).getPaymentMean() == 3) {
						paymentMeanText.setText("AmericanExpress");}
					else {paymentMeanText.setText("Pas spécifié");}
				}
			}
		});

		// Product Pannel
		orderPanel = new JScrollPane();
		orderPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		orderPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		orderPanel.setBounds(12, 42, 200, 171);
		content.add(orderPanel);
		orderPanel.setViewportView(orderList);

		// Button Panel
		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setBounds(237, 188, 279, 25);
		content.add(buttonPanel);
		cancelOrder = new JButton("Refuser");
		
		cancelOrder.setBounds(12,0,100,20);
		buttonPanel.add(cancelOrder);
		validateOrder = new JButton("Accepter");
		validateOrder.setBounds(179,0,100,20);
		buttonPanel.add(validateOrder);
		
		// Info Pannel
		infoPanel = new JPanel();
		infoPanel.setLayout(null);
		infoPanel.setBounds(237, 65, 279, 106);
		content.add(infoPanel);
		numOrderLabel = new JLabel("N\u00B0 Commande");
		numOrderLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		numOrderLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		numOrderLabel.setBounds(12, 25, 74, 16);
		infoPanel.add(numOrderLabel);
		buyerLabel = new JLabel("Acheteur");
		buyerLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		buyerLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buyerLabel.setBounds(12, 45, 74, 16);
		infoPanel.add(buyerLabel);
		numOrderText = new JTextField();
		numOrderText.setEditable(false);
		numOrderText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		numOrderText.setBounds(90, 25, 189, 16);
		infoPanel.add(numOrderText);
		numOrderText.setColumns(10);
		buyerText = new JTextField();
		buyerText.setEditable(false);
		buyerText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buyerText.setColumns(10);
		buyerText.setBounds(90, 45, 189, 16);
		infoPanel.add(buyerText);
		paymentMeanLabel = new JLabel("Carte");
		paymentMeanLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		paymentMeanLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		paymentMeanLabel.setBounds(37, 64, 49, 16);
		infoPanel.add(paymentMeanLabel);
		paymentMeanText = new JTextField();
		paymentMeanText.setEditable(false);
		paymentMeanText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		paymentMeanText.setColumns(10);
		paymentMeanText.setBounds(90, 64, 189, 16);
		infoPanel.add(paymentMeanText);
		infoComplementaires = new JLabel("Informations Complementaires");
		infoComplementaires.setBounds(12, 0, 183, 16);
		infoPanel.add(infoComplementaires);
		
		// Action Listeners
		validateOrder.addActionListener(this);
		validateOrder.setActionCommand("validate");
		cancelOrder.addActionListener(this);
		cancelOrder.setActionCommand("cancel");
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("validate")) {
			this.orderFacade.acceptOrder(myOrders.get(orderList.getSelectedIndex()));
			UIOrderManagement frame = new UIOrderManagement(factory);
			frame.setVisible(true);
			this.dispose();
		}
		if (e.getActionCommand().equals("cancel")) {
			this.orderFacade.cancelOrder(myOrders.get(orderList.getSelectedIndex()));
			UIOrderManagement frame = new UIOrderManagement(factory);
			frame.setVisible(true);
			this.dispose();
		}
	}
}


