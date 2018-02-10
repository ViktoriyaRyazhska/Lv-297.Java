package com.lv297java.inputreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * This class create a BufferReader.
 *
 * @author Andriy Shemechko
 * @version 1.0 9 Feb 2018
 */
public class BufferReader implements Reader {

    /**
     * This is the common reader for all classes.
     */
    public static BufferedReader reader;

    /**
     * {@inheritDoc}
     */
    @Override
    public void createReader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }
}

