package com.example.myoop;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Cat cat = new Lion();
      cat.talk();

      Printable printable = new Puma();
      printable.print();
      ((Puma) printable).move();

      printAnyObject(new Puma());



    }
    void printAnyObject(Printable printable){

    }


}