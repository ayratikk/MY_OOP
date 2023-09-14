package com.example.myoop;

import android.util.Log;

public class Cat extends Animal{
    int age;
    String name;
    String breed;
    String color;

    public Cat() {

    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat(int age, String name, String breed, String color) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void initFields(int a, String n){
        age = a;
        name = n;
    }

    public void talk(){
        Log.i("talk()", "Hi! My name is " + name + ", and I'm " + age + " years old.");
    }

    public void talkAboutBreedAndColor(){
        Log.i("talk()", "Hi! My name is " + name + ", and I'm " + age + " years old, "
                + "my breed - " + breed + " and color - " + color);
    }

}
