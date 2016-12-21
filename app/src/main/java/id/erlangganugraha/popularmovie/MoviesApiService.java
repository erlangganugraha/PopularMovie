package id.erlangganugraha.popularmovie;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Erlangga on 12/6/2016.
 */

public interface MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}
