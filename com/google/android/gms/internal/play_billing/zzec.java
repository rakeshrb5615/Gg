package com.google.android.gms.internal.play_billing;
final class zzec extends com.google.android.gms.internal.play_billing.zzeg {
    private final int zzc;

    public zzec(byte[] p1, int p2, int p3)
    {
        super(p1);
        com.google.android.gms.internal.play_billing.zzei.zzh(0, p3, p1.length);
        super.zzc = p3;
        return;
    }

    public final byte zza(int p5)
    {
        ArrayIndexOutOfBoundsException v0_0 = this.zzc;
        if (((v0_0 - (p5 + 1)) | p5) >= 0) {
            return this.zza[p5];
        } else {
            if (p5 >= null) {
                throw new ArrayIndexOutOfBoundsException(v1.a.i("Index > length: ", p5, v0_0, ", "));
            } else {
                throw new ArrayIndexOutOfBoundsException(g2.g.c(p5, "Index < 0: "));
            }
        }
    }

    public final byte zzb(int p2)
    {
        return this.zza[p2];
    }

    public final int zzc()
    {
        return 0;
    }

    public final int zzd()
    {
        return this.zzc;
    }
}
