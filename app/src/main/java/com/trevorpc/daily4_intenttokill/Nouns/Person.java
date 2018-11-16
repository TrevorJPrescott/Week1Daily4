package com.trevorpc.daily4_intenttokill.Nouns;

import java.io.Serializable;

public class Person implements Serializable
{


    String first;
    String last;
    int month;
    int day;
    int year;

    public String getFirst() {
        return first;
    }
    public void setFirst(String first) {
        this.first = first;
    }
    public String getLast() {
        return last;
    }
    public void setLast(String last) {
        this.last = last;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public Person(String first,String last,int month,int day,int year)
    {
        this.first = first;
        this.last = last;
        this.month = month;
        this.day = day;
        this.year = year;
    }

}
