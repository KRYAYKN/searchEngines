package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//        String kelime ="koray";
//        StringBuilder ters =new StringBuilder(kelime);
//        ters.reverse();
//        System.out.println(ters);
//    }

        String path1 = "C:\\Users\\w\\Desktop\\KORAY.txt";
        String path2 = "C:\\Users\\w\\Desktop\\KORAY2.txt";
        List<String> yazi = new ArrayList<>();
        List<String> yazi2 = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path1));
        BufferedReader br2 = new BufferedReader(new FileReader(path2));
        String line1 = br.readLine();
        String line2 = br2.readLine();
        while (line1 != null) {
            System.out.println(line1);
            yazi.add(line1);
            line1 = br.readLine();

        }
        while (line2 != null) {
            yazi2.add(line2);
            line2 = br2.readLine();
        }
if(yazi.size()==yazi2.size()){
    for (int i = 0; i <yazi.size()+1 ; i++) {
        assert (yazi.get(i))==(yazi2.get(i));

    }
}else  {
    System.out.println("icerik ayni degil");
}
        System.out.println("icerik ayni");





        FileInputStream fis = new FileInputStream(path1);
        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }

    }
}