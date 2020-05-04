package com.example.movie.database;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "movie_fav")
public class MovieData {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idMovie")
    private int idMovie;

//    @ColumnInfo(name = "bolVideo")
//    private boolean bolVideo;

    @ColumnInfo(name = "strTitle")
    private String strTitle;

    @ColumnInfo(name = "strposter_path")
    private String strPosterPath;

    @ColumnInfo(name = "strVote_average")
    private double strVoteAverage;

    @ColumnInfo(name = "id")
    private int id;


    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }


    public String getStrTitle() {
        return strTitle;
    }

    public void setStrTitle(String strTitle) {
        this.strTitle = strTitle;
    }

    public String getStrPosterPath() {
        return strPosterPath;
    }

    public void setStrPosterPath(String strPosterPath) {
        this.strPosterPath = strPosterPath;
    }

    public double getStrVoteAverage() {
        return strVoteAverage;
    }

    public void setStrVoteAverage(double strVoteAverage) {
        this.strVoteAverage = strVoteAverage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}





