/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2sc;

import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author elizajasin
 */
public class writeData {
    private static final String EXCEL_FILE_LOCATION = "E:\\Kuliah\\semester 7\\SC\\Tugas 2\\Tubes2SC\\data_norm.xls";
    public void write(double[][] data){
        WritableWorkbook myFirstWbook = null;
        try {

            myFirstWbook = Workbook.createWorkbook(new File(EXCEL_FILE_LOCATION));

            // create an Excel sheet
            WritableSheet excelSheet = myFirstWbook.createSheet("Sheet 1", 0);

            // add something into the Excel sheet
            for (int i = 0; i <= 43999 ; i++){
                for (int j = 0; j < 10 ; j++){
                    Number number = new Number(j, i, data[i][j]);
                    excelSheet.addCell(number);
                }
            }

            myFirstWbook.write();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        } finally {

            if (myFirstWbook != null) {
                try {
                    myFirstWbook.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (WriteException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}