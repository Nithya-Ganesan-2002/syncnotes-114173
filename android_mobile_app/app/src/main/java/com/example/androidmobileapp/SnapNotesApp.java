package com.example.androidmobileapp;

import android.app.Application;
import androidx.room.Room;
import com.example.androidmobileapp.model.AppDatabase;

// PUBLIC_INTERFACE
/** Application-level singleton for global Room DB access. */
public class SnapNotesApp extends Application {
    private static AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "snapnotes.db")
                .fallbackToDestructiveMigration()
                .build();
    }

    // PUBLIC_INTERFACE
    public static AppDatabase getDb() {
        return db;
    }
}
