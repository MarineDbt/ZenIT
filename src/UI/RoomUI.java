package UI;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import BL.Front.*;
import BL.TechnicalClasses.*;

public class RoomUI extends JPanel implements ActionListener {
	
	public RoomFacade RoomFacade;
	
	
	/**
	 * Create the frame.
	 */
	// Constructor
	public RoomUI(AbstractPersistenceHandlerFactory factory) {
		super("Gestion des salles et des accessoires");
		RoomFacade = new RoomFacade(factory);
		
		Container contentPane = getContentPane();
		setSize(1000,1000);
		
		

}
