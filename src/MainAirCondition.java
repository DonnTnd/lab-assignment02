import java.util.Scanner;

public class MainAirCondition {
    public static void main(String[] args) {
        AirCondition donn = new AirCondition("Samsung","AR13TYHZCWKNST","White/Blue",25000) ;

        System.out.println("รายละเอียดเครื่องปรับอากาศ");
        System.out.println("ยี่ห้อแอร์ : " + donn.getBrand());
        System.out.println("รหัสรุ่น  : " + donn.getModelcode());
        System.out.println("โทนสี   : " + donn.getColor());
        System.out.println("ราคา    : " + donn.getPrice());
    }
}
