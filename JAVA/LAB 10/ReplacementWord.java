
//Write a program to replace all “word1” by “word2” from a file1, and output is written to file2 file and display the no. of replacement.
import java.util.*;
import java.io.*;

public class ReplacementWord {
    public static void main(String[] args) {
        File f1 = new File("File1.txt");
        File f2 = new File("File2.txt");
        String word1 = "hello";
        String word2 = "world";
        try {
            f1.createNewFile();
            f2.createNewFile();

            if (!f1.exists() || !f2.exists()) {
                System.out.println("File Not Exist");
            }

            FileReader fr1 = new FileReader("File1.txt");
            FileWriter fr2 = new FileWriter("File2.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            BufferedWriter wr1 = new BufferedWriter(fr2);

            String temp = br1.readLine();
            int count = 0;

            while (temp != null) {
                String changedline = "";

                String a[] = temp.split(" ");

                for (int i = 0; i < a.length; i++) {
                    if (a[i].equals(word1)) {
                        count++;
                        changedline += word2 += " ";
                    } else {
                        changedline += a[i] += " ";
                    }
                }

                wr1.write(changedline);
                wr1.newLine();

                temp = br1.readLine();
            }

            br1.close();
            wr1.close();

            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
