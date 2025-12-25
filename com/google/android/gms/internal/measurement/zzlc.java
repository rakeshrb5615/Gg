package com.google.android.gms.internal.measurement;
final class zzlc extends com.google.android.gms.internal.measurement.zzlg {
    private final int zzc;

    public zzlc(byte[] p1, int p2, int p3)
    {
        super(p1);
        com.google.android.gms.internal.measurement.zzlh.zzj(0, p3, p1.length);
        super.zzc = p3;
        return;
    }

    public final byte zza(int p6)
    {
        ArrayIndexOutOfBoundsException v0_0 = this.zzc;
        if (((v0_0 - (p6 + 1)) | p6) >= 0) {
            return this.zza[p6];
        } else {
            if (p6 >= null) {
                StringBuilder v4_1 = new StringBuilder(((String.valueOf(p6).length() + 18) + String.valueOf(v0_0).length()));
                v4_1.append("Index > length: ");
                v4_1.append(p6);
                v4_1.append(", ");
                v4_1.append(v0_0);
                throw new ArrayIndexOutOfBoundsException(v4_1.toString());
            } else {
                throw new ArrayIndexOutOfBoundsException(v1.a.m(new StringBuilder((String.valueOf(p6).length() + 11)), "Index < 0: ", p6));
            }
        }
    }

    public final byte zzb(int p2)
    {
        return this.zza[p2];
    }

    public final int zzc()
    {
        return this.zzc;
    }

    public final int zzd()
    {
        return 0;
    }
}
