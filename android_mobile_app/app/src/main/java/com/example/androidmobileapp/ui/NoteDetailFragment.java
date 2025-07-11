package com.example.androidmobileapp.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.androidmobileapp.R;

/**
 * PUBLIC_INTERFACE
 * Displays the detail view for a single note.
 */
public class NoteDetailFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_note_detail, container, false);

        Bundle args = getArguments();
        String noteTitle = args != null ? args.getString("noteTitle", "") : "";
        String noteContent = args != null ? args.getString("noteContent", "") : "";

        TextView tvTitle = root.findViewById(R.id.tv_note_detail_title);
        TextView tvContent = root.findViewById(R.id.tv_note_detail_content);

        tvTitle.setText(!TextUtils.isEmpty(noteTitle) ? noteTitle : "Note");
        tvContent.setText(!TextUtils.isEmpty(noteContent) ? noteContent : "(no content)");
        return root;
    }
}
