package com.example.dagger;

import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {


    Coffee getCoffee();

    /**
     * to inject mainActivity with dagger
     */
    void inject(MainActivity mainActivity);
}
