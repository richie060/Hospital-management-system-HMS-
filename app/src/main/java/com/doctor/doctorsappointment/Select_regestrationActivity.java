package com.doctor.doctorsappointment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import doctor.doctorsappointment.R;


public class Select_regestrationActivity extends AppCompatActivity {

    private TextView back;
    private Button patientReg, doctorReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_question);

        back = findViewById(R.id.back);
        patientReg = findViewById(R.id.patientReg);
        doctorReg = findViewById(R.id.doctorReg);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Select_regestrationActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
        patientReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Select_regestrationActivity.this, PatientRegister.class);
                startActivity(intent);
            }
        });
        doctorReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Select_regestrationActivity.this, DoctorRegister.class);
                startActivity(intent);
            }
        });


    }
}