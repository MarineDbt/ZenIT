package UI;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ShoppingUI extends BaseUI {
	private JTable table;
	public ShoppingUI() {
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
		
		JComboBox comboBox = new JComboBox();
		search.add(comboBox);
		
		JLabel lblSubcategory = new JLabel("SubCategory");
		search.add(lblSubcategory);
		
		JComboBox comboBox_1 = new JComboBox();
		search.add(comboBox_1);
		
		JButton btnSearch = new JButton("Search");
		search.add(btnSearch);
		
		JPanel products = new JPanel();
		GridBagConstraints gbc_products = new GridBagConstraints();
		gbc_products.insets = new Insets(0, 0, 5, 0);
		gbc_products.fill = GridBagConstraints.VERTICAL;
		gbc_products.gridx = 0;
		gbc_products.gridy = 1;
		content.add(products, gbc_products);
		GridBagLayout gbl_products = new GridBagLayout();
		gbl_products.columnWidths = new int[]{159, 0};
		gbl_products.rowHeights = new int[]{50, 0};
		gbl_products.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_products.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		products.setLayout(gbl_products);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		products.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Category", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		content.add(panel, gbc_panel);
		
		JButton btnAddToCart = new JButton("Add to Cart");
		panel.add(btnAddToCart);
		
		
	}

}
