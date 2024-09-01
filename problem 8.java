public class SimpleStringExample {
    public static void main(String[] args) {
        // String Initialization
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";

        // Concatenation
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        // Comparison (case-sensitive)
        boolean areEqual = str1.equals(str2);
        System.out.println("str1 equals str2: " + areEqual);

        // Comparison (case-insensitive)
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("str1 equals str3 (ignore case): " + areEqualIgnoreCase);

        // String Length
        int lengthOfStr1 = str1.length();
        System.out.println("Length of str1: " + lengthOfStr1);

        // Substring
        String subStr = concatenatedString.substring(0, 5);
        System.out.println("Substring of concatenatedString (0 to 5): " + subStr);

        // Convert to Upper Case
        String upperCaseStr = str1.toUpperCase();
        System.out.println("str1 in upper case: " + upperCaseStr);
    }
}
