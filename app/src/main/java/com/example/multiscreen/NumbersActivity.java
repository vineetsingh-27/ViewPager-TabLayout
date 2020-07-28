package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("lutti", "one", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("otiiko", "Two", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("tolookosu", "Three", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("oyyisa", "Four", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("massokka", "Five", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("temmokka", "Six", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("kenekaku", "Seven", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("kawinta", "Eight", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("wo’e", "Nine", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("na’aacha", "Ten", R.drawable.number_ten, R.raw.number_ten));

        ListView listView = findViewById(R.id.list);
        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.category_number);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}