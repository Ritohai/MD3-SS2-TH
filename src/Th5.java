import java.util.Scanner;

public class Th5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Hình vuông. ");
            System.out.println("2.Hình chữ nhật. ");
            System.out.println("3.Hình tam giác. ");
            System.out.println("4.Thoát ");
            System.out.println("Nhập lựa chọn: ");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    break;
                case 2:
                    System.out.println("*******************");
                    System.out.println("*******************");
                    System.out.println("*******************");
                    System.out.println("*******************");
                    break;
                case 3:
                    System.out.println("* * * *");
                    System.out.println("* * *");
                    System.out.println("* *");
                    System.out.println("*");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Nhập từ 1 -> 4");
            }
        }
    }
}
