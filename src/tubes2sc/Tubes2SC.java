/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2sc;

import java.io.IOException;

/**
 *
 * @author elizajasin
 */
public class Tubes2SC {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int[][] input = new int[50000][10];
        double[][] dataNorm = new double[50000][10];
        int[] target = new int[50000];
        
        readData data = new readData();
        data.setInputFile("data_train.xls");
        data.read(input,target);
        
//        display data
//        for (int i = 0; i <43999; i++){
//            for (int j = 0; j <10; j++){
//                System.out.print(i+"| "+input[i][j]+" ");
//            }
//            System.out.println();
//        }
        
        normalisasiData norm = new normalisasiData();
        norm.minMax(input, dataNorm);
        
        writeData data1 = new writeData();
        data1.write(dataNorm);
    }
}