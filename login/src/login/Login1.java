package login;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login1 extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	String adi = "Ali";
	String sifre = "123";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login1 frame = new Login1();
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
	public Login1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Buraya da şifreni yazmalısın, ne büyük süpriz");
		passwordField.setBounds(218, 135, 112, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Kullanıcı Adı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(134, 83, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Şifre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(134, 138, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("Buraya kullanıcı adını yazman gerekiyor");
		textField.setBounds(220, 80, 110, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Giriş");
		btnNewButton.setToolTipText("Giriş yazıyor dostum, başka ne olabilir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pass = new String(passwordField.getPassword());
				if(adi.equals(textField.getText()) && sifre.equals(pass)) {
					System.out.println("Giris Yapildi");
				}
				else {
					System.out.println("Hatali Kullanici adi veya sifre");
				}
			}
		});
		btnNewButton.setBounds(218, 213, 112, 23);
		contentPane.add(btnNewButton);
	}
}
