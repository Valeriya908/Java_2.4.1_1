package ru.netology.sqr;

public class SQRService {
    public int enumerationSqrNum(int lowerRangeLimit, int upperRangeLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerRangeLimit && i * i <= upperRangeLimit) {
                counter++;
            }
        }
        return counter;
    }
}


