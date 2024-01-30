package com.application.adaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        String [] countrys = {"Usa", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France", "Germany", "Saudi Arabia", "France"};

       //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countrys);
        MyCustomAdapter adapter = new MyCustomAdapter(this, countrys);

       listView.setAdapter(adapter);
    }

}