package org.example;

public class RealSubject implements ISubject{
    @Override
    public void doSomething() {
        System.out.println(this.getClass().getSimpleName()+"::doSomething.");
    }
}
