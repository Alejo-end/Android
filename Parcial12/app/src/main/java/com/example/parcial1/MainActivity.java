package com.example.parcial1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER = "com.example.application.parcial1.EXTRA_NUMBER";


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAct2();
            }
        });

        Spinner tipo = findViewById(R.id.tipo);
        tipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int
                    position, long id) {
                Toast.makeText(MainActivity.this,
                        parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    public void openAct2() {
        EditText userid = (EditText) findViewById(R.id.userid);
        int number = Integer.parseInt(userid.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_NUMBER, number);

        startActivity(intent);
    }
}