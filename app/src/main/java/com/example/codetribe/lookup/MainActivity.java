package com.example.codetribe.lookup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private String name;
    private String DoB;
    private String gender;



    TextView Display;
    RadioButton male;
    RadioButton female;
    Button Clicked;
    EditText Name;
    EditText DOB;


    RadioGroup radGroup;
    Person Persons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display = (TextView) findViewById(R.id.Dsiplay);
        male = (RadioButton) findViewById(R.id.radMale);
        female = (RadioButton)findViewById(R.id.radFemale);
        Clicked = (Button)findViewById(R.id.Show);
        Name = (EditText)findViewById(R.id.editName);
        DOB=(EditText)findViewById(R.id.Dob);

        radGroup = (RadioGroup)findViewById(R.id.radioGroup);


        radGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radMale)
                {
                    gender = "Male";

                }
                else if (checkedId == R.id.radFemale)
                {
                    gender = "Female";
                }
            }
        });



        Clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = Name.getText().toString();
                DoB = DOB.getText().toString();

                Display.setText(name + " Born at " + DoB + " and the gender is " + gender);
                Toast.makeText(getBaseContext(),name + " Born at " + DoB+ " and the gender is " + gender,Toast.LENGTH_LONG).show();
            }
        });





    }
}
