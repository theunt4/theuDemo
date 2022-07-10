package MangNangCao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AdEdDe {
    public static void main(String[] args) {
        //tao mang và thêm 1 phẩn tử vào cuối mảng
        String[] arr = {"1" , "2", "4", "7", "5"};
        System.out.println("Mảng ban đầu là: " +Arrays.toString(arr));
        int N = arr.length;
        arr = Arrays.copyOf(arr,N+1);
        String n = "n";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số cần thêm vào mảng:");
        n = scanner.nextLine();
        arr[N] = n;
        System.out.println("Mảng sau khi thêm phần tử: " +Arrays.toString(arr));

        // Xóa 1 phần tử
        //Chuyển mảng sang ArrList, xóa phần tử, sau đó chuyển lại thành mảng
        List<String> testList = new ArrayList<>(Arrays.asList(arr));
        String m ="";
        System.out.println("Mời bạn nhập số cần xóa trong mảng:");
        m = scanner.nextLine();
        testList.remove(m);
        //chuyển list thành mảng
        arr = testList.toArray(new String[0]);
        System.out.println("Mảng sau khi xóa 1 phần tử là: " +Arrays.toString(arr));

        //Sửa 1 phần tử trong mảng
        arr[0] = "8";
        System.out.println("Mảng sau khi update 1 phần tử là: " +Arrays.toString(arr));
    }

}
