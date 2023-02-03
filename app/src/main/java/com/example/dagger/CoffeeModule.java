package com.example.dagger;


import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    int sugar;

    public CoffeeModule(int sugar) {
        this.sugar = sugar;
    }

    @Provides
    Milk provideMilk(){
        return new Milk();

    }

    @Provides
    int provideSugar(){
        return sugar;

    }
}
