
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
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
public class Zadanie2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("liczby.txt");
        BufferedReader reader = null;
        FileReader in = null;
        int divTwo = 0;
        int divEight=0;
        int number;
        in = new FileReader(file);
        reader = new BufferedReader(in);
        String text;
        while ((text = reader.readLine()) != null) {
            if(text.charAt(text.length()-1)=='0'  ){
                divTwo++;
                
                if(text.charAt(text.length()-3)=='0' && text.charAt(text.length()-2)=='0'&&text.charAt(text.length()-1)=='0'  ){
                divEight++;
            }
            }
        }
        System.out.println("Ilość liczb podzielnych przez 2 ="+divTwo );
        System.out.println("Ilość liczb podzielnych przez 8 ="+divEight);

    }

}
