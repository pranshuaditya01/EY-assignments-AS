package com.ey.io;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class DisplayChargeRecord{
    public static void main(String[] args) {
        List<CallDetailRecord> records = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ChargeRecord.ser"))) {
            while (true) {
                CallDetailRecord record = (CallDetailRecord) inputStream.readObject();
                records.add(record);
            }
        } catch (EOFException e) {
           
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Error while deserializing charge records: " + e.getMessage());
        }

        System.out.println("FromNumber\tToNumber\tCharge");
        for (CallDetailRecord record : records) {
            System.out.println(record.getFromNumber() + "\t\t" + record.getToNumber() + "\t\t" + record.getCharge());
        }
    }
}
