package com.google.android.gms.common.api.internal;
public abstract class DataHolderNotifier implements com.google.android.gms.common.api.internal.ListenerHolder$Notifier {
    private final com.google.android.gms.common.data.DataHolder zaa;

    public DataHolderNotifier(com.google.android.gms.common.data.DataHolder p1)
    {
        this.zaa = p1;
        return;
    }

    public final void notifyListener(Object p2)
    {
        this.notifyListener(p2, this.zaa);
        return;
    }

    public abstract void notifyListener();

    public void onNotifyListenerFailed()
    {
        com.google.android.gms.common.data.DataHolder v0 = this.zaa;
        if (v0 != null) {
            v0.close();
        }
        return;
    }
}
