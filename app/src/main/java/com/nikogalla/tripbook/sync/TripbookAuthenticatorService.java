package com.nikogalla.tripbook.sync;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Nicola on 2017-02-10.
 */

public class TripbookAuthenticatorService extends Service {
    // Instance field that stores the authenticator object
    private TripbookAuthenticator mAuthenticator;
    @Override
    public void onCreate() {
        // Create a new authenticator object
        mAuthenticator = new TripbookAuthenticator(this);
    }
    /*
     * When the system binds to this Service to make the RPC call
     * return the authenticator's IBinder.
     */
    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
