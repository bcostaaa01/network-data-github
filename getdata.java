package com.github;

import java.net.URL; // import package to use URL and methods

public class URLGitHub {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://github.com/marketplace");
            System.out.println("Protocol: " + url.getProtocol()); // get protocol
            System.out.println("Host: " + url.getHost()); // get host
            System.out.println("Path: " + url.getPath()); // get path
            System.out.println("Port: " + url.getPort()); // get port
        } catch (Exception error) {
            System.out.println(error); // throw an error in case request fails
        }
    }
}