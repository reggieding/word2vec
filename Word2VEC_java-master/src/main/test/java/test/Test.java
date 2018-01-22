package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.ansj.vec.Word2VEC;

import com.ansj.vec.util.ReadFile;
import org.ansj.domain.Result;
import org.ansj.splitWord.analysis.ToAnalysis;

public class Test {
    public static void main(String[] args) throws IOException {

        String str = "BEIJING -- China's tax revenue grew faster in Q1, official data showed on Thursday.\n" +
                "\n" +
                "The tax authority collected 3.33 trillion yuan ($490 billion) of revenue (excluding export rebates). It represents an increase of 11.8 percent from a year ago, compared with an annual rise of 4.8 percent registered in 2016, according to the State Administration of Taxation.\n" +
                "\n" +
                "The growth is buoyed by positive economic indicators, notably the producer price index, a main gauge of inflation at the factory gate which shows the economy firming up, Zheng Xiaoying, a senior official of the administration said at a press conference.\n" +
                "\n" +
                "In breakdown, the central government collected 1.54 trillion yuan and the local governments collected 1.79 trillion yuan, an increase of 11.1 percent and 12.4 percent respectively.\n" +
                "\n" +
                "The service sector contributed 55.7 percent of the total, 11.6 percentage points higher than secondary industries, reflecting improvement of industrial structure, Zheng said.\n" +
                "\n" +
                "Nonetheless, tax revenue from secondary industry gained steam, showing the real economy is improving, Zheng added.";

       // ToAnalysis toAnalysis = new ToAnalysis();

      //  Result res = toAnalysis.parseStr(str);

       // System.out.print(res.toString());



        File file =new File("library/xh.txt");

        //if file doesnt exists, then create it
        if(!file.exists()){
            file.createNewFile();
        }

        //true = append file
        FileWriter fileWritter = new FileWriter(file.getName(),true);
        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        bufferWritter.write(str);
        bufferWritter.close();

        System.out.println("Done");



    }
}
