package org.example;

public class Main {
    public static void main(String[] args) {
        ISubject iSubject = new Proxy(new RealSubject());
        iSubject.doSomething();
    }
}