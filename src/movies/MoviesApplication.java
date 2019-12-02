package movies;
import util.Input;
import java.util.Arrays;
import java.util.Scanner;
public class MoviesApplication {
    static Input in = new Input();
    public static Movie[] addMovie(Movie[] newMovies, Movie newMovie) {
        newMovies = Arrays.copyOf(newMovies, newMovies.length + 1);
        newMovies[newMovies.length-1] = newMovie;
        return newMovies;
    }

    public static void movie() {
        Movie[] newMovies = MoviesArray.findAll();
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        System.out.println("6 - add movie");
        int userInput = in.getInt(0, 6);
        while (true) {
            if (userInput == 0) {
                System.exit(0);
            } else if (userInput == 1) {
                for (Movie movie : newMovies) {
                    System.out.println(movie.getName());
                }
            } else if (userInput == 2) {
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("animated"))
                        System.out.println(movie.getName());
                }
            } else if (userInput == 3) {
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("drama"))
                        System.out.println(movie.getName());
                }
            } else if (userInput == 4) {
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("horror"))
                        System.out.println(movie.getName());
                }
            } else if (userInput == 5) {
                for (Movie movie : newMovies) {
                    if (movie.getCategory().equals("scifi"))
                        System.out.println(movie.getName());
                }
            } else if (userInput == 6){
                Scanner sc = new Scanner(System.in);
                String input1 = sc.nextLine();
                String input2 = sc.nextLine();
                Movie newMovie = new Movie(input1, input2);
                newMovies = addMovie(newMovies, newMovie);
            }
            movie();
        }
    }

    public static void main(String[] args) {
        movie();
    }
}