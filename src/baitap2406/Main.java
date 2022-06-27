package baitap2406;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String person1;
//        Scanner scanner = new Scanner(System.in);
//        person1 = scanner.nextLine();
//        System.out.println("Mời bạn nhập: id, full name, salary: ");
//        Employee Person1 = new Employee();

        System.out.println("Bài tập 1");
        Employee Person1 = new Employee(21,"Nguyễn","Tô Hoài", 10000000);
        Person1.getFullName();
        Person1.getAnnualSalary();
        System.out.println("Năm nay bạn được tăng bao nhiêu % lương:");
        Person1.upToSalary();
//bài 2
        System.out.println(" ");
        System.out.println("Bài tập 2");
        // con mèo
        System.out.println("Con mèo: ");
        Cat meo1 = new Cat(2,"Canada");
        meo1.Say();
        meo1.reproduction();
        // con gà
        System.out.println("Con gà: ");
        Hen hen1 = new Hen (3,"Vietnam");
        hen1.Say();
        hen1.reproduction();

//bài 3
        System.out.println(" ");
        System.out.println("Area and color of Circle: ");
        Circle vongTron1 = new Circle(5, "pink");
        vongTron1.getArea();
    }
}
