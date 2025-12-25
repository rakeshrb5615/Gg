package com.google.android.gms.auth.api.accounttransfer;
public final class zzo extends com.google.android.gms.internal.auth.zzbz {
    public static final android.os.Parcelable$Creator CREATOR;
    private static final java.util.HashMap zzc;
    final java.util.Set zza;
    final int zzb;
    private java.util.ArrayList zzd;
    private int zze;
    private com.google.android.gms.auth.api.accounttransfer.zzs zzf;

    static zzo()
    {
        com.google.android.gms.auth.api.accounttransfer.zzo.CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzp();
        java.util.HashMap v0_3 = new java.util.HashMap();
        com.google.android.gms.auth.api.accounttransfer.zzo.zzc = v0_3;
        v0_3.put("authenticatorData", com.google.android.gms.common.server.response.FastJsonResponse$Field.forConcreteTypeArray("authenticatorData", 2, com.google.android.gms.auth.api.accounttransfer.zzu));
        v0_3.put("progress", com.google.android.gms.common.server.response.FastJsonResponse$Field.forConcreteType("progress", 4, com.google.android.gms.auth.api.accounttransfer.zzs));
        return;
    }

    public zzo()
    {
        this.zza = new java.util.HashSet(1);
        this.zzb = 1;
        return;
    }

    public zzo(java.util.Set p1, int p2, java.util.ArrayList p3, int p4, com.google.android.gms.auth.api.accounttransfer.zzs p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzd = p3;
        this.zze = p4;
        this.zzf = p5;
        return;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, java.util.ArrayList p3)
    {
        String v1_1 = p1.getSafeParcelableFieldId();
        if (v1_1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[] {Integer.valueOf(v1_1), p3.getClass().getCanonicalName()})));
        } else {
            this.zzd = p3;
            this.zza.add(Integer.valueOf(v1_1));
            return;
        }
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, com.google.android.gms.common.server.response.FastJsonResponse p3)
    {
        String v1_1 = p1.getSafeParcelableFieldId();
        if (v1_1 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[] {Integer.valueOf(v1_1), p3.getClass().getCanonicalName()})));
        } else {
            this.zzf = ((com.google.android.gms.auth.api.accounttransfer.zzs) p3);
            this.zza.add(Integer.valueOf(v1_1));
            return;
        }
    }

    public final synthetic java.util.Map getFieldMappings()
    {
        return com.google.android.gms.auth.api.accounttransfer.zzo.zzc;
    }

    public final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse$Field p3)
    {
        IllegalStateException v0_0 = p3.getSafeParcelableFieldId();
        if (v0_0 == 1) {
            return Integer.valueOf(this.zzb);
        } else {
            if (v0_0 == 2) {
                return this.zzd;
            } else {
                if (v0_0 != 4) {
                    throw new IllegalStateException(g2.g.c(p3.getSafeParcelableFieldId(), "Unknown SafeParcelable id="));
                } else {
                    return this.zzf;
                }
            }
        }
    }

    public final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse$Field p2)
    {
        return this.zza.contains(Integer.valueOf(p2.getSafeParcelableFieldId()));
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.auth.api.accounttransfer.zzs v1_0 = this.zza;
        if (v1_0.contains(Integer.valueOf(1))) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 1, this.zzb);
        }
        if (v1_0.contains(Integer.valueOf(2))) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p6, 2, this.zzd, 1);
        }
        if (v1_0.contains(Integer.valueOf(3))) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 3, this.zze);
        }
        if (v1_0.contains(Integer.valueOf(4))) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p6, 4, this.zzf, p7, 1);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, v0);
        return;
    }
}
