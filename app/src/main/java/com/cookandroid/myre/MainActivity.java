package com.cookandroid.myre;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button codecheck;
    Button codeget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usercode);
        codecheck = findViewById(R.id.codecheck);
        codeget = findViewById(R.id.codeget);
        codecheck.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            userDBHelper userDBHelper;
                            userDBHelper = new userDBHelper(getApplicationContext());
                            String code = findViewById(R.id.codecheck).toString();
                            if (code=="AAAAAAAAAA") {
                                Toast myToast = Toast.makeText(getApplicationContext(), "유저 코드 입력 성공", Toast.LENGTH_LONG);
                                myToast.show();
                                Intent intent = new Intent(getApplicationContext(), userMain.class);
                                startActivity(intent);
                            } else {
                                Toast myToast = Toast.makeText(getApplicationContext(), "유저 코드 입력 실패", Toast.LENGTH_LONG);
                                myToast.show();
                            }
                }
            });
        codeget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Code code = new Code();
                char[] ucode = new char[10];
                ucode = code.RandomUserCode();
                userDBHelper userDBHelper;
                userDBHelper = new userDBHelper(getApplicationContext());
                String scode = new String(ucode);
                userDBHelper.insertUser(scode);
                Toast toast = Toast.makeText(getApplicationContext(),"my code : "+scode,Toast.LENGTH_LONG);
                toast.show();*/
               Intent intent = new Intent(getApplicationContext(),userMain.class);
               startActivity(intent);
            }
        });
    }
}
