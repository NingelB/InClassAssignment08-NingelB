package com.example.cmltdstudent.inclassassignment08_ningelb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {

    private EditText name;
    private EditText calories;
    private CheckBox healthy;

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference foodRef = database.getReference("food");


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = (EditText) findViewById(R.id.food);
        calories = (EditText) findViewById(R.id.calories);
        healthy = (CheckBox) findViewById(R.id.healthy);
    }

        public void firebase (View view) {

            String addName = name.getText().toString();
            int addCalories = Integer.parseInt(calories.getText().toString());
            boolean isHealthy = healthy.isChecked();

            Food food = new Food(addName, addCalories, isHealthy);
            foodRef.push().setValue(food);

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
    }
}
