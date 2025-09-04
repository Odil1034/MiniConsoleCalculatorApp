package uz.com.utils;

import java.util.Scanner;

/**
 * @author Baxriddinov Odiljon
 * @since 04/09/2025 20:56
 */
public interface ScanUtils {

    // create two scanner for scanner bug
    Scanner scannerStr = new Scanner(System.in);
    Scanner scannerLong = new Scanner(System.in);
    Scanner scannerDouble = new Scanner(System.in);

    static int enterInt(String hint) {
        while (true) {
            System.out.print(hint);
            if (scannerLong.hasNextInt()) {
                return scannerLong.nextInt();
            } else {
                System.out.println("❌ Not a valid number. Please try again.");
                scannerDouble.next();
            }
        }
    }

    static String enterStr(String hint) {
        while (true) {
            System.out.print(hint);
            if (scannerDouble.hasNextLine()) {
                return scannerDouble.nextLine();
            } else {
                System.out.println("❌ Not a valid number. Please try again.");
                scannerDouble.next();
            }
        }
    }

    static Double enterDouble(String hint) {
        while (true) {
            System.out.print(hint);
            if (scannerDouble.hasNextDouble()) {
                return scannerDouble.nextDouble();
            } else {
                System.out.println("❌ Not a valid number. Please try again.");
                scannerDouble.next();
            }
        }
    }

}
