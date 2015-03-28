package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ActSupprime extends JFrame implements ActionListener {

	private JPanel contentPane;


	public ActSupprime(String message) {
		
		setBounds(100, 100, 300, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(5, 5, 274, 101);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setText(message);
		contentPane.add(lblNewLabel);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(114, 77, 55, 23);
		contentPane.add(btnOk);
		btnOk.addActionListener(this);
		btnOk.setActionCommand("ok");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("ok")) {
		this.dispose();
	}

}
	
}
