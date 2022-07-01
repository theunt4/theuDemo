package BaitapNangCao1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chào mừng quý khách. Hãy chọn 1 trong các option:");
        System.out.println("1. Chuyển tiền");
        System.out.println("2. Nộp tiền");
        System.out.println("3. Rút tiền");
        System.out.println("4. Exit");

            Account accountA = new Account(12, "Lan Anh", 6000000);
            accountA.credit();
            accountA.debit();
 //           accountA.transfer();

            Account accountB = new Account(17, "Đỗ Tùng Dương", 400000);
            accountA.transfer(accountB,100000);
            System.out.println("Số dư của bạn khách hành B là: "+ );
    }
}
