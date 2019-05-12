package com.aandrosov.lamp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private TextView mTextMode;
    private Button changeModeButton;

    private List<Integer> modes = new ArrayList<>();
    private int position = 0;

    private void initializeModes(){
        modes.add(R.string.first);
        modes.add(R.string.second);
        modes.add(R.string.third);
        modes.add(R.string.fourth);
        modes.add(R.string.fifth);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initializeModes();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//        changeModeButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        mTextMode = findViewById(R.id.textMode);
    }


    public void pressButton(View view) {
        mTextMode.setText(modes.get(position));
        position++;
        if(position >= 5){
            position = 0;
        }
    }
}
