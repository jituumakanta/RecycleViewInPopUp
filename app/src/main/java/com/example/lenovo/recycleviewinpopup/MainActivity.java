package com.example.lenovo.recycleviewinpopup;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickButton = (Button) findViewById(R.id.clickButton);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.before_submit);
                dialog.setTitle("Title...");
               /* myNames= (ListView) dialog.findViewById(R.id.List);
                adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.answer_view,arrayList);
                myNames.setAdapter(adapter);
                dialog.show();*/









                RecyclerView     recyclerView = (RecyclerView) dialog.findViewById(R.id.recyclerView);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

                //initializing the productlist
                List<Product> productList = new ArrayList<>();


                //adding some items to our list
                productList.add(
                        new Product(
                                1,
                                "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                                "13.3 inch, Silver, 1.35 kg",
                                4.3,
                                60000,
                                R.drawable.ic_launcher_background));


                //creating recyclerview adapter
                ProductAdapter adapter = new ProductAdapter(getApplicationContext(), productList);

                //setting adapter to recyclerview
                recyclerView.setAdapter(adapter);















            }
        });
    }
}
