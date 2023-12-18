import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("lungime=");
        int a = scanner.nextInt();
        System.out.print("latime=");
        int b = scanner.nextInt();

        System.out.println("aria: "+a*b);
        System.out.println("perimetrul: "+2*(a+b));
    }
}
