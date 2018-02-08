package com.lv297java;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<AbstractTest> tasksList = new ArrayList<AbstractTest>();

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        initializeList(searchClasses("src/com/lv297java/tasks"));
        start();
    }

    private static void start() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String taskName;
        System.out.println("Welcome to Lv-297Java first app.");
        System.out.println("To show list of tasks input (show tasks)");
        System.out.println("To exit this app input (exit)");
        while (true) {
            System.out.println("Enter task name:");
            taskName = bufferedReader.readLine();
            if (taskName.equals("exit"))
                break;
            if(taskName.equals("show tasks")) {
                List<String> list = searchClasses("src/com/lv297java/tasks");
                for(String item : list) {
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

    private static List<String> searchClasses(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        if(file.isDirectory()) {
            File[] result = file.listFiles();
            for(File item: result) {
                String temp = item.getPath().replace('\\', '.').replace("src.", "").replace(".java", "");
                list.add(temp);
            }
        }
        return list;
    }

    private static void initializeList(List<String> list) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException{
        for(String item : list) {
            try {
                Class<?> a = Class.forName(item);
                tasksList.add((AbstractTest) a.getConstructor().newInstance());
            } catch (ClassNotFoundException e) {
                System.out.println("SYS-INFO: Can`t load class " + item);
            }
        }
    }
}
