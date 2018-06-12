package com.example.yessinekebir.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button threePt_button;
    private Button twoPt_button;
    private Button freeThrow_button;

    private Button threePt_buttonB;
    private Button twoPt_buttonB;
    private Button freeThrow_buttonB;


    private Button reset_button;


    private TextView counterA;
    private TextView counterB;

    private int pointsA = 0;
    private int pointsB = 0;

    private static final String POINTSA = "pointsA";
    private static final String POINTSB = "pointsB";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            this.pointsA = savedInstanceState.getInt(POINTSA, 0);
            this.pointsB = savedInstanceState.getInt(POINTSB, 0);


        }

        // TEAM A btn
        threePt_button   = findViewById(R.id.threePt_button);
        twoPt_button   = findViewById(R.id.twoPt_button);
        freeThrow_button   = findViewById(R.id.freeThrow_button);

        // TEAM B btn
        threePt_buttonB   = findViewById(R.id.threePt_buttonB);
        twoPt_buttonB   = findViewById(R.id.twoPt_buttonB);
        freeThrow_buttonB   = findViewById(R.id.freeThrow_buttonB);

        // RESET btn
        reset_button   = findViewById(R.id.reset_button);

        //Counter binding

        counterA = findViewById(R.id.counterA);
        counterB = findViewById(R.id.counterB);


        //TEAM A btn
        threePt_button.setOnClickListener(this);
        twoPt_button.setOnClickListener(this);
        freeThrow_button.setOnClickListener(this);

        //TEAM B btn
        threePt_buttonB.setOnClickListener(this);
        twoPt_buttonB.setOnClickListener(this);
        freeThrow_buttonB.setOnClickListener(this);
        // RESET btn
        reset_button.setOnClickListener(this);

        this.counterA.setText(String.valueOf(this.pointsA));
        this.counterB.setText(String.valueOf(this.pointsB));


    }

    // LANDSCAPE SAVE

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(POINTSA, this.pointsA);
        savedInstanceState.putInt(POINTSB, this.pointsB);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            // TEAM A
            case R.id.threePt_button:
                this.pointsA += 3 ;
                this.counterA.setText(String.valueOf(pointsA));
                break;

            case R.id.twoPt_button:
                this.pointsA += 2 ;
                this.counterA.setText(String.valueOf(pointsA));
                break;
            case R.id.freeThrow_button:
                this.pointsA += 1 ;
                this.counterA.setText(String.valueOf(pointsA));
                break;

                //TEAM B
            case R.id.threePt_buttonB:
                this.pointsB += 3 ;
                this.counterB.setText(String.valueOf(pointsB));
                break;

            case R.id.twoPt_buttonB:
                this.pointsB += 2 ;
                this.counterB.setText(String.valueOf(pointsB));
                break;

            case R.id.freeThrow_buttonB:
                this.pointsB += 1 ;
                this.counterB.setText(String.valueOf(pointsB));
                break;

            case R.id.reset_button:
                this.pointsA = 0 ;
                this.counterA.setText(String.valueOf(pointsA));
                this.pointsB = 0 ;
                this.counterB.setText(String.valueOf(pointsB));
                break;



        }
    }


}
