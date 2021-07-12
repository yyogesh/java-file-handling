package com.company;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Java uses the concept of a stream to make I/O operations on a file.
public class Main {

    public static void main(String[] args) {
        try {
// Creating an object of a file
            File myObj = new File("FileHandlingNewFilef1.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

class FileInformation {
    public static void main(String[] args) {
        // Creating an object of a file
        File myObj = new File("FileHandlingNewFilef1.txt");
        if (myObj.exists()) {
            // Returning the file name
            System.out.println("File name: " + myObj.getName());

// Returning the path of the file
            System.out.println("Absolute path: " + myObj.getAbsolutePath());

// Displaying whether the file is writable
            System.out.println("Writeable: " + myObj.canWrite());

// Displaying whether the file is readable or not
            System.out.println("Readable " + myObj.canRead());

// Returning the length of the file in bytes
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}





class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("FileHandlingNewFilef1.txt");
            // Writes this content into the specified file
            myWriter.write("Java is the prominent programming language of the millenium!");

// Closing is necessary to retrieve the resources allocated
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


class ReadFromFile {
    public static void main(String[] args) {
        try {
// Creating an object of the file for reading the data
            File myObj = new File("D:FileHandlingNewFilef1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}