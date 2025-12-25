package com.google.android.gms.common;
public class BlockingServiceConnection implements android.content.ServiceConnection {
    boolean zza;
    private final java.util.concurrent.BlockingQueue zzb;

    public BlockingServiceConnection()
    {
        this.zza = 0;
        this.zzb = new java.util.concurrent.LinkedBlockingQueue();
        return;
    }

    public android.os.IBinder getService()
    {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if (this.zza) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        } else {
            this.zza = 1;
            return ((android.os.IBinder) this.zzb.take());
        }
    }

    public android.os.IBinder getServiceWithTimeout(long p2, java.util.concurrent.TimeUnit p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.zza) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        } else {
            this.zza = 1;
            java.util.concurrent.TimeoutException v2_2 = ((android.os.IBinder) this.zzb.poll(p2, p4));
            if (v2_2 == null) {
                throw new java.util.concurrent.TimeoutException("Timed out waiting for the service connection");
            } else {
                return v2_2;
            }
        }
    }

    public final void onServiceConnected(android.content.ComponentName p1, android.os.IBinder p2)
    {
        this.zzb.add(p2);
        return;
    }

    public final void onServiceDisconnected(android.content.ComponentName p1)
    {
        return;
    }
}
