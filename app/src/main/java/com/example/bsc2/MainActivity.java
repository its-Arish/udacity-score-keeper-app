package com.example.bsc2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int TeamApoints=0;
    int TeamBpoints=0;
    int TeamAfouls = 0;
    int TeamBfouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sixpointA(View view) {

        TeamApoints=TeamApoints+6;
        display(TeamApoints);
    }

    private void display(int teamApoints) {
        TextView TeamApoints = findViewById(R.id.txt2);
        TeamApoints.setText(""+teamApoints);
    }

    public void fourpointA(View view) {
        TeamApoints=TeamApoints+4;
        display(TeamApoints);
    }

    public void penaltyA(View view) {
        TeamAfouls++;
        displayAf(TeamAfouls);
    }

    private void displayAf(int teamAfouls) {
        TextView TeamAfouls = findViewById(R.id.txt6);
        TeamAfouls.setText("/"+teamAfouls);
    }


    public void reset(View view) {
        TeamApoints=0;
        TeamBpoints=0;
        TeamBfouls = 0;
        TeamAfouls = 0;
        displayAf(TeamAfouls);
        displayBf(TeamBfouls);
        display(TeamApoints);
        displayB(TeamBpoints);
    }

    public void fourpointB(View view) {
        TeamBpoints= TeamBpoints+4;
        displayB(TeamBpoints);
    }

    private void displayB(int teamBpoints) {
    TextView TeamBpoints = findViewById(R.id.txt4);
    TeamBpoints.setText(""+teamBpoints);
    }


    public void sixpointB(View view) {
        TeamBpoints=TeamBpoints+6;
        displayB(TeamBpoints);
    }

    public void penaltyB(View view) {
        TeamBfouls++;
        displayBf(TeamBfouls);

    }

    private void displayBf(int teamBfouls) {
        TextView TeamBfouls = findViewById(R.id.txt8);
        TeamBfouls.setText("/"+teamBfouls);
    }
}
