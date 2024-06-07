package com.ey.io;
import java.io.File;
public class FileSearch {
	 public static void searchFile(File directory, String fileName) {
	        File[] files = directory.listFiles();
	        if (files != null) {
	            for (File file : files) {
	                if (file.isDirectory()) {
	                    searchFile(file, fileName); 
	                } else if (file.getName().equals(fileName)) {
	                    System.out.println(file.getAbsolutePath()); 
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String directoryPath = "C:\\Program Files\\Java\\jdk-17"; 
	        String fileName ="README"; 

	        File directory = new File(directoryPath);
	        if (directory.exists()) {
	            searchFile(directory, fileName);
	        } else {
	            System.out.println("Directory not found.");
	        }
	    }
}