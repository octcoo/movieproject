package com.example.movie.service;

import com.example.movie.model.movie.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieRepository {
    @GET("discover/movie?api_key=05faacecb1bb8a123ad56542b1708bad")
    Call<MovieResponse> getMovie();
}
