package com.google.android.gms.internal.firebase-auth-api;
public final class zzhy extends com.google.android.gms.internal.firebase-auth-api.zzhu {

    public zzhy(byte[] p1, int p2)
    {
        super(p1, p2);
        return;
    }

    public final int zza()
    {
        return 24;
    }

    public final bridge synthetic void zza(java.nio.ByteBuffer p1, byte[] p2, byte[] p3)
    {
        super.zza(p1, p2, p3);
        return;
    }

    public final bridge synthetic byte[] zza(byte[] p1, java.nio.ByteBuffer p2)
    {
        return super.zza(p1, p2);
    }

    public final int[] zza(int[] p4, int p5)
    {
        if (p4.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[] {Integer.valueOf((p4.length << 5))})));
        } else {
            String v0_3 = new int[16];
            com.google.android.gms.internal.firebase-auth-api.zzhp.zza(v0_3, com.google.android.gms.internal.firebase-auth-api.zzhp.zzb(this.zza, p4));
            v0_3[12] = p5;
            v0_3[13] = 0;
            v0_3[14] = p4[4];
            v0_3[15] = p4[5];
            return v0_3;
        }
    }
}
