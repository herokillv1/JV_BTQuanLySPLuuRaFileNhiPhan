import java.io.Serializable;

public class DanhSachSP implements Serializable {
    private String MaSP;
    private String TenSP;
    private String HangSX;
    private int GiaSP;

    public DanhSachSP(){
    }

    public DanhSachSP(String maSP, String tenSP, String hangSX, int giaSP) {
        MaSP = maSP;
        TenSP = tenSP;
        HangSX = hangSX;
        GiaSP = giaSP;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String maSP) {
        MaSP = maSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public String getHangSX() {
        return HangSX;
    }

    public void setHangSX(String hangSX) {
        HangSX = hangSX;
    }

    public int getGiaSP() {
        return GiaSP;
    }

    public void setGiaSP(int giaSP) {
        GiaSP = giaSP;
    }

    @Override
    public String toString() {
        return this.MaSP+"-"+this.TenSP+"-"+this.HangSX+"-"+this.GiaSP;
    }
}
