package org.one10.examples.mainapp;

import org.one10.examples.util.TokenUtil;

public class Main {
    public static void main(String[] args) {

        System.out.format("Testing Java 9 module org.one10.examples.util: %s%n", new TokenUtil().getToken());

        System.out.println("*** Done");
    }
}
