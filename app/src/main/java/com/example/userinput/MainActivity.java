package com.example.userinput;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    String userinput;
    String newmessage = "";
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txt = findViewById(R.id.txt);
        Button btn = findViewById(R.id.btn);
        TextView outputtxt = findViewById(R.id.outputtxt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userinput = txt.getText().toString();
                for(int i = 0;i<userinput.length();i++){
                    if(Character.isLetter(userinput.charAt(i))==false){
                        newmessage = newmessage + userinput.substring(i,i+1);
                    }
                    else if(count%2==0){

                            newmessage = newmessage + userinput.substring(i,i+1).toUpperCase();
                            count++;


                    }
                    else{
                        newmessage = newmessage + userinput.substring(i,i+1).toLowerCase();
                        count++;
                    }



                }
                outputtxt.setText(newmessage);


            }
        });
    }
}