/*
 * Copyright 2016 The AppAuth for Android Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.crossingthestreams.flutterappauth.appauth.connectivity;

import android.net.Uri;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Creates {@link HttpURLConnection} instances for use in direct interactions
 * with the authorization service, i.e. those not performed via a browser.
 */
public interface ConnectionBuilder {

    /**
     * Creates a connection to the specified URL.
     * @throws IOException if an error occurs while attempting to establish the connection.
     */
    @NonNull
    HttpURLConnection openConnection(@NonNull Uri uri) throws IOException;
}
