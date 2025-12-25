package com.google.android.gms.common.internal;
final class zaq implements com.google.android.gms.common.internal.PendingResultUtil$ResultConverter {
    final synthetic com.google.android.gms.common.api.Response zaa;

    public zaq(com.google.android.gms.common.api.Response p1)
    {
        this.zaa = p1;
        return;
    }

    public final bridge synthetic Object convert(com.google.android.gms.common.api.Result p2)
    {
        this.zaa.setResult(p2);
        return this.zaa;
    }
}
