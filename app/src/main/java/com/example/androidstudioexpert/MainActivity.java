package com.example.androidstudioexpert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Roder Hu on 2015/12/1.
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private ImageView icon;
    private Button chooseButton;
    private GridView iconGridView;

    private List<Map<String, Object>> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        chooseButton = (Button) findViewById(R.id.main_chooseButton);
        iconGridView = (GridView) findViewById(R.id.chooseIcon_gridView);
        icon = (ImageView) findViewById(R.id.main_icon);
        iconGridView.setOnItemSelectedListener(this);

        generateData();
    }

    private void generateData() {
        dataList = new ArrayList<>(30);

        Map<String, Object> itemMap;
        for (int i = 0; i < 30; i++) {
            itemMap = new HashMap<>();
            itemMap.put("imageRes", R.mipmap.ic_launcher);
            dataList.add(itemMap);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, dataList, R.layout.icon_grid_item,
                new String[]{"imageRes"}, new int[]{R.id.iconGridItem_imageView});
        iconGridView.setAdapter(adapter);
    }

    public void onChooseClick(View view) {
        throw new RuntimeException("I want to crash!");
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int imageRes = (int)dataList.get(position).get("imageRes");
        icon.startAnimation(getAnimation(imageRes));
    }

    private Animation getAnimation(final int imageRes) {
        Animation anim = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                icon.setImageResource(imageRes);
                icon.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.fade_in));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        return anim;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
