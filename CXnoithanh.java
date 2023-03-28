/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

/**
 *
 * @author Nam Le
 */
public class CXnoithanh {
   public class ChuyenXeNoiThanh extends ChuyenXe {
    private String soTuyen;
    private double soKmDiDuoc;
     
    public ChuyenXeNoiThanh() {
        super();
    }
 
    public ChuyenXeNoiThanh(String soTuyen, double soKmDiDuoc) {
        super();
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
 
    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }
 
    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
 
    public Scanner getScanner() {
        return scanner;
    }
 
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
     
    public void nhapThongTinChuyenXe() {
        super.nhapThongTinChuyenXe();   // gọi hàm nhapThongTinChuyenXe() của lớp ChuyenXe
        System.out.print("Nhập số tuyến: ");
        soTuyen = scanner.nextLine();
        System.out.print("Nhập số km đi được: ");
        soKmDiDuoc = scanner.nextDouble();
    }
     
    public String toString() {
        return super.toString() + ", số tuyến: " + this.soTuyen + 
                ", số km đi được: " + this.soKmDiDuoc;
    }
}
}