package com.example.myoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Cat myCat = new Cat(4,"Puma");
        myCat.talk();
        Cat murzik = new Cat(3, "Murza");
        murzik.talk();
        murzik.breathe();

        Cat glasha = new Cat();
        glasha.initFields(5, "Glasha");
        glasha.talk();

        Cat catt;
        catt = new Cat(4,"Rita","birmanskaya","white");
        catt.talkAboutBreedAndColor();

        Puma puma = new Puma();
        puma.isAlive = true;
        puma.name = "Leo";
        puma.age = 4;
        puma.talk();
        //Log.i( "isAlive", String.valueOf(puma.isAlive));
        //Log.i( "breathe()", "My name is " + puma.name + " and " + puma.breathe());

    }


}