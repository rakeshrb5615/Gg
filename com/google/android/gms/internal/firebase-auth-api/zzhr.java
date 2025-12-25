package com.google.android.gms.internal.firebase-auth-api;
public final class zzhr extends com.google.android.gms.internal.firebase-auth-api.zzhu {

    public zzhr(byte[] p1, int p2)
    {
        super(p1, p2);
        return;
    }

    public final int zza()
    {
        return 12;
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
        if (p4.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[] {Integer.valueOf((p4.length << 5))})));
        } else {
            String v0_3 = new int[16];
            com.google.android.gms.internal.firebase-auth-api.zzhp.zza(v0_3, this.zza);
            v0_3[12] = p5;
            System.arraycopy(p4, 0, v0_3, 13, p4.length);
            return v0_3;
        }
    }
}
