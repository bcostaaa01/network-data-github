package com.github;

import java.net.URL;

public class URLGitHub {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://github.com/marketplace");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Path: " + url.getPath());
            System.out.println("Port: " + url.getPort());
        } catch (Exception error) {
            System.out.println(error);
        }
    }
}