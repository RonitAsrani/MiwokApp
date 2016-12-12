package com.example.android.miwok;

import android.support.annotation.DrawableRes;

import java.net.URL;

/**
 * Created by sainih on 7/26/2016.
 */
public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String miwok_word;
    private String english_word;
    private int img = NO_IMAGE_PROVIDED;
    private int maudio_resid;


    public Word(String pmiwok, String peng, int audio_resid) {
        miwok_word = pmiwok;
        english_word = peng;
        img = 0;
        maudio_resid =audio_resid;
    }

    public Word(String pmiwok, String peng, int mImg, int audio_resid) {
        this(pmiwok, peng,audio_resid);
        img = mImg;
    }

    public String getMiwok_word() {
        return miwok_word;
    }

    public String getEnglish_word() {
        return english_word;
    }

    public int getImg() {
        return img;
    }

    public boolean hasImage() {
        if (img == NO_IMAGE_PROVIDED) {
            return false;
        } else {
            return true;
        }
    }
    public int getMaudio_resid(){
        return maudio_resid;
    }
}
