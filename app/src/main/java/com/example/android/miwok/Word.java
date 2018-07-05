package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;

    private String mKicheTranslation;

    public Word(String defaultTranslation, String kicheTranslation) {
        mDefaultTranslation = defaultTranslation;
        mKicheTranslation = kicheTranslation;
    }

    /**
     * return default translation of word
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * return k'iche' translation
     */
    public String getmKicheTranslation() {
        return mKicheTranslation;
    }
}
