package com.google.android.gms.fido.fido2.api.common;
public final class zzai extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final byte[][] zza;

    static zzai()
    {
        com.google.android.gms.fido.fido2.api.common.zzai.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaj();
        return;
    }

    public zzai(byte[][] p6)
    {
        int v2_2;
        if (p6 == null) {
            v2_2 = 0;
        } else {
            v2_2 = 1;
        }
        int v2_0;
        com.google.android.gms.common.internal.Preconditions.checkArgument(v2_2);
        if (1 == ((p6.length & 1) ^ int v1)) {
            v2_0 = 1;
        } else {
            v2_0 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v2_0);
        int v2_1 = 0;
        while (v2_1 < p6.length) {
            if ((v2_1 != 0) && (p6[v2_1] == null)) {
                int v3_2 = 0;
            } else {
                v3_2 = 1;
            }
            int v4_1;
            com.google.android.gms.common.internal.Preconditions.checkArgument(v3_2);
            int v3_3 = (v2_1 + 1);
            if (p6[v3_3] == null) {
                v4_1 = 0;
            } else {
                v4_1 = 1;
            }
            int v3_6;
            com.google.android.gms.common.internal.Preconditions.checkArgument(v4_1);
            int v3_5 = p6[v3_3].length;
            if ((v3_5 != 32) && (v3_5 != 64)) {
                v3_6 = 0;
            } else {
                v3_6 = 1;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(v3_6);
            v2_1 += 2;
        }
        this.zza = p6;
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((p2 instanceof com.google.android.gms.fido.fido2.api.common.zzai)) {
            return java.util.Arrays.deepEquals(this.zza, ((com.google.android.gms.fido.fido2.api.common.zzai) p2).zza);
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        byte[][] v0 = this.zza;
        int v1 = v0.length;
        int v2 = 0;
        int v3 = 0;
        while (v2 < v1) {
            v3 ^= com.google.android.gms.common.internal.Objects.hashCode(new Object[] {v0[v2]}));
            v2++;
        }
        return v3;
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArrayArray(p4, 1, this.zza, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
