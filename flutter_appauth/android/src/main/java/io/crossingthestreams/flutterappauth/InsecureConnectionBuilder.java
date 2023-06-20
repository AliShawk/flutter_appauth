package io.crossingthestreams.flutterappauth;

import android.net.Uri;

import androidx.annotation.NonNull;

//import net.openid.appauth.connectivity.ConnectionBuilder;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import io.crossingthestreams.flutterappauth.appauth.connectivity.ConnectionBuilder;

public class InsecureConnectionBuilder implements ConnectionBuilder {

    public static final InsecureConnectionBuilder INSTANCE = new InsecureConnectionBuilder();

    private InsecureConnectionBuilder() { }

    @NonNull
    @Override
    public HttpURLConnection openConnection(@NonNull Uri uri) throws IOException {
        return (HttpURLConnection) new URL(uri.toString()).openConnection();
    }
}
