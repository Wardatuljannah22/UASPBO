package com.example.uaspbo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UtamaActivity extends AppCompatActivity {
    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);
        play = (Button) findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent play = new Intent(UtamaActivity.this, MainActivity.class);
                startActivity(play);
                showDialog();
            }
        });
    }
    public void showDialog(){
        Toast.makeText(UtamaActivity.this, "Player 1 vs Player 2", Toast.LENGTH_SHORT).show();
    }
}

