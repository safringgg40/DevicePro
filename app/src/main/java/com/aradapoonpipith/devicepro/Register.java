package com.aradapoonpipith.devicepro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, surnameEditText,
            usernameEditText,passwordEditText,phoneEditText,
            emailEditText,addressEditText;
    private String nameString,surnameString,
            usernameString,passwordString,phoneString,
            emailString,addressString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Bind Widget
        bindwidget();

    }//Main Class

    public void ClickSignUp(View view) {
        nameString = nameEditText.getText().toString().trim();
        addressString = addressEditText.getText().toString().trim();


        //chk space
        if (checkSpace()) {
            //Have Space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "blank", "please enter your data");

        } else {
            //No Space

        }
    }

    private boolean checkSpace() {
        return nameString.equals("")||
               addressString.equals("");

    }

    private void bindwidget() {
        nameEditText = findViewById(R.id.editText2);
        addressEditText = findViewById(R.id.editText4);
    }

}
