package com.thoughtworksPrograd;

import java.util.Objects;

 class Movie {
    private final String  title;
    private final String studio;
    private final String rating;


     public Movie(String title, String studio){
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }

    public Movie(String title,String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }

    public static  Movie[] getPg(Movie[] movieArray){

        Movie[] pgMovies=new Movie[10];
        int count=0;

        for(Movie movie:movieArray){

            if(Objects.equals(movie.rating, "PG"))
                pgMovies[count++] = movie;

        }
        return pgMovies;
    }


    public void printMovie(){
        System.out.println("title: "+ title+" studio: "+ studio+" rating: "+rating);
    }

}
