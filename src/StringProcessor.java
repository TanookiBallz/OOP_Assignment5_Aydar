public class StringProcessor {
	  // Method to check if the password is strong
    public boolean isStrongPassword(String password) {
			boolean hasUppercase = false;
			boolean hasLowercase = false;
			boolean hasDigit = false;
			boolean hasSpecial = false;

			for (char c : password.toCharArray()) {
					if (Character.isUpperCase(c)) {
							hasUppercase = true;
					} else if (Character.isLowerCase(c)) {
							hasLowercase = true;
					} else if (Character.isDigit(c)) {
							hasDigit = true;
					} else if ("!@#$%^&*()-+".contains(Character.toString(c))) {
							hasSpecial = true;
					}
			}

			return hasUppercase && hasLowercase && hasDigit && hasSpecial;
	}

	// Method to calculate the number of digits in a sentence
	public int calculateDigits(String sentence) {
			int digitCount = 0;
			for (char c : sentence.toCharArray()) {
					if (Character.isDigit(c)) {
							digitCount++;
					}
			}
			return digitCount;
	}

	// Method to calculate the number of words in a sentence
	public int calculateWords(String sentence) {
			if (sentence == null || sentence.trim().isEmpty()) {
					return 0;
			}
			String[] words = sentence.trim().split("\\s+");
			return words.length;
	}

	// Method to calculate the result of an arithmetic expression
	public double calculateExpression(String expression) {
			try {
					// Use Java's built-in scripting engine for evaluation
					javax.script.ScriptEngineManager manager = new javax.script.ScriptEngineManager();
					javax.script.ScriptEngine engine = manager.getEngineByName("JavaScript");
					return (double) engine.eval(expression);
			} catch (Exception e) {
					throw new IllegalArgumentException("Invalid expression");
			}
	}
}
