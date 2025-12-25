package com.google.android.gms.common.api;
public abstract class GoogleApiClient {
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final java.util.Set zaa;

    static GoogleApiClient()
    {
        com.google.android.gms.common.api.GoogleApiClient.zaa = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
        return;
    }

    public GoogleApiClient()
    {
        return;
    }

    public static void dumpAll(String p7, java.io.FileDescriptor p8, java.io.PrintWriter p9, String[] p10)
    {
        String v1_1 = new StringBuilder();
        v1_1.append(p7);
        v1_1.append("  ");
        String v1_2 = v1_1.toString();
        java.util.Iterator v2_1 = com.google.android.gms.common.api.GoogleApiClient.zaa.iterator();
        int v3 = 0;
        while (v2_1.hasNext()) {
            com.google.android.gms.common.api.GoogleApiClient v4_2 = ((com.google.android.gms.common.api.GoogleApiClient) v2_1.next());
            int v6_1 = (v3 + 1);
            p9.append(p7).append("GoogleApiClient#").println(v3);
            v4_2.dump(v1_2, p8, p9, p10);
            v3 = v6_1;
        }
        return;
    }

    public static java.util.Set getAllClients()
    {
        try {
            return com.google.android.gms.common.api.GoogleApiClient.zaa;
        } catch (Throwable v1) {
            throw v1;
        }
    }

    public static bridge synthetic java.util.Set zaq()
    {
        return com.google.android.gms.common.api.GoogleApiClient.zaa;
    }

    public abstract com.google.android.gms.common.ConnectionResult blockingConnect();

    public abstract com.google.android.gms.common.ConnectionResult blockingConnect();

    public abstract com.google.android.gms.common.api.PendingResult clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int p1)
    {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump();

    public com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl enqueue(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p1)
    {
        throw new UnsupportedOperationException();
    }

    public com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p1)
    {
        throw new UnsupportedOperationException();
    }

    public com.google.android.gms.common.api.Api$Client getClient(com.google.android.gms.common.api.Api$AnyClientKey p1)
    {
        throw new UnsupportedOperationException();
    }

    public abstract com.google.android.gms.common.ConnectionResult getConnectionResult();

    public android.content.Context getContext()
    {
        throw new UnsupportedOperationException();
    }

    public android.os.Looper getLooper()
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasApi(com.google.android.gms.common.api.Api p1)
    {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi();

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered();

    public abstract boolean isConnectionFailedListenerRegistered();

    public boolean maybeSignIn(com.google.android.gms.common.api.internal.SignInConnectionListener p1)
    {
        throw new UnsupportedOperationException();
    }

    public void maybeSignOut()
    {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks();

    public abstract void registerConnectionFailedListener();

    public com.google.android.gms.common.api.internal.ListenerHolder registerListener(Object p1)
    {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage();

    public abstract void unregisterConnectionCallbacks();

    public abstract void unregisterConnectionFailedListener();

    public void zao(com.google.android.gms.common.api.internal.zada p1)
    {
        throw new UnsupportedOperationException();
    }

    public void zap(com.google.android.gms.common.api.internal.zada p1)
    {
        throw new UnsupportedOperationException();
    }
}
