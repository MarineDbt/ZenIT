
package UI;
import javax.swing.JFrame;

import BL.Front.ProductFacade;

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

/**
 * @author Jules Cordonnier
 * 
 * @poseidon-object-id [I7e6badf8m14c21c9ffdfmm7de1]
 */
public class UIProduct extends BaseUI {
	
	private JScrollPane productPanel;
	private JPanel buttonPanel;
	private JPanel infoPanel;
	private JList productList;
	
	private JButton deleteProduct;
	private JButton addProduct;
	private JButton modifyProduct;
	
	private JLabel infoComplementaires;
	private JLabel nameProductLabel;
	private JLabel priceProductLabel;
	private JLabel subcategoryProductLabel;
	private JLabel remiseProductLabel;
	private JLabel descriptionProductLabel;
	
	private JTextField nameProductText;
	private JTextField priceProductText;
	private JTextField subcategoryProductText;
	private JTextField discountProductText;
	private JTextField descriptionProductText;
	
	public UIProduct() {
			
			// Frame Characteristics
			setTitle("Mes Commandes");
			setBackground(Color.gray);

			// Product Pannel
			
			productPanel = new JScrollPane();
			productPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			productPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			productPanel.setBounds(10, 20, 549, 100);
			content.add(productPanel);
			
			Object myProducts[] = {"Product 1","Product 2","Product 3","Product 4","Product 5","Product 6", "Product 7"};
			productList = new JList(myProducts);
			productPanel.setViewportView(productList);
			
			// Button Panel
			
			buttonPanel = new JPanel();
			buttonPanel.setLayout(null);
			buttonPanel.setBounds(571, 20, 101, 206);
			content.add(buttonPanel);
			
			deleteProduct = new JButton("Supprimer");
			deleteProduct.setBounds(0,173,100,20);
			buttonPanel.add(deleteProduct);
			
			modifyProduct = new JButton("Modifier");
			modifyProduct.setBounds(0, 150, 100, 20);
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
			
			priceProductLabel = new JLabel("Prix");
			priceProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			priceProductLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			priceProductLabel.setBounds(11, 45, 24, 16);
			infoPanel.add(priceProductLabel);
			
			subcategoryProductLabel = new JLabel("Sous-Categorie");
			subcategoryProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			subcategoryProductLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			subcategoryProductLabel.setBounds(12, 65, 79, 16);
			infoPanel.add(subcategoryProductLabel);
			
			remiseProductLabel = new JLabel("Remise");
			remiseProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			remiseProductLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			remiseProductLabel.setBounds(131, 45, 34, 16);
			infoPanel.add(remiseProductLabel);
			
			descriptionProductLabel = new JLabel("Description");
			descriptionProductLabel.setBounds(270, 0, 183, 16);
			infoPanel.add(descriptionProductLabel);
			
			nameProductText = new JTextField();
			nameProductText.setEditable(false);
			nameProductText.setBounds(62, 25, 183, 16);
			infoPanel.add(nameProductText);
			nameProductText.setColumns(10);
			
			priceProductText = new JTextField();
			priceProductText.setEditable(false);
			priceProductText.setColumns(10);
			priceProductText.setBounds(47, 45, 72, 16);
			infoPanel.add(priceProductText);
			
			subcategoryProductText = new JTextField();
			subcategoryProductText.setEditable(false);
			subcategoryProductText.setColumns(10);
			subcategoryProductText.setBounds(103, 65, 142, 16);
			infoPanel.add(subcategoryProductText);
			
			discountProductText = new JTextField();
			discountProductText.setEditable(false);
			discountProductText.setColumns(10);
			discountProductText.setBounds(176, 45, 69, 16);
			infoPanel.add(discountProductText);
			
			descriptionProductText = new JTextField();
			descriptionProductText.setEditable(false);
			descriptionProductText.setColumns(10);
			descriptionProductText.setBounds(270, 21, 289, 60);
			infoPanel.add(descriptionProductText);
		}
	}

