package com.acadgild.android_as_fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Pri on 8/19/2017.
 */
  // Created a fragment SimpleAdition
public class SimpleAdition extends Fragment {
    //Making references
    EditText edt;
    TextView txt;
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.simple_addition, container, false);
        //Using findViewById method to link with java class
        edt = (EditText) view.findViewById(R.id.editText);
        txt = (TextView) view.findViewById(R.id.textView);
        btn = (Button) view.findViewById(R.id.button);
        //Setting Onclicklistener on button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Storing the entered text in input
                String input = edt.getText().toString();
                Toast.makeText(getActivity(),"Input is called",Toast.LENGTH_LONG).show();
                //changing the text of textview with the input on button click
                txt.setText(input);
            }
        });
        return view;
    }
}