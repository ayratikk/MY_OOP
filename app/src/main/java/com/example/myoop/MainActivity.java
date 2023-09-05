package com.example.myoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

        Cat glasha = new Cat();
        glasha.initFields(5, "Glasha");
        glasha.talk();

        Cat catt = new Cat();
        catt = new Cat(4,"Puma","birmanskaya","white");
        catt.talkAboutBreedAndColor();
    }
}