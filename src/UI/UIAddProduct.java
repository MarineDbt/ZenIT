
package UI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import BL.DataClasses.Category;
import BL.DataClasses.Member;
import BL.DataClasses.SubCategory;
import BL.Front.CategoryFacade;
import BL.Front.ProductFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;
import BL.TechnicalClasses.ProductManager;

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
	
	private JLabel myProductsLabel;
	private JLabel infoNewProduct;
	private JLabel nameProductLabel;
	private JLabel priceProductLabel;
	private JLabel remiseProductLabel;
	private JLabel quantityLabel;
	private JLabel descriptionProductLabel;
	private JLabel categoryLabel;
	private JLabel subcategoryLabel;
	
	private JTextField nameProductText;
	private JTextField priceProductText;
	private JTextField discountProductText;
	private JTextField quantityText;
	private JTextArea descriptionText;
	
	private JButton addButton;
	private JButton returnButton;
	
	private JComboBox subcategoryComboBox;
	private JComboBox categoryComboBox;
	
	public AbstractPersistenceHandlerFactory factory;
	public ProductFacade productFacade;
	
	private CategoryFacade categoryFacade;
	private ArrayList<Category> categories;
	private ArrayList<SubCategory> subcategories;
	
	public UIAddProduct(AbstractPersistenceHandlerFactory factory) {
			
			this.factory = factory;
			this.productFacade = new ProductFacade(factory);
			
			// Get Categories
			
			this.categoryFacade = new CategoryFacade(factory);
			
			categories = categoryFacade.selectAllCategories();
			String[] categ = new String[categories.size()];
			for(int i = 0; i < categ.length; i++) {
			    categ[i] = categories.get(i).getName();
			}	
			
			// Frame Characteristics
			setTitle("Ajouter un Produit");
			setBackground(Color.gray);
			
			// Panel
			
			newProductPanel = new JPanel();
			newProductPanel.setLayout(null);
			newProductPanel.setBounds(0, 30, 559, 131);
			content.add(newProductPanel);
			
			// Labels
			
			myProductsLabel = new JLabel("Ajouter un nouveau produit");
			myProductsLabel.setBounds(12, 5, 161, 16);
			content.add(myProductsLabel);
			
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
			remiseProductLabel.setBounds(89, 45, 58, 16);
			newProductPanel.add(remiseProductLabel);
			
			quantityLabel = new JLabel("Quantit\u00E9");
			quantityLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			quantityLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			quantityLabel.setBounds(159, 45, 58, 16);
			newProductPanel.add(quantityLabel);
			
			descriptionProductLabel = new JLabel("Description");
			descriptionProductLabel.setBounds(270, 0, 183, 16);
			newProductPanel.add(descriptionProductLabel);
			
			// Texts
			
			nameProductText = new JTextField();
			nameProductText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			nameProductText.setBounds(54, 25, 191, 16);
			newProductPanel.add(nameProductText);
			nameProductText.setColumns(10);
			
			priceProductText = new JTextField();
			priceProductText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			priceProductText.setColumns(10);
			priceProductText.setBounds(54, 45, 34, 16);
			newProductPanel.add(priceProductText);
			
			discountProductText = new JTextField();
			discountProductText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			discountProductText.setColumns(10);
			discountProductText.setBounds(148, 45, 23, 16);
			newProductPanel.add(discountProductText);
			
			quantityText = new JTextField();
			quantityText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			quantityText.setColumns(10);
			quantityText.setBounds(222, 45, 23, 16);
			newProductPanel.add(quantityText);
			
			returnButton = new JButton("Annuler");
			returnButton.setBounds(12, 111, 90, 20);
			newProductPanel.add(returnButton);
			
			addButton = new JButton("Ajouter");
			addButton.setBounds(469, 111, 90, 20);
			newProductPanel.add(addButton);
			
			categoryLabel = new JLabel("Categorie");
			categoryLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			categoryLabel.setBounds(16, 65, 56, 16);
			newProductPanel.add(categoryLabel);
			
			categoryComboBox = new JComboBox(categ);
			categoryComboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
			categoryComboBox.setToolTipText("");
			categoryComboBox.setBounds(64, 65, 181, 16);
			newProductPanel.add(categoryComboBox);
			
			subcategoryLabel = new JLabel("Sous-Categorie");
			subcategoryLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			subcategoryLabel.setBounds(16, 85, 86, 16);
			newProductPanel.add(subcategoryLabel);
			
			subcategoryComboBox = new JComboBox();
			subcategoryComboBox.setModel(new DefaultComboBoxModel());
			//subcategoryComboBox.setModel(new DefaultComboBoxModel(new String[] {"Vetement de Zumba", "Sous-Categorie 2"}));
			subcategoryComboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
			subcategoryComboBox.setToolTipText("");
			subcategoryComboBox.setBounds(92, 85, 153, 16);
			newProductPanel.add(subcategoryComboBox);
			
			descriptionText = new JTextArea();
			descriptionText.setFont(new Font("Tahoma", Font.PLAIN, 11));
			descriptionText.setRows(4);
			descriptionText.setBounds(270, 26, 289, 75);
			newProductPanel.add(descriptionText);
			
			// Action Listeners
			
			addButton.addActionListener(this);
			addButton.setActionCommand("add");
			
			addButton.addActionListener(this);
			returnButton.setActionCommand("return");
			
			categoryComboBox.addActionListener(this);
			categoryComboBox.setActionCommand("comboBox");
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("add")) {
			Member currentMember = new Member(1,"1");
			productFacade.addProduct(nameProductText.getText(), Float.parseFloat(priceProductText.getText()), Float.parseFloat(discountProductText.getText()), currentMember, Integer.parseInt(quantityText.getText()), subcategoryComboBox.getSelectedItem().toString(), descriptionText.getText());
			UIProduct frameProduct = new UIProduct(factory);
			frameProduct.setVisible(true);
			this.dispose();
		}
		else if (e.getActionCommand().equals("return")) {
			UIProduct frame = new UIProduct(factory);
			frame.setVisible(true);
			this.dispose();
		}
		else if (e.getActionCommand().equals("comboBox")) {
    		int selected = categoryComboBox.getSelectedIndex();
    		subcategories = categoryFacade.selectSubCategories(categories.get(selected));
    		if (subcategories == null) {
    			subcategoryComboBox.setModel(new DefaultComboBoxModel());
    		} else {
    			String[] subcateg = new String[subcategories.size()];
    			for(int i = 0; i < subcateg.length; i++) {
    			    subcateg[i] = subcategories.get(i).getName();
    			}
    			subcategoryComboBox.setModel(new DefaultComboBoxModel(subcateg));
    		}
    	}
    }
}
