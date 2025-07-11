package com.example.androidmobileapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

// PUBLIC_INTERFACE
/** Note model as stored locally (Room) and for syncing with Supabase */
@Entity(tableName = "notes")
public class Note {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String title;
    public String content;
    public long timestamp; // unix epoch ms
    public boolean synced;
}
