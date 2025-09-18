import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanBMI person = new HumanBMI(80, 1.52); // 80 кг, 1.52 м
        System.out.println("BMI: " + person.calculateBMI());
        System.out.println("Category: " + person.getBMICategory());

//        обробник подій введення з консолі тексту замість числа
//        Scanner scanner = new Scanner(System.in);
//        double weight = 0;
//        double height = 0;
//
//        try {
//            System.out.print("Enter weight (kg): ");
//            weight = Double.parseDouble(scanner.nextLine());
//
//            System.out.print("Enter height (m): ");
//            height = Double.parseDouble(scanner.nextLine());
//        } catch (NumberFormatException e) {
//            System.out.println("Error: Please enter a valid number!");
//            System.exit(1); // або повторити введення
//        }
    }
}
