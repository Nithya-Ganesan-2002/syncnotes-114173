package com.example.androidmobileapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.androidmobileapp.R;

// PUBLIC_INTERFACE
/** Displays list of notes, supports navigation to note editor. */
public class NoteListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate actual layout for note list
        return inflater.inflate(R.layout.fragment_note_list, container, false);
    }
}
