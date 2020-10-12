package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Family_Members extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("father", "әpә"));
        words.add(new word("mother", "әṭa"));
        words.add(new word("son", "angsi"));
        words.add(new word("daughter", "tune"));
        words.add(new word("older brother", "taachi"));
        words.add(new word("younger brother", "chalitti"));
        words.add(new word("older sister", "teṭe"));
        words.add(new word("younger sister", "kolliti"));
        words.add(new word("grandmother ", "ama"));
        words.add(new word("grandfather", "paapa"));



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