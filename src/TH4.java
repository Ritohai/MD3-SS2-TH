import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cần vay: ");
        int sltv = sc.nextInt();
        System.out.println("Nhập tỉ lệ lãi suât: ");
        int tltt = sc.nextInt();
        System.out.println("Nhập số tháng vay: ");
        int tv = sc.nextInt();
        int stl = 0;
        for (int i = 0; i < tv; i++) {
            stl += sltv*tltt/12/100*tv;
            System.out.println(stl);
        }
    }
}
