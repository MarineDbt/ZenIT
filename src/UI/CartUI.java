package UI;
import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

import BL.Front.ShoppingFacade;
import BL.DataClasses.Cart;
import BL.DataClasses.Category;
import BL.DataClasses.Contains;
import BL.DataClasses.Product;
import BL.DataClasses.SubCategory;
import BL.DataClasses.User;
import BL.Front.UserFacade;
import BL.TechnicalClasses.ShoppingManager;

import javax.swing.JList;

import net.miginfocom.swing.MigLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.ScrollPaneConstants;

public class CartUI extends BaseUI implements ActionListener{

	private JPanel productList;
	private ShoppingFacade shoppingFacade;
	private Cart cart;
	private ArrayList<JLabel> quantities = new ArrayList<JLabel>();
	private ArrayList<JLabel> totals = new ArrayList<JLabel>();

	/**
	 * Launch the application.
	 */

	public CartUI(User user) {
		super(user);
		shoppingFacade=new ShoppingFacade();
		cart = shoppingFacade.showCart(currentUser);
		shoppingFacade = new ShoppingFacade();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		content.setLayout(gridBagLayout);

		JPanel products = new JPanel();
		GridBagConstraints gbc_products = new GridBagConstraints();
		gbc_products.insets = new Insets(0, 0, 5, 0);
		gbc_products.fill = GridBagConstraints.BOTH;
		gbc_products.gridx = 0;
		gbc_products.gridy = 1;
		content.add(products, gbc_products);
		products.setLayout(new GridLayout(0, 1, 0, 0));

		JScrollPane scrollPane = new JScrollPane();
		products.add(scrollPane);

		productList = new JPanel();
		scrollPane.setViewportView(productList);
		productList.setLayout(new MigLayout("", "[45px,grow][grow][grow][grow][]", "[14px][14px]"));

		JLabel lblProductName = new JLabel("Product Name");
		productList.add(lblProductName, "cell 0 0");

		JLabel lblUnitPrice = new JLabel("Unit Price");
		productList.add(lblUnitPrice, "cell 1 0,grow");

		JLabel lblQuantity = new JLabel("Quantity");
		productList.add(lblQuantity, "cell 2 0,grow");

		JLabel lblTotalPrice = new JLabel("Total Price");
		productList.add(lblTotalPrice, "cell 3 0");

		this.addProducts(this.currentUser);

		JPanel validate = new JPanel();
		GridBagConstraints gbc_validate = new GridBagConstraints();
		gbc_validate.fill = GridBagConstraints.BOTH;
		gbc_validate.gridx = 0;
		gbc_validate.gridy = 2;
		content.add(validate, gbc_validate);

		JLabel lblTotal = new JLabel("Total :");
		validate.add(lblTotal);

		JLabel label = new JLabel("50 \u20AC");
		validate.add(label);

		JButton btnBuy = new JButton("Buy");
		validate.add(btnBuy);
	}

	private void addProducts(User currentUser) {
		//System.out.println(currentUser.getId());
		ArrayList<Contains> products= cart.contains;
		Iterator<Contains> it = products.iterator();
		int i = 2;
		Contains currentContains;

		String name;
		String price;
		String quantity;
		String total;

		while(it.hasNext()){

			currentContains=it.next();
			name=currentContains.product.getNameProduct();
			price = Double.toString(currentContains.product.getPrice());
			quantity = Integer.toString(currentContains.getQuantity());
			total = Double.toString((double)currentContains.product.getPrice()*(double)currentContains.getQuantity());

			JButton moins = new JButton("-");
			moins.addActionListener(this);
			moins.setActionCommand("-" + i);

			JButton plus = new JButton("+");
			plus.addActionListener(this);
			plus.setActionCommand("+" + i);
			
			JButton delete = new JButton("delete");
			delete.addActionListener(this);
			delete.setActionCommand("x" + i);
			
			JLabel lblQuantityi;
			JLabel lblTotali;


			productList.add(new JLabel(name), "cell 0 " + i);
			productList.add(new JLabel(price), "cell 1 " + i);
			
			lblQuantityi = new JLabel(quantity);
			quantities.add(lblQuantityi);
			productList.add(lblQuantityi, "cell 2 " + i);
			
			lblTotali = new JLabel(total);
			totals.add(lblTotali);
			productList.add(lblTotali, "cell 3 " + i);
			
			productList.add(moins, "cell 4 " + i);
			productList.add(plus, "cell 5 " + i);
			productList.add(delete, "cell 6 " + i);
			i++;
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		super.actionPerformed(arg0);
		System.out.println("COUCOU " + arg0.getActionCommand().substring(0, 1));
		
		if (arg0.getActionCommand().substring(0, 1).equals("-")){
			int j = Integer.parseInt(arg0.getActionCommand().substring(1, arg0.getActionCommand().length())) - 2; //-2 car le 1er produit (j=0) est affiché à la troisème ligne ligne (i=2)
			int quantity=cart.contains.get(j).getQuantity();
			
			
			
			if (quantity==1){
				//TODO
			}
			else{
				int newQuantity = quantity - 1;
				double newTotal = newQuantity*cart.contains.get(j).product.getPrice();
				shoppingFacade.modifyQuantityProduct(cart.contains.get(j).product, cart, newQuantity);
				cart.contains.get(j).setQuantity(newQuantity);
				quantities.get(j).setText(Integer.toString(newQuantity));
				totals.get(j).setText(Double.toString(newTotal));
			}
		}
		if (arg0.getActionCommand().substring(0, 1).equals("+")){
			int j = Integer.parseInt(arg0.getActionCommand().substring(1, arg0.getActionCommand().length())) - 2; //-2 car le 1er produit (j=0) est affiché à la troisème ligne ligne (i=2)
			int quantity=cart.contains.get(j).getQuantity();
			int newQuantity =quantity + 1;
			double newTotal = newQuantity*cart.contains.get(j).product.getPrice();
			shoppingFacade.modifyQuantityProduct(cart.contains.get(j).product, cart, newQuantity);
			cart.contains.get(j).setQuantity(newQuantity);
			quantities.get(j).setText(Integer.toString(newQuantity));
			totals.get(j).setText(Double.toString(newTotal));
			
		}
		if (arg0.getActionCommand().substring(0, 1).equals("x")){
			int j = Integer.parseInt(arg0.getActionCommand().substring(1, arg0.getActionCommand().length())) - 2; //-2 car le 1er produit (j=0) est affiché à la troisème ligne ligne (i=2)
			shoppingFacade.deleteProductFromCart(cart.contains.get(j).product, cart);
			cart.contains.remove(j);
			CartUI cartUI = new CartUI(this.currentUser);
			cartUI.setVisible(true);
			this.dispose();
		}
	}
}
