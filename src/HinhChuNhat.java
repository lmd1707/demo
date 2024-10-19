import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;

public class HinhChuNhat {
    private double chieudai;
    private double chieurong;


public HinhChuNhat(double chieudai, double chieurong) {
    this.chieudai = chieudai;
    this.chieurong = chieurong;
}
 public double getArea() {
    return chieudai * chieurong;
 }
 @Override
    public String toString() {
    return "HinhChuNhat{chieudai = " + chieudai + ", chieurong = " + chieurong + ", area = " + getArea() + "}";
 }
 static class SoSanhHinhChuNhat implements Sosanh<HinhChuNhat> {

     @Override
     public int soSanh(HinhChuNhat o1, HinhChuNhat o2) {
         double area1 = o1.getArea();
         double area2 = o2.getArea();
         if(area1 > area2) {
             return 2;
         } else if(area1 < area2) {
             return 1;
         } else return 0;
     }

 }


    }
class Main {
    public static void main(String[] args) {
        List<HinhChuNhat> list = new ArrayList<>();
        list.add(new HinhChuNhat(3.0, 3.0));
        list.add(new HinhChuNhat(5.0, 4.0));
        list.add(new HinhChuNhat(2.0, 5.0));

        HinhChuNhat.SoSanhHinhChuNhat sosanh = new HinhChuNhat.SoSanhHinhChuNhat();

        Collections.sort(list, ((o1, o2) -> Double.compare(o1.getArea(), o2.getArea())));

        for(HinhChuNhat hinhChuNhat : list) {

        System.out.println(hinhChuNhat);}
    }




}
