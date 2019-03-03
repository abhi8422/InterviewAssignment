package com.example.apptest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apptest.DataBase.DBHelper;
import com.example.apptest.adapter.RecyclerAdapter;
import com.example.apptest.model.MyPojo;
import com.example.apptest.model.Results;
import com.example.apptest.service.APICLient;

import javax.xml.transform.Result;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerAdapter adapter;
Results[] results;
DBHelper dbHelper;
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=getApplicationContext();

        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dbHelper=new DBHelper(context);

        Call<MyPojo> call= APICLient.getClient().getPojo();
        call.enqueue(new Callback<MyPojo>() {
            @Override
            public void onResponse(Call<MyPojo> call, Response<MyPojo> response) {
                MyPojo myPojo=response.body();
                results=myPojo.getResults();
                dbHelper.insertData(results,context);
                adapter=new RecyclerAdapter(results);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<MyPojo> call, Throwable t) {

            }
        });
    }
}
