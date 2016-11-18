package lec1_1.task2;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Illya on 16.11.2016.
 */
@SaveTo(path = "D:\\JetBrains\\IdeaProjects\\src\\lec1_1\\task2\\t2.txt")
public class TextContainer {
    String str = "I'm TextContainer's string!";

    @Saver
    public void save(String path) throws IOException {
        FileWriter fw = new FileWriter(path);
        try {
            fw.write(str);
        } finally {
            fw.close();
        }

    }
}
