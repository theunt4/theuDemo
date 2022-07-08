package BaitapNangCao1;

import java.util.Scanner;

public class Account {
    private int id;
    private String name;
    private int balance;
    private int amount1;
    int amount2;

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit (){
        int a;
        System.out.println("Mời bạn nhập số tiền nộp vào");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if(a>0){
        amount1 = balance+ a;
        System.out.println("Tổng tiền hiện tại là:" +amount1);}
        else {
            System.out.println("Số tiền invalid");
        }

    }

    public void debit(){
        int b;
        System.out.println("Mời bạn nhập số tiền rút ra:");
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        if(b<= amount1){
            amount2 = amount1- b;
            System.out.println("Tổng tiền hiện tại là:" +amount2);}
        else {
            System.out.println("Số tiền invalid, thanh toán không thành công");
        }
    }
    public void transfer( Account account){
        int amountA;
        int amountB = 0;
        Account account2 = account;
//        System.out.println(" Mời bạn nhập số tài khoản của người nhận");
//        Scanner scanner = new Scanner(System.in);
 //       account2 = scanner.nextLine();
//        System.out.println("Mời bạn nhập số tiền:");
 //       c = scanner.nextInt();
        if (transfer1<= amount2){
            amountA = amount2 -transfer1;
            amountB = account.getBalance() + transfer1;
            System.out.println("Chuyển khoản thành công. Số dư hiện tại của A là: "+ amountA);
        }else {
            System.out.println("Nhập số tiền nhỏ hơn"+amount2);
        }
        System.out.println("Số dư hiện tại của B là:" + amountB);
    }




    public int showMenu(){
        System.out.println("Chào mừng quý khách. Hãy chọn 1 trong các option:");
        System.out.println("1. Chuyển tiền");
        System.out.println("2. Nộp tiền");
        System.out.println("3. Rút tiền");
        System.out.println("4. Exit");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        return  n;
    }

    public void action(int n, Account accountB) {
        switch (n){
            case 1:
                transfer(accountB);
                break;
            case 2:
                credit();
                break;
            case 3:
                debit();
                break;
            default:
                System.out.println("something ");
                break;
        }
    }
}
