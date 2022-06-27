import java.util.Scanner;

public class nhapSo18 {
    public static void tuoi(int age) {
        if (age >= 18) {
            System.out.println("Bạn đủ tuổi");
        } else {
            System.out.println("Bạn chưa đủ 18 tuổi");
        }

    }

    public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    System.out.println("Nhập từ bạn muốn tìm vào đây");
//    int n = scan.nextInt();
//    if (checkNTo(n)){
//      System.out.println(n + " là số nguyên tố");
//    } else {
//      System.out.println("Ngược lại");
//    }
        System.out.println("Mời bạn nhập số tuổi vào đây");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        tuoi(age);


//        System.out.println("a + b = " + tong(a,b));
    }
}

