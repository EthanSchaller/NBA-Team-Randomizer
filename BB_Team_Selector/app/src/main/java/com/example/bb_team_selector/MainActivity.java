package com.example.bb_team_selector;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Context pgContent;
    private ConstraintLayout pgLayout;
    ImageView imgEra, imgTeam, imgPlyr;
    Button bttnRoll;
    Switch swtchEra, swtchTeam, swtchPlyr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //setting variables to take the data of the activity for future use
        pgContent = getApplicationContext();
        pgLayout = (ConstraintLayout) findViewById(R.id.mainScreen);

        //making it so that you can dismiss the keyboard by clicking the background on the phone
        pgLayout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
            }
        });

        imgEra = findViewById(R.id.imgEra);
        imgTeam = findViewById(R.id.imgTeam);
        imgPlyr = findViewById(R.id.imgPlyr);
        bttnRoll = findViewById(R.id.bttnReroll);
        swtchEra = findViewById(R.id.swtchEraShiny);
        swtchTeam = findViewById(R.id.swtchTeamShiny);
        swtchPlyr = findViewById(R.id.swtchPlyrShiny);

        bttnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(swtchEra.isChecked()) {
                    rollEra(2);
                } else {
                    rollEra(1);
                }

                if(swtchTeam.isChecked()) {
                    rollTeam(2);
                } else {
                    rollTeam(1);
                }

                if(swtchPlyr.isChecked()) {
                    rollPlyr(2);
                } else {
                    rollPlyr(1);
                }
            }
        });
    }

    public int rollEra(int i) {
        int Shiny = new Random().nextInt((50 - 1) + 1) + 1;
        int eraSlct = new Random().nextInt((3 - 1) + 1) + 1;

        if(i == 2) {
            if(Shiny == 50) {
                imgEra.setBackgroundResource(R.drawable.shnyera);
                return 0;
            }
            picChngEra(eraSlct);
        } else {
            picChngEra(eraSlct);
        }

        return 0;
    }
    public int rollTeam(int i) {
        int Shiny = new Random().nextInt((75 - 1) + 1) + 1;
        int teamSlct = new Random().nextInt((30 - 1) + 1) + 1;

        if(i == 2) {
            if(Shiny == 75) {
                imgTeam.setBackgroundResource(R.drawable.shnylogo);
                return 0;
            }
            picChngTeam(teamSlct);
        } else {
            picChngTeam(teamSlct);
        }

        return 0;
    }
    public int rollPlyr(int i) {
        int Shiny = new Random().nextInt((100 - 1) + 1) + 1;
        int plyrSlct = new Random().nextInt((15 - 1) + 1) + 1;

        if (i == 2) {
            if (Shiny == 100) {
                imgPlyr.setImageResource(R.drawable.shnyplyr);
                return 0;
            }
            picChngPlyr(plyrSlct);
        } else {
            picChngPlyr(plyrSlct);
        }

        return 0;
    }

    public void picChngEra(int i) {
        switch(i) {
            case 1: imgEra.setBackgroundResource(R.drawable.current_logo);
                break;
            case 2: imgEra.setBackgroundResource(R.drawable.historic_logo);
                break;
            case 3: imgEra.setBackgroundResource(R.drawable.alltime_logo);
                break;

            default: imgEra.setBackgroundResource(R.drawable.defera);
        }
    }
    public void picChngTeam(int i) {
        switch(i) {
            case 1: imgTeam.setBackgroundResource(R.drawable.bkn);
                break;
            case 2: imgTeam.setBackgroundResource(R.drawable.bos);
                break;
            case 3: imgTeam.setBackgroundResource(R.drawable.cha);
                break;
            case 4: imgTeam.setBackgroundResource(R.drawable.chi);
                break;
            case 5: imgTeam.setBackgroundResource(R.drawable.cle);
                break;
            case 6: imgTeam.setBackgroundResource(R.drawable.dal);
                break;
            case 7: imgTeam.setBackgroundResource(R.drawable.den);
                break;
            case 8: imgTeam.setBackgroundResource(R.drawable.det);
                break;
            case 9: imgTeam.setBackgroundResource(R.drawable.gsw);
                break;
            case 10: imgTeam.setBackgroundResource(R.drawable.hou);
                break;
            case 11: imgTeam.setBackgroundResource(R.drawable.ind);
                break;
            case 12: imgTeam.setBackgroundResource(R.drawable.lac);
                break;
            case 13: imgTeam.setBackgroundResource(R.drawable.lal);
                break;
            case 14: imgTeam.setBackgroundResource(R.drawable.mem);
                break;
            case 15: imgTeam.setBackgroundResource(R.drawable.mia);
                break;
            case 16: imgTeam.setBackgroundResource(R.drawable.mil);
                break;
            case 17: imgTeam.setBackgroundResource(R.drawable.min);
                break;
            case 18: imgTeam.setBackgroundResource(R.drawable.nop);
                break;
            case 19: imgTeam.setBackgroundResource(R.drawable.nyk);
                break;
            case 20: imgTeam.setBackgroundResource(R.drawable.okc);
                break;
            case 21: imgTeam.setBackgroundResource(R.drawable.orl);
                break;
            case 22: imgTeam.setBackgroundResource(R.drawable.phi);
                break;
            case 23: imgTeam.setBackgroundResource(R.drawable.phx);
                break;
            case 24: imgTeam.setBackgroundResource(R.drawable.por);
                break;
            case 25: imgTeam.setBackgroundResource(R.drawable.sac);
                break;
            case 26: imgTeam.setBackgroundResource(R.drawable.sac);
                break;
            case 27: imgTeam.setBackgroundResource(R.drawable.sas);
                break;
            case 28: imgTeam.setBackgroundResource(R.drawable.tor);
                break;
            case 29: imgTeam.setBackgroundResource(R.drawable.uta);
                break;
            case 30: imgTeam.setBackgroundResource(R.drawable.was);
                break;

            default: imgTeam.setBackgroundResource(R.drawable.deflogo);
        }
    }
    public void picChngPlyr(int i) {
        switch(i) {
            case 1: imgPlyr.setImageResource(R.drawable.one);
                break;
            case 2: imgPlyr.setImageResource(R.drawable.two);
                break;
            case 3: imgPlyr.setImageResource(R.drawable.three);
                break;
            case 4: imgPlyr.setImageResource(R.drawable.four);
                break;
            case 5: imgPlyr.setImageResource(R.drawable.five);
                break;
            case 6: imgPlyr.setImageResource(R.drawable.six);
                break;
            case 7: imgPlyr.setImageResource(R.drawable.seven);
                break;
            case 8: imgPlyr.setImageResource(R.drawable.eight);
                break;
            case 9: imgPlyr.setImageResource(R.drawable.nine);
                break;
            case 10: imgPlyr.setImageResource(R.drawable.ten);
                break;
            case 11: imgPlyr.setImageResource(R.drawable.eleven);
                break;
            case 12: imgPlyr.setImageResource(R.drawable.twelve);
                break;
            case 13: imgPlyr.setImageResource(R.drawable.thirteen);
                break;
            case 14: imgPlyr.setImageResource(R.drawable.fourteen);
                break;
            case 15: imgPlyr.setImageResource(R.drawable.fifteen);
                break;

            default: imgPlyr.setImageResource(R.drawable.defplyr);
        }
    }
}