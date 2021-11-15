package model;

import util.Configs;

public class NhanVienFulltime extends NhanVien {

    private int loaiChucVu;
    private int ngayLamThem;

    public NhanVienFulltime(String ten) {
        super(ten);
        this.loaiChucVu = Configs.NHAN_VIEN_LINH; //mac dinh la Linh
    }

    public NhanVienFulltime(String ten, int ngayLamThem) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = Configs.NHAN_VIEN_LINH; //mac dinh la linh
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            return "Lính toàn thời gian" + (ngayLamThem > 0 ? "(có làm thêm ngày)" : "");
        } else {
            return "Sếp toàn thời gian" + (ngayLamThem>0 ? "(có làm thêm ngày)" : "");
        }
    }
    
    public void tinhLuong(){
        if(loaiChucVu == Configs.NHAN_VIEN_LINH){
            
        }
    }
}
