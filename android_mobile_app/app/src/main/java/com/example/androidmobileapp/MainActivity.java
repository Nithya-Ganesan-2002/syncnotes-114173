package com.example.androidmobileapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // PUBLIC_INTERFACE
    /**
     * Activity for displaying the main screen.
     * Sets up a FAB to trigger note creation (currently just a placeholder toast).
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab_add_note);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Trigger note creation screen/flow
                Toast.makeText(MainActivity.this, "Create new note (to be implemented)", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
