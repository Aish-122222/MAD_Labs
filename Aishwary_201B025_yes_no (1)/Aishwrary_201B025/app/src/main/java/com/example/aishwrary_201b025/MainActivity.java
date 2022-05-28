package com.example.aishwrary_201b025;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_ad)
                .setTitle("Be alert!")
                .setMessage("Follow Social Distancing")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Welcome to the era of Social Distancing",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Go Back Corona",Toast.LENGTH_SHORT).show();
                    }
                })
                .show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}