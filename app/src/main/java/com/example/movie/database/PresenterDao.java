package com.example.movie.database;


import android.content.Context;
import android.os.AsyncTask;

import com.example.movie.view.activity.MainContact;

public class PresenterDao implements MainContact.presenter {
    MainContact.view view;
    MainContact.delete viewDel;

    public PresenterDao(MainContact.view view) {
        this.view = view;
    }

    public PresenterDao(MainContact.delete viewDel) {
        this.viewDel = viewDel;
    }

    @Override
    public void deleteData(AppDatabase database, MovieData movieData) {
        new DeleteData(database, movieData).execute();
    }

    private class DeleteData extends AsyncTask<Void, Void, Void> {
        private AppDatabase database;
        private MovieData movieData;
        Context context;

        public DeleteData(AppDatabase database, MovieData movieData) {
            this.database = database;
            this.movieData = movieData;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            database.dao().deleteData(movieData);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            viewDel.successDel();
        }
    }
}