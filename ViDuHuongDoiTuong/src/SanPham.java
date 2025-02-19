
public class SanPham {
//dinh nghia thuoc tinh
	int maSP;
	String tenSP;
	String loaiSP;
	String  anhSP; //ten file anh
	//Ham tao
	//cung ten voi class
	public SanPham()
	{
		//khoi tao gia tri ban dau cua thuoc tinh neu co o day
	}
//	public SanPham(int mSP, String tSP, String lSP, String aSP)
//	{
//		maSP = mSP;
//		tenSP = tSP;
//		loaiSP = lSP;
//		anhSP = aSP;	
//	}
//	
	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP)
	{
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.anhSP = anhSP;	
	}
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	public String getAnhSP() {
		return anhSP;
	}
	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", loaiSP=" + loaiSP + "]";
	}

	
	
}
