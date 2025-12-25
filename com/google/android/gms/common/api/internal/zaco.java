package com.google.android.gms.common.api.internal;
public final class zaco {
    private static final java.util.concurrent.ExecutorService zaa;

    static zaco()
    {
        com.google.android.gms.common.api.internal.zaco.zaa = com.google.android.gms.internal.base.zat.zaa().zaa(new com.google.android.gms.common.util.concurrent.NumberedThreadFactory("GAC_Transform"), 1);
        return;
    }

    public static java.util.concurrent.ExecutorService zaa()
    {
        return com.google.android.gms.common.api.internal.zaco.zaa;
    }
}
