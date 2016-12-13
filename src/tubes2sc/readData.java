/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2sc;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author elizajasin
 */
public class readData {
    private String inputFile;
    
    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public void read(int[][] input,int[] target) throws IOException  {
        File inputWorkbook = new File(inputFile);
        Workbook w;
        try {
          w = Workbook.getWorkbook(inputWorkbook);
          // Get the first sheet
          Sheet sheet = w.getSheet(0);
          // Loop over first 10 column and lines
          for (int j = 0; j < sheet.getColumns(); j++) {
            for (int i = 0; i < sheet.getRows(); i++) {
              Cell cell = sheet.getCell(j, i);
              if (j == 10){
                  target[i] = Integer.parseInt(cell.getContents());
              } else{
                  input[i][j] = Integer.parseInt(cell.getContents());
              }
            }
          }
        } catch (BiffException e) {
          e.printStackTrace();
        }
    }
}
