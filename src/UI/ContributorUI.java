
package UI;
import BL.Front.ContributorFacade;

import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


/**
 * 
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm5f84]
 */
public class ContributorUI extends BaseUI {
	
	private JScrollPane planningPanel;
	private JTable planningTable;
	private JTable table;
	
	public ContributorUI() {
		
		
		//Description
		JTextArea descriptionArea = new JTextArea();
		descriptionArea.setBounds(12, 63, 200, 113);
		content.add(descriptionArea);
		
		JButton btnNewButton = new JButton("Modifier");
		btnNewButton.setBounds(12, 189, 97, 25);
		content.add(btnNewButton);
		
		// Planning Pannel
		planningPanel = new JScrollPane();
		planningPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		planningPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		planningPanel.setBounds(224, 63, 489, 113);
		content.add(planningPanel);
		planningPanel.setViewportView(planningTable);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"
			}
		));
		planningPanel.setViewportView(table);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(12, 24, 200, 50);
		content.add(lblDescription);
		
		JLabel lblNewLabel = new JLabel("Planning");
		lblNewLabel.setBounds(224, 24, 200, 50);
		content.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Profil Intervenant");
		lblNewLabel_1.setBounds(12, 0, 200, 34);
		content.add(lblNewLabel_1);
		
	}
 }
