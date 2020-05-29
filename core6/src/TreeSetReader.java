import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetReader {
    public static void main(String[] args) {
        try {
            URL url = TreeSetReader.class.getResource("Names.txt");
            File originalFile = new File(url.getPath());
            FileInputStream fis = new FileInputStream(originalFile);
            Scanner sc = new Scanner(fis);
            TreeSet<String> treeSet = new TreeSet<>();
            while (sc.hasNextLine()) {
                treeSet.add(sc.nextLine());
            }
            sc.close();
            TreeSet<String> sortedTreeSet = (TreeSet<String>) treeSet.descendingSet();
            File newFile = new File("NamesSortedInTreeSet.txt");
            if (newFile.createNewFile()) {
                BufferedWriter writer = new BufferedWriter(new FileWriter("NamesSortedInTreeSet.txt", false));
                for (String s : sortedTreeSet) {
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
