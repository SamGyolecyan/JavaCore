package homeworks.IOExampleDemo;

import java.io.IOException;

public class FileAnalyzerDemo {

    public static final String PATH = "C:\\Users\\Welcome\\IdeaProjects\\JavaCore\\src\\homeworks\\IOExampleDemo\\fileDemo.txt";

    public static void main(String[] args) throws IOException {

        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        fileAnalyzer.wordMap(PATH);


    }
}
