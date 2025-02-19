import java.util.ArrayList;
public class CT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khoi tao danh sach
		ArrayList<SanPham> dsSanPham;
		//xin moi
		dsSanPham = new ArrayList<SanPham>();
		
		//Nhap 3 San Pham
		SanPham sp1 = new SanPham(0, "Kem", "Do an nhanh", "kem.jpg");
		SanPham sp2 = new SanPham(1, "Com", "Do an", "com.jpg");
		SanPham sp3 = new SanPham(2, "Pho", "Do an", "pho.jpg");
		
		//them vao list
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
//		for(SanPham x: dsSanPham)
//			System.out.println(x.toString());
//		
		for(int i = 0; i< dsSanPham.size() ; i++)
		{
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
	}

}
