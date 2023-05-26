// referensi: https://www.w3schools.com/java/java_files_read.asp

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Hitung2 {
    public static void main(String[] args) {
        int data;
        int total=0;
        try {
            File myObj = new File("text2.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextInt()) {
                data = myReader.nextInt();
                total = total + data;
                System.out.print(data+" ");
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Total = "+total);
    }
}