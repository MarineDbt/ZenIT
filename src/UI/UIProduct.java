
package UI;
import javax.swing.JFrame;

import BL.DataClasses.Category;
import BL.DataClasses.Member;
import BL.DataClasses.Product;
import BL.Front.CategoryFacade;
import BL.Front.ProductFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * @author Jules Cordonnier
 * 
 * @poseidon-object-id [I7e6badf8m14c21c9ffdfmm7de1]
 */
public class UIProduct extends BaseUI implements ActionListener {
	
	private JScrollPane productPanel;
	private JPanel buttonPanel;
	private JPanel infoPanel;
	private JList productList;
	
	private JButton deleteProduct;
	private JButton addProduct;
	private JButton modifyProduct;
	
	private JLabel myProductsLabel;
	private JLabel infoComplementaires;
	private JLabel nameProductLabel;
	private JLabel priceProductLabel;
	private JLabel subcategoryProductLabel;
	private JLabel discountProductLabel;
	private JLabel quantityLabel;
	private JLabel descriptionProductLabel;
	
	private JTextField nameProductText;
	private JTextField priceProductText;
	private JTextField subcategoryProductText;
	private JTextField discountProductText;
	private JTextField quantityText;
	private JTextArea descriptionTextArea;
	
	public AbstractPersistenceHandlerFactory factory;
	private ProductFacade productFacade;
	private Member currentMember;
	private ArrayList<Product> myProducts;;
	
