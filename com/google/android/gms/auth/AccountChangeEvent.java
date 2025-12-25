package com.google.android.gms.auth;
public class AccountChangeEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    final long zzb;
    final String zzc;
    final int zzd;
    final int zze;
    final String zzf;

    static AccountChangeEvent()
    {
        com.google.android.gms.auth.AccountChangeEvent.CREATOR = new com.google.android.gms.auth.zza();
        return;
    }

    public AccountChangeEvent(int p1, long p2, String p4, int p5, int p6, String p7)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        this.zzd = p5;
        this.zze = p6;
        this.zzf = p7;
        return;
    }

    public AccountChangeEvent(long p2, String p4, int p5, int p6, String p7)
    {
        this.zza = 1;
        this.zzb = p2;
        this.zzc = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        this.zzd = p5;
        this.zze = p6;
        this.zzf = p7;
        return;
    }

    public boolean equals(Object p7)
    {
        if ((p7 instanceof com.google.android.gms.auth.AccountChangeEvent)) {
            if (p7 != this) {
                if ((this.zza != ((com.google.android.gms.auth.AccountChangeEvent) p7).zza) || ((this.zzb != ((com.google.android.gms.auth.AccountChangeEvent) p7).zzb) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.auth.AccountChangeEvent) p7).zzc)) || ((this.zzd != ((com.google.android.gms.auth.AccountChangeEvent) p7).zzd) || ((this.zze != ((com.google.android.gms.auth.AccountChangeEvent) p7).zze) || (!com.google.android.gms.common.internal.Objects.equal(this.zzf, ((com.google.android.gms.auth.AccountChangeEvent) p7).zzf))))))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public String getAccountName()
    {
        return this.zzc;
    }

    public String getChangeData()
    {
        return this.zzf;
    }

    public int getChangeType()
    {
        return this.zzd;
    }

    public int getEventIndex()
    {
        return this.zze;
    }

    public int hashCode()
    {
        Integer v1 = Integer.valueOf(this.zza);
        Long.valueOf(this.zzb);
        String v3 = this.zzc;
        Integer.valueOf(this.zzd);
        Integer.valueOf(this.zze);
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {v1, this.zzf}));
    }

    public String toString()
    {
        String v0_1;
        String v0_0 = this.zzd;
        if (v0_0 == 1) {
            v0_1 = "ADDED";
        } else {
            if (v0_0 == 2) {
                v0_1 = "REMOVED";
            } else {
                if (v0_0 == 3) {
                    v0_1 = "RENAMED_FROM";
                } else {
                    if (v0_0 == 4) {
                        v0_1 = "RENAMED_TO";
                    } else {
                        v0_1 = "UNKNOWN";
                    }
                }
            }
        }
        String v2 = this.zzf;
        int v3 = this.zze;
        String v0_2 = v1.a.r("AccountChangeEvent {accountName = ", this.zzc, ", changeType = ", v0_1, ", changeData = ");
        v0_2.append(v2);
        v0_2.append(", eventIndex = ");
        v0_2.append(v3);
        v0_2.append("}");
        return v0_2.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p4, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 6, this.zzf, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
