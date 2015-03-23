
package UI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import BL.DataClasses.Member;
import BL.Front.ProductFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

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
public class UIAddProduct extends BaseUI implements ActionListener {
	
	private JPanel newProductPanel;
	
	private JLabel infoNewProduct;
	private JLabel nameProductLabel;
	private JLabel priceProductLabel;
	private JLabel remiseProductLabel;
	private JLabel descriptionProductLabel;
	private JLabel categoryLabel;
	private JLabel subcategoryLabel;
	
	private JTextField nameProductText;
	private JTextField priceProductText;
	private JTextField discountProductText;
	private JTextArea descriptionText;
	
	private JButton addButton;
	private JButton returnButton;
	
	private JComboBox subcategoryComboBox;
	private JComboBox categoryComboBox;
	
	public ProductFacade productFacade;
	
	public UIAddProduct(AbstractPersistenceHandlerFactory factory) {
			
			// Frame Characteristics
			setTitle("Ajouter un Produit");
			setBackground(Color.gray);
			
			// Panel
			
			newProductPanel = new JPanel();
			newProductPanel.setLayout(null);
			newProductPanel.setBounds(0, 30, 559, 131);
			content.add(newProductPanel);
			
			// Labels
			
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
			
			// Texts
			
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
			
			returnButton = new JButton("Annuler");
			returnButton.setBounds(12, 111, 90, 20);
			newProductPanel.add(returnButton);
			
			addButton = new JButton("Ajouter");
			addButton.setBounds(469, 111, 90, 20);
			newProductPanel.add(addButton);
			
			categoryComboBox = new JComboBox();
			categoryComboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
			categoryComboBox.setModel(new DefaultComboBoxModel(new String[] {"Categorie 1", "Categorie 2", "Categorie 3"}));
			categoryComboBox.setToolTipText("");
			categoryComboBox.setBounds(72, 65, 173, 16);
			newProductPanel.add(categoryComboBox);
			
			categoryLabel = new JLabel("Categorie");
			categoryLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			categoryLabel.setBounds(16, 65, 56, 16);
			newProductPanel.add(categoryLabel);
			
			subcategoryLabel = new JLabel("Sous-Categorie");
			subcategoryLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			subcategoryLabel.setBounds(16, 85, 86, 16);
			newProductPanel.add(subcategoryLabel);
			
			subcategoryComboBox = new JComboBox();
			subcategoryComboBox.setModel(new DefaultComboBoxModel(new String[] {"Sous-Categorie 1", "Sous-Categorie 2"}));
			subcategoryComboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
			subcategoryComboBox.setToolTipText("");
			subcategoryComboBox.setBounds(100, 85, 145, 16);
			newProductPanel.add(subcategoryComboBox);
			
			descriptionText = new JTextArea();
			descriptionText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			descriptionText.setRows(4);
			descriptionText.setBounds(270, 26, 289, 72);
			newProductPanel.add(descriptionText);
			
			JLabel myProductsLabel = new JLabel("Ajouter un nouveau produit");
			myProductsLabel.setBounds(12, 5, 161, 16);
			content.add(myProductsLabel);
			
			// Action Listeners
			
			addButton.addActionListener(this);
			addButton.setActionCommand("add");
			
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("add")) {
			Member currentMember = new Member(1,"1");
			productFacade.addProduct(nameProductText.getText(), Float.parseFloat(priceProductText.getText()), Float.parseFloat(discountProductText.getText()), currentMember, 1, subcategoryComboBox.getSelectedItem().toString(), descriptionText.getText());
		}
		
	}
 }
