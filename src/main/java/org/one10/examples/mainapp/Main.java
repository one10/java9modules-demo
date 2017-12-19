package org.one10.examples.mainapp;

import org.one10.examples.one.BackendServiceOne;
import org.one10.examples.two.BackendServiceTwo;
import org.one10.examples.util.TokenUtil;

public class Main {
    public static void main(String[] args) {

        System.out.format("Java 9 module org.one10.examples.util: %s%n", runModuleUtil());
        System.out.format("Java 9 module org.one10.examples.one: %s%n", runModuleOne());
        System.out.format("Java 9 module org.one10.examples.two: %s%n", runModuleTwo());

        System.out.println("*** Done");
    }

    public static String runModuleUtil() {
        return new TokenUtil().getToken();
    }

    public static String runModuleOne() {
        return new BackendServiceOne().getBackendServiceName();
    }

    public static String runModuleTwo() {
        return new BackendServiceTwo().getBackendServiceName();
    }
}
