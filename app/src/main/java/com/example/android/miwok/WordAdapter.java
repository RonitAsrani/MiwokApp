package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sainih on 7/26/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolor;

    WordAdapter(Context context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mcolor = color;
           }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        LinearLayout ll = (LinearLayout) listItemView.findViewById(R.id.linearlay);
        int color = ContextCompat.getColor(getContext(), mcolor);
        ll.setBackgroundColor(color);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokTextView.setText(currentWord.getMiwok_word());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_word);
        englishTextView.setText(currentWord.getEnglish_word());

        ImageView img = (ImageView) listItemView.findViewById(R.id.img);
        if (currentWord.hasImage()) {
            img.setImageResource(currentWord.getImg());
            img.setVisibility(View.VISIBLE);  //We wanna make sure the view is visible again coz the views will be reused

        } else {
            img.setVisibility(View.GONE);
        }

        return listItemView;
    }
}