package UI;
import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
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

import BL.DataClasses.Cart;
import BL.DataClasses.Category;
import BL.DataClasses.Contains;
import BL.DataClasses.Product;
import BL.DataClasses.SubCategory;
import BL.DataClasses.User;
import BL.Front.UserFacade;

import javax.swing.JList;

import net.miginfocom.swing.MigLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.ScrollPaneConstants;

public class CartUI extends BaseUI {

	private JPanel productList;

	/**
	 * Launch the application.
	 */

	public CartUI(UserFacade userFacade) {
		super(userFacade);
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
		GridBagLayout gbl_products = new GridBagLayout();
		gbl_products.columnWidths = new int[]{159, 0};
		gbl_products.rowHeights = new int[]{50, 0, 0};
		gbl_products.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_products.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		products.setLayout(gbl_products);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		products.add(scrollPane, gbc_scrollPane);

		productList = new JPanel();
		scrollPane.setViewportView(productList);
		productList.setLayout(new MigLayout("", "[45px][][][][]", "[14px][14px]"));

		JLabel lblProductName = new JLabel("Product Name");
		productList.add(lblProductName, "cell 0 0");

		JLabel lblUnitPrice = new JLabel("Unit Price");
		productList.add(lblUnitPrice, "cell 1 0,grow");

		JLabel lblQuantity = new JLabel("Quantity");
		productList.add(lblQuantity, "cell 2 0,grow");

		JLabel lblTotalPrice = new JLabel("Total Price");
		productList.add(lblTotalPrice, "cell 3 0");

		this.addProducts(userFacade.userManager.currentUser);

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

		Collection<Contains> products=currentUser.cart.contains;
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
			//System.out.println((double)currentContains.product.getPrice());
			//System.out.println((double)currentContains.getQuantity());
			//System.out.println(total);
			//System.out.println();

			productList.add(new JLabel(name), "cell 0 " + i);
			productList.add(new JLabel(price), "cell 1 " + i);
			productList.add(new JLabel(quantity), "cell 2 " + i);
			productList.add(new JLabel(total), "cell 3 " + i);
			productList.add(new JButton("-"), "cell 4 " + i);
			productList.add(new JButton("+"), "cell 5 " + i);
			i++;
		}

	}

}
