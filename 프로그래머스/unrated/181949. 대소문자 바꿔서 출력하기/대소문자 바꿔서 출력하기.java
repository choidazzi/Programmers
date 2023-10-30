import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String printStr = "";
        
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                printStr += String.valueOf(c).toLowerCase();
            } else {
                printStr += String.valueOf(c).toUpperCase();
            }
        }
        System.out.print(printStr);
    }
}