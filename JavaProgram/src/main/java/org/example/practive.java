package org.example;

public class practive {
public static String removechar(String word, char c) {
    StringBuilder s = new StringBuilder(word);
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == c) {
            s.deleteCharAt(i);
            i--;

        }
    }
    return s.toString();

}
    public static void main(String args[]){
    String word="shreyaa";
    char c='a';
        System.out.println(removechar(word,c));
}
}
