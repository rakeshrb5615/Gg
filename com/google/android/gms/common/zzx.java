package com.google.android.gms.common;
final class zzx extends com.google.android.gms.common.zzy {
    private final java.util.concurrent.Callable zze;

    public synthetic zzx(java.util.concurrent.Callable p10, byte[] p11)
    {
        super(0, 1, 5, 0, 0, -1, 0).zze = p10;
        return;
    }

    public final String zza()
    {
        try {
            return ((String) this.zze.call());
        } catch (Exception v0_3) {
            throw new RuntimeException(v0_3);
        }
    }
}
