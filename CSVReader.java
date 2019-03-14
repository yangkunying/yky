/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yangkunying
 */
public class CSVReader {

    public static void main(String... args) throws FileNotFoundException {
        File file = new File("‪‪‪‪‪‪‪C:\\Users\\yangkunying\\Desktop\\Emlpoyee.txt");
        System.out.println(file.exists());
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        
        try {
            String line;
            for(int row = 0; (line = br.readLine())!= null; row++){
               String[] emp = line.split(",");
               for(String data : emp){
                System.out.println(data);
               }
              
            }
            
        } catch (IOException ex) {
            Logger.getLogger(CSVReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
