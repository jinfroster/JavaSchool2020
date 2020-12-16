import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TestFileLines {

    public static void main(String[] args) {
        BufferedReader reader;
        LinkedList<String> allLines = new LinkedList<>();
        TreeSet<MyString> allWords = new TreeSet<>();
        HashMap<String,Integer> distinctWordCount = new HashMap<>();

        try {
            reader = new BufferedReader(new FileReader("data.txt"));
            String line = reader.readLine();
            while (line != null) {
//                System.out.println(line);
                line = line.replaceAll("-"," ");
                line = line.replaceAll("[!\"',.-;:]","");
                line = line.replaceAll("  ","");
                allLines.add(line);

                String[] tmpWords = line.split(" ");
                for (String tmpWord: tmpWords) {
                    if (distinctWordCount.containsKey(tmpWord)) {
                        distinctWordCount.put(tmpWord, distinctWordCount.get(tmpWord)+1);
                    } else {
                        distinctWordCount.put(tmpWord, 1);
                    }
                    allWords.add(new MyString(tmpWord));
                }

                line = reader.readLine();                 // read next line
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        {
            System.out.println("===================");
            System.out.println("Reverse allLines: ");
            Iterator<String> iter = allLines.descendingIterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
        }

        System.out.println("===================");
        System.out.println("Distinct words: "+ distinctWordCount.size());
        for (String word : distinctWordCount.keySet()) {
            System.out.println(word + " : " + distinctWordCount.get(word));
        }

        System.out.println("===================");
        System.out.println("Words sorted by length, value: ");

        {
            Iterator<MyString> iter = allWords.iterator();
            while(iter.hasNext()) {
                System.out.println(iter.next());
            }
        }

    }
}
