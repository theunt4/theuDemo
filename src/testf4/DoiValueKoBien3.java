package testf4;

import java.util.Scanner;

public class DoiValueKoBien3  {
        public static void main (String [] args ) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Mời bạn nhập 2 số : ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println ("Giá trị trước khi biến đổi là: "+ a + " " + b);
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println ("Giá trị sau khi biến đổi là: " + a + " " + b);


        }
}



