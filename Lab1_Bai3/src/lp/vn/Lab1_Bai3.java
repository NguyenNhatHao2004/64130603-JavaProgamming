package lp.vn;

import java.util.Scanner;

public class Lab1_Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập cạnh của khối lập phương: ");
	        double canh = scanner.nextDouble();
	        
	       
	        double theTich = Math.pow(canh, 3);
	        
	       
	        System.out.printf("Thể tích của khối lập phương: %.2f\n", theTich);
	        
	        scanner.close();

	}

}
