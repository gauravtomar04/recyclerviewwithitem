package com.e.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );

        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString( "title" );

        if ( text.equals( "gaurav" ) ) {
            Toast.makeText( this,"ye hi hai",Toast.LENGTH_SHORT ).show();

        }

        else if ( text.equals( "tomar" ) ){

            Toast.makeText( this,"na ye nahi hai",Toast.LENGTH_SHORT ).show();

        }

        else {
            Toast.makeText( this,"sab bhai bhai hai", Toast.LENGTH_SHORT ).show();
        }
    }
}
