package com.example.construction_sevices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public boolean getText() {

        edit1 = (EditText) findViewById(R.id.text);
        if ((edit1 == null) || (edit1.equals(""))) {

            String result = "Please enter a value";
            assert edit1 != null;
            edit1.setText(result);

            return false;
        } else {

        }
        return true;
    }
}

