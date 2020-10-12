package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("red", "weṭeṭṭi"));
        words.add(new word("mustard yellow", "chiwiiṭә"));
        words.add(new word("dusty yellow", "ṭopiisә"));
        words.add(new word("green", "chokokki"));
        words.add(new word("brown", "ṭakaakki"));
        words.add(new word("gray", "ṭopoppi"));
        words.add(new word("black", "kululli"));
        words.add(new word("white", "kelelli"));




//        int lg=0;


//        while (lg<10) {
//            ListView rootView= (ListView) findViewById(R.id.number_list);
//            ArrayAdapter<String>itemAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,words);
//rootView.setAdapter(itemAdapter);
//            TextView number= new TextView(this);
//            number.setText(words.get(lg));
//            rootView.addView(number);
//        lg++;
//        }

        wordAdapter adapter = new wordAdapter(this, words);
//        ArrayAdapter<word> itemAdapter = new ArrayAdapter(Numbers.this,R.layout.new_layout, words);

        ListView rootView = (ListView) findViewById(R.id.list);
        rootView.setAdapter(adapter);
    }
}