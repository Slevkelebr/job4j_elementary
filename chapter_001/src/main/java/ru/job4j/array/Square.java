package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int y = 1;
        for (int i = 0; i != bound; i++) {
            if (y <= bound) {
                rst[i] = y * y;
                y++;
            }
        }
        return rst;
    }
}