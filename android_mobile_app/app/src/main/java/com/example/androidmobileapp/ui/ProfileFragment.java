package com.example.androidmobileapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.androidmobileapp.R;

// PUBLIC_INTERFACE
/** User profile and logout/settings screen. */
public class ProfileFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate actual layout for profile fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}
