import java.util.Scanner;
import java.lang.String;
public class ReverseString {
    public static void main(String[] args) {
        String text="Hello World";
        String reversed=reverseString(text);
        System.out.println(reversed);
        
    }

    public static String reverseString(String input){
        char[] chars=input.toCharArray();
        StringBuilder reversed= new StringBuilder();
        for(int i=chars.length-1;i>=0;i--){
            reversed.append(chars[i]);

        }
        return reversed.toString();
    }
    
}
