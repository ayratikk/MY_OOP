package com.example.myoop;

import android.util.Log;

public class Lion extends Cat{
    public void talk(){
        Log.i("talk()", "RRRRR! I m lion. My name is " + name + ", and I'm " + age + " years old." + Cat.whatCatsLike());
    }
}
