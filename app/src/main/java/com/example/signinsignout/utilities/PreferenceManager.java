package com.example.signinsignout.utilities;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * A utility class to manage shared preferences for storing and retrieving
 * key-value pairs, providing methods for handling boolean and string preferences.
 */
public class PreferenceManager {

    private final SharedPreferences sharedPreferences;

    /**
     * Initializes the PreferenceManager with the specified context, creating
     * a shared preferences instance with the name defined in {@link Constants#KEY_PREFERENCE_NAME}.
     *
     * @param context The context used to initialize the shared preferences.
     */
    public PreferenceManager(Context context) {
        sharedPreferences = context.getSharedPreferences(Constants.KEY_PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    /**
     * Saves a boolean value in shared preferences.
     *
     * @param key   The key under which the value is stored.
     * @param value The boolean value to be stored.
     */
    public void putBoolean(String key, Boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    /**
     * Retrieves a boolean value from shared preferences.
     *
     * @param key The key associated with the boolean value.
     * @return The boolean value, or false if the key does not exist.
     */
    public Boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    /**
     * Saves a string value in shared preferences.
     *
     * @param key   The key under which the value is stored.
     * @param value The string value to be stored.
     */
    public void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    /**
     * Retrieves a string value from shared preferences.
     *
     * @param key The key associated with the string value.
     * @return The string value, or null if the key does not exist.
     */
    public String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    /**
     * Clears all stored preferences.
     */
    public void clear() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
