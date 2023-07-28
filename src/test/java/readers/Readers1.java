package readers;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Readers1 {


    public void testReusable(String path1,String path2) throws IOException {
//        String path1 = "C:\\Users\\w\\Desktop\\KORAY.txt";
//        String path2 = "C:\\Users\\w\\Desktop\\KORAY2.txt";
        List<String> yazi = new ArrayList<>();
        List<String> yazi2 = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path1));
        BufferedReader br2 = new BufferedReader(new FileReader(path2));
        String line1 = br.readLine();
        String line2 = br2.readLine();
        while (line1 != null) {

            yazi.add(line1);
            line1 = br.readLine();

        }
        while (line2 != null) {
            yazi2.add(line2);
            line2 = br2.readLine();
        }
        if(yazi.size()==yazi2.size()){
            for (int i = 0; i <yazi.size() ; i++) {
                assertEquals(yazi.get(i),yazi2.get(i));

            }
        }else  {
            System.out.println("icerik ayni degil");
        }
        System.out.println("icerik ayni");

    }
}
