package uz.com.exeption;

/**
 * @author Baxriddinov Odiljon
 * @since 04/09/2025 22:22
 */
public class UsernameAlReadyException extends RuntimeException {
    public UsernameAlReadyException(String message) {
        super(message);
    }
}
