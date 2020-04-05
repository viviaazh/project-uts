package com.example.cobauts1.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Transaction implements Parcelable {
    private String classSchedule;
    private String day;

    public Transaction(){

    }

    public Transaction( String classSchedule, String day) {
        this.classSchedule = classSchedule;
        this.day = day;
    }

    public String getClassSchedule() {
        return classSchedule;
    }

    public void setClassSchedule(String classSchedule) {
        this.classSchedule = classSchedule;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.classSchedule);
        dest.writeString(this.day);
    }

    protected Transaction(Parcel in) {
        classSchedule = in.readString();
        day = in.readString();
    }

    public static final Creator<Transaction> CREATOR = new Creator<Transaction>() {
        @Override
        public Transaction createFromParcel(Parcel in) {

            return new Transaction(in);
        }

        @Override
        public Transaction[] newArray(int size) {

            return new Transaction[size];
        }
    };
}
