package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Swing1 {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("ilk pencerem");
		//jf.setTitle("ilk pencerem"); üstteki ile aynıdır
		jf.setSize(500,600);	//width,length
		jf.setLocation(200, 200);	//on screen location
		
		jf.getContentPane().setLayout(new FlowLayout());	//container yapısı
		
		JTextField text1 = new JTextField(10);
		JButton button1 = new JButton("Gönder");
		JLabel label1 = new JLabel();
		label1.setText("Buraya isminizi giriniz:");
		jf.getContentPane().add(label1);
;		jf.getContentPane().add(text1);
		jf.getContentPane().add(button1);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setText("Merhabalar " + text1.getText() + ", programa hosgeldin");
			}
		});
		
		JButton button2 = new JButton("Uyarı");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane panelismi = new JOptionPane();
				panelismi.showMessageDialog(null,"Uyarı mesajı!");
			}
		});
		jf.getContentPane().add(button2);
		
		JButton button3 = new JButton("Şifre");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = JOptionPane.showInputDialog("Lütfen şifrenizi giriniz: ");
				JOptionPane.showMessageDialog(null, "şifreni çaldım. " + password);
			}
		});
		jf.getContentPane().add(button3);
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Sağ üstteki çarpının programı kapatmasını sağlar
		jf.setResizable(true);	//tam ekran tuşu aktifliği
		jf.setVisible(true);	//visible true olmasaydı pencere gelmezdi
		
		
	}

}
