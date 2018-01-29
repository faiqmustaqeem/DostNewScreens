package com.example.faiq.dostnewscreens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SelectCategory extends AppCompatActivity {


    @BindView(R.id.recycleview1)
    RecyclerView recyclerView1;
    @BindView(R.id.recycleview2)
    RecyclerView recyclerView2;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    SelectCategoryAdapter adapter1;
    FeatureAddAdapter adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_category);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        // Remove default title text
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        adapter1 = new SelectCategoryAdapter(getSelection() , getApplicationContext());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView1.setLayoutManager(mLayoutManager);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        recyclerView1.setAdapter(adapter1);

        adapter2 = new FeatureAddAdapter(getFeatureAdds() , getApplicationContext());
        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(getApplicationContext());
        recyclerView2.setLayoutManager(mLayoutManager);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView2.setAdapter(adapter2);


    }
   List<String> getSelection()
   {
       List<String> list=new ArrayList<>();
       list.add("All in property for sale");
       list.add("Appartments ans flats");
       list.add("Houses");
       list.add("Lands and plots");
       list.add("Portions an d floors");
       list.add("shops - offices - commercial space");
       return list;
   }
    List<FeatureAddModel> getFeatureAdds()
    {
        List<FeatureAddModel> list=new ArrayList<>();
        list.add(new FeatureAddModel("demo" , "120" , ""));
        list.add(new FeatureAddModel("demo" , "120" , ""));

        list.add(new FeatureAddModel("demo" , "120" , ""));

        list.add(new FeatureAddModel("demo" , "120" , ""));

        list.add(new FeatureAddModel("demo" , "120" , ""));
    return list;
    }
}
