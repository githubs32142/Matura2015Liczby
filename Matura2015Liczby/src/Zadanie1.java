
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
public class Zadanie1 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file= new File("liczby.txt");
        BufferedReader reader = null;
        FileReader in=null;
        int counter=0;
            in = new FileReader(file);
            reader= new BufferedReader(in);
            String text;
                while((text=reader.readLine())!=null){
                    if(moreZeroThanOne(text)){
                        counter++;
                    }
                }
        System.out.println("Ilość licz w zapisie binarnym mająca więcej zer niż jedynek wynosi="+counter);
    }
    public static boolean moreZeroThanOne(String text){
        int countZero=0;
        int countOne=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='0'){
                countZero++;
            }
            else{
                countOne++;
            }
    }
        return countZero>countOne;
    }
}
