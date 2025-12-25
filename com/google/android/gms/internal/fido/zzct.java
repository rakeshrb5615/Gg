package com.google.android.gms.internal.fido;
final class zzct extends com.google.android.gms.internal.fido.zzcw {
    private final int zzc;
    private final int zzd;

    public zzct(byte[] p2, int p3, int p4)
    {
        super(p2);
        com.google.android.gms.internal.fido.zzcz.zzj(p3, (p3 + p4), p2.length);
        super.zzc = p3;
        super.zzd = p4;
        return;
    }

    public final byte zza(int p5)
    {
        ArrayIndexOutOfBoundsException v0_0 = this.zzd;
        if (((v0_0 - (p5 + 1)) | p5) >= 0) {
            return this.zza[(this.zzc + p5)];
        } else {
            if (p5 >= null) {
                throw new ArrayIndexOutOfBoundsException(v1.a.i("Index > length: ", p5, v0_0, ", "));
            } else {
                throw new ArrayIndexOutOfBoundsException(g2.g.c(p5, "Index < 0: "));
            }
        }
    }

    public final byte zzb(int p3)
    {
        return this.zza[(this.zzc + p3)];
    }

    public final int zzc()
    {
        return this.zzc;
    }

    public final int zzd()
    {
        return this.zzd;
    }

    public final void zze(byte[] p2, int p3, int p4, int p5)
    {
        System.arraycopy(this.zza, this.zzc, p2, 0, p5);
        return;
    }
}
