package com.example.myoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
Cat myCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCat = new Cat(4,"Puma");
        myCat.talk();

        Cat murzik = new Cat(3, "Murza");
        murzik.talk();
        murzik.breathe();

        Cat glasha = new Cat();
        glasha.initFields(5, "Glasha");
        glasha.talk();

        Cat catt = new Cat();
        catt = new Cat(4,"Puma","birmanskaya","white");
        catt.talkAboutBreedAndColor();

        Puma puma = new Puma();

        puma.breathe();
        puma.talk();
        puma.isAlive = true;
        puma.name = "Leo";
        Log.i( "isAlive", String.valueOf(puma.isAlive));
        Log.i( "breathe()", "My name is " + puma.name + " and " + puma.breathe());
    }
}