package com.iitdh.sonusourav.instigo.Council;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;

import com.iitdh.sonusourav.instigo.R;
import com.tmall.ultraviewpager.UltraViewPager;
import com.tmall.ultraviewpager.transformer.UltraDepthScaleTransformer;

import java.util.ArrayList;


public class CouncilCulturalSecy extends AppCompatActivity
        {

    private android.support.v7.app.ActionBar culturalActionBar;
    private PagerAdapter adapter;
    private UltraViewPager.Orientation gravity_indicator;
    private ArrayList<CouncilUserClass> culturalList;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
        culturalList =new ArrayList<>();
        CouncilUserClass danceSecy=new CouncilUserClass("Yash Doshi","Institute Dance Secretary",""," 160020001@iitdh.ac.in",R.drawable.ritik);
        CouncilUserClass filmSecy=new CouncilUserClass("Gautam Jagdhish","Institute Film and Media Secretary",""," 170010031@iitdh.ac.in",R.drawable.ritik);
        CouncilUserClass musicSecy=new CouncilUserClass("Saurav Nitin Dosi","Institute Music Secretary","","170030006@iitdh.ac.in",R.drawable.ritik);
        CouncilUserClass artSecy=new CouncilUserClass("Deeksha N","Institute Fine Arts Secretary","","160010033@iitdh.ac.in",R.drawable.ritik);
        culturalList.add(danceSecy);
        culturalList.add(filmSecy);
        culturalList.add(musicSecy);
        culturalList.add(artSecy);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
        adapter = new UltraPagerAdapter(true,this, culturalList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
        gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        culturalActionBar = getSupportActionBar();
        assert culturalActionBar != null;
        culturalActionBar.setHomeButtonEnabled(true);
        culturalActionBar.setDisplayHomeAsUpEnabled(true);
        culturalActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        culturalActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Complaint</font>"));
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return true;

    }


}
