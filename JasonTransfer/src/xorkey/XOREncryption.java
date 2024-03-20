package xorkey;
import java.util.Random;

public class XOREncryption {
	// Method to generate a random key of the same length as the plaintext
    public static String generateKey(int length) {
        Random random = new Random();
        StringBuilder key = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            key.append((char) (random.nextInt(26) + 'a')); // Generate a random lowercase letter
        }
        return key.toString();
    }

    // Method to encrypt plaintext using XOR with a key
    public static String encrypt(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            // XOR each character of plaintext with corresponding character of key
            char encryptedChar = (char) (plaintext.charAt(i) ^ key.charAt(i));
            ciphertext.append(encryptedChar);
        }
        return ciphertext.toString();
    }

    // Method to decrypt ciphertext using XOR with a key
    public static String decrypt(String ciphertext, String key) {
        return encrypt(ciphertext, key); // XOR encryption and decryption are symmetric
    }

    public static void main(String[] args) {
        String plaintext = "Hello, world!";
        int plaintextLength = plaintext.length();

        // Generate a random key of the same length as the plaintext
        String key = generateKey(plaintextLength);

        // Encrypt the plaintext
        String encryptedText = encrypt(plaintext, key);
        System.out.println("Encrypted: " + encryptedText);

        // Decrypt the ciphertext
        String decryptedText = decrypt(encryptedText, key);
        System.out.println("Decrypted: " + decryptedText);
    }

}
