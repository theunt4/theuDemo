import java.util.Scanner;

public class TinhTong {
    public static int tong(int a, int b) {
        int sum = a + b;
        return sum;
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
            System.out.println("Mời bạn nhập 2 số vào đây");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("a + b = " + tong(a,b));
        }
}

