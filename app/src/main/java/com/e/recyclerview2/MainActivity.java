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
        MyModel myModel=new MyModel( "gaurav",R.drawable.ic_launcher_background);
        MyModel myModel2=new MyModel( "tomar",R.drawable.ic_launcher_background );
        MyModel myModel3=new MyModel( "golu",R.drawable.ic_launcher_background );
        MyModel myModel4=new MyModel( "raman" ,R.drawable.ic_launcher_background);
        MyModel myModel5=new MyModel( "pawan",R.drawable.ic_launcher_background );
        MyModel myModel6=new MyModel( "banti",R.drawable.ic_launcher_background );

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
