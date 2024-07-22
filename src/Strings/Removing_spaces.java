package Strings;

import java.io.StringWriter;
import java.util.Scanner;

public class Removing_spaces {
        public static void main(String[] ar) {
            Scanner s = new Scanner(System.in);
            String sentence = s.nextLine();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) != ' ') {
                    sb.append(sentence.charAt(i));
                }
            }
            System.out.println(sb);

        }
}
