/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2sc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author elizajasin
 */
public class Tubes2SC {
    private static int nCol;
    private static int countData;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float data[][] = new float[2000][2000];
        String s = readFile("newthyroid.txt");
        String[] has =s.split("\n");
        for(int i=0;i<has.length;i++){
            String nilai[]=has[i].split("\t");
            nCol=nilai.length;
            for(int j=0;j<nilai.length;j++){
                try{
                        data[i][j]=Float.valueOf(nilai[j]);
                countData++;
                }catch(NumberFormatException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
    public static String readFile (String fileName){
        BufferedReader br = null;
        String stringRes = "";
  
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(fileName));
            while ((sCurrentLine = br.readLine()) != null) {
                stringRes = stringRes + sCurrentLine + "\n";
            }
  
        } catch (IOException e) {
            System.out.println("Gagal membaca file " + fileName);
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return stringRes;
    }
}
