package com.google.android.gms.fido.fido2.api.common;
public final class zzq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final long zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    static zzq()
    {
        com.google.android.gms.fido.fido2.api.common.zzq.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzr();
        return;
    }

    public zzq(long p1, byte[] p3, byte[] p4, byte[] p5)
    {
        this.zza = p1;
        this.zzb = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zzc = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        this.zzd = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p5));
        return;
    }

    public final boolean equals(Object p7)
    {
        if ((p7 instanceof com.google.android.gms.fido.fido2.api.common.zzq)) {
            if ((this.zza != ((com.google.android.gms.fido.fido2.api.common.zzq) p7).zza) || ((!java.util.Arrays.equals(this.zzb, ((com.google.android.gms.fido.fido2.api.common.zzq) p7).zzb)) || ((!java.util.Arrays.equals(this.zzc, ((com.google.android.gms.fido.fido2.api.common.zzq) p7).zzc)) || (!java.util.Arrays.equals(this.zzd, ((com.google.android.gms.fido.fido2.api.common.zzq) p7).zzd))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Long.valueOf(this.zza), this.zzb, this.zzc, this.zzd}));
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 2, this.zzb, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 3, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 4, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
