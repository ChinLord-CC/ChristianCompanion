package com.glorytog_d.app2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class OptionsPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_page);
    }


    public void Reminder(View view) {
        Intent i = new Intent(this, ReminderActivity.class);
        startActivity(i);

    }

    public void Notes(View view) {
        Intent i = new Intent(this, BibleNotes.class);
        startActivity(i);

    }

    public void Fast(View view) {
        Intent i = new Intent(this, FastPage.class);
        startActivity(i);

    }

    public void Journal(View view) {
        Intent i = new Intent(this, Journal.class);
        startActivity(i);

    }

    public void Settings(View view) {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);

    }

    public void About(View view) {
        Intent i = new Intent(this, About.class);
        startActivity(i);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_options_page, menu);
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
}
