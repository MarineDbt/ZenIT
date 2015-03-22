package UI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.FlowLayout;
import BL.DataClasses.User;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class BaseUI extends JFrame {

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

	//TO TEST ONLY
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseUI frame = new BaseUI(new User());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
	public BaseUI(User currentUser) {
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

		JButton btnProfile = new JButton("Profile");
		btnProfile.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnProfile);

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

		btnMyActivities = new JButton("My Activities");
		btnMyActivities.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnMyActivities);

		JButton btnShop = new JButton("Shop");
		btnShop.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnShop);

		JButton btnCart = new JButton("Cart");
		btnCart.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnCart);

		JButton btnLogOut = new JButton("Log out");
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnLogOut);

		content = new JPanel();
		contentPane.add(content, "2, 4, fill, fill");
		content.setLayout(null);

		//hideUselessButtons(currentUser);
		hideUselessButtons(new User());
		
		this.pack();

	}

	/**
	 * Method which set invisible the useless buttons, according to the type of the current user
	 * 
	 * @param currentUser
	 */
	private void hideUselessButtons(User currentUser) {
		if (!currentUser.isMember()){
			btnMyActivities.setVisible(false);
		}
		if (!currentUser.isContributor()){
			btnContributor.setVisible(false);
		}
		if (!currentUser.isSupervisor()){
			btnSupervisor.setVisible(false);
		}
		if (!currentUser.isAdmin()){
			btnAdmin.setVisible(false);
		}
	}
}
