package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieList {
    private ArrayList<Movie> List;

    public MovieList(ArrayList<Movie> List) {
        this.List = List;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name\tYear\tDirector\tRating\n");
        for (Movie movie :
                this.List) {
            if (!movie.GetChecked()) {
                stringBuilder.append(movie.toString());
            }
        }
        return stringBuilder.toString();
    }

    public Boolean CheckOut(String title){
        for (int i = 0 ; i < this.List.size() ; i++ ) {
            Movie movie = this.List.get(i);
            if (movie.GetName().equals(title)&&!movie.GetChecked()){
                movie.CheckOut();
                this.List.set(i, movie);
                return true;
            }
        }
        return false;
    }
}
