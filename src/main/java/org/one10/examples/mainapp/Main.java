package org.one10.examples.mainapp;

import org.one10.examples.one.BackendServiceOne;
import org.one10.examples.two.BackendServiceTwo;
import org.one10.examples.util.TokenUtil;

public class Main {
    public static void main(String[] args) {

        System.out.format("Java 9 module org.one10.examples.util: %s%n", new TokenUtil().getToken());
        System.out.format("Java 9 module org.one10.examples.one: %s%n", new BackendServiceOne().getBackendServiceName());
        System.out.format("Java 9 module org.one10.examples.two: %s%n", new BackendServiceTwo().getBackendServiceName());

        System.out.println("*** Done");
    }
}
