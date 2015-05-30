package com.cluttereddesk.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class AppLauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_launcher);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_launcher, menu);
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

    public void launchSpotifyStreamer(View view) {
        Toast toast = Toast.makeText(this, "This will launch the spotify streamer app", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void launchScoresApp(View view) {
        Toast toast = Toast.makeText(this, "This will launch the scores app", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void launchLibraryApp(View view) {
        Toast toast = Toast.makeText(this, "This will launch the library app", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void launchBuildItBigger(View view) {
        Toast toast = Toast.makeText(this, "This will launch the build it bigger app", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void launchXyzReader(View view) {
        Toast toast = Toast.makeText(this, "This will launch the xyz app", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void launchBeachTrip(View view) {
        Toast toast = Toast.makeText(this, "This will launch the beachtrip app", Toast.LENGTH_SHORT);
        toast.show();
    }

}
