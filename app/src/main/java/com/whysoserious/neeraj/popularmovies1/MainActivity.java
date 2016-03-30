package com.whysoserious.neeraj.popularmovies1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.whysoserious.neeraj.popularmovies1.tmdb_api.MovieModel;
import com.whysoserious.neeraj.popularmovies1.Details.Details_Activity;
import com.whysoserious.neeraj.popularmovies1.Settings.Settings_Activity;

import butterknife.ButterKnife;

import com.whysoserious.neeraj.popularmovies1.Grid_View.Grid_Fragment;

/**
 * Created by Neeraj on 29-Mar-16.
 */
public class MainActivity extends AppCompatActivity implements Grid_Fragment.Callback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Grid_Fragment fragment = (Grid_Fragment) getFragmentManager().findFragmentById(R.id.movie_list);
        fragment.setCallback(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, Settings_Activity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void movieSelected(MovieModel movie) {
        Intent intent = new Intent(this, Details_Activity.class);
        intent.putExtra("movie", movie);
        startActivity(intent);
    }
}
