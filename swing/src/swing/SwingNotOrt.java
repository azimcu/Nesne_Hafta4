package swing;

//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SwingNotOrt {

	public static void main(String[] args) {
		
		int vize1,vize2,final1;
		
		String svize1 = JOptionPane.showInputDialog("Lütfen 1.vize notunuzu giriniz: ");
		vize1 = Integer.parseInt(svize1);
		String svize2 = JOptionPane.showInputDialog(null,"Lütfen 2.vize notunuzu giriniz: ","Vize 2",JOptionPane.ERROR_MESSAGE);
		vize2 = Integer.parseInt(svize2);
		String sfinal1 = JOptionPane.showInputDialog("Lütfen final notunuzu giriniz: ");
		final1 = Integer.parseInt(sfinal1);
		
		double result = vize1*0.2 + vize2*0.2 + final1*0.6;
		String mesaj = "";
		
		if(result > 50) {
			mesaj += "Tebrikler geçtiniz";
		}
		else {
			mesaj += "Kaldınız";
		}
		
		//ImageIcon icon = new ImageIcon("C:\\Users\\...\\image.png");	-> bu şekilde açılan pencereye img ekleyebilirsin
		JOptionPane.showMessageDialog(null, mesaj, "Sonuç Açıklama", JOptionPane.INFORMATION_MESSAGE);	//en sona " ,icon " demem lazım
		
		

	}

}
