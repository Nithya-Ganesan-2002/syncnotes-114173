package com.example.androidmobileapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

// PUBLIC_INTERFACE
/** User profile and logout/settings screen. */
public class ProfileFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return new android.widget.LinearLayout(getContext()); // placeholder
    }
}
