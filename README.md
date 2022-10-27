# 🖥 network-data-github

This Java network application prints out the protocol, host, path and port of the GitHub.com/marketplace page using the java.net.URL package and it's built-in methods.

## ⚙️ Codebase

In the main getdata.java file, 

```
package com.github;

import java.net.URL;
```

1. The java.net.URL is imported, in order to use the data type URL where we will later store the URL of github.com/marketplace and the methods needed to return the data we want to have regarding the URL.

```
public class URLGitHub {
  public static void main(String[] args) {}
}
```

2. Then, the class URLGitHub is instantiated, where the codebase is written.

```
try {
            URL url = new URL("https://github.com/marketplace");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Path: " + url.getPath());
            System.out.println("Port: " + url.getPort());
        } catch (Exception error) {
            System.out.println(error);
        }
```

3. Then, we create an exception, where we get the data from the GitHub.com/marketplace URL stored in the url variable.

5. Then, the program prints 4 things on the console using the different network methods available: 

- getProtocol()
- getHost()
- getPath()
- getPort()

6. The console should look like this when the java file is executed:

<img width="245" alt="Screenshot 2022-10-27 at 18 56 43" src="https://user-images.githubusercontent.com/72168158/198363941-43d54f86-2ca6-475d-bb99-d5cd3a9e59c2.png">

🎉🎉

## 💡 Resources 

java.net: https://www.javatpoint.com/java-net-package

## 💻 How to run the project locally

```
git clone https://github.com/bcostaaa01/network-data-github
java --version 
java getdata.java
```

1. First, clone the repo 
2. Make sure you have java jdk installed on your machine in order to run the java file
3. Run the file
