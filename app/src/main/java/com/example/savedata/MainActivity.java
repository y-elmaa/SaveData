package com.example.savedata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

      EditText nmbrY,nmbrX ;
      TextView result;
      Button calc;
    int sum ;
    private Bundle outState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();

        nmbrY = findViewById(R.id.editTextNumber);
        nmbrX = findViewById(R.id.editTextNumber2);

        result = findViewById(R.id.textView);

        calc = findViewById(R.id.button);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int number1 = Integer.parseInt(nmbrY.getText().toString());
                int number2 = Integer.parseInt(nmbrX.getText().toString());
                 sum = number1 + number2;
                result.setText("Result: " + sum);
            }
        });
        if (savedInstanceState != null) {
            sum = savedInstanceState.getInt("result");
            result.setText(String.valueOf(sum));
        }
        public void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            outState.putInt("result", sum);
        }
        @Override
        protected void onStart() {
            super.onStart();
            Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onResume() {
            super.onResume();
            Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onPause() {
            super.onPause();
            Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onStop() {
            super.onStop();
            Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        }
    }
}