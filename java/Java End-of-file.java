import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int lineNumber = 1;
        Scanner scanner = new Scanner(System.in);
        do{
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }while (scanner.hasNext());
    }
}
