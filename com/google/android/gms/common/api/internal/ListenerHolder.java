package com.google.android.gms.common.api.internal;
public final class ListenerHolder {
    private final java.util.concurrent.Executor zaa;
    private volatile Object zab;
    private volatile com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey zac;

    public ListenerHolder(android.os.Looper p2, Object p3, String p4)
    {
        this.zaa = new com.google.android.gms.common.util.concurrent.HandlerExecutor(p2);
        this.zab = com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Listener must not be null");
        this.zac = new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey(p3, com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4));
        return;
    }

    public ListenerHolder(java.util.concurrent.Executor p2, Object p3, String p4)
    {
        this.zaa = ((java.util.concurrent.Executor) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Executor must not be null"));
        this.zab = com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Listener must not be null");
        this.zac = new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey(p3, com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p4));
        return;
    }

    public void clear()
    {
        this.zab = 0;
        this.zac = 0;
        return;
    }

    public com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey getListenerKey()
    {
        return this.zac;
    }

    public boolean hasListener()
    {
        if (this.zab == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public void notifyListener(com.google.android.gms.common.api.internal.ListenerHolder$Notifier p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Notifier must not be null");
        this.zaa.execute(new com.google.android.gms.common.api.internal.zacb(this, p2));
        return;
    }

    public final void zaa(com.google.android.gms.common.api.internal.ListenerHolder$Notifier p2)
    {
        RuntimeException v0_0 = this.zab;
        if (v0_0 != null) {
            try {
                p2.notifyListener(v0_0);
                return;
            } catch (RuntimeException v0_1) {
                p2.onNotifyListenerFailed();
                throw v0_1;
            }
        } else {
            p2.onNotifyListenerFailed();
            return;
        }
    }
}
