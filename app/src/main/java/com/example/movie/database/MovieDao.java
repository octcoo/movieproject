package com.example.movie.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.movie.MovieData;

import java.util.List;

@Dao
public interface MovieDao {
    @Insert
    long insertData(MovieData movieData);

    @Query("SELECT * FROM movie_fav order by id")
    List<MovieData> getData();

    @Delete
    void deleteData(MovieData item);
}