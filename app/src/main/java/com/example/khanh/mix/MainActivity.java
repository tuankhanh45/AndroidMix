package com.example.khanh.mix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText edtUserName,edtPassWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // set id xml
        btnLogin=(Button)findViewById(R.id.btn_login);
        edtPassWord=(EditText)findViewById(R.id.edtpassword);
        edtUserName=(EditText)findViewById(R.id.edtusername);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

}
