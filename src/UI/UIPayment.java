package UI;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UIPayment extends BaseUI{
	private JTextField cardNumberText;
	private JTextField expirationMonthText;
	private JTextField expirationDayText;
	private JTextField expirationYearText;
	private JTextField cryptogramText;
	public UIPayment() {
		
		JLabel paymentTitleLabel = new JLabel("Paiement en ligne");
		paymentTitleLabel.setBounds(12, 13, 108, 16);
		content.add(paymentTitleLabel);
		
		JLabel paymentMeanLabel = new JLabel("Type de carte");
		paymentMeanLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		paymentMeanLabel.setBounds(12, 42, 79, 16);
		content.add(paymentMeanLabel);
		
		JComboBox paymentMeanComboBox = new JComboBox();
		paymentMeanComboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		paymentMeanComboBox.setBounds(99, 40, 135, 18);
		content.add(paymentMeanComboBox);
		
		JLabel expirationDateLabel = new JLabel("Expiration (JJ/MM/AAAA)");
		expirationDateLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationDateLabel.setBounds(12, 100, 124, 16);
		content.add(expirationDateLabel);
		
		cardNumberText = new JTextField();
		cardNumberText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cardNumberText.setBounds(99, 71, 135, 18);
		content.add(cardNumberText);
		cardNumberText.setColumns(10);
		
		JLabel cardNumberLabel = new JLabel("Numero de carte");
		cardNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cardNumberLabel.setBounds(12, 71, 80, 16);
		content.add(cardNumberLabel);
		
		expirationMonthText = new JTextField();
		expirationMonthText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationMonthText.setColumns(2);
		expirationMonthText.setBounds(170, 98, 22, 18);
		content.add(expirationMonthText);
		
		expirationDayText = new JTextField();
		expirationDayText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationDayText.setColumns(2);
		expirationDayText.setBounds(144, 98, 22, 18);
		content.add(expirationDayText);
		
		expirationYearText = new JTextField();
		expirationYearText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		expirationYearText.setColumns(4);
		expirationYearText.setBounds(196, 98, 38, 18);
		content.add(expirationYearText);
		
		JLabel cryptogramLabel = new JLabel("Cryptogramme visuel (3 chiffres)");
		cryptogramLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cryptogramLabel.setBounds(12, 129, 157, 16);
		content.add(cryptogramLabel);
		
		cryptogramText = new JTextField();
		cryptogramText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cryptogramText.setBounds(196, 129, 38, 18);
		content.add(cryptogramText);
		
		JButton returnButton = new JButton("Annuler");
		returnButton.setBounds(12, 188, 97, 25);
		content.add(returnButton);
		
		JButton validateButton = new JButton("Valider");
		validateButton.setBounds(137, 188, 97, 25);
		content.add(validateButton);
	}
}
