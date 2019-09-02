package com.e.recyclerview2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHolder> {

    Context applicationContext;
    ArrayList <MyModel> arrayList;
    public RecyclerAdapter(Context applicationContext, ArrayList <MyModel> arrayList) {
    this.applicationContext=applicationContext;
    this.arrayList=arrayList;
    }

    @Override
    public MyHolder onCreateViewHolder(@Nullable ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext() );
        View view =layoutInflater.inflate(R.layout.recylerviewrow_main,parent,false );
        MyHolder myHolder=new MyHolder( view );
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@Nullable final MyHolder holder, int position) {

        MyModel myModel = arrayList.get( position );
        holder.textView.setText(myModel.getMaintitle() );
        holder.imageView.setImageResource(myModel.getImages());
        holder.textView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText( applicationContext,"hey guru", Toast.LENGTH_LONG).show();
                Intent intent=new Intent( applicationContext, Main2Activity.class );
                intent.setFlags( Intent.FLAG_ACTIVITY_NEW_TASK );
                intent.putExtra( "title",holder.textView.getText().toString() );
                applicationContext.startActivity( intent );
            }
        } );
    }

     public class MyHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        ImageView imageView;
        public MyHolder(View itemView)
        {
            super( itemView );
            textView=(TextView) itemView.findViewById(R.id.textView  );
            imageView=(ImageView) itemView.findViewById(R.id.imageView);

        }
    }

    @Override
    public int getItemCount()

    {
        return arrayList.size();
    }
}
