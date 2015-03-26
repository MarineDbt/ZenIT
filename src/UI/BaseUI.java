package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.FlowLayout;

import BL.DataClasses.User;
import BL.Front.UserFacade;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseUI extends JFrame implements ActionListener {

	/* Panel corresponding to the content of the frame
	 * this panel is empty yet
	 * you need to use in subclasses to set up your content */
	protected JPanel content;

	/* Buttons that can be set invisible
	 * it is needed to keep a variable on them */
	JButton btnAdmin;
	JButton btnSupervisor;
	JButton btnContributor;
	JButton btnMyActivities;
	
	protected UserFacade userFacade;

	public BaseUI() {
		
	}
	/**
	 * Create the frame.
	 * 
	 * MADE BY WINDOW BUILDER
	 * 
	 * @param currentUser
	 * 
	 * You actually need to refer a User, because the display of the ribbon differs from users
	 * 
	 */
	public BaseUI(UserFacade userFacade) {
		this.userFacade=userFacade;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 432);
		this.setMinimumSize(new Dimension(600,450));
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("1dlu"),
				ColumnSpec.decode("min:grow"),},
				new RowSpec[] {
				RowSpec.decode("1dlu"),
				RowSpec.decode("max(33dlu;pref)"),
				RowSpec.decode("1dlu"),
				RowSpec.decode("max(139dlu;default):grow"),}));

		JPanel header = new JPanel();
		contentPane.add(header, "2, 2, fill, top");
		header.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("1dlu"),
				ColumnSpec.decode("center:max(150dlu;min):grow"),},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(14dlu;default):grow"),}));

		JLabel lblZenLounge = new JLabel("Zen Lounge");
		lblZenLounge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		header.add(lblZenLounge, "2, 2, center, center");

		JPanel ribbon = new JPanel();
		header.add(ribbon, "2, 4, fill, center");
		ribbon.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnHome);
		btnHome.addActionListener(this);
		btnHome.setActionCommand("home");
		
		JLabel lblUser = new JLabel("Hi " + userFacade.getCurrentUser().getId());
		lblUser.setFont(new Font("Verdana", Font.PLAIN, 9));
		ribbon.add(lblUser);

		JButton btnProfile = new JButton("Profile");
		btnProfile.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnProfile);
		btnProfile.addActionListener(this);
		btnProfile.setActionCommand("profile");

		btnAdmin = new JButton("Admin");
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnAdmin);

		btnSupervisor = new JButton("Supervisor");
		btnSupervisor.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnSupervisor);

		btnContributor = new JButton("Contributor");
		btnContributor.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnContributor);

		JButton btnNotifications = new JButton("Notifications");
		btnNotifications.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnNotifications);
		btnNotifications.addActionListener(this);
		btnNotifications.setActionCommand("notifications");

		btnMyActivities = new JButton("My Activities");
		btnMyActivities.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnMyActivities);

		JButton btnShop = new JButton("Shop");
		btnShop.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnShop);

		JButton btnCart = new JButton("Cart");
		btnCart.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnCart);
		btnCart.addActionListener(this);
		btnCart.setActionCommand("cart");

		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnLogOut);
		btnLogOut.addActionListener(this);
		btnLogOut.setActionCommand("logout");

		content = new JPanel();
		contentPane.add(content, "2, 4, fill, fill");
		content.setLayout(null);

		hideUselessButtons(userFacade.getCurrentUser());
		
		this.pack();

	}

	/**
	 * Method which set invisible the useless buttons, according to the type of the current user
	 * 
	 * @param currentUser
	 */
	private void hideUselessButtons(User currentUser) {
		if (!userFacade.isMember(currentUser)){
			btnMyActivities.setVisible(false);
		}
		if (!userFacade.isContributor(currentUser)){
			btnContributor.setVisible(false);
		}
		if (!userFacade.isSupervisor(currentUser)){
			btnSupervisor.setVisible(false);
		}
		if (!userFacade.isAdministrator(currentUser)){
			btnAdmin.setVisible(false);
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("home")){
			HomeUI homeUI = new HomeUI(userFacade);
    		homeUI.setVisible(true);
	    	this.dispose();
		}
		if (arg0.getActionCommand().equals("notifications")){
			 NotificationCenterUI notificationCenterUI = new NotificationCenterUI(userFacade);
			 notificationCenterUI.setVisible(true);
			 this.dispose();
		}
		if (arg0.getActionCommand().equals("profile")){
			 ProfileUI profileUI = new ProfileUI(userFacade);
			 profileUI.setVisible(true);
			 this.dispose();
		}
		if (arg0.getActionCommand().equals("logout")){
			 LoginUI loginUI = new LoginUI();
			 loginUI.setVisible(true);
			 this.dispose();
		}
		if (arg0.getActionCommand().equals("cart")){
			 CartUI cartUI = new CartUI(userFacade);
			 cartUI.setVisible(true);
			 this.dispose();
		}
	}
}
