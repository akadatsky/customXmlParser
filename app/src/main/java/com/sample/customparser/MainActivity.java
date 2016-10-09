package com.sample.customparser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.sample.customparser.vast.model.Vast;
import com.sample.customparser.xml.XmlParser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGoClick(View view) {
        Vast vast = null;
        try {
            vast = XmlParser.parse(DataSource.getVast(), Vast.class);
        } catch (Exception e) {
            Toast.makeText(this, "Parsing failed", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, "Version: " + vast.getVersion(), Toast.LENGTH_SHORT).show();
    }
}
