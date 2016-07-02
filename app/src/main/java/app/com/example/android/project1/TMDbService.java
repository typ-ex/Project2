package app.com.example.android.project1;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by typ_ex on 6/14/2016.
 */
public class TMDbService {

    public interface TMDbAPI {

        @GET("/3/movie/{sort}")
        Call<MovieResults> loadMovies(@Path("sort") String sortType,
                                      @Query("api_key") String key);

        @GET("/3/movie/{id}/videos")
        Call<MovieResults> loadVideos(@Path("id") String movieID,
                                       @Query("api_key") String key);

        @GET("/3/movie/{id}/reviews")
        Call<MovieResults> loadReviews(@Path("id") String movieID,
                                       @Query("api_key") String key);
    }
}