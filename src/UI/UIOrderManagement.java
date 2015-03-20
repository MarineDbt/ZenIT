
package UI;
import javax.swing.JFrame;

import BL.Front.OrderFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.OrderManager;
import BL.DataClasses.*;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

/**
 * 
 * 
 * @poseidon-object-id [I7e6badf8m14c21c9ffdfmm7e13]
 */
public class UIOrderManagement extends JFrame {
	
	private OrderFacade orderFacade;
	
	public UIOrderManagement(AbstractPersistenceHandlerFactory factory) {
		
		this.orderFacade = new OrderFacade(factory);
	}
 }
