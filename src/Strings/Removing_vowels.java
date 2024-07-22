package Strings;

public class Removing_vowels {
    public static  void main(String[] ar) {
        Removing_vowels ob = new Removing_vowels();

        System.out.println(ob.removeVowels());
    }

    private String removeVowels() {
        StringBuilder removed_string = new StringBuilder();
        String word = "I am vinay sdjlkfghlvqlkv alksg sdokhg";
        word = word.toLowerCase();
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
            {
                removed_string.append(ch);
            }
        }

    return removed_string.toString();
    }

}
