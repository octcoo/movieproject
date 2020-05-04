package com.example.movie.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.movie.R;
import com.example.movie.database.AppDatabase;
import com.example.movie.database.MovieData;
import com.example.movie.model.movie.MovieResultsItem;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private ArrayList<MovieResultsItem> movieItems = new ArrayList<>();
    private Context context;
    AppDatabase appDatabase;

    private static  String BASE_IMAGE_URL = "https://image.tmdb.org/t/p/w185/";

    public MovieAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<MovieResultsItem> items){
       movieItems.clear();
       movieItems.addAll(items);
       notifyDataSetChanged();
   }

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {
        holder.bind(position);
        Glide.with(context).load(BASE_IMAGE_URL+movieItems.get(position).getStrPosterPath()).into(holder.ivMovie);

        holder.tvJudul.setText(movieItems.get(position).getStrTitle());
        holder.tvRate.setText(String.valueOf(movieItems.get(position).getStrVoteAverage()));
    }

    @Override
    public int getItemCount() {
       //meberikan data sebanyak dari luar ke sini.
        return movieItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivMovie, loveclick;
        TextView tvJudul, tvRate;
        CardView cvItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cvItem = itemView.findViewById(R.id.itemlist_cv);
            ivMovie = itemView.findViewById(R.id.movieimg_iv);
            tvJudul = itemView.findViewById(R.id.movietitle_tv);
            tvRate = itemView.findViewById(R.id.itemlist_tv_rate);
            appDatabase = AppDatabase.iniDb(context);
        }
        public void bind(final int position) {
            loveclick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MovieData movieData = new MovieData();
                    movieData.setStrOriginalLanguage(movieItems.get(position).getStrOriginalLanguage());
                    movieData.setStrOriginalTitle(movieItems.get(position).getStrOriginalTitle());
                    movieData.setStrOverview(movieItems.get(position).getStrOverview());
                    movieData.setStrBackdropPath(movieItems.get(position).getStrBackdropPath());
                    movieData.setStrPopularity(movieItems.get(position).getStrPopularity());
                    movieData.setStrPosterPath(movieItems.get(position).getStrPosterPath());
                    movieData.setStrReleaseDate(movieItems.get(position).getStrReleaseDate());
                    movieData.setStrTitle(movieItems.get(position).getStrTitle());
                    movieData.setStrVoteAverage(movieItems.get(position).getStrVoteAverage());
                    movieData.setIntGenreIds(movieItems.get(position).getIntGenreIds());
                    movieData.setIntVoteCount(movieItems.get(position).getIntVoteCount());
                    movieData.setId(movieItems.get(position).getId());

                    appDatabase.dao().insertData(movieData);
                    Toast.makeText(context, "SAVE TO FAVORITE", Toast.LENGTH_SHORT).show();
                    Log.d("MovieAdapter", "Save to favorite Success");
                }
            });
        }
    }
}
