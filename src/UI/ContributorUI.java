
package UI;
import BL.DataClasses.Contributor;
import BL.DataClasses.User;
import BL.Front.ContributorFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

import javax.swing.DefaultRowSorter;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.RowSorter;
import javax.swing.ScrollPaneConstants;
import javax.swing.SortOrder;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 * 
 * 
 * @poseidon-object-id [I395d852m14bf5118266mm5f84]
 */
public class ContributorUI extends BaseUI implements ActionListener {
	
	private JScrollPane planningPanel;
	private JTable table;
	private JButton modifyButton;
	private JTextArea descriptionArea;
	
	public AbstractPersistenceHandlerFactory factory;
	private ContributorFacade contributorFacade;
	private User currentUser;
	private String id_contributor;
	private ArrayList<ArrayList<String>> myEvents; //list containing lists of string containing event_name, id_room, activity_name, day, startTime, endTime
	private JLabel contributorNameLabel;
	
	public ContributorUI(AbstractPersistenceHandlerFactory factory, User currentUser, String id_contributor) {
		
		this.factory = factory;
		this.contributorFacade = new ContributorFacade(factory, currentUser);
		this.currentUser = currentUser;
		this.id_contributor = id_contributor;
		
		//Description
		descriptionArea = new JTextArea();
		descriptionArea.setBounds(12, 63, 251, 113);
		content.add(descriptionArea);
		Contributor contrib = contributorFacade.getProfile(id_contributor);
		descriptionArea.setText(contrib.getDescription());
		descriptionArea.setLineWrap(true);
		descriptionArea.setWrapStyleWord(true); 
		
		modifyButton = new JButton("Modifier");
		modifyButton.setBounds(12, 189, 97, 25);
		content.add(modifyButton);
		modifyButton.addActionListener(this);
		modifyButton.setActionCommand("modify");
		
		if (this.currentUser.getID() != this.id_contributor) { // If current user is not the contributor, disable editing and hide button
			descriptionArea.setEditable(false);
			modifyButton.hide();
		}
		
		
		// Planning Pannel
		planningPanel = new JScrollPane();
		planningPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		planningPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		planningPanel.setBounds(285, 31, 428, 183);
		content.add(planningPanel);
		planningPanel.setViewportView(table);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cours", "Activite", "Salle", "Jour", "Debut", "Fin"
			}
		));
		planningPanel.setViewportView(table);
		
		// Get Info for Planning Panel
		
		myEvents = this.contributorFacade.getPlanning(id_contributor);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		for (int i =0; (i<myEvents.size()); i++) {
			// Get currentEvent
			ArrayList<String> currentEvent = myEvents.get(i);
			// Transform currentEvent to array
			String[] currentEventArray = currentEvent.toArray(new String[currentEvent.size()]);
			// Add Array to JTable
			model.addRow(currentEventArray);
		}
		
		// Sort Table by Day
		
		TableRowSorter sorter = new TableRowSorter(table.getModel());
		table.setRowSorter(sorter);
		List<RowSorter.SortKey> sortKeys = new ArrayList<>();
		int columnIndexToSort = 3;
		sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
		sorter.setSortKeys(sortKeys);
		sorter.sort();
		
		
		// Labels
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(12, 22, 200, 50);
		content.add(lblDescription);
		
		JLabel lblNewLabel = new JLabel("Planning");
		lblNewLabel.setBounds(285, -8, 200, 50);
		content.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Profil Intervenant :");
		lblNewLabel_1.setBounds(12, 0, 109, 34);
		content.add(lblNewLabel_1);
		
		contributorNameLabel = new JLabel("");
		contributorNameLabel.setBounds(125, 9, 97, 16);
		content.add(contributorNameLabel);
		contributorNameLabel.setText(id_contributor);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("modify")) {
			contributorFacade.modifyDescription(currentUser, descriptionArea.getText());
			ContributorUI frame = new ContributorUI(factory, currentUser, id_contributor);
			frame.setVisible(true);
			this.dispose();
		}
	}
	
}
