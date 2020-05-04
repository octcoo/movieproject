package com.example.movie.database;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity (tableName = "movie_fav")
public class MovieData {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idMovie")
    private int idMovie;

    @ColumnInfo(name = "strOverview")
    private String strOverview;

    @ColumnInfo(name = "strOriginal_language")
    private String strOriginalLanguage;

    @ColumnInfo(name = "stroriginal_title")
    private String strOriginalTitle;

//    @ColumnInfo(name = "bolVideo")
//    private boolean bolVideo;

    @ColumnInfo(name = "strTitle")
    private String strTitle;

    @ColumnInfo(name = "intGenre_ids")
    private List<Integer> intGenreIds;

    @ColumnInfo(name = "strposter_path")
    private String strPosterPath;

    @ColumnInfo(name = "strBackdrop_path")
    private String strBackdropPath;

    @ColumnInfo(name = "strRelease_date")
    private String strReleaseDate;

    @ColumnInfo(name = "strPopularity")
    private double strPopularity;

    @ColumnInfo(name = "strVote_average")
    private double strVoteAverage;

    @ColumnInfo(name = "id")
    private int id;

//    @ColumnInfo(name = "adult")
//    private boolean bolAdult;

    @ColumnInfo(name = "intVote_count")
    private int intVoteCount;

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getStrOverview() {
        return strOverview;
    }

    public void setStrOverview(String strOverview){
        this.strOverview=strOverview;
    }

    public String getStrOriginalLanguage() {
        return strOriginalLanguage;
    }

    public void setStrOriginalLanguage(String strOriginalLanguage) {
        this.strOriginalLanguage = strOriginalLanguage;
    }

    public String getStrOriginalTitle() {
        return strOriginalTitle;
    }

    public void setStrOriginalTitle(String strOriginalTitle) {
        this.strOriginalTitle = strOriginalTitle;
    }

//    public boolean bolVideo() {
//        return bolVideo;
//    }

//    public void setBolVideo(boolean bolVideo) {
//        this.bolVideo = bolVideo;
//    }

    public String getStrTitle() {
        return strTitle;
    }

    public void setStrTitle(String strTitle) {
        this.strTitle = strTitle;
    }

    public List<Integer> getIntGenreIds() {
        return intGenreIds;
    }

    public void setIntGenreIds(List<Integer> intGenreIds) {
        this.intGenreIds = intGenreIds;
    }

    public String getStrPosterPath() {
        return strPosterPath;
    }

    public void setStrPosterPath(String strPosterPath) {
        this.strPosterPath = strPosterPath;
    }

    public String getStrBackdropPath() {
        return strBackdropPath;
    }

    public void setStrBackdropPath(String strBackdropPath) {
        this.strBackdropPath = strBackdropPath;
    }

    public String getStrReleaseDate() {
        return strReleaseDate;
    }

    public void setStrReleaseDate(String strReleaseDate) {
        this.strReleaseDate = strReleaseDate;
    }

    public double getStrPopularity() {
        return strPopularity;
    }

    public void setStrPopularity(double strPopularity) {
        this.strPopularity = strPopularity;
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

//    public boolean isBolAdult() {
//        return bolAdult;
//    }
//
//    public boolean isBolAdult() {
//        return bolAdult;
//    }

    public int getIntVoteCount() {
        return intVoteCount;
    }

    public void setIntVoteCount(int intVoteCount) {
        this.intVoteCount = intVoteCount;
    }
}



