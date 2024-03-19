/**
 * This lab is intended to allow for creativity. Your task is to build your own
 * encryption algorithm, or cipher, such that a piece of text is transformed into some
 * unreadable format, but can still be turned back into a readable format.
 * <p>
 * Passing the lab will require you to write both the encryption and decryption
 * methods, but the exact implementation is up to you. You do not need to worry about
 * making a genuinely secure encryption at all, the test cases will only check that no
 * 3-letter sequence present in the original message still remains in the encrypted
 * message, and it will check that decryption produces the original message. The
 * chance that you have genuinely encrypted a short message but still retain a
 * 3-letter sequence from the original message is very small.
 */
public class Lab {

  /**
   * TODO: encrypt a message, such that it can later be decrypted, and return it.
   * The test cases will check that the encrypted messages do not have the same patterns
   * of chars in the encrypted
   * message, making it unreadable.
   *
   * @param msg
   */
  public String encrypt(String msg) {

    int shift = 3;
    StringBuilder encrypted = new StringBuilder();
    for (char c : msg.toCharArray()) {
      if (Character.isLetter(c)) {
        //The base variable in the suggested code is used to determine
        // the starting point of the alphabet for the character being encrypted.
        // If the character is lowercase, base is set to the ASCII value of 'a' (97),
        // and if the character is uppercase, base is set to the ASCII value of 'A' (65).
        char base = Character.isLowerCase(c) ? 'a' : 'A';
        c = (char) ((c - base + shift) % 26 + base);
      }
      encrypted.append(c);
    }
    return encrypted.toString();
  }

  /**
   * TODO: decrypt a message produced by your encryption method, and return it.
   * The decrypted message should match the original, pre-encryption message exactly.
   *
   * @param msg
   */
  public String decrypt(String msg) {
    int shift = 3;
    StringBuilder decrypted = new StringBuilder();
    for (char c : msg.toCharArray()) {
      if (Character.isLetter(c)) {
        char base = Character.isLowerCase(c) ? 'a' : 'A';
        c = (char) ((c - base - shift +26) % 26 + base);
      }
      decrypted.append(c);
    }
    return decrypted.toString();
  }
}
