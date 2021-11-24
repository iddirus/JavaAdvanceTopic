package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static java.sql.DriverManager.getConnection;

public class DatabaseConnectionDirectly {

    public static void main(String[] args) {
        // database connection : JDBC connection
        String url = "jdbc:mysql://localhost:3306/iddir?serverTimezone=UTC&useSSL=false";
        String user = "root";
        String password = "Iddir15hadjal";

        // create connection
        Connection connection = null;
        Statement statement = null;


        // movie class is using to insert data
        // create object of movie class and use the multi parameterized constructor and pass the value

        Movie taken = new Movie(4, "Taken", 2009, "Action", "PG_13");
        Movie shooter = new Movie(5, "Shooter", 2010, "Thriller", "PG_14");
        Movie bigMama = new Movie(6, "Big Mama", 2005, "Comedy", "PG_12");
        Movie ww2 = new Movie(2, "WW2", 2012, "War", "PG_11");
        Movie lost = new Movie(1, "Lost", 2006, "Adventure", "PG_15");
        Movie sweetNovember = new Movie(3, "Sweet November", 2002, "Romance", "PG_10");

        // create an Arraylist and add movie values to this arrayList
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(taken);
        movies.add(shooter);
        movies.add(bigMama);
        movies.add(ww2);
        movies.add(lost);
        movies.add(sweetNovember);

        try {
            connection =DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();
            // insert data to table/ database
            // go to MySQL workbench and create a tableName = movieInfo
            for (Movie mv : movies) {

                String insertQuery = "insert into movieinformation (movieId,movieTitle,movieReleaseYear,movieGenre,movieRating)"
                        + "values (" + mv.getMovieId() + ",'" + mv.getMovieTitle() + "'," + mv.getMovieReleaseYear() + ",'" + mv.getMovieGenre() + "','" + mv.getMovieRating() + "')";
                statement.execute(insertQuery);

                //  String getAllMovieInfo = "select * from movieinformation";
                //  statement.execute(getAllMovieInfo);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }


}
