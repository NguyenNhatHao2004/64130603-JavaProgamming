package del.vn;

import java.util.Scanner; 

public class Lab1_Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;
        double canDelta = Math.sqrt(delta);
        
        System.out.printf("Delta: %.2f\n", delta);
        System.out.printf("Căn delta: %.2f\n", canDelta);

        scanner.close();
	}

}
