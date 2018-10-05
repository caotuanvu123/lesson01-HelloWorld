package vu.dev;

public class MainApp {
	  public static void main(String []args)
	  {
	       int a = 9;
	       int b = 5;
	       int sum = a + b;
	       System.out.println("Tong a + b = " + sum);
	       
	       int hieu = a -b;
	       System.out.println("Hieu a -b = " + hieu);
	       
	       int thuong = a /b;
	       System.out.println("thuong a / b = " + thuong);
	       
	       int chiaLayDu = a % b;
	       System.out.println("chia lay du a % b = " + chiaLayDu);
	       
	       int Tich = a * b;
	       System.out.println("thuong a * b = " + Tich);
	       
	       a +=  b;
	       System.out.println("a +=b = " + a);
	       
	       a -= b;
	       System.out.println("a -=b = " + a);
	       
	       a /= b;
	       System.out.println("a /=b = " + a);
	       
	       a %= b;
	       System.out.println("a %=b = " + a);
	   }
}
