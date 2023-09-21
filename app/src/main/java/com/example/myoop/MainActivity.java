package com.example.myoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat vaska = new Cat();
        // vaska.talk(3);

        Puma bagira = new Puma();
        // bagira.talk();

        Cat puma = new Puma();
        //puma.talk();

        Cat murzik = new Lion();
        //lion.talk();

        Cat lion = new Lion();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(vaska);
        cats.add(bagira);
        cats.add(puma);
        cats.add(murzik);
        cats.add(lion);

        Cat cat = cats.get(0);
        Cat cat1 = cats.get(1);
        Cat cat2 = cats.get(2);
        Cat cat3 = cats.get(3);
        Cat cat4 = cats.get(4);
        Puma puma1 = (Puma) cats.get(1);
        puma1.talk();

        Cat cat5 = cats.get(4);

        if (cat5 instanceof Puma) {

            Puma puma2 = (Puma) cat5;
            puma2.talk();
        } else {
            Log.i("instanceof", "This is not Puma");
        }
    }


}