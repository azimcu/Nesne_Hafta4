package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class Login2 extends JFrame {

	private JPanel contentPane;
	private JTextField giris_t1;
	private JPasswordField giris_p1;
	private JTextField kayit_t1;
	private JTextField kayit_t2;
	private JPasswordField kayit_p1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
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
	public Login2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(43, 53, 386, 277);
		contentPane.add(tabbedPane);
		
		JPanel giris_p_1 = new JPanel();
		giris_p_1.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Giriş", null, giris_p_1, null);
		giris_p_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kullanıcı Adı:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(36, 34, 91, 23);
		giris_p_1.add(lblNewLabel);
		
		JLabel lblifre = new JLabel("Şifre:");
		lblifre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblifre.setBounds(36, 74, 91, 23);
		giris_p_1.add(lblifre);
		
		giris_t1 = new JTextField();
		giris_t1.setBounds(137, 34, 119, 23);
		giris_p_1.add(giris_t1);
		giris_t1.setColumns(10);
		
		giris_p1 = new JPasswordField();
		giris_p1.setBounds(137, 74, 119, 23);
		giris_p_1.add(giris_p1);
		
		JButton giris_button = new JButton("Giriş");
		giris_button.setBounds(137, 117, 119, 23);
		giris_p_1.add(giris_button);
		
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(192, 192, 192));
		tabbedPane.addTab("Kayıt Ol", null, p2, null);
		p2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Kullanıcı Adı:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(34, 36, 91, 24);
		p2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("E-posta:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(34, 71, 91, 24);
		p2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Şifre:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(34, 141, 91, 24);
		p2.add(lblNewLabel_1_2);
		
		kayit_t1 = new JTextField();
		kayit_t1.setBounds(135, 40, 120, 20);
		p2.add(kayit_t1);
		kayit_t1.setColumns(10);
		
		kayit_t2 = new JTextField();
		kayit_t2.setColumns(10);
		kayit_t2.setBounds(135, 75, 120, 20);
		p2.add(kayit_t2);
		
		kayit_p1 = new JPasswordField();
		kayit_p1.setBounds(135, 145, 120, 20);
		p2.add(kayit_p1);
		
		JButton kayit_button = new JButton("Kayıt Ol");
		kayit_button.setBounds(135, 182, 120, 23);
		p2.add(kayit_button);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Adı ve Soyadı:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(34, 106, 91, 24);
		p2.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(135, 106, 120, 20);
		p2.add(textField);
	}
}
