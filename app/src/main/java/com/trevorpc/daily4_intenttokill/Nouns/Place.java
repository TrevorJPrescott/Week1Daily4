package com.trevorpc.daily4_intenttokill.Nouns;

import android.os.Parcel;
import android.os.Parcelable;

public class Place implements Parcelable
{
    	int streetNum;
    	String streetName;
    	String city;
    	String state;
    	int zip;



    public int getStreetNum() {
        return streetNum;
    }
    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }

    public Place(int a,String b,String c,String d,int e)
    {
        this.streetNum = a;
        this.streetName = b;
        this.city = c;
        this.state = d;
        this.zip = e;

    }

    public Place(Parcel input)
    {
        streetNum =input.readInt();
        streetName = input.readString();
        city = input.readString();
        state = input.readString();
        zip = input.readInt();
    }

    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeInt(streetNum);
        dest.writeString(streetName);
        dest.writeString(city);
        dest.writeString(state);
        dest.writeInt(zip);
    }

    public static final Parcelable.Creator<Place> CREATOR
            = new Parcelable.Creator<Place>() {
        public Place createFromParcel(Parcel in) {
            return new Place(in);
        }

        public Place[] newArray(int size) {
            return new Place[size];
        }

    };



}

