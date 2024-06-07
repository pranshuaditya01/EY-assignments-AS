package com.ey.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chargemanager {
    public static void main(String[] args) {
        List<CallDetailRecord> records = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter fromNumber: ");
            int fromNumber = scanner.nextInt();

            System.out.print("Enter toNumber: ");
            int toNumber = scanner.nextInt();

            System.out.print("Enter duration (in minutes): ");
            float duration = scanner.nextFloat();

            CallDetailRecord record = new CallDetailRecord(fromNumber, toNumber, duration);
            records.add(record);

            System.out.print("Do you want to enter another call detail? (Yes/No): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("yes")) {
                break;
            }
        }

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ChargeRecord.ser"))) {
            for (CallDetailRecord record : records) {
                outputStream.writeObject(record);
            }
            System.out.println("Charge records serialized successfully.");
        } catch (IOException e) {
            System.err.println("Error while serializing charge records: " + e.getMessage());
        }
    }
}

