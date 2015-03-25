package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import BL.DataClasses.Activity;
import BL.DataClasses.User;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;

public class AddLessonEventUI extends BaseUI implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	Activity currentActivity;
	
	public AddLessonEventUI(AbstractPersistenceHandlerFactory factory, User currentUser, Activity currentAct) {

		//super(factory, currentUser);
		super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
		this.factory = factory;
		this.user = currentUser;
		content.setLayout(null);
		this.currentActivity = currentAct;
	}

	
	public void actionPerformed(ActionEvent e) {
		
	}
}
