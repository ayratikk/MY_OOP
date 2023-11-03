package com.example.myoop;

import android.util.Log;

public abstract class Cat extends Animal{
    int age;
    String name;
    final static int numberOfLegs = 4;
    private String breed;
    private String color;
    static int count = 0;

    static class CountResetter {
        boolean moreThan100 = false;
        CountResetter(){
            if (Cat.count > 5){
                moreThan100 = true;
            }
            if(moreThan100){
                resetCount(0);
            }
        }
        void resetCount(int value){
        Cat.count = value;
        }
    }
    String helloText;
    CatMood catMood;
    private class CatMood{
        int levelOfMood;

        CatMood(){
            if(Cat.this.age < 2){
                levelOfMood = 100;
            } else if (Cat.this.age >=2 && Cat.this.age <7){
                levelOfMood = 50;
            } else if (Cat.this.age >= 7) {
                levelOfMood = 20;
            }
        }
    }

    public Cat() {
    count++;
    this.name = "John";
    this.age = -1;
    catMood = new CatMood();
    switch(catMood.levelOfMood){
        case 100:
            helloText = "Meow! I m happy cat. My name is " + name + ", and I'm " + age + " years old.";
            break;
        case 50:
            helloText = "Meow! I m cat. My name is " + name + ", and I'm " + age + " years old.";
            break;
        case 20:
            helloText = "Meow! I m angry cat! My name is " + name + ", and I'm " + age + " years old.";
            break;

        }

    }
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;

        catMood= new CatMood();
        switch(catMood.levelOfMood){
            case 100:
                helloText = "Meow! I m happy cat. My name is " + name + ", and I'm " + age + " years old.";
                break;
            case 50:
                helloText = "Meow! I m cat. My name is " + name + ", and I'm " + age + " years old.";
                break;
            case 20:
                helloText = "Meow! I m angry cat! My name is " + name + ", and I'm " + age + " years old.";
                break;

        }
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
        Log.i("talk()", helloText);
    }

    //В методе talk сделать вывод значения этих полей
    public void talkAboutBreedAndColor(){
        Log.i("talk()", "Hi! My name is " + name + ", and I'm " + age + " years old, "
                + "my breed - " + breed + " and color - " + color);
    }

    public void talk(int age){
        Log.i("talk()", "Meow! I'm cat " + age + " years old.");
    }

    public void talk(String hello){
        Log.i("talk()", "Meow! " + hello);
    }

    public static String whatCatsLike(){
        return "I like playing, jumping and sometimes scratching";
    }

    public void catchMouse(int mouseWeight){
        class Mouse{
            String color;
            int weight;

            public Mouse(String color, int weight){
                this.color = color;
                this.weight = weight;
            }

            String mouseVoice(){
                return "Pi-pi-pi";
            }
        }
        Mouse mouse = new Mouse("White", mouseWeight);
        if(mouse.weight < 2){
            Log.i("cat say", "I will eat you" + " "+ mouse.mouseVoice());
        } else {
            Log.i("cat say", "I afraid you");
        }
    }
}
