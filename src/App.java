public class App {
    public static void main(String[] args) throws Exception {
			StringProcessor sp = new StringProcessor();

			// Test isStrongPassword
			System.out.println("Test isStrongPassword:");
			System.out.println(sp.isStrongPassword("Passw0rd!") == true); // Strong password
			System.out.println(sp.isStrongPassword("password") == false); // No uppercase, digit, or special
			System.out.println(sp.isStrongPassword("Password") == false); // No digit, special
			System.out.println(sp.isStrongPassword("Passw0rd") == false); // No special character
			System.out.println(sp.isStrongPassword("P@ssword") == false); // No digit

			// Test calculateDigits
			System.out.println("\nTest calculateDigits:");
			System.out.println(sp.calculateDigits("There are 123 apples.") == 3); // 3 digits
			System.out.println(sp.calculateDigits("No digits here!") == 0); // No digits
			System.out.println(sp.calculateDigits("10 cats and 20 dogs.") == 4); // 4 digits
			System.out.println(sp.calculateDigits("12345") == 5); // All digits
			System.out.println(sp.calculateDigits("") == 0); // Empty string

			// Test calculateWords
			System.out.println("\nTest calculateWords:");
			System.out.println(sp.calculateWords("Hello World!") == 2); // 2 words
			System.out.println(sp.calculateWords("This is a simple sentence.") == 5); // 5 words
			System.out.println(sp.calculateWords("") == 0); // Empty string
			System.out.println(sp.calculateWords("OneWord") == 1); // 1 word
			System.out.println(sp.calculateWords("    ") == 0); // Only spaces

			// Test calculateExpression
			System.out.println("\nTest calculateExpression:");
			System.out.println(sp.calculateExpression("5 + 3 * 2") == 11.0); // Expression with priority
			System.out.println(sp.calculateExpression("(10 - 3) * 2") == 14.0); // Expression with brackets
			System.out.println(sp.calculateExpression("10 / 2") == 5.0); // Simple division
			System.out.println(sp.calculateExpression("100 - 99") == 1.0); // Simple subtraction
			System.out.println(sp.calculateExpression("1 + 1 * (3 + 2)") == 6.0); // Complex expression
    }
}
