package BaitapNangCao1;

public class Main {
    public static void main(String[] args) {

            Account accountA = new Account(12, "Lan Anh", 6000000);
//            accountA.credit();
//            accountA.debit();
 //           accountA.transfer();

            Account accountB = new Account(17, "Đỗ Tùng Dương", 400000);
//            accountA.transfer(accountB,100000);
//            System.out.println("Số dư của bạn khách hành B là: "+ );

        do {
            int n = accountA.showMenu();
            accountA.action(n,accountB);
        } while (true);
    }
}
