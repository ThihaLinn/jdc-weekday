package org.example;

public class Proxy implements ISubject{

   private  RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        doSomething();
        realSubject.doSomething();
    }

    @Override
    public void doSomething() {
        System.out.println(this.getClass().getSimpleName()+"::doSomethingExtra...");
    }
}
