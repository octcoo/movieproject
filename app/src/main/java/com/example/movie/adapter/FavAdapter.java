package com.example.movie.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movie.R;
import com.example.movie.database.AppDatabase;
import com.example.movie.database.MovieData;
import com.example.movie.view.activity.MainContact;

import java.util.List;

public class FavAdapter extends RecyclerView.Adapter<FavAdapter.Holder> {
    private Context context;
    private List<MovieData> list;
    private MainContact.delete viewDel;
    private AppDatabase appDatabase;
    private MovieData movieData;

    public FavAdapter(Context context, List<MovieData> list, MainContact.delete viewDel) {
        this.context = context;
        this.list = list;
//        this.viewDel = viewDel;
    }

    @NonNull
    @Override
    public FavAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fav, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FavAdapter.Holder holder, final int position) {
        holder.bind(position);
//        Glide.with(context).load(list.get(position).getStrTeamBadge())  //PANGGIL GAMBARNYA WOIII
//                .into(holder.iv_img_club);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView ivMovie;
        TextView tvJudul, tvRate;
        CardView cvItem;

           public Holder(@NonNull View itemView) {
                super(itemView);
                cvItem = itemView.findViewById(R.id.itemlist_cv);
                ivMovie = itemView.findViewById(R.id.movieimg_iv);
                tvJudul = itemView.findViewById(R.id.movietitle_tv);
                tvRate = itemView.findViewById(R.id.itemlist_tv_rate);
        }


        public void bind(int position) {
            //MENAMPILKAN DATA
            final MovieData movieData = list.get(position);
           ivMovie.setImageURI(Uri.parse(movieData.getStrPosterPath()));
            tvJudul.setText(movieData.getStrTitle());
            tvRate.setText((int) movieData.getStrVoteAverage());
//          btnDel.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    viewDel.deleteData(movieData);
//                }
            };
        }
    }

