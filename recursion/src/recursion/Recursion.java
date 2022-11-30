package recursion;

public class Recursion {

	public static void main(String[] args) {
	    int result = sum(10);
	    System.out.println(result);
	    
	    normal_topla();
	    int res2 = rec_topla(10);
	    System.out.println(res2);
	    
	    normal_fibo(10);
	    //rec_fibo(10);
	  }
	
	  public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	  }
	  
	  public static void normal_topla() {
		  int toplam = 0;
		  for (int r = 0; r <= 10; r++) {
			  toplam = toplam + r;
		  }
		  System.out.println(toplam);
	  }
	  public static int rec_topla(int a) {
		  if (a > 0) {
			 // int toplam = a + rec_topla(a - 1);
			  return a + rec_topla(a - 1);
		  }
		  else {
			  return 0;
		  }
			  
	  }
	  
	  public static void normal_fibo(int k) {
		  int n1, n2 = 1;
		  int sonuc = 0;
		  
		  for (int a = 0; a != k; a++) {
			  n1 = n2;
			  n2 = sonuc;
			  sonuc = n1 + n2;
			  System.out.printf(sonuc + " ");
		  }
	  }
}
	  /*
	  public static int rec_fibo (int nx) {
		  int n1, n2 = 1;
		  nx = n1 + n2;
		  n1 = n2;
		  n2 = nx;
		  return 
	  }
		*/
