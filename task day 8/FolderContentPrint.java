package com.ey.io;
import java.io.File;

public class FolderContentPrint {
	public static void displayFolderContents(String folderPath) {
        File folder = new File(folderPath);

       
        File[] items = folder.listFiles();

        if (items != null) {
            for (File item : items) {
                if (item.isDirectory()) {
                    String folderName = item.getName();
                    System.out.println(folderName); 
                    displayFolderContents(item.getAbsolutePath()); 
                }
            }
        }
    }

    public static void main(String[] args) {
        
        String folderPath = "C:\\Program Files\\Java\\jdk-17";

        
        System.out.println("Contents of folder: " + folderPath);
        displayFolderContents(folderPath);
    }
}

