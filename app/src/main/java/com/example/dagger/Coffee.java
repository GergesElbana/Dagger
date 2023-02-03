package com.example.dagger;


import android.util.Log;

import javax.inject.Inject;

public class Coffee {
    private static final String TAG = "coffee";
    /**
     * Dagger does not support injection into private fields
     */
    @Inject
    public Farm farm;

    @Inject
    public River river;

    public Milk milk;

    int sugar = 2;


    /**
     * i cant make inject to milk so i use module for it
     */
    //    @Inject
    //    public Milk milk;
    @Inject
    public Coffee(Farm farm, River river, Milk milk, int sugar) {
        this.farm = farm;
        this.river = river;
        this.milk = milk;
        this.sugar = sugar;
        Log.d(TAG, " gerges Coffee: constructor inject");
    }


    /**
     * method injection every time i call an object of coffee the method also will be called
     */
    @Inject
    public void testCup() {
        Log.d(TAG, " gerges method injection: cup is ready");
    }

    public String getCoffeeCup() {
        return farm.getBeans() + " + " + river.getWater() +" Sugar ="+ sugar;
    }
}
