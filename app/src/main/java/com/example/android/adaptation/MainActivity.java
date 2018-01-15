package com.example.android.adaptation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String theList[]={"Vsause","Veritasium","Minuite Physics","Smarter Everyday","Dong"};
        ListAdapter theadapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,theList);
        ListView theListView = (ListView) findViewById(R.id.listview);
        theListView.setAdapter(theadapter);
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String channelPicked="You Selected "+String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this,channelPicked,Toast.LENGTH_SHORT).show();
            }
        });

    }
}