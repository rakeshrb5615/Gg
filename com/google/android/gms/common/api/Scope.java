package com.google.android.gms.common.api;
public final class Scope extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    private final String zzb;

    static Scope()
    {
        com.google.android.gms.common.api.Scope.CREATOR = new com.google.android.gms.common.api.zzd();
        return;
    }

    public Scope(int p2, String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3, "scopeUri must not be null or empty");
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public Scope(String p2)
    {
        this(1, p2);
        return;
    }

    public boolean equals(Object p2)
    {
        if (this != p2) {
            if ((p2 instanceof com.google.android.gms.common.api.Scope)) {
                return this.zzb.equals(((com.google.android.gms.common.api.Scope) p2).zzb);
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public String getScopeUri()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        return this.zzb.hashCode();
    }

    public String toString()
    {
        return this.zzb;
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        String v5_0 = this.zza;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, v5_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.getScopeUri(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, v0);
        return;
    }
}
