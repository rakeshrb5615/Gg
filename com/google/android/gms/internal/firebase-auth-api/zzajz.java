package com.google.android.gms.internal.firebase-auth-api;
final class zzajz extends com.google.android.gms.internal.firebase-auth-api.zzakg {
    private final int zzc;
    private final int zzd;

    public zzajz(byte[] p2, int p3, int p4)
    {
        super(p2);
        com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p3, (p3 + p4), p2.length);
        super.zzc = p3;
        super.zzd = p4;
        return;
    }

    public final byte zza(int p5)
    {
        ArrayIndexOutOfBoundsException v0_0 = this.zzb();
        if (((v0_0 - (p5 + 1)) | p5) >= 0) {
            return this.zzb[(this.zzc + p5)];
        } else {
            if (p5 >= null) {
                throw new ArrayIndexOutOfBoundsException(v1.a.i("Index > length: ", p5, v0_0, ", "));
            } else {
                throw new ArrayIndexOutOfBoundsException(g2.g.c(p5, "Index < 0: "));
            }
        }
    }

    public final void zza(byte[] p2, int p3, int p4, int p5)
    {
        System.arraycopy(this.zzb, this.zze(), p2, 0, p5);
        return;
    }

    public final byte zzb(int p3)
    {
        return this.zzb[(this.zzc + p3)];
    }

    public final int zzb()
    {
        return this.zzd;
    }

    public final int zze()
    {
        return this.zzc;
    }
}
