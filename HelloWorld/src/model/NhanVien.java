package model;

public class NhanVien {

    protected String ten;
    protected long luong;

    public NhanVien() {
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    protected String loaiNhanVien() {
        //lớp con override lại method này
        return "";
    }

    public void thongTinNhanVien() {
        System.out.println("===== Nhân viên: " + ten + " =====");
        System.out.println("- Loại nhân viên: " + loaiNhanVien());
        System.out.println("- Lương: " + luong + " VND");
    }

}
