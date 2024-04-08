package lab6;
import java.util.Scanner;

public class c2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        System.out.println("The string after changing the case is: " + str.toUpperCase());

       
        StringBuilder reversedString = new StringBuilder(str);
        reversedString.reverse();
        System.out.println("The string after reversing is: " + reversedString);

      
        System.out.print("Enter the second string for comparison: ");
        String str2 = scanner.nextLine();
        int asciiDifference = Math.abs(str.compareTo(str2));
        System.out.println("The difference between ASCII values is: " + asciiDifference);

       
        System.out.print("Enter the string to be inserted into the first string: ");
        String insertedString = scanner.nextLine();
        System.out.println("The string after insertion is: " + str + " " + insertedString);

       
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

       
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int position = str.indexOf(ch);
        if (position != -1)
            System.out.println("Position of entered character: " + (position + 1));
        else
            System.out.println("Entered character is not present");

       
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");

        
        str = str.trim(); 
        int wordCount = str.split("\\s").length;
        int vowelCount = str.replaceAll("[aeiouAEIOU]", "").length();
        int consonantCount = str.replaceAll("[aeiouAEIOU]", "").length();
        System.out.println("No. of words: " + wordCount);
        System.out.println("No. of vowels: " + vowelCount);
        System.out.println("No. of consonants: " + consonantCount);

        scanner.close();
    }
}
