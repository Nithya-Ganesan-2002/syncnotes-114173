package com.example.androidmobileapp.service;

import android.content.Context;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// PUBLIC_INTERFACE
/**
 * Placeholder service for Supabase integration using REST API.
 * Provides Retrofit client pre-configured for Supabase usage.
 */
public class SupabaseService {
    private static Retrofit retrofit = null;

    // PUBLIC_INTERFACE
    public static Retrofit getInstance(Context context) {
        if (retrofit == null) {
            String url = context.getString(
                context.getResources().getIdentifier("supabase_url", "string", context.getPackageName())
            );
            OkHttpClient client = new OkHttpClient.Builder().build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(url + "/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }
}
