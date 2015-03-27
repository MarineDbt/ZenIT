package UI;
import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

import net.miginfocom.swing.MigLayout;
import BL.DataClasses.Contains;
import BL.DataClasses.Product;
import BL.DataClasses.User;
import BL.Front.ShoppingFacade;
import BL.Front.UserFacade;

public class ShoppingUI extends BaseUI implements ItemListener{

	private JTable table;
	private ShoppingFacade shoppingFacade;
	private JComboBox cbbCategories;
	private JComboBox cbbSubcategories;
	private JPanel productsPanel;

	public ShoppingUI(User user) {
		super(user);
		shoppingFacade=new ShoppingFacade();
		Object[] categories = shoppingFacade.readCategories();

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		content.setLayout(gridBagLayout);

		JPanel search = new JPanel();
		GridBagConstraints gbc_search = new GridBagConstraints();
		gbc_search.insets = new Insets(0, 0, 5, 0);
		gbc_search.anchor = GridBagConstraints.NORTH;
		gbc_search.gridx = 0;
		gbc_search.gridy = 0;
		content.add(search, gbc_search);

		JLabel lblCategory = new JLabel("Category");
		search.add(lblCategory);

		cbbCategories = new JComboBox();
		cbbCategories.setModel(new DefaultComboBoxModel(categories));
		cbbCategories.setSelectedItem(null);
		cbbCategories.addItemListener(this);
		search.add(cbbCategories);

		JLabel lblSubcategory = new JLabel("SubCategory");
		search.add(lblSubcategory);

		cbbSubcategories = new JComboBox();
		cbbSubcategories.setModel(new DefaultComboBoxModel());
		search.add(cbbSubcategories);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(this);
		btnSearch.setActionCommand("search");
		search.add(btnSearch);

		productsPanel = new JPanel();
		GridBagConstraints gbc_products = new GridBagConstraints();
		gbc_products.insets = new Insets(0, 0, 5, 0);
		gbc_products.fill = GridBagConstraints.BOTH;
		gbc_products.gridx = 0;
		gbc_products.gridy = 1;
		content.add(productsPanel, gbc_products);
		productsPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		productsPanel.add(scrollPane);
		
		productsPanel = new JPanel();
		scrollPane.setViewportView(productsPanel);
		productsPanel.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[14px][14px]"));

	}

	private String[] getSubcategories(String category) {
		// TODO Auto-generated method stub
		return null;
	}
	private void addProducts(ArrayList<Product> products){
		Iterator<Product> it = products.iterator();
		int i = 2;
		Product currentProduct;

		String name;
		String price;
		String discount;
		String subcategory_name;


		while(it.hasNext()){

			currentProduct=it.next();
			name=currentProduct.getNameProduct();
			price = Double.toString(currentProduct.getPrice());
			discount = Double.toString(currentProduct.getDiscount());
			subcategory_name = currentProduct.getSubcategory_name();

			JButton add = new JButton("Add to cart");
			add.addActionListener(this);
			add.setActionCommand("a" + i);
			
			productsPanel.add(new JLabel(name), "cell 0 " + i);
			productsPanel.add(new JLabel(price), "cell 1 " + i);
			productsPanel.add(new JLabel(discount), "cell 2 " + i);
			productsPanel.add(new JLabel(subcategory_name), "cell 3 " + i);
			productsPanel.add(add, "cell 4 " + i);
			i++;
		}
	}
	public void itemStateChanged(ItemEvent event) {
		if (event.getStateChange() == ItemEvent.SELECTED) {
			Object[] subcategories = shoppingFacade.readSubcategories((String)cbbCategories.getSelectedItem());
			Object[] blank = new Object[1];
			blank[0]="";
			Object[] tab = new Object[subcategories.length+1];
			System.arraycopy(blank, 0, tab,0, blank.length);
			System.arraycopy(subcategories, 0, tab,blank.length, subcategories.length);
			cbbSubcategories.setModel(new DefaultComboBoxModel(tab));
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		super.actionPerformed(arg0);
		if (arg0.getActionCommand().equals("search")){
			
			productsPanel.removeAll();
			JLabel lblProductName = new JLabel("Product Name");
			productsPanel.add(lblProductName, "cell 0 0,grow");

			JLabel lblUnitPrice = new JLabel("Unit Price");
			productsPanel.add(lblUnitPrice, "cell 1 0,grow");
			
			JLabel lblDiscount = new JLabel("Discount");
			productsPanel.add(lblDiscount, "cell 2 0,grow");
			
			JLabel lblSubcategory_name = new JLabel("Subcategory");
			productsPanel.add(lblSubcategory_name, "cell 3 0,grow");

			if (cbbCategories.getSelectedItem()==null){
				System.out.println("HEEELo");
				addProducts(shoppingFacade.readAllProducts());
				this.setVisible(false);
				this.revalidate();
				this.repaint();
				this.setVisible(true);
				
			}
			else{
				if (cbbSubcategories.getSelectedItem()==null || cbbSubcategories.getSelectedItem().equals("")){

				}
				else{

				}
			}
		}
	}
}