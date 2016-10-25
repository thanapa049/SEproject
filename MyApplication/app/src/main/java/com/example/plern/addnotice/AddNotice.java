package com.example.plern.addnotice;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class AddNotice extends AppCompatActivity {

    EditText placeId, placeName, placeAddress, placeLocation, placeTel, placeDetail, placeWebsite, placeFacebook, placeLine, placeIg, placeStarAvg, placePrice, reviewerAmount, placeWorkDay, placePhoto;
    private DatabaseReference mDatabase;

    boolean monCheck, tueCheck, wedCheck, thuCheck, friCheck, satCheck, sunCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notice);

        mDatabase = FirebaseDatabase.getInstance().getReference();
    }



    String workdayAvailiable = "";
    public String checkWorkday(){
        if(monCheck&&tueCheck&&wedCheck&&thuCheck&&friCheck&&satCheck&&sunCheck){
            //mon-sun
            workdayAvailiable = "Everyday";
        }else if (monCheck&&thuCheck&&wedCheck&&thuCheck&&friCheck){
            //mon-fri
            workdayAvailiable = "Monday to Friday";
        }else {
            if (monCheck){
                workdayAvailiable.concat("Monday ");
            } if (tueCheck){
                workdayAvailiable.concat("Tuesday ");
            }if (wedCheck){
                workdayAvailiable.concat("Wednesday ");
            }if (thuCheck){
                workdayAvailiable.concat("Thursday ");
            }if (friCheck){
                workdayAvailiable.concat("Friday ");
            }if (satCheck){
                workdayAvailiable.concat("Saturday ");
            }if (sunCheck){
                workdayAvailiable.concat("Sunday");
            }
        }
        return workdayAvailiable;
    }

    public void onClicksetposition(View v){
        Intent intent = new Intent(this, setPositionMap.class);
        startActivity(intent);
    }
    public void onClicksave(View v){

        monCheck = ((CheckBox) findViewById(R.id.mon)).isChecked();
        tueCheck = ((CheckBox) findViewById(R.id.tue)).isChecked();
        wedCheck = ((CheckBox) findViewById(R.id.wed)).isChecked();
        thuCheck = ((CheckBox) findViewById(R.id.thu)).isChecked();
        friCheck = ((CheckBox) findViewById(R.id.fri)).isChecked();
        satCheck = ((CheckBox) findViewById(R.id.sat)).isChecked();
        sunCheck = ((CheckBox) findViewById(R.id.sun)).isChecked();
        //send to view notice by gade
        placeName = (EditText)findViewById(R.id.placename);
        placeAddress = (EditText)findViewById(R.id.address);//physical address
        placeLocation = (EditText)findViewById(R.id.posi);//latitudelongtitude
        placeTel = (EditText)findViewById(R.id.telnum);
        placeWebsite = (EditText)findViewById(R.id.web);
        placeFacebook = (EditText)findViewById(R.id.fb);
        placeLine = (EditText)findViewById(R.id.line);
        placeIg = (EditText)findViewById(R.id.insta);
        placeDetail = (EditText)findViewById(R.id.detail);
        placePrice = (EditText)findViewById(R.id.price);


//        ArrayList<Image>;
//        photo

        Place place = new Place(placeName.getText().toString(), placeAddress.getText().toString(),
                placeLocation.getText().toString(), placeTel.getText().toString(),
                placeDetail.getText().toString(), placeWebsite.getText().toString(),
                placeFacebook.getText().toString(), placeLine.getText().toString(),
                placeIg.getText().toString(), placePrice.getText().toString(),
                checkWorkday());


        mDatabase.child("Place").push().setValue(place);
        Log.e("success", mDatabase.child("Place").getRoot().toString());
    }
}
