package com.google.android.play.core.install;
public final class zza {
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    public zza(int p1, long p2, long p4, int p6, String p7)
    {
        this.a = p1;
        this.b = p2;
        this.c = p4;
        this.d = p6;
        if (p7 == null) {
            throw new NullPointerException("Null packageName");
        } else {
            this.e = p7;
            return;
        }
    }

    public final boolean equals(Object p8)
    {
        if (p8 != this) {
            if ((!(p8 instanceof com.google.android.play.core.install.zza)) || ((this.a != ((com.google.android.play.core.install.zza) p8).a) || ((this.b != ((com.google.android.play.core.install.zza) p8).b) || ((this.c != ((com.google.android.play.core.install.zza) p8).c) || ((this.d != ((com.google.android.play.core.install.zza) p8).d) || (!this.e.equals(((com.google.android.play.core.install.zza) p8).e))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v1 = 1000003;
        int v2_5 = this.b;
        long v5_1 = this.c;
        return (((((((((this.a ^ 1000003) * 1000003) ^ ((int) (v2_5 ^ (v2_5 >> 32)))) * 1000003) ^ ((int) ((v5_1 >> 32) ^ v5_1))) * v1) ^ this.d) * v1) ^ this.e.hashCode());
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("InstallState{installStatus=");
        v0_1.append(this.a);
        v0_1.append(", bytesDownloaded=");
        v0_1.append(this.b);
        v0_1.append(", totalBytesToDownload=");
        v0_1.append(this.c);
        v0_1.append(", installErrorCode=");
        v0_1.append(this.d);
        v0_1.append(", packageName=");
        v0_1.append(this.e);
        v0_1.append("}");
        return v0_1.toString();
    }
}
