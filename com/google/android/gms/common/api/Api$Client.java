package com.google.android.gms.common.api;
public interface Api$Client implements com.google.android.gms.common.api.Api$AnyClient {

    public abstract void connect();

    public abstract void disconnect();

    public abstract void disconnect();

    public abstract void dump();

    public abstract com.google.android.gms.common.Feature[] getAvailableFeatures();

    public abstract String getEndpointPackageName();

    public abstract String getLastDisconnectMessage();

    public abstract int getMinApkVersion();

    public abstract void getRemoteService();

    public abstract com.google.android.gms.common.Feature[] getRequiredFeatures();

    public abstract java.util.Set getScopesForConnectionlessNonSignIn();

    public abstract android.os.IBinder getServiceBrokerBinder();

    public abstract android.content.Intent getSignInIntent();

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract void onUserSignOut();

    public abstract boolean providesSignIn();

    public abstract boolean requiresAccount();

    public abstract boolean requiresGooglePlayServices();

    public abstract boolean requiresSignIn();
}
