package com.amit.grochousevendor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);
        setToggleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid){

    }

    private void setSingleEvent(GridLayout mainGrid){
        //loop all the child item of Main Grid
        for(int i = 0; i < mainGrid.getChildCount();i++)
        {
            //You can see , all child item is CardView, So we get the cast object to CardView
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(finalI == 0) //open activity one
                    {
                        Intent intent = new Intent(MainActivity.this,Order.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1)
                    {
                        Intent intent = new Intent(MainActivity.this,Product.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2)
                    {
                        Intent intent = new Intent(MainActivity.this,Offers.class);
                        startActivity(intent);
                    }
                    else if (finalI == 3)
                    {
                        Intent intent = new Intent(MainActivity.this,Profile.class);
                        startActivity(intent);
                    }
                    else if (finalI == 4)
                    {
                        Intent intent = new Intent(MainActivity.this,Setting.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}


















