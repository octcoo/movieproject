package com.example.movie.view.activity;

import android.view.View;

import com.example.movie.database.AppDatabase;
import com.example.movie.database.MovieData;

import java.util.List;

public interface MainContact {
    interface view extends View.OnClickListener {
    }

    interface presenter {
        void deleteData(AppDatabase database, MovieData movielData);
    }

    interface read extends View.OnClickListener {
        void getData(List<MovieData> list);
    }

    interface delete {
        void successDel();

        void deleteData(MovieData item);
    }
}