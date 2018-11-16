package com.trevorpc.daily4_intenttokill;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.trevorpc.daily4_intenttokill.Nouns.Person;
import com.trevorpc.daily4_intenttokill.Nouns.Place;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
    }

    public void OnButtonClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.toInfo:
                intent = new Intent(this, Info.class);
                startActivity(intent);
                break;
            case R.id.Result:
                intent = new Intent(this, Info.class);
                startActivityForResult(intent, 999);
                break;

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 999) {

            String fullName = data.getStringExtra("fullName");
            String birthDate = data.getStringExtra("birthDate");
            String fullAddress = data.getStringExtra("fullAddress");
            String fullCSZ = data.getStringExtra("CSZ");


            // set text view with string
            TextView textView = findViewById(R.id.RfullName);
            textView.setText(fullName);
            TextView textView1 = findViewById(R.id.RBirthday);
            textView1.setText(birthDate);
            TextView textView2 = findViewById(R.id.RAddress);
            textView2.setText(fullAddress);
            TextView textView3 = findViewById(R.id.RCityAndState);
            textView3.setText(fullCSZ);
        }
        if (requestCode == 1) {
            Person person1 = (Person) getIntent().getSerializableExtra("person");
            Place place1 = getIntent().getParcelableExtra("place");

            String fullName = person1.getFirst() + " " + person1.getLast();
            String birthDate = person1.getMonth() + " " + person1.getDay() + " " + person1.getYear();

            String fullAddress = place1.getStreetNum() + " " + place1.getStreetName();
            String fullCSZ = place1.getCity() + " " + place1.getState() + " " + place1.getZip();


            // set text view with string
            TextView textView = findViewById(R.id.RfullName);
            textView.setText(fullName);
            TextView textView1 = findViewById(R.id.RBirthday);
            textView1.setText(birthDate);
            TextView textView2 = findViewById(R.id.RAddress);
            textView2.setText(fullAddress);
            TextView textView3 = findViewById(R.id.RCityAndState);
            textView3.setText(fullCSZ);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAGD", "onStart: ");
    }

    @Override
    protected void onResume() {
        Log.d("TAGD", "onResume: ");
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAGD", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAGD", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAGD", "onDestroy: ");
    }
}





