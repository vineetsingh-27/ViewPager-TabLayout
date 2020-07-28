package com.example.multiscreen;

public class Word {
    private String miwokTranslation;
    private String englishTranslation;
    private int resourceId = IMAGE_RESOURCE_ID;
    private int audioResourceId;

    private static final int IMAGE_RESOURCE_ID = -1;

    public Word(String miwokTranslation, String englishTranslation, int resourceId, int audioResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.englishTranslation = englishTranslation;
        this.resourceId = resourceId;
        this.audioResourceId = audioResourceId;
    }

    public Word(String miwokTranslation, String englishTranslation, int audioResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.englishTranslation = englishTranslation;
        this.audioResourceId=audioResourceId;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public int getResourceId() {
        return resourceId;
    }

    public boolean hasImage() {
        return resourceId != IMAGE_RESOURCE_ID;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }
}
