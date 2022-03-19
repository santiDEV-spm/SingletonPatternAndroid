package com.santidev.singletonpatternandroid;

import java.util.ArrayList;

public class RentalStore {

    //instanciar un  objeto de mi mismo
    //sera el unico objeto instanciado de la clase RentalStore
    private static RentalStore sharedInstance  = new RentalStore();

    //Gestor de mis peliculas
    private ArrayList<Movie> movies;

    //Cualquiera que quiera usar el singleton, necesitara
    //llamar al metodo getInstance

    public static RentalStore getInstance(){
        return RentalStore.getInstance();
    }

    //para que nadie pueda crear ninguna otra Rental Store
    //hago su unico constructor sea privado
    private RentalStore(){
        this.movies = new ArrayList<Movie>();
    }

    public ArrayList<Movie> getMovies(){
        return this.movies;
    }

    public Movie getMovieAt(int index){
        return this.movies.get(index);
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }

    public void removeMovie(Movie movie){
        this.movies.remove(movie);
    }

}
