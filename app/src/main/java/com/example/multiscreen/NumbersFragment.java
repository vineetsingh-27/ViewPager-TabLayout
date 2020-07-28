package com.example.multiscreen;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

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

        ListView listView = rootView.findViewById(R.id.list);
        WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.category_number);
        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(getActivity(), word.getAudioResourceId());
                mediaPlayer.start();
            }
        });

        return rootView;
    }
}