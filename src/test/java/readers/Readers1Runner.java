package readers;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Readers1Runner {
    Readers1 readers1=new Readers1();

    @Test
    public void test1() throws IOException {
        String s1="C:\\Users\\w\\Desktop\\employees\\KORAY.txt";
        String s2 ="C:\\Users\\w\\Desktop\\employees\\KORAY2.txt";
        readers1.testReusable(s1,s2);
    }
    @Test
            public void test2(){
        findFileFromFolderAndCompareTheirContents();

    }
    @Test
    public void test3(){
        checkTxtFilesContentsSameFromDifferentFolder();

    }
    public void findFileFromFolderAndCompareTheirContents(){
        String folderPath="C:\\Users\\w\\Desktop\\employees";
        Map<String, List<File>> fileGroups = new HashMap<>();

        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String extension = getFileExtension(file);
                    List<File> group = fileGroups.getOrDefault(extension, new ArrayList<>());
                    group.add(file);
                    fileGroups.put(extension, group);
                }
            }
        }

        // Check the contents of .txt files within each group
        for (List<File> group : fileGroups.values()) {
            if (group.get(0).getName().toLowerCase().endsWith(".txt")) {
                if (areTxtFilesContentsSame(group)) {
                    System.out.println("Files with extension ." + getFileExtension(group.get(0)) + " have the same content.");
                } else {
                    System.out.println("Files with extension ." + getFileExtension(group.get(0)) + " have different content.");
                }
            }
        }
    }

    public static String getFileExtension(File file) {
        String name = file.getName();
        int lastDotIndex = name.lastIndexOf('.');
        if (lastDotIndex != -1 && lastDotIndex < name.length() - 1) {
            return name.substring(lastDotIndex + 1).toLowerCase();
        }
        return "";
    }

    public static boolean areTxtFilesContentsSame(List<File> files) {
        try {
            String firstFileContent = getFileContent(files.get(0));
            for (int i = 1; i < files.size(); i++) {
                String currentFileContent = getFileContent(files.get(i));
                if (!firstFileContent.equals(currentFileContent)) {
                    return false;
                }
            }
            return true;
        } catch (IOException e) {
            // Handle IOException if necessary
            e.printStackTrace();
            return false;
        }
    }

    public static String getFileContent(File file) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
    public void checkTxtFilesContentsSameFromDifferentFolder(){
        String folderPath1="C:\\Users\\w\\Desktop\\employees actual";
        String folderPath2="C:\\Users\\w\\Desktop\\employees expected";
        try (DirectoryStream<Path> dirStream1 = Files.newDirectoryStream(Paths.get(folderPath1), "*.txt");
             DirectoryStream<Path> dirStream2 = Files.newDirectoryStream(Paths.get(folderPath2), "*.txt")) {

            for (Path filePath1 : dirStream1) {
                Path filePath2 = Paths.get(folderPath2, filePath1.getFileName().toString());

                if (Files.exists(filePath2) && Files.isRegularFile(filePath1) && Files.isRegularFile(filePath2)) {
                    if (compareFiles(filePath1, filePath2)) {
                        System.out.println(filePath1.getFileName() + " and " + filePath2.getFileName() + " have the same content.");
                    }
                }
            }
        } catch (IOException e) {
            // Handle IOException if necessary
            e.printStackTrace();
        }
    }

    public static boolean compareFiles(Path file1, Path file2) throws IOException {
        if (Files.size(file1) != Files.size(file2)) {
            return false; // Dosyaların boyutu farklıysa içerikleri kesinlikle farklıdır.
        }

        byte[] content1 = Files.readAllBytes(file1);
        byte[] content2 = Files.readAllBytes(file2);

        for (int i = 0; i < content1.length; i++) {
            if (content1[i] != content2[i]) {
                return false; // İçerikleri karşılaştır ve farklı bir byte bulursan false döndür.
            }
        }
        return true; // İçerikleri tamamen eşleşiyorsa true döndür.
    }
}

