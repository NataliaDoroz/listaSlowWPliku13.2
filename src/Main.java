import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> wordsList = readWordsFromFile();
        System.out.println(wordsList);

        String theLongestWord = getTheLongestWord(wordsList);
        System.out.println("największe slowo: " + theLongestWord);

        String theShortestWord = getTheShortestWord(wordsList);
        System.out.println("najmiejsze słowo: " + theShortestWord);

        System.out.println("liczba liter= " + countingLetters(wordsList));
    }

    private static ArrayList<String> readWordsFromFile() throws FileNotFoundException {
        File file = new File("words.txt");
        ArrayList<String> wordsList = new ArrayList<>();
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            wordsList.add(scan.nextLine());
        }
        return wordsList;
    }

    private static String getTheLongestWord(ArrayList<String> wordsList) {
        String theLongestWord = wordsList.get(0);
        for (String word : wordsList) {
            if (word.length() > theLongestWord.length()) {
                theLongestWord = word;
            }
        }
        return theLongestWord;
    }

    private static String getTheShortestWord(ArrayList<String> wordsList) {
        String theShortestWord = wordsList.get(0);
        for (String word : wordsList) {
            if (word.length() < theShortestWord.length()) {
                theShortestWord = word;
            }
        }
        return theShortestWord;
    }

    private static int countingLetters(ArrayList<String> wordsList) {
        int numbersOfLetters = 0;
        for (String words : wordsList) {
            numbersOfLetters += words.length();
        }
        return numbersOfLetters;
    }
}
