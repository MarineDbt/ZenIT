package UI;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
public class BaseUI extends JFrame {
	protected JPanel content;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseUI frame = new BaseUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public BaseUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 432);
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
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnAdmin);
		JButton btnSupervisor = new JButton("Supervisor");
		btnSupervisor.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnSupervisor);
		JButton btnContributor = new JButton("Contributor");
		btnContributor.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnContributor);
		JButton btnNotifications = new JButton("Notifications");
		btnNotifications.setFont(new Font("Tahoma", Font.PLAIN, 9));
		ribbon.add(btnNotifications);
		JButton btnMyActivities = new JButton("My Activities");
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
		this.pack();
	}
}