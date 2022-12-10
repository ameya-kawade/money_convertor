import java.util.Scanner;
public class money_converter {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome to money converter ");
        System.out.println("What do you what to do?");
        System.out.println("1.Rupees to Dollars");
        System.out.println("2.Dollar to Rupees");
        int choice=sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Enter the amount:");
                float rupees = sc.nextFloat();
                float dollar = rupees * 0.012F;
                System.out.println(rupees + " rupees is equal to " + String.format("%.2f", dollar) + "dollars");
            }
            case 2 -> {
                System.out.println("Enter the amount:");
                float dollar2 = sc.nextFloat();
                float rupees2 = dollar2 * 82.44F;
                System.out.println(dollar2 + " dollars is equal to " + String.format("%.2f", rupees2) + "rupees");
            }
            default -> System.out.println("Wrong input !!");
        }
    }
}