	public UIProduct(AbstractPersistenceHandlerFactory factory, Member currentMember) {
			
			// Variables
			this.factory = factory;
			this.productFacade = new ProductFacade(factory);
			this.currentMember = currentMember;
		
			// Display Member's Products
			myProducts = productFacade.getProducts(currentMember);

			if (myProducts.size()!=0) {
				String[] products = new String[myProducts.size()];
				for(int i = 0; i < products.length; i++) {
					products[i] = myProducts.get(i).getName();
				}	
				productList = new JList(products);
			}
			else {
				productList = new JList();
			}
			
			// Display Informations
			productList.addListSelectionListener(new ListSelectionListener() {

	            @Override
	            public void valueChanged(ListSelectionEvent arg0) {
	                if (!arg0.getValueIsAdjusting()) {
	                	int index = productList.getSelectedIndex();
	                	nameProductText.setText(myProducts.get(index).getName());
	                	priceProductText.setText(String.valueOf(myProducts.get(index).getPrice()));
	                	discountProductText.setText(String.valueOf(myProducts.get(index).getDiscount()));
	                	subcategoryProductText.setText(myProducts.get(index).getSubcategory());
	                	quantityText.setText(String.valueOf(myProducts.get(index).getQuantity()));
	                	descriptionTextArea.setText(myProducts.get(index).getDescription());
	                }
	            }
	        });
			
			// Frame Characteristics
			setTitle("Mes Produits");
			setBackground(Color.gray);

			// Product Pannel
			
			productPanel = new JScrollPane();
			productPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			productPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			productPanel.setBounds(10, 25, 549, 100);
			content.add(productPanel);
			
			productList.setBackground(new Color(240, 248, 255));
			productPanel.setViewportView(productList);
			
			// Button Panel
			
			buttonPanel = new JPanel();
			buttonPanel.setLayout(null);
			buttonPanel.setBounds(571, 25, 101, 201);
			content.add(buttonPanel);
			
			deleteProduct = new JButton("Supprimer");
			deleteProduct.setBounds(0,168,100,20);
			buttonPanel.add(deleteProduct);
			
			modifyProduct = new JButton("Modifier");
			modifyProduct.setBounds(0, 145, 100, 20);
			buttonPanel.add(modifyProduct);
			
			addProduct = new JButton("Ajouter");
			addProduct.setBounds(0,0,100,20);
			buttonPanel.add(addProduct);
			
			// Info Pannel
			
			infoPanel = new JPanel();
			infoPanel.setLayout(null);
			infoPanel.setBounds(0, 132, 559, 94);
			content.add(infoPanel);
			
			infoComplementaires = new JLabel("Informations Complementaires");
			infoComplementaires.setBounds(12, 0, 183, 16);
			infoPanel.add(infoComplementaires);
			
			nameProductLabel = new JLabel("Produit");
			nameProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			nameProductLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			nameProductLabel.setBounds(16, 25, 34, 16);
			infoPanel.add(nameProductLabel);
			
			priceProductLabel = new JLabel("Prix (\u20AC)");
			priceProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			priceProductLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			priceProductLabel.setBounds(12, 45, 39, 16);
			infoPanel.add(priceProductLabel);
			
			subcategoryProductLabel = new JLabel("Sous-Categorie");
			subcategoryProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			subcategoryProductLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			subcategoryProductLabel.setBounds(11, 65, 79, 16);
			infoPanel.add(subcategoryProductLabel);
			
			discountProductLabel = new JLabel("Remise (%)");
			discountProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			discountProductLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			discountProductLabel.setBounds(104, 45, 56, 16);
			infoPanel.add(discountProductLabel);
			
			descriptionProductLabel = new JLabel("Description");
			descriptionProductLabel.setBounds(291, 0, 183, 16);
			infoPanel.add(descriptionProductLabel);
			
			nameProductText = new JTextField();
			nameProductText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			nameProductText.setBounds(56, 25, 223, 16);
			infoPanel.add(nameProductText);
			nameProductText.setColumns(10);
			
			priceProductText = new JTextField();
			priceProductText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			priceProductText.setColumns(10);
			priceProductText.setBounds(56, 45, 45, 16);
			infoPanel.add(priceProductText);
			
			subcategoryProductText = new JTextField();
			subcategoryProductText.setEditable(false);
			subcategoryProductText.setColumns(10);
			subcategoryProductText.setBounds(96, 65, 183, 16);
			infoPanel.add(subcategoryProductText);
			
			discountProductText = new JTextField();
			discountProductText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			discountProductText.setColumns(10);
			discountProductText.setBounds(161, 45, 34, 16);
			infoPanel.add(discountProductText);
			
			descriptionTextArea = new JTextArea();
			descriptionTextArea.setRows(3);
			descriptionTextArea.setFont(new Font("Tahoma", Font.PLAIN, 11));
			descriptionTextArea.setBounds(291, 25, 268, 56);
			infoPanel.add(descriptionTextArea);
			
			quantityLabel = new JLabel("Quantit\u00E9");
			quantityLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			quantityLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			quantityLabel.setBounds(194, 45, 49, 16);
			infoPanel.add(quantityLabel);
			
			quantityText = new JTextField();
			quantityText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			quantityText.setColumns(10);
			quantityText.setBounds(245, 45, 34, 16);
			infoPanel.add(quantityText);
			
			myProductsLabel = new JLabel("Mes Produits");
			myProductsLabel.setBounds(10, 5, 93, 16);
			content.add(myProductsLabel);
			
			// Action Listeners
			
			addProduct.addActionListener(this);
			addProduct.setActionCommand("add");
			
			deleteProduct.addActionListener(this);
			deleteProduct.setActionCommand("delete");
			
			modifyProduct.addActionListener(this);
			modifyProduct.setActionCommand("modify");
			
		}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("add")) {
			UIAddProduct frame = new UIAddProduct(factory, currentMember);
			frame.setVisible(true);
			this.dispose();
		}
		if (e.getActionCommand().equals("delete")) {
			productFacade.deleteProduct(myProducts.get(productList.getSelectedIndex()));
			UIProduct frame = new UIProduct(factory, currentMember);
			frame.setVisible(true);
			this.dispose();
		}
		if (e.getActionCommand().equals("modify")) {
			productFacade.modifyProduct(myProducts.get(productList.getSelectedIndex()),
														nameProductText.getText(),
														Double.parseDouble(priceProductText.getText()),
														Double.parseDouble(discountProductText.getText()),
														Integer.parseInt(quantityText.getText()),
														descriptionTextArea.getText());
			UIProduct frame = new UIProduct(factory, currentMember);
			frame.setVisible(true);
			this.dispose();
		}
	}

}

