package hcn.vn;

import java.util.Scanner;
public class Lab1_Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập chiều dài của hình chữ nhật: ");
	        double chieuDai = scanner.nextDouble();
	        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
	        double chieuRong = scanner.nextDouble();
	        
	       
	        double chuVi = 2 * (chieuDai + chieuRong);
	        
	      
	        double dienTich = chieuDai * chieuRong;
	        
	       
	        double canhNho = Math.min(chieuDai, chieuRong);
	        
	        
	        System.out.printf("Chu vi hình chữ nhật: %.2f\n", chuVi);
	        System.out.printf("Diện tích hình chữ nhật: %.2f\n", dienTich);
	        System.out.printf("Cạnh nhỏ hơn của hình chữ nhật: %.2f\n", canhNho);
	        
	        scanner.close();
	}

}
