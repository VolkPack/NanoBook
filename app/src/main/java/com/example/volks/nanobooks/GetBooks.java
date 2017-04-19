package com.example.volks.nanobooks;

import android.os.AsyncTask;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by Volks on 4/18/2017.
 */

public class GetBooks extends AsyncTask<URL,Void,ArrayList<Book>> {

    @Override
    protected ArrayList<Book> doInBackground(URL... urls) {
        return null;
    }
}
