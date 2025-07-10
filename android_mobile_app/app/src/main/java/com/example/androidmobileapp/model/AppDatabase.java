package com.example.androidmobileapp.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;

// PUBLIC_INTERFACE
/** Room database for SnapNotes. */
@Database(entities = {Note.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
