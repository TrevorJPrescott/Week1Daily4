package com.trevorpc.daily4_intenttokill;
import android.support.annotation.Nullable;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


import com.trevorpc.daily4_intenttokill.Nouns.Person;
import com.trevorpc.daily4_intenttokill.Nouns.Place;

public class Info extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent intent = getIntent();
        setResult(999, intent);
    }

    public void OnButtonClick(View view)
    {
        //finding Answers
        Log.d("The end is nigh", "OnButtonClick:welp we started ");
        EditText last = findViewById(R.id.etLastName);
        EditText first =  findViewById(R.id.etFirstName);
        String fullName = first.getText().toString()+" "+last.getText().toString();

        EditText month = findViewById(R.id.etBirthMonth);
        EditText day = findViewById(R.id.etBirthDay);
        EditText year =  findViewById(R.id.etBirthyear);
        String bd = month.getText().toString()+"/"+day.getText().toString()+"/" +year.getText().toString();

        EditText stNum =  findViewById(R.id.etStreetNumber);
        EditText stName = findViewById(R.id.etStreetName);
        String fullAd = stNum.getText().toString()+" "+stName.getText().toString();

        EditText city = findViewById(R.id.etCity);
        EditText state = findViewById(R.id.etState);
        EditText zip = findViewById(R.id.etZip);
        String CSZ = city.getText().toString()+" "+state.getText().toString()+" " +zip.getText().toString();


        //conversions
        String lastP = last.toString();
        String firstP= first.toString();
        String stNameP = stName.toString();
        String cityP= city.toString();
        String stateP =state.toString();

        String temp = month.toString();
        int monthP = Integer.parseInt(temp);
        temp = day.toString();
        int dayP = Integer.parseInt(temp);
        temp = year.toString();
        int yearP = Integer.parseInt(temp);
        temp = stNum.toString();
        int stNumP = Integer.parseInt(temp);
        temp = zip.toString();
        int zipP = Integer.parseInt(temp);


        Log.d("The end is nigh", "OnButtonClick: We got this Far ");

        Person person = new Person(firstP,lastP,monthP,dayP,yearP);
        Place place = new Place(stNumP,stNameP,cityP,stateP,zipP);

        Log.d("The end is nigh", "OnButtonClick: not the objects");

        Bundle bundle = new Bundle();

        bundle.putString("fullName",fullName);
        bundle.putString("birthDate",bd);
        bundle.putString("fullAddress",fullAd);
        bundle.putString("CSZ",CSZ);

        Log.d("The end is nigh", "OnButtonClick: Not the Bundle");

        Intent Rintent = new Intent();
        Rintent.putExtras(bundle);
        //Rintent.putExtra("person",person);
        //Rintent.putExtra("place",place);


        setResult(RESULT_OK, Rintent);
        finish();

            }




    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAGI", "onStart: ");
    }

    @Override
    protected void onResume() {
        Log.d("TAGI", "onResume: ");
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAGI", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAGI", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAGI", "onDestroy: ");
    }
}

