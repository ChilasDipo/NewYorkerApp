package com.example.newyorkerapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newyorkerapp.R;

public class ContactActivity extends AppCompatActivity {

    private String name, address, message, email;
    private int phonenumber;

    Button buttonKontaktMeasure, buttonKontaktKatalog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        getSupportActionBar().hide();

        buttonKontaktKatalog = findViewById(R.id.buttonKontaktKatalog);
        buttonKontaktMeasure = findViewById(R.id.buttonKontaktMeasure);
        initializeOnClickListeners();
    }

    public int getPhonenumber() {
        EditText editText = findViewById(R.id.editTextKontaktPhonenumber);
        String temp = editText.getText().toString();
        if (!"".equals(temp)){
            phonenumber = Integer.parseInt(temp);
        }
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        EditText editText = findViewById(R.id.editTextKontaktName);
        name = editText.getText().toString();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        EditText editText = findViewById(R.id.editTextKontaktAdress);
        address = editText.getText().toString();
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        EditText editText = findViewById(R.id.editTextTextMultiLine);
        message = editText.getText().toString();
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEmail() {
        EditText editText = findViewById(R.id.editTextKontaktEmail);
        email = editText.getText().toString();
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void initializeOnClickListeners(){
        buttonKontaktMeasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ContactActivity.this, MainActivity.class);
                startActivity(myIntent);

            }
        });
        buttonKontaktKatalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ContactActivity.this, CatalogActivity.class);
                startActivity(myIntent);
            }
        });
    }



}
