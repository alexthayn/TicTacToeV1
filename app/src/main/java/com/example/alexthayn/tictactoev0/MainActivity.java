package com.example.alexthayn.tictactoev0;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {
    private Button[][] buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buildGuiByCode();
    }

    public void buildGuiByCode(){
        //Get width of the screen
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int w = size.x / TicTacToe.SIDE;

        //Create the layout manager as a GridLayout
        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setColumnCount(TicTacToe.SIDE);
        gridLayout.setRowCount(TicTacToe.SIDE);


        //Create the buttons and add them to gridLayout
        buttons = new Button[TicTacToe.SIDE][TicTacToe.SIDE];


        for(int row = 0; row<TicTacToe.SIDE; row++){
            for(int col = 0; col < TicTacToe.SIDE; col++){
                buttons[row][col] = new Button(this);
                buttons[row][col].setTextSize((int)(w*.2));

                gridLayout.addView( buttons[row][col], w, w);
            }
        }

        //set gridLayout as the View of the activity
        setContentView(gridLayout);
    }
}
