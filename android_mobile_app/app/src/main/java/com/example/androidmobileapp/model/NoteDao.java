package com.example.androidmobileapp.model;

import androidx.lifecycle.LiveData;
import androidx.room.*;

// PUBLIC_INTERFACE
/** DAO for accessing notes in the offline cache. */
@Dao
public interface NoteDao {
    @Query("SELECT * FROM notes ORDER BY timestamp DESC")
    LiveData<java.util.List<Note>> getAllNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Note note);

    @Delete
    void delete(Note note);
}
