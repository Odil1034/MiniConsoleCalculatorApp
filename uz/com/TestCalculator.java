package uz.com;

import uz.com.calculator.CalculatorImp;
import uz.com.utils.MenuConstants;
import uz.com.utils.ScanUtils;

/**
 * @author Baxriddinov Odiljon
 * @since 04/09/2025 20:39
 */
public class TestCalculator {
    public static void main(String[] args) {
        System.out.println("🎇🎇🎇 Welcome to Our Calculator Application 🎇🎇🎇");
        System.out.println(MenuConstants.DESCRIPTION);

        CalculatorImp calculator = new CalculatorImp();

        while (true) {
            Double firstNum = ScanUtils.enterDouble("Enter first number: ");
            Double secondNum = ScanUtils.enterDouble("Enter second number: ");

            MenuConstants.showMenu("Calculator operations");
            System.out.println(MenuConstants.CALCULATOR_OPERATION);

            int chosenMenu = ScanUtils.enterInt("Choose operation: ");

            Double result = null;
            switch (chosenMenu) {
                case 1 -> result = calculator.add(firstNum, secondNum);
                case 2 -> result = calculator.subtract(firstNum, secondNum);
                case 3 -> result = calculator.multiply(firstNum, secondNum);
                case 4 -> result = calculator.divide(firstNum, secondNum);
                case 5 -> result = calculator.pow(firstNum, secondNum);
                case 0 -> {
                    System.out.println("Thank you for using our calculator! 👋");
                    System.exit(0);
                }
                default -> System.out.println("❌ You entered an incorrect number, please try again.");
            }

            if (result != null) {
                System.out.println("✅ Result: " + result);
            }
        }
    }
}

