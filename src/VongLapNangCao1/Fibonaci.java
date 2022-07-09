package VongLapNangCao1;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        int n;
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.println("Mời bạn nhập n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 0;i<n-2;i++){
            a = b;
            b = c;
            c = a+b;

        }
        System.out.println("Số thứ n trong fibonaci là:" +c);
    }
}
