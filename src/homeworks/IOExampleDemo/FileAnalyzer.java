package homeworks.IOExampleDemo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class FileAnalyzer {

    public int totalWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем общее количество слов

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "";
            int count = 0;

            while ((line = br.readLine()) != null) {
                count++;
            }

            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }



    public int countWordOccurrences(String path, String word) throws IOException {
        // Читаем файл, находим количество вхождений слова и возвращаем это число

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "";
            int count = 0;

            while ((line = br.readLine()) != null) {
                if (line.equals(word)) {
                    count++;
                }
            }

            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return 0;
    }

    public Map<String, Integer> wordMap(String path) throws IOException {
        // Читаем файл, составляем мапу слово-количество и возвращаем ее

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> word = new HashMap<>();
            String line = "";
            int count = 0;

            while ((line = br.readLine()) != null) {
                if (line != null) {
                    word.put(line, count++);
                }
            }
            System.out.println(line + " " + count);


        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
