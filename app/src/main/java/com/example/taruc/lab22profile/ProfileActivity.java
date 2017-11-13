package com.example.taruc.lab22profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {
    private EditText editTextName, editTextMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Linking UI to program
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextMail = (EditText) findViewById(R.id.editTextMail);
    }

    public void saveProfile (View view){
        //TODO: GET USER INPUT
        String name, email;
        name = editTextName.getText().toString();
        email = editTextMail.getText().toString();
        //TODO: RETURN INPUT DATE TO THE MAIN ACTIVITY
        Intent intent = getIntent();
        intent.putExtra(MainActivity.PROFILE_NAME, name);
        intent.putExtra(MainActivity.PROFILE_EMAIL, email);
        setResult(RESULT_OK, intent);
        finish();
    }

}
