package uz.com.utils;

/**
 * @author Baxriddinov Odiljon
 * @since 04/09/2025 20:49
 */
public interface MenuConstants {

    String OPERATION_MENU = """
            1. Addition
            2. Subtraction
            3. multiplication
            4. division
            5. pow
            
            0. EXIT""";
    String DESCRIPTION = "This mini application is provide for users to calculate mathematical operations between " +
                         "2 numbers (integer or floating numbers)";

    String REGISTRATION_MENU = """
            1. Log In
            2. Sign Up
            
            0. Exit
            """;


    static void showMenu(String menu) {
        System.out.println("=".repeat(20) + menu.toUpperCase() + "=".repeat(20));
    }
}
