package com.company.ht5;

import java.util.Random;

public class Fraction {
    private int  m;
    private int n;

    public void setMN() {
        Random random = new Random();
        m = random.nextInt(100) + 1;
        n = random.nextInt(100) + 1;
    }

    public void setMN(int valueM, int valueN) {
        this.m = valueM;
        this.n = valueN;
    }

    public int getM () {
        return this.m;
    }

    public int getN () {
        return this.n;
    }

}
