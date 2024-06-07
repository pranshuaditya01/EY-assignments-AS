package com.ey.io;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class DetailRecord implements Serializable {
    private int fromNumber;
    private int toNumber;
    private float duration;
    private float charge;

    public CallDetailRecord(int fromNumber, int toNumber, float duration) {
        this.fromNumber = fromNumber;
        this.toNumber = toNumber;
        this.duration = duration;
        this.charge = duration; // 1 Rupee per minute rate
    }

    public int getFromNumber() {
        return fromNumber;
    }

    public int getToNumber() {
        return toNumber;
    }

    public float getCharge() {
        return charge;
    }
}

