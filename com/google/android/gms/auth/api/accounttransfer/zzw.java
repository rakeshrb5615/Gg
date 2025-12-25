package com.google.android.gms.auth.api.accounttransfer;
public final class zzw extends com.google.android.gms.internal.auth.zzbz {
    public static final android.os.Parcelable$Creator CREATOR;
    private static final java.util.HashMap zzc;
    final java.util.Set zza;
    final int zzb;
    private String zzd;
    private int zze;
    private byte[] zzf;
    private android.app.PendingIntent zzg;
    private com.google.android.gms.auth.api.accounttransfer.DeviceMetaData zzh;

    static zzw()
    {
        com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzx();
        java.util.HashMap v0_3 = new java.util.HashMap();
        com.google.android.gms.auth.api.accounttransfer.zzw.zzc = v0_3;
        v0_3.put("accountType", com.google.android.gms.common.server.response.FastJsonResponse$Field.forString("accountType", 2));
        v0_3.put("status", com.google.android.gms.common.server.response.FastJsonResponse$Field.forInteger("status", 3));
        v0_3.put("transferBytes", com.google.android.gms.common.server.response.FastJsonResponse$Field.forBase64("transferBytes", 4));
        return;
    }

    public zzw()
    {
        this.zza = new r.f(3);
        this.zzb = 1;
        return;
    }

    public zzw(java.util.Set p1, int p2, String p3, int p4, byte[] p5, android.app.PendingIntent p6, com.google.android.gms.auth.api.accounttransfer.DeviceMetaData p7)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzd = p3;
        this.zze = p4;
        this.zzf = p5;
        this.zzg = p6;
        this.zzh = p7;
        return;
    }

    public final synthetic java.util.Map getFieldMappings()
    {
        return com.google.android.gms.auth.api.accounttransfer.zzw.zzc;
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
                if (v0_0 == 3) {
                    return Integer.valueOf(this.zze);
                } else {
                    if (v0_0 != 4) {
                        throw new IllegalStateException(g2.g.c(p3.getSafeParcelableFieldId(), "Unknown SafeParcelable id="));
                    } else {
                        return this.zzf;
                    }
                }
            }
        }
    }

    public final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse$Field p2)
    {
        return this.zza.contains(Integer.valueOf(p2.getSafeParcelableFieldId()));
    }

    public final void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, String p3, byte[] p4)
    {
        String v2_1 = p2.getSafeParcelableFieldId();
        if (v2_1 != 4) {
            throw new IllegalArgumentException(v1.a.j("Field with id=", v2_1, " is not known to be an byte array."));
        } else {
            this.zzf = p4;
            this.zza.add(Integer.valueOf(v2_1));
            return;
        }
    }

    public final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p2, String p3, int p4)
    {
        String v2_1 = p2.getSafeParcelableFieldId();
        if (v2_1 != 3) {
            throw new IllegalArgumentException(v1.a.j("Field with id=", v2_1, " is not known to be an int."));
        } else {
            this.zze = p4;
            this.zza.add(Integer.valueOf(v2_1));
            return;
        }
    }

    public final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field p1, String p2, String p3)
    {
        String v1_1 = p1.getSafeParcelableFieldId();
        if (v1_1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[] {Integer.valueOf(v1_1)})));
        } else {
            this.zzd = p3;
            this.zza.add(Integer.valueOf(v1_1));
            return;
        }
    }

    public final void writeToParcel(android.os.Parcel p6, int p7)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p6);
        com.google.android.gms.auth.api.accounttransfer.DeviceMetaData v1_0 = this.zza;
        if (v1_0.contains(Integer.valueOf(1))) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 1, this.zzb);
        }
        if (v1_0.contains(Integer.valueOf(2))) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p6, 2, this.zzd, 1);
        }
        if (v1_0.contains(Integer.valueOf(3))) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p6, 3, this.zze);
        }
        if (v1_0.contains(Integer.valueOf(4))) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p6, 4, this.zzf, 1);
        }
        if (v1_0.contains(Integer.valueOf(5))) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p6, 5, this.zzg, p7, 1);
        }
        if (v1_0.contains(Integer.valueOf(6))) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p6, 6, this.zzh, p7, 1);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p6, v0);
        return;
    }
}
