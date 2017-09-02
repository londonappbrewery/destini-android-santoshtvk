package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mstoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    int mStoryIndex = 1;

    final int[] storiesArray = {R.string.T1_Story, R.string.T2_Story,
            R.string.T3_Story, R.string.T4_End, R.string.T5_End, R.string.T6_End};
    final int[] topButtontext = {R.string.T1_Ans1, R.string.T2_Ans1, R.string.T3_Ans1};
    final int[] bottomButtontext = {R.string.T1_Ans2, R.string.T2_Ans2, R.string.T3_Ans2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mstoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    updateScreen(3);
                } else if (mStoryIndex == 2) {
                    updateScreen(3);
                } else if (mStoryIndex == 3) {
                    updateScreen(6);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    updateScreen(2);
                } else if (mStoryIndex == 2) {
                    updateScreen(4);
                } else if (mStoryIndex == 3) {
                    updateScreen(5);
                }
            }
        });

    }

    public void updateScreen(int index) {
        mStoryIndex = index;
        mstoryTextView.setText(storiesArray[index-1]);
        if (index <= topButtontext.length) {
            mButtonTop.setText(topButtontext[index-1]);
            mButtonBottom.setText(bottomButtontext[index-1]);
        }
        else{
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }
    }
}
