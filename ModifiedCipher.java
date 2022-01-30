/* Input must include only small albhabets. */
import java.lang.*;
public class ModifiedCipher{
    static void cipher(String message, int offset) {
        StringBuilder result = new StringBuilder();
        int x = 0;
        int up_offset = offset;
        for (char character : message.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + up_offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
                x++;
                up_offset = offset + (x*x);
            }
            else {
                result.append(character);
            }
        }
        System.out.println("Plain Text: " + message);
        System.out.println("Cipher Text: " + result.toString());
    }
    
    public static void main (String[] args) {
        String message = "gourav singh";
        cipher(message, 3);
    }
}
