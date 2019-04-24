package com.example.quiztestdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnOk;
    private EditText edtFirst;
    private RadioGroup rgTwo;
    private RadioGroup rgThree;
    private RadioGroup rgFour;
    private RadioGroup rgFive;
    private RadioGroup rgSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {

        btnOk = findViewById(R.id.btn_ok);
        edtFirst = findViewById(R.id.edt_first);
        rgTwo = findViewById(R.id.rg_two);
        rgThree = findViewById(R.id.rg_three);
        rgFour = findViewById(R.id.rg_four);
        rgFive = findViewById(R.id.rg_five);
        rgSix = findViewById(R.id.rg_six);

        btnOk.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int  m ;
        m = checkQuest();
        if(m==6)
        Toast.makeText(this, "Success " +m+"/6", Toast.LENGTH_SHORT).show();
        else {
            Toast.makeText(this, "Fail " +m+"/6", Toast.LENGTH_SHORT).show();
        }
//        rgOne.getCheckedRadioButtonId();
    }

    private int checkQuest() {
        int i = 0;

        if(!edtFirst.getText().toString().isEmpty())i++;
        if(rgTwo.getCheckedRadioButtonId()!=-1)i++;
        if(rgThree.getCheckedRadioButtonId()!=-1)i++;
        if(rgFour.getCheckedRadioButtonId()!=-1)i++;
        if(rgFive.getCheckedRadioButtonId()!=-1)i++;
        if(rgSix.getCheckedRadioButtonId()!=-1)i++;

        return i;
    }
}
