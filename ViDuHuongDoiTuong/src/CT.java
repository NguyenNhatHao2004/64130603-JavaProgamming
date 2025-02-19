
public class CT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "banh chuoi","Do an nhanh","bc.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("Bia SG");
		sp1.setLoaiSP("Do uong co con");
		sp1.setAnhSP("sg.jpg");
		
		//in hai thong tin ra
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Ma San Pham 2 la: " + sp2.getMaSP();
		       thongtinSP2 += "Ten SP2 la " + sp2.getTenSP();
		System.out.println(thongtinSP1);
		System.out.println(thongtinSP2);
	}

}
