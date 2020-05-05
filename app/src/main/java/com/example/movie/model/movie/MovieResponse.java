package com.example.movie.model.movie;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MovieResponse{

	@SerializedName("page")
	private int page;

	@SerializedName("total_pages")
	private int totalPages;

	@SerializedName("results")
	private ArrayList<MovieResultsItem> results;

	@SerializedName("total_results")
	private int totalResults;

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setResults(ArrayList<MovieResultsItem> results){
		this.results = results;
	}

	public ArrayList<MovieResultsItem> getResults(){
		return results;
	}

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;
	}

	@Override
	public String toString(){
		return
				"MovieResponse{" +
						"page = '" + page + '\'' +
						",total_pages = '" + totalPages + '\'' +
						",results = '" + results + '\'' +
						",total_results = '" + totalResults + '\'' +
						"}";
	}
}