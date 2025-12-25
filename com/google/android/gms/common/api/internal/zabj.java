package com.google.android.gms.common.api.internal;
public final class zabj {
    private static final java.util.concurrent.ExecutorService zaa;

    static zabj()
    {
        com.google.android.gms.common.api.internal.zabj.zaa = com.google.android.gms.internal.base.zat.zaa().zac(2, new com.google.android.gms.common.util.concurrent.NumberedThreadFactory("GAC_Executor"), 2);
        return;
    }

    public static java.util.concurrent.ExecutorService zaa()
    {
        return com.google.android.gms.common.api.internal.zabj.zaa;
    }
}
