package com.kuliah.fahrulyurisnan.contohrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import com.kuliah.fahrulyurisnan.contohrecyclerview.adapter.MyAdapter;
import com.kuliah.fahrulyurisnan.contohrecyclerview.adapter.MyDataAdapter;
import com.kuliah.fahrulyurisnan.contohrecyclerview.models.MyData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
//    private String[] mData;
    private List<MyData> myData = new ArrayList<>();
    private MyData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.list);
        mLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        data = new MyData("Database", "Man With A Mission", "2014", R.drawable.mwam3);
        myData.add(data);

        data = new MyData("Emotions", "Man With A Mission", "2015", R.drawable.mwam);
        myData.add(data);

        data = new MyData("White World", "Man With A Mission", "2011", R.drawable.logomwam);
        myData.add(data);

        data = new MyData("Don't Lose Yourself", "Man With A Mission", "2011", R.drawable.mwam1);
        myData.add(data);

        data = new MyData("Insane Dream", "Aimer", "2016",
                R.drawable.insane_dream1);
        myData.add(data);

        data = new MyData("Us", "Aimer", "2016", R.drawable.insane_dream1);
        myData.add(data);

        data = new MyData("Tone", "Aimer", "2016", R.drawable.insane_dream_2);
        myData.add(data);

        data = new MyData("Butterfly Knot", "Aimer", "2016",
                R.drawable.chouchou1);
        myData.add(data);

        data = new MyData("Think of You in Summer Grass", "Aimer", "2016",
                R.drawable.chouchou2);
        myData.add(data);

        data = new MyData("September", "Aimer", "2016", R.drawable.chouchou1);
        myData.add(data);

        data = new MyData("Kagoesou na Kisetsu Kara", "Aimer", "2017", R.drawable.spica1);
        myData.add(data);

        data = new MyData("Re:Pray", "Aimer", "2017", R.drawable.spica2);
        myData.add(data);

        data = new MyData("broKen NIGHT", "Aimer", "2017", R.drawable.hoshikuzu_venus_1);
        myData.add(data);

        data = new MyData("Everlasting Snow", "Aimer", "2017", R.drawable.hoshikuzu_venus_1);
        myData.add(data);

        data = new MyData("March of Time", "Aimer", "2017", R.drawable.spica2);
        myData.add(data);

        data = new MyData("Sixth Star Night", "Aimer", "2017", R.drawable.spica2);
        myData.add(data);

        data = new MyData("stardust venus", "Aimer", "2012", R.drawable.hoshikuzu_venus_1);
        myData.add(data);

        data = new MyData("Polaris", "Aimer", "2014", R.drawable.spica2);
        myData.add(data);

        data = new MyData("Kataomoi", "Aimer", "2016", R.drawable.spica2);
        myData.add(data);

        mAdapter = new MyDataAdapter(myData);

        mRecyclerView.setAdapter(mAdapter);

    }
}
