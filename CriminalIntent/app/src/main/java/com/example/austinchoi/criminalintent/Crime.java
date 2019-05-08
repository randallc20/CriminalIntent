package com.example.austinchoi.criminalintent;

import java.util.Date;
import java.util.UUID;
import java.text.DateFormat;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Date mTime;
    private String theday;
    private boolean mSolved;
    private boolean mRequiresPolice;

    public Crime() {
        /*mId = UUID.randomUUID();
        mDate = new Date();*/
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDate() {
        theday = DateFormat.getDateInstance(DateFormat.FULL).format(mDate);
        return theday;
    }

    public Date getNewDate() { return mDate; }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public boolean getPolice() { return mRequiresPolice;}

    public void setPolice(boolean policeNeeded) {
        mRequiresPolice = policeNeeded;
    }

    public Date getTime() { return mTime;  }

    public void setTime(Date time) { mTime = time; }
}
