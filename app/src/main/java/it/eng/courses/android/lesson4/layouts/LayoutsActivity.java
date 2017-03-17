package it.eng.courses.android.lesson4.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import it.eng.courses.android.lesson4.R;

public class LayoutsActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private View frame,linear,relative;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar()!=null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        frame = findViewById(R.id.frame);
        linear = findViewById(R.id.linear);
        relative = findViewById(R.id.relative);

        frame.setOnClickListener(this);
        linear.setOnClickListener(this);
        relative.setOnClickListener(this);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.frame:
                i = new Intent(this,FrameActivity.class);
                startActivity(i);
                break;
            case R.id.linear:
                i = new Intent(this,LinearActivity.class);
                startActivity(i);
                break;
            case R.id.relative:
                i = new Intent(this,RelativeActivity.class);
                startActivity(i);
                break;

        }
    }
}
