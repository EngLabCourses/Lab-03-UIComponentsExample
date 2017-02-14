package it.eng.courses.android.lesson3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import it.eng.courses.android.lesson3.layouts.LayoutsActivity;
import it.eng.courses.android.lesson3.recyclerview.RecyclerViewActivity;
import it.eng.courses.android.lesson3.views.ViewsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    View layouts, views,recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layouts = findViewById(R.id.layouts);
        views = findViewById(R.id.viewshowcase);
        recyclerview = findViewById(R.id.recyclerviewexample);

        layouts.setOnClickListener(this);
        views.setOnClickListener(this);
        recyclerview.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.layouts:
                intent = new Intent(this, LayoutsActivity.class);
                startActivity(intent);
                break;
            case R.id.viewshowcase:
                intent = new Intent(this, ViewsActivity.class);
                startActivity(intent);
                break;
            case R.id.recyclerviewexample:
                intent = new Intent(this, RecyclerViewActivity.class);
                startActivity(intent);
                break;
        }
    }
}
