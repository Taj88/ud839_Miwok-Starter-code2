package com.example.android.miwok;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class Numbers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words = new ArrayList<>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

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
        ListView rootView = (ListView) findViewById(R.id.number_list);
        ArrayAdapter<String> itemAdapter = new ArrayAdapter(Numbers.this,R.layout.new_layout, words);
        rootView.setAdapter(itemAdapter);
    }
}