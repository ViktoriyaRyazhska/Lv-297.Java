package com.lv297java;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Main class of this project. Contain <em>public static void main</em> method
 * and is responsible for running current console app.
 *
 * <p> It should load classes from specified directory
 * and return them when user input name of exact class.
 *
 * <p> It use some custom console commands, in particular:
 * <ul>
 *     <li>show tasks</li>
 *     <li>exit</li>
 * </ul>
 *
 * @version 1.0.7   09.02.2018
 * @author Kravtsiv Ostap
 */
public class Main {

    /** This field contains instances of all loaded classes. */
    private static List<AbstractTest> tasksList = new ArrayList<AbstractTest>();

    /** Here we hardcode path to folder with task classes */
    private static final String PATH_TO_TASKS = "src/com/lv297java/tasks";

    /**
     * Method from which the program starts
     *
     * @param args array of string arguments for startup
     *
     * @throws IOException can throw IOException
     * @throws IllegalAccessException can throw IllegalAccessException
     * @throws InstantiationException can throw InstantiationException
     * @throws NoSuchMethodException can throw NoSuchMethodException
     * @throws InvocationTargetException can throw InvocationTargetException
     */
    public static void main(String[] args) throws IOException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {
        initializeList(searchClasses(PATH_TO_TASKS));
        start();
    }

    /**
     * Run while(true) loop to maintain users input.
     *
     * @throws IOException can throw IOException
     */
    private static void start() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String taskName;
        System.out.println("Welcome to Lv-297Java first app.");
        System.out.println("To show list of tasks input (show tasks)");
        System.out.println("To exit this app input (exit)");
        while (true) {
            System.out.println("Enter task name:");
            taskName = bufferedReader.readLine();
            if (taskName.equals("exit")) {
                break;
            }
            if (taskName.equals("show tasks")) {
                List<String> list = searchClasses(PATH_TO_TASKS);
                for (String item : list) {
                    System.out.println(item);
                }
            }
            for (AbstractTest abstractTest : tasksList) {
                if (abstractTest.getTestID().equals(taskName)) {
                    abstractTest.execute();
                }
            }
        }
    }

    /**
     * This method go to specified directory, read and format
     * paths of all classes that exists.
     *
     * @param path string argument which points to the required directory
     *
     * @return collection of formatted relative paths to classes
     */
    private static List<String> searchClasses(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        if (file.isDirectory()) {
            File[] result = file.listFiles();
            for (File item: result) {
                String temp = item.getPath().replace('\\', '.').replace("src.", "").replace(".java", "");
                list.add(temp);
            }
        }
        return list;
    }

    /**
     * Method that is responsible for initializing classes from paths read through searchClasses.
     *
     * @param list receives list of strings with relative paths to classes
     *
     * @throws IllegalAccessException can throw IllegalAccessException
     * @throws InstantiationException can throw InstantiationException
     * @throws NoSuchMethodException can throw NoSuchMethodException
     * @throws InvocationTargetException can throw InvocationTargetException
     */
    private static void initializeList(List<String> list) throws IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {

        for (String item : list) {
            try {
                Class<?> a = Class.forName(item);
                tasksList.add((AbstractTest) a.getConstructor().newInstance());
            } catch (ClassNotFoundException e) {
                System.out.println("SYS-INFO: Can`t load class " + item);
            }
        }
    }
}
