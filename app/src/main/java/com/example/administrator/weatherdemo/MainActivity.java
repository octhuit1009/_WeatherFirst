package com.example.administrator.weatherdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        refreshView();
    }

    private void refreshView() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }

    private void initData() {
        data = new String[]{"aa", "bb", "cc", "dd", "ee"};
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.list_view);
    }
}
