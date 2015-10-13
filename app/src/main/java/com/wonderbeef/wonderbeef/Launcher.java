package com.wonderbeef.wonderbeef;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Launcher extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launcher, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        String toastMessage = "This button will launch ";
        Resources r = getResources();
        switch (v.getId()){

            case R.id.launch_bttnSpotifyStream:
                toastMessage+=r.getString(R.string.spotstreamer);
                break;

            case R.id.launch_bttnScores:
                toastMessage+=r.getString(R.string.ScoresApp);
                break;

            case R.id.launch_bttnLib:
                toastMessage+=r.getString(R.string.LibraryApp);
                break;

            case R.id.launch_bttnBuild:
                toastMessage+=r.getString(R.string.builditbigger) + " App";
                break;

            case R.id.launch_bttnXYZ:
                toastMessage+=r.getString(R.string.xyzreader);
                break;

            case R.id.launch_bttnCapstone:
                toastMessage+=r.getString(R.string.capstone);
                break;
        }

        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();

    }
}
