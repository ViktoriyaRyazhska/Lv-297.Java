package com.lv297java;

import java.io.IOException;

/**
 * Class from which the program starts.
 *
 * @author Kravtsiv Ostap
 * @version 1.1.2   10.02.2018
 */
class Main {
    /**
     * Method from which the program starts.
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
