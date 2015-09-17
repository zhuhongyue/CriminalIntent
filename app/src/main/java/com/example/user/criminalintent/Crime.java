package com.example.user.criminalintent;

import java.util.UUID;

/**
 * Created by zhuhongyue on 2015/9/17.
 */
public class Crime {
    private UUID mid;

    private String mTitle;

    public Crime(){
        mid = UUID.randomUUID();
    }

    public UUID getID(){
        return mid;
    }

    public String getTitle(){
        return mTitle;
    }

    public void setTitle(String title){
        mTitle = title;
    }

}
