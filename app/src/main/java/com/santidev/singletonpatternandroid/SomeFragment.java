package com.santidev.singletonpatternandroid;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;

public class SomeFragment extends Fragment {

    private ActivityComs activityComs;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        activityComs = (ActivityComs) activity;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activityComs = (ActivityComs) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        activityComs = null;
    }

    public void someBullyFunction(){
        Movie movie = new Movie();
        movie.setTitle("Spyderman");
        movie.setOnRental(true);
        activityComs.onListItemSelected(movie);
    }
}
