package databaseconnection;

public class Movie {

    private int movieId;
    private String  movieTitle;
    private int movieReleaseYear;
    private String movieGenre;
    private String movieRating;

    // create constructor


    public Movie() {
    }

    public Movie(int movieId) {
        this.movieId = movieId;
    }

    public Movie(int movieId, String movieTitle) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
    }

    public Movie(int movieId, String movieTitle, int movieReleaseYear) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieReleaseYear = movieReleaseYear;
    }

    public Movie(int movieId, String movieTitle, int movieReleaseYear, String movieGenre) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieReleaseYear = movieReleaseYear;
        this.movieGenre = movieGenre;
    }

    public Movie(int movieId, String movieTitle, int movieReleaseYear, String movieGenre, String movieRating) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieReleaseYear = movieReleaseYear;
        this.movieGenre = movieGenre;
        this.movieRating = movieRating;
    }

    // getter and setter methods

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public void setMovieReleaseYear(int movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    // create movieInformation method

    public void movieInformation(){
        System.out.println("this is movie information method");
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieTitle='" + movieTitle + '\'' +
                ", movieReleaseYear=" + movieReleaseYear +
                ", movieGenre='" + movieGenre + '\'' +
                ", movieRating='" + movieRating + '\'' +
                '}';
    }
}
