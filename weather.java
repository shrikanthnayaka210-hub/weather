import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int temp = sc.nextInt();

        if(temp >= 30) {
            System.out.println("It's hot today.");
        } else if(temp >= 20) {
            System.out.println("The weather is warm.");
        } else if(temp >= 10) {
            System.out.println("It's cool outside.");
        } else {
            System.out.println("It's cold today.");
        }

        sc.close();
    }
}