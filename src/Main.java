import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("asdfgaaaa", 'a'));
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("assa"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Угадай слово:.........");
        String o = sc.nextLine();


        String[] word = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int i = random.nextInt(word.length);
        String randomWord = word[i];

        while (!randomWord.equals(o)) {
            if (o == randomWord) {
            } else {
                StringBuilder sBrandomWord = new StringBuilder(randomWord);
                System.out.println("не угодал вот подсказка: " + sBrandomWord.replace(2, 13, "###############"));
                o = sc.next().toLowerCase();
            }
        }
    }

    public static int findSymbolOccurance(String text, char b) {
        int counter = 0;
        char[] s = text.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == (b)) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public static int findWordPosition(String source, String target) {
        int stri = source.indexOf(target);


        return stri;
    }

    public static String stringReverse(String rse) {

        StringBuilder sb = new StringBuilder(rse);
        String a = sb.reverse().toString();


        return a;
    }

    public static Boolean isPalindrome(String palindrome) {
        StringBuilder sb = new StringBuilder(palindrome);
        String reverPalindrome = sb.reverse().toString();
        boolean x = palindrome.equals(reverPalindrome);
        return x;
    }

}

