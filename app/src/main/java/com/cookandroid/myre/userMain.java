package com.cookandroid.myre;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class userMain extends AppCompatActivity {
    Button myteamlist;
    Button addTeam;
    Button createTeam;
    Button mycode;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usermain);
        myteamlist = findViewById(R.id.myteamlist);
        addTeam=findViewById(R.id.addteam);
        createTeam = findViewById(R.id.createteam);
        myteamlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MyTeamList.class);
                startActivity(intent);
            }
        });
        addTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddTeam.class);
                startActivity(intent);
            }
        });
        createTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CreateTeam.class);
                startActivity(intent);
            }
        });
        mycode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),myCodeView.class);
                startActivity(intent);
            }
        });
    }
}
