package com.netease.study.learnjava.inject;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * @author : lishuming
 */
public class HelloTest {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Module() {
            public void configure(Binder binder) {

            }
        });

        HelloCaller helloCaller = injector.getInstance(HelloCaller.class);
        helloCaller.sayHello();
        helloCaller = injector.getInstance(HelloCaller.class);
        helloCaller.sayHello();

        HelloCaller helloCaller1 = injector.getInstance(HelloCaller.class);
        helloCaller1.sayHello();
    }
}
