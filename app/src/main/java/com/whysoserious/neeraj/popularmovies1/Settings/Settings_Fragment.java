package com.whysoserious.neeraj.popularmovies1.Settings;


import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.whysoserious.neeraj.popularmovies1.R;


/**
 * Created by Neeraj on 29-Mar-16.
 */
public class Settings_Fragment extends PreferenceFragment {

    public Settings_Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
