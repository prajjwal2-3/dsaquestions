import java.util.Scanner;

public class Simple {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
       int prin = input.nextInt();
        System.out.println("Enter interest rate: ");
        int inte = input.nextInt();
        System.out.println("Enter time: ");
        int time = input.nextInt();
        int ans = (prin*inte*time)/100;
        System.out.println("Calculated simple interest is: "+ ans);
    }
}
