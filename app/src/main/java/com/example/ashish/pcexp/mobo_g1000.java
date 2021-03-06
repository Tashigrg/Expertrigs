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

public class mobo_g1000 extends AppCompatActivity {

    Button button_save;
    RadioGroup rG;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobo_g1000);

        button_save = (Button) findViewById(R.id.Save_G1_imobo);
        rG = (RadioGroup) findViewById(R.id.mobo_RadioGrp);
        tv = (TextView) findViewById(R.id.moboNameG1000);

        button_save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int selected_mobo = rG.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = (RadioButton) findViewById(selected_mobo);

                String radioValue = selectedRadioButton.getText().toString();
                Intent intent = new Intent(mobo_g1000.this, Game_1000.class);
                intent.putExtra("Motherboard", radioValue);

//                startActivity(intent);
                setResult(2,intent);
                finish();

            }

        });

        Button mShowDialog = (Button) findViewById(R.id.imobo_1000g);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(mobo_g1000.this);
                View mView = getLayoutInflater().inflate(R.layout.mobog1dialog, null);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });
    }
}
