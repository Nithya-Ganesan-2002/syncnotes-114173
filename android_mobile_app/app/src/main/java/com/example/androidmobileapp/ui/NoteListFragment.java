package com.example.androidmobileapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.androidmobileapp.R;

import java.util.ArrayList;

/**
 * PUBLIC_INTERFACE
 * Displays list of notes, supports navigation to note detail.
 */
public class NoteListFragment extends Fragment {
    private ArrayList<String> sampleTitles;
    private ArrayList<String> sampleContents;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate actual layout for note list
        View root = inflater.inflate(R.layout.fragment_note_list, container, false);

        // Sample data (can later be fetched from DB)
        sampleTitles = new ArrayList<>();
        sampleContents = new ArrayList<>();
        sampleTitles.add("Welcome to SnapNotes!");
        sampleContents.add("SnapNotes is your simple, fast note-taking app. Tap here to see full details or add a new note using the + button.");

        ListView listView = new ListView(requireContext());
        listView.setId(View.generateViewId()); // Unique ID

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireContext(),
                android.R.layout.simple_list_item_1,
                sampleTitles
        );
        listView.setAdapter(adapter);

        // Replace (or add) ListView to layout:
        if (root instanceof ViewGroup vg) {
            vg.addView(listView);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // PUBLIC_INTERFACE
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle args = new Bundle();
                args.putString("noteTitle", sampleTitles.get(position));
                args.putString("noteContent", sampleContents.get(position));
                Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_content_main)
                        .navigate(R.id.action_noteList_to_noteDetail, args);
            }
        });

        return root;
    }
}
