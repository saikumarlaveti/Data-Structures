package RevisionTopics.Exception;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
     public static void main(String[] args) {
            try {
                FileReader reader = new FileReader("file.txt"); // may throw FileNotFoundException
                reader.read();                                  // may throw IOException
                reader.close();
            } catch (IOException e) {
                System.out.println("Exception handled: " + e);
            }
        }
}

