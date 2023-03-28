/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

/**
 *
 * @author Nam Le
 */
public class CXngoaithanh {
    public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;
     
    public ChuyenXeNgoaiThanh() {
        super();
        this.noiDen = "";
        this.soNgayDiDuoc = 0;
    }
 
    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDiDuoc) {
        super();
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
 
    public String getNoiDen() {
        return noiDen;
    }
 
    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
 
    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }
 
    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
     
    public void nhapThongTinChuyenXe() {
        super.nhapThongTinChuyenXe();
        System.out.print("Nhập nơi đến: ");
        noiDen = scanner.nextLine();
        System.out.print("Nhập số ngày đi được: ");
        soNgayDiDuoc = scanner.nextInt();
    }
    public String toString() {
        return super.toString() + ", nơi đến: " + this.noiDen + ", số ngày đi được: " + 
                this.soNgayDiDuoc;
    }
}
}
