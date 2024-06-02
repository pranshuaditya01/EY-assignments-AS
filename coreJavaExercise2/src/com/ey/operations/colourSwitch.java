package com.ey.operations;

public class colourSwitch {

    public String getColor(char colorCode) {
        switch (colorCode) {
            case 'r':
                return "Red";
            case 'g':
                return "Green";
            case 'b':
                return "Blue";
            case 'y':
                return "Yellow";
            default:
                return "Invalid color code";
        }
    }
}
