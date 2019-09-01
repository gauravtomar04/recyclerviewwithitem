package com.e.recyclerview2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        recyclerView = (RecyclerView) findViewById( R.id.recycler );
        ArrayList<MyModel> arrayList = new ArrayList<MyModel>();
        MyModel myModel=new MyModel( "gaurav" );
        MyModel myModel2=new MyModel( "tomar" );
        MyModel myModel3=new MyModel( "golu" );
        MyModel myModel4=new MyModel( "raman" );
        MyModel myModel5=new MyModel( "pawan" );
        MyModel myModel6=new MyModel( "banti" );

        arrayList.add( myModel );
        arrayList.add( myModel2 );
        arrayList.add( myModel3 );
        arrayList.add( myModel4 );
        arrayList.add( myModel5 );
        arrayList.add( myModel6 );

        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(getApplicationContext(),arrayList);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerAdapter);
      //  recyclerView.setHasFixedSize( true );
      //  recyclerView.addItemDecoration( new DividerItemDecoration( getApplicationContext(), LinearLayoutManager.VERTICAL ) );
    }
}
