package com.lv297java;

import java.io.IOException;

public class Main {
    /**
     * Method from which the program starts
     *
     * @param args array of string arguments for startup
     *
     * @throws IOException can throw IOException
     */
    public static void main(String[] args) throws IOException {
        ProjectManager manager = new ProjectManager();
        manager.start();
    }
}
