package com.example.ashish.pcexp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class psu_r1000 extends AppCompatActivity {

    Button button_save;
    RadioGroup rG;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psu_r1000);

        button_save = (Button) findViewById(R.id.Save_R1_psu);
        rG = (RadioGroup) findViewById(R.id.psu_RadioGrp);
        tv = (TextView) findViewById(R.id.psuNameR1000);

        button_save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int selected_psu= rG.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = (RadioButton) findViewById(selected_psu);

                String radioValue = selectedRadioButton.getText().toString();
                Intent intent = new Intent(psu_r1000.this, Rend_1000.class);
                intent.putExtra("PSU", radioValue);

//                startActivity(intent);
                setResult(7,intent);
                finish();


            }

        });

        Button mShowDialog = (Button) findViewById(R.id.psu_1000r);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(psu_r1000.this);
                View mView = getLayoutInflater().inflate(R.layout.psudialog, null);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });


    }
}
