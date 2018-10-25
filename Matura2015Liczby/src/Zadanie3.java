
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Zadanie3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("liczby.txt");
        BufferedReader reader = null;
        FileReader in = null;
        int maxLine = 0;
        String max = null;
        int minLine = 0;
        String min = null;
        in = new FileReader(file);
        reader = new BufferedReader(in);
        String text;
        int counter = 1;
        while ((text = reader.readLine()) != null) {
            if (max == null) {
                max = text;
            }
            if (min == null) {
                min = text;
            }
            if (max.length() == text.length()) {
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) > max.charAt(i)) {
                        maxLine = counter;
                        max = text;
                        break;
                     }
                    if(max.charAt(i)>text.charAt(i)){
                        break;
                    }
                    
                }
            }
            if (max.length() < text.length()) {
                maxLine = counter;
                max = text;
            }
            if (min.length() == text.length()) {
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) < min.charAt(i)) {
                        minLine = counter;
                        min = text;
                        break;
                    }
                }
            }
            if (min.length() > text.length()) {
                minLine = counter;
                min = text;
            }
            counter++;
            
        }
        System.out.println("Linia maksymalnej liczby to"+maxLine);
        System.out.println("Linia minimalne liczby to"+minLine);
    }

}
