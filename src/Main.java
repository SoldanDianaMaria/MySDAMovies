/**
 * @author Diana Soldan
 * @date : 5/11/2019
 */
public class Main {
    public static void main(String[] args) {
        String moviesPath= "movies.txt";
        MyMoviesColection myMoviesColection = new MyMoviesColection();
        myMoviesColection.readMoviesFromFile(moviesPath);
        myMoviesColection.showMovies();

    }
}
