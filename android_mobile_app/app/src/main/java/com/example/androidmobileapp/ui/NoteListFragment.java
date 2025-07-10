package com.example.androidmobileapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

// PUBLIC_INTERFACE
/** Displays list of notes, supports navigation to note editor. */
public class NoteListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return new android.widget.LinearLayout(getContext()); // placeholder
    }
}
