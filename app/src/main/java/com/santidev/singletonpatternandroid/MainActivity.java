package com.santidev.singletonpatternandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ActivityComs {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RentalStore rentalStore = RentalStore.getInstance();
        ArrayList<Movie> myMovies = rentalStore.getMovies();


    }

    @Override
    public void onListItemSelected(Movie movie) {
        Toast.makeText(this, movie.getTitle(), Toast.LENGTH_SHORT).show();

    }
}