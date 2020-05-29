import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListReader {
    public static void main(String[] args) {
        try {
            URL url = ArrayListReader.class.getResource("Names.txt");
            File originalFile = new File(url.getPath());
            FileInputStream fis = new FileInputStream(originalFile);
            Scanner sc = new Scanner(fis);
            ArrayList<String> arrayList = new ArrayList();
            while (sc.hasNextLine()) {
                arrayList.add(sc.nextLine());
            }
            sc.close();
            arrayList.sort(Collections.reverseOrder());
            File newFile = new File("NamesSortedInArrayList.txt");
            if (newFile.createNewFile()) {
                BufferedWriter writer = new BufferedWriter(new FileWriter("NamesSortedInArrayList.txt", false));
                for (String s : arrayList) {
                    writer.write(s);
                    writer.write("\n");
                }
                writer.close();
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}