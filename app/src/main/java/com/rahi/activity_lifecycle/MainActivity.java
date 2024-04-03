package com.rahi.activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Oncreate", Toast.LENGTH_LONG).show();
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Activity2.class);
            startActivity(intent);
        });
    }
// when the app starts
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ONSTART", "onStart:");
        Toast.makeText(this, "Start Method", Toast.LENGTH_SHORT).show();
        btn.setVisibility(View.VISIBLE);
    }
// when app resumes from background
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Resume Method", Toast.LENGTH_SHORT).show();
    }
// when app goes into background
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Pause Method", Toast.LENGTH_SHORT).show();
    }
// when the app stops working for some reasons
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Stop Method", Toast.LENGTH_SHORT).show();
    }
// when the app is killed after using or from background to free up ROM
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy Method", Toast.LENGTH_SHORT).show();
    }
}
