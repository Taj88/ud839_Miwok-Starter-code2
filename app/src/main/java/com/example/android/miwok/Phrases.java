package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Where are you going?", "minto wuksus"));
        words.add(new word("What is your name?", "tinnә oyaase'nә"));
        words.add(new word("My name is...", "oyaaset..."));
        words.add(new word("How are you feeling?", "michәksәs?"));
        words.add(new word("I’m feeling good.", "kuchi achit"));
        words.add(new word("Are you coming?", "әәnәs'aa?"));
        words.add(new word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new word("I’m coming.", "әәnәm"));
        words.add(new word("Let’s go.", "yoowutis"));
        words.add(new word("Come here.", "әnni'nem"));




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

        ListView rootView = (ListView) findViewById(R.id.phrase_list);
        rootView.setAdapter(adapter);
    }
}