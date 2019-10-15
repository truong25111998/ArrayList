
package qlhsarray;


public class QLHSArray {
    private int mahocsinh;
    private String name;
    private String lop;
    private int point;
    
    public QLHSArray(int mahocsinh, String name, String lop,  int point){
        this.mahocsinh = mahocsinh;
        this.name = name;
        this.lop = lop;
        this.point = point;
    }

    public int getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(int mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
    public void xuattt(){
        System.out.println("mahs la: " + mahocsinh);
        System.out.println("ten hs la: " + name);
        System.out.println("lop hs la: " + lop);
        System.out.println("diem hs la: " + point);
    }
}
