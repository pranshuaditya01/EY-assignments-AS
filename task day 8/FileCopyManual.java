package com.ey.io;
import java.io.*;
public class FileCopyManual {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            
            System.out.print("Enter the source file path: ");
            String sourceFilePath = reader.readLine();

           
            System.out.print("Enter the destination file path: ");
            String destinationFilePath = reader.readLine();

            File sourceFile = new File(sourceFilePath);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException("Source file not found: " + sourceFilePath);
            }

            File destinationFile = new File(destinationFilePath);
            if (destinationFile.exists()) {
                System.out.print("Destination file already exists. Do you want to overwrite? Yes/No: ");
                String response = reader.readLine().toLowerCase();
                if (!response.equals("yes")) {
                    System.out.println("Operation aborted.");
                    return;
                }
            }

            copyFile(sourceFile, destinationFile);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void copyFile(File source, File destination) throws IOException {
        try (InputStream inputStream = new FileInputStream(source);
             OutputStream outputStream = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }
    }
}
