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
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("One","lutti"));
        words.add(new word("Two","otiiko"));
        words.add(new word("Three","tolookosu"));
        words.add(new word("Four","oyyisa"));
        words.add(new word("Five","massokka"));
        words.add(new word("Six","temmokka"));
        words.add(new word("Seven","kenekaku"));
        words.add(new word("Eight","kawinta"));
        words.add(new word("Nine","wo'e"));
        words.add(new word("Ten","na'aacha"));




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

        ListView rootView = (ListView) findViewById(R.id.number_list);
        rootView.setAdapter(adapter);
    }
}