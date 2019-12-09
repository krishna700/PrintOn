package com.printon.user.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.firestore.FirebaseFirestore;
import com.printon.user.dbmodel.EventModel;
import com.printon.user.R;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.dmoral.toasty.Toasty;

public class Event extends AppCompatActivity {

    @BindView(R.id.type)
    EditText type;
    @BindView(R.id.name)
    EditText name;
    @BindView(R.id.phone)
    EditText phone;
    @BindView(R.id.landmark)
    EditText landmark;
    @BindView(R.id.street)
    EditText street;
    @BindView(R.id.house)
    EditText house;

    @BindView(R.id.request)
    MaterialButton request;

    String sType,sName,sPhone,sLandmark,sStreet,sHouse;

    FirebaseFirestore db;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        ButterKnife.bind(this);
        db= FirebaseFirestore.getInstance();

        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sType=type.getText().toString();
                sName=name.getText().toString();
                sPhone=phone.getText().toString();
                sLandmark=landmark.getText().toString();
                sStreet=street.getText().toString();
                sHouse=house.getText().toString();

                final int random = new Random().nextInt(100) + 10;
                final int randomOne = new Random().nextInt(10000) + 100;
                String id=""+random+randomOne;



                if(sType.equals("")) type.setError("Empty !");
                else if(sName.equals("")) name.setError("Empty !");
                else if(sPhone.equals("")) phone.setError("Empty !");
                else if(sStreet.equals("")) street.setError("Empty !");
                else if(sLandmark.equals("")) landmark.setError("Empty !");
                else if(sHouse.equals("")) house.setError("Empty !");

                else
                {
                    EventModel event=new EventModel(id,sName,sType,sPhone,sStreet,sLandmark);

                    db.collection("orders").document("events")
                            .collection("requests")
                            .document(id).set(event)
                            .addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Toasty.success(Event.this, "Sit back. Relax! We'll contact you", Toast.LENGTH_LONG, true).show();
                                    finish();
                                }
                            });
                }
            }
        });


    }
}
