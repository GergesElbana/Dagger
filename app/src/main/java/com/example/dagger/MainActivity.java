package com.example.dagger;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private String TAG = "gerges";
    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        /**  manual DI*/
//        manualDI();
//        /** Constructor Injection*/
//        constructorInject();
//
//        /**Field Inject*/
//        fieldInject();
//
//        injectMain();
        usingModule();


    }

    /**
     * manual DI
     */
    private void manualDI() {

        Milk milk = new Milk();
        Farm farm = new Farm();
        River river = new River();

        Coffee coffee = new Coffee(farm, river, milk, 5);

    }


    /**
     * Constructor Injection
     */
//    private void constructorInject() {
//        CoffeeComponent component = DaggerCoffeeComponent.create();
//          component.getCoffee();
//
//    }

    /**
     * Field Inject
     */
//    private void fieldInject() {
//        CoffeeComponent component = DaggerCoffeeComponent.create();
//        component.getCoffee();
//        Log.d(TAG, "methodInject: " + component.getCoffee().getCoffeeCup());
//    }


    /**
     * use main activity injection
     */
//    private void injectMain(){
//        CoffeeComponent component = DaggerCoffeeComponent.create();
//        component.inject(this);
//        coffee.getCoffeeCup();
//
//    }


    /**
     * Show how to use module
     */
    private void usingModule() {
        CoffeeComponent component = DaggerCoffeeComponent.builder()
                .coffeeModule(new CoffeeModule(5)).build();
        component.inject(this);
        Log.d(TAG, "onCreate " + coffee.getCoffeeCup());
    }


}