package lect2_1.task2;

import com.google.gson.Gson;

import java.io.*;

/**
 * Created by Illya on 16.11.2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        System.out.println("Reading Json from file...");
        BufferedReader br = new BufferedReader(new FileReader("src\\lect2_1\\task2\\json.txt"));
        Contact contact = gson.fromJson(br, Contact.class);
        System.out.println(contact);
    }
}
