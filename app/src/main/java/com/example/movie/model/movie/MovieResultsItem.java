package com.example.movie.model.movie;

import com.google.gson.annotations.SerializedName;

public class MovieResultsItem {

	@SerializedName("strOverview")
	private String strOverview;

	@SerializedName("strOriginal_language")
	private String strOriginalLanguage;

	@SerializedName("stroriginal_title")
	private String strOriginalTitle;

	@SerializedName("bolVideo")
	private boolean bolVideo;

	@SerializedName("strTitle")
	private String strTitle;

	@SerializedName("intGenre_ids")
	private int intGenreIds;

	@SerializedName("strposter_path")
	private String strPosterPath;

	@SerializedName("strBackdrop_path")
	private String strBackdropPath;

	@SerializedName("strRelease_date")
	private String strReleaseDate;

	@SerializedName("strPopularity")
	private double strPopularity;

	@SerializedName("strVote_average")
	private double strVoteAverage;

	@SerializedName("id")
	private int id;

	@SerializedName("adult")
	private boolean bolAdult;

	@SerializedName("intVote_count")
	private int intVoteCount;

	public void setStrOverview(String strOverview){
		this.strOverview = strOverview;
	}

	public String getStrOverview(){
		return strOverview;
	}

	public void setStrOriginalLanguage(String strOriginalLanguage){
		this.strOriginalLanguage = strOriginalLanguage;
	}

	public String getStrOriginalLanguage(){
		return strOriginalLanguage;
	}

	public void setStrOriginalTitle(String strOriginalTitle){
		this.strOriginalTitle = strOriginalTitle;
	}

	public String getStrOriginalTitle(){
		return strOriginalTitle;
	}

//	public void setBolVideo(boolean video){
//		this.bolVideo = bolVideo;
//	}
//
//	public boolean isVideo(){
//		return bolVideo;
//	}

	public void setStrTitle(String strTitle){
		this.strTitle = strTitle;
	}

	public String getStrTitle(){
		return strTitle;
	}

	public void setIntGenreIds(int intGenreIds){
		this.intGenreIds = intGenreIds;
	}

	public int getIntGenreIds(){
		return intGenreIds;
	}

	public void setStrPosterPath(String strPosterPath){
		this.strPosterPath = strPosterPath;
	}

	public String getStrPosterPath(){
		return strPosterPath;
	}

	public void setStrBackdropPath(String strBackdropPath){
		this.strBackdropPath = strBackdropPath;
	}

	public String getStrBackdropPath(){
		return strBackdropPath;
	}

	public void setStrReleaseDate(String strReleaseDate){
		this.strReleaseDate = strReleaseDate;
	}

	public String getStrReleaseDate(){
		return strReleaseDate;
	}

	public void setStrPopularity(double strPopularity){
		this.strPopularity = strPopularity;
	}

	public double getStrPopularity(){
		return strPopularity;
	}

	public void setStrVoteAverage(double strVoteAverage){
		this.strVoteAverage = strVoteAverage;
	}

	public double getStrVoteAverage(){
		return strVoteAverage;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setBolAdult(boolean bolAdult){
		this.bolAdult = bolAdult;
	}

	public boolean isAdult(){
		return bolAdult;
	}

	public void setIntVoteCount(int intVoteCount){
		this.intVoteCount = intVoteCount;
	}

	public int getIntVoteCount(){
		return intVoteCount;
	}

	@Override
 	public String toString(){
		return 
			"MovieResultsItem{" +
			"overview = '" + strOverview + '\'' +
			",original_language = '" + strOriginalLanguage + '\'' +
			",original_title = '" + strOriginalTitle + '\'' +
//			",video = '" + bolVideo + '\'' +
			",title = '" + strTitle + '\'' +
			",genre_ids = '" + intGenreIds + '\'' +
			",poster_path = '" + strPosterPath + '\'' +
			",backdrop_path = '" + strBackdropPath + '\'' +
			",release_date = '" + strReleaseDate + '\'' +
			",popularity = '" + strPopularity + '\'' +
			",vote_average = '" + strVoteAverage + '\'' +
			",id = '" + id + '\'' + 
			",adult = '" + bolAdult + '\'' +
			",vote_count = '" + intVoteCount + '\'' +
			"}";
		}
}