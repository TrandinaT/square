package ru.netology.sqr;

public class SQRService {
    public int cube(int max, int min) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= min) {
                if (sqr <= max) {
                    amount++;
                }
            }
        }
        return amount;
    }
}