package com.example;

import java.util.List;

public class Add {
    public int addtwo(int i, int i1) {
        return i+i1;
    }

    public int addThree(int i, int i1, int i2) {
        return i+i1+i2;
    }

    public int addFromList(List<Integer> list) {
        int result = 0;

        for (Integer i: list){
            result = result + i;
        }

        return result;
    }
}
