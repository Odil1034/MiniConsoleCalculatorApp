package uz.com;

import uz.com.calculator.CalculatorImp;
import uz.com.entity.User;
import uz.com.exeption.UsernameAlReadyException;
import uz.com.service.AuthService;
import uz.com.utils.MenuConstants;
import uz.com.utils.ScanUtils;

/**
 * @author Baxriddinov Odiljon
 * @since 04/09/2025 20:39
 */
public class TestCalculator {
    public static void main(String[] args) {
        System.out.println("🎇🎇🎇 Welcome to Our Calculator Application 🎇🎇🎇");
        boolean loggedIn = false;
        while (!loggedIn) {
            MenuConstants.showMenu("Registration menu");
            System.out.println(MenuConstants.REGISTRATION_MENU);
            int choice = ScanUtils.enterInt("Choose: ");

            switch (choice) {
                case 1 -> {
                    String u = ScanUtils.enterStr("Enter username: ");
                    String p = ScanUtils.enterStr("Enter password: ");
                    User login = AuthService.login(u, p);
                    if (login != null) {
                        System.out.println("Log in successfully ✔✔✔");
                        loggedIn = true;
                    } else {
                        System.out.println("❌ User not found or bad credentials, try again");
                    }
                }
                case 2 -> {
                    String u = ScanUtils.enterStr("Enter username: ");
                    String p = ScanUtils.enterStr("Enter password: ");
                    try {
                        boolean register = AuthService.register(u, p);
                        if (register) {
                            System.out.println("User is registered successfully ✔✔✔");
                        }
                    } catch (UsernameAlReadyException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 0 -> exit();
            }
        }
        System.out.println("Calculator Application started");
        System.out.println(MenuConstants.DESCRIPTION);

        CalculatorImp calculator = new CalculatorImp();

        while (true) {
            double firstNum = ScanUtils.enterDouble("Enter first number: ");
            double secondNum = ScanUtils.enterDouble("Enter second number: ");

            MenuConstants.showMenu("Calculator operations");
            System.out.println(MenuConstants.OPERATION_MENU);

            int chosenMenu = ScanUtils.enterInt("Choose operation: ");

            Double result = null;
            switch (chosenMenu) {
                case 1 -> result = calculator.add(firstNum, secondNum);
                case 2 -> result = calculator.subtract(firstNum, secondNum);
                case 3 -> result = calculator.multiply(firstNum, secondNum);
                case 4 -> {
                    try {
                        result = calculator.divide(firstNum, secondNum);
                    } catch (ArithmeticException e) {
                        System.out.println("Can not divide by zero, please enter another number");
                    }
                }
                case 5 -> result = calculator.pow(firstNum, secondNum);
                case 0 -> exit();
                default -> {
                    System.out.println("❌ You entered an incorrect number, please try again.");
                    continue;
                }
            }
            if (result != null) System.out.println("✅ Result: " + result);
        }
    }

    private static void exit() {
        System.out.println("Thank you for using our calculator! 👋");
        System.exit(0);
    }
}

