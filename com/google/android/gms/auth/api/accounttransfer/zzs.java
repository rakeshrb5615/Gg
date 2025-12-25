package com.google.android.gms.auth.api.accounttransfer;
public final class zzs extends com.google.android.gms.internal.auth.zzbz {
    public static final android.os.Parcelable$Creator CREATOR;
    private static final r.e zzb;
    final int zza;
    private java.util.List zzc;
    private java.util.List zzd;
    private java.util.List zze;
    private java.util.List zzf;
    private java.util.List zzg;

    static zzs()
    {
        com.google.android.gms.auth.api.accounttransfer.zzs.CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzt();
        r.e v0_3 = new r.e(0);
        com.google.android.gms.auth.api.accounttransfer.zzs.zzb = v0_3;
        v0_3.put("registered", com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings("registered", 2));
        v0_3.put("in_progress", com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings("in_progress", 3));
        v0_3.put("success", com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings("success", 4));
        v0_3.put("failed", com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings("failed", 5));
        v0_3.put("escrowed", com.google.android.gms.common.server.response.FastJsonResponse$Field.forStrings("escrowed", 6));
        return;
    }

    public zzs()
    {
        this.zza = 1;
        return;
    }

    public zzs(int p1, java.util.List p2, java.util.List p3, java.util.List p4, java.util.List p5, java.util.List p6)
    {
        this.zza = p1;
        this.zzc = p2;
        this.zzd = p3;
        this.zze = p4;
        this.zzf = p5;
        this.zzg = p6;
        return;
    }

    public final java.util.Map getFieldMappings()
    {
        return com.google.android.gms.auth.api.accounttransfer.zzs.zzb;
    }

    public final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse$Field p3)
    {
        switch (p3.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zza);
            case 2:
                return this.zzc;
            case 3:
                return this.zzd;
            case 4:
                return this.zze;
            case 5:
                return this.zzf;
            case 6:
                return this.zzg;
            default:
                throw new IllegalStateException(g2.g.c(p3.getSafeParcelableFieldId(), "Unknown SafeParcelable id="));
        }
    }

    public final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse$Field p1)
    {
        return 1;
    }

    public final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.ArrayList p3)
    {
        String v1_1 = p1.getSafeParcelableFieldId();
        if (v1_1 == 2) {
            this.zzc = p3;
            return;
        } else {
            if (v1_1 == 3) {
                this.zzd = p3;
                return;
            } else {
                if (v1_1 == 4) {
                    this.zze = p3;
                    return;
                } else {
                    if (v1_1 == 5) {
                        this.zzf = p3;
                        return;
                    } else {
                        if (v1_1 != 6) {
                            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[] {Integer.valueOf(v1_1)})));
                        } else {
                            this.zzg = p3;
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p4, 2, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p4, 3, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p4, 4, this.zze, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p4, 5, this.zzf, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(p4, 6, this.zzg, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
