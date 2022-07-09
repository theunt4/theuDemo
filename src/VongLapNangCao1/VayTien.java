package VongLapNangCao1;

public class VayTien {
    public static void main(String[] args) {
            double a = 600;
            float  x = 0;
        for (int i = 0; i < 60; i++) {
                    x = (float) (x + (a * 0.005));
                    a = a - 10;
            }
            System.out.println("Tổng số tiền lãi sau 5 năm là: " +x + " triệu");
    }
}
