package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String movieName, String movieCategory) {
        name = movieName;
        category = movieCategory;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
}
