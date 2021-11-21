package com.thoughtworksPrograd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Movie movie1= new Movie("Casino Royale", "Eon Productions","PG-13");
        Movie movie2= new Movie("Free Guy", "20th Century Studios","PG-13");

        Movie movie3= new Movie("Free Guy", "20th Century Studios");


        Movie[] movieArray={movie1,movie2,movie3};

        Movie[] pgMovies=Movie.getPg(movieArray);

        for(Movie pgMovie: pgMovies){
            if(pgMovie==null)
                break;
            pgMovie.printMovie();

        }


    }
}
