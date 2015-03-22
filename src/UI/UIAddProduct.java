
package UI;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import BL.Front.ProductFacade;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

/**
 * @author Jules Cordonnier
 * 
 * @poseidon-object-id [Im619706dm14c21d41ce6mm79e1]
 */
public class UIAddProduct extends BaseUI {
	private JPanel newProductPanel;
	
	private JLabel infoNewProduct;
	private JLabel nameProductLabel;
	private JLabel priceProductLabel;
	private JLabel remiseProductLabel;
	private JLabel descriptionProductLabel;
	
	private JTextField nameProductText;
	private JTextField priceProductText;
	private JTextField discountProductText;
	private JButton btnAjouter;
	
	public UIAddProduct() {
			
			// Frame Characteristics
			setTitle("Mes Produits");
			setBackground(Color.gray);
			
			Object myProducts[] = {"Product 1","Product 2","Product 3","Product 4","Product 5","Product 6", "Product 7"};
			
			// Info Pannel
			
			newProductPanel = new JPanel();
			newProductPanel.setLayout(null);
			newProductPanel.setBounds(0, 30, 559, 131);
			content.add(newProductPanel);
			
			infoNewProduct = new JLabel("Informations");
			infoNewProduct.setBounds(12, 0, 183, 16);
			newProductPanel.add(infoNewProduct);
			
			nameProductLabel = new JLabel("Produit");
			nameProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			nameProductLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			nameProductLabel.setBounds(16, 25, 34, 16);
			newProductPanel.add(nameProductLabel);
			
			priceProductLabel = new JLabel("Prix (\u20AC)");
			priceProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			priceProductLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			priceProductLabel.setBounds(14, 45, 38, 16);
			newProductPanel.add(priceProductLabel);
			
			remiseProductLabel = new JLabel("Remise (%)");
			remiseProductLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			remiseProductLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			remiseProductLabel.setBounds(122, 45, 64, 16);
			newProductPanel.add(remiseProductLabel);
			
			descriptionProductLabel = new JLabel("Description");
			descriptionProductLabel.setBounds(270, 0, 183, 16);
			newProductPanel.add(descriptionProductLabel);
			
			nameProductText = new JTextField();
			nameProductText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			nameProductText.setBounds(62, 25, 183, 16);
			newProductPanel.add(nameProductText);
			nameProductText.setColumns(10);
			
			priceProductText = new JTextField();
			priceProductText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			priceProductText.setColumns(10);
			priceProductText.setBounds(62, 44, 59, 16);
			newProductPanel.add(priceProductText);
			
			discountProductText = new JTextField();
			discountProductText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			discountProductText.setColumns(10);
			discountProductText.setBounds(191, 45, 54, 16);
			newProductPanel.add(discountProductText);
			
			JButton returnButton = new JButton("Annuler");
			returnButton.setBounds(12, 111, 90, 20);
			newProductPanel.add(returnButton);
			
			btnAjouter = new JButton("Ajouter");
			btnAjouter.setBounds(469, 111, 90, 20);
			newProductPanel.add(btnAjouter);
			
			JComboBox categoryComboBox = new JComboBox();
			categoryComboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
			categoryComboBox.setModel(new DefaultComboBoxModel(new String[] {"Categorie 1", "Categorie 2", "Categorie 3"}));
			categoryComboBox.setToolTipText("");
			categoryComboBox.setBounds(72, 65, 173, 16);
			newProductPanel.add(categoryComboBox);
			
			JLabel categoryLabel = new JLabel("Categorie");
			categoryLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			categoryLabel.setBounds(16, 65, 56, 16);
			newProductPanel.add(categoryLabel);
			
			JLabel subCategoryLabel = new JLabel("Sous-Categorie");
			subCategoryLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			subCategoryLabel.setBounds(16, 85, 86, 16);
			newProductPanel.add(subCategoryLabel);
			
			JComboBox subcategoryComboBox = new JComboBox();
			subcategoryComboBox.setModel(new DefaultComboBoxModel(new String[] {"Sous-Categorie 1", "Sous-Categorie 2"}));
			subcategoryComboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
			subcategoryComboBox.setToolTipText("");
			subcategoryComboBox.setBounds(100, 85, 145, 16);
			newProductPanel.add(subcategoryComboBox);
			
			JTextArea textArea = new JTextArea();
			textArea.setFont(new Font("Tahoma", Font.PLAIN, 13));
			textArea.setRows(4);
			textArea.setBounds(270, 26, 289, 72);
			newProductPanel.add(textArea);
			
			JLabel myProductsLabel = new JLabel("Ajouter un nouveau produit");
			myProductsLabel.setBounds(12, 5, 161, 16);
			content.add(myProductsLabel);
	}
 }
