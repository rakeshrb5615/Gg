package com.google.android.gms.common.api.internal;
public class ListenerHolders {
    private final java.util.Set zaa;

    public ListenerHolders()
    {
        this.zaa = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
        return;
    }

    public static com.google.android.gms.common.api.internal.ListenerHolder createListenerHolder(Object p1, android.os.Looper p2, String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Looper must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.ListenerHolder(p2, p1, p3);
    }

    public static com.google.android.gms.common.api.internal.ListenerHolder createListenerHolder(Object p1, java.util.concurrent.Executor p2, String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Executor must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.ListenerHolder(p2, p1, p3);
    }

    public static com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey createListenerKey(Object p1, String p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Listener type must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2, "Listener type must not be empty");
        return new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey(p1, p2);
    }

    public final com.google.android.gms.common.api.internal.ListenerHolder zaa(Object p2, android.os.Looper p3, String p4)
    {
        p4 = this.zaa;
        com.google.android.gms.common.api.internal.ListenerHolder v2_1 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p2, p3, "NO_TYPE");
        p4.add(v2_1);
        return v2_1;
    }

    public final void zab()
    {
        java.util.Set v0_1 = this.zaa.iterator();
        while (v0_1.hasNext()) {
            ((com.google.android.gms.common.api.internal.ListenerHolder) v0_1.next()).clear();
        }
        this.zaa.clear();
        return;
    }
}
