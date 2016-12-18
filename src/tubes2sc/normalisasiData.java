/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2sc;

/**
 *
 * @author elizajasin
 */
public class normalisasiData {
    public static void minMax(int[][] data, double[][] newdata){
        String s;
        int jumdat=44000;
        int newmax=1;
        int newmin=0;
        for(int j=0;j<10;j++){
            float max=max(data,j);
            float min=min(data,j);
            for(int i=0;i<jumdat;i++){
                newdata[i][j] = ((data[i][j]-min)*(newmax-newmin))/((max-min)+newmin);
                //newdata[i][j] = (int)(newdata[i][j]*100);
            }
        }
    }
    private static float max(int[][] data,int j) {
        float max = 0;
        int jumdat=44000;
        for(int i=0;i<jumdat;i++){
            if(data[i][j]>max){
                max=data[i][j];
            }
        }
        //System.out.println(max);
        return max;
    }
     
    private static float min(int[][] data,int j){
     float min=1000;        
            int jumdat=44000;
            for(int i=0;i<jumdat;i++){
                if(min>data[i][j]){
                min=data[i][j];
                }
                 
        }
         //System.out.println(min);   
        return min;
    }
}