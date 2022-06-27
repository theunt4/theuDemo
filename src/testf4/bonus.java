package testf4;
import java.util.*;

public class bonus {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap so tien muon tinh toan (don vi nghin dong): ");
        long money = sc.nextLong();
        int count = 0;
        if(money < 50)
            System.out.println("So tien khong du");
        else
            for (int amount500 = 0; amount500 <= money/500; amount500++)

                for (int amount200 = 0; amount200 <= money/200; amount200++)

                    for (int amount100 = 0; amount100 <= money/100; amount100++)

                        for (int amount50 = 0; amount50 <= money/50; amount50++)
                        {
                            if(500 * amount500 + 200 * amount200 + amount100 * 100 + 50 * amount50 == money) {
                                System.out.println("Vay can co " + amount500 + " to 500 + " + amount200 + " to 200 + " + amount100 + " to 100 + " + amount50 + " to 50 de tra so tien " + money + "k");
                                count++;
                            }
                        }
        System.out.println("==> Chia duoc "+count+" cach");
    }








}