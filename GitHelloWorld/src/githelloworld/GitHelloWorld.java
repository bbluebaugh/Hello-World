/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githelloworld;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author bwbluebaugh0
 */
public class GitHelloWorld {
    public void GitHelloWorld(){
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<String> lines = new ArrayList<String>();
        try{
            
            FileReader F = new FileReader(args[0]);
            BufferedReader BR = new BufferedReader(F);
            String line = "";
            while((line = BR.readLine()) != null);
            {
                lines.add(line);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("File not Found");
        }
        catch(IOException ex){
            System.out.println("Input not great");
        }
    }
    
}
