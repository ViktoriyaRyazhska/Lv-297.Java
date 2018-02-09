package com.lv297java.tasks.inputreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReader implements Reader {

    public static BufferedReader reader;

    @Override
    public void createReader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }
}

