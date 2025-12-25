package com.google.android.gms.common.internal;
final class zzp implements android.os.Handler$Callback {
    final synthetic com.google.android.gms.common.internal.zzq zza;

    public synthetic zzp(com.google.android.gms.common.internal.zzq p1, byte[] p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final boolean handleMessage(android.os.Message p9)
    {
        java.util.HashMap v0_0 = p9.what;
        if (v0_0 == null) {
            java.util.HashMap v0_6 = this.zza;
            v0_6.zzf();
            String v9_8 = ((com.google.android.gms.common.internal.zzn) p9.obj);
            com.google.android.gms.common.internal.zzo v3_2 = ((com.google.android.gms.common.internal.zzo) v0_6.zzf().get(v9_8));
            if ((v3_2 != null) && (v3_2.zzg())) {
                if (v3_2.zzd()) {
                    v3_2.zza("GmsClientSupervisor");
                }
                v0_6.zzf().remove(v9_8);
            }
            return 1;
        } else {
            if (v0_0 == 1) {
                java.util.HashMap v0_2 = this.zza;
                v0_2.zzf();
                String v9_3 = ((com.google.android.gms.common.internal.zzn) p9.obj);
                java.util.HashMap v0_5 = ((com.google.android.gms.common.internal.zzo) v0_2.zzf().get(v9_3));
                if ((v0_5 != null) && (v0_5.zze() == 3)) {
                    Exception v5_1 = String.valueOf(v9_3);
                    StringBuilder v7_1 = new StringBuilder((v5_1.length() + 47));
                    v7_1.append("Timeout waiting for ServiceConnection callback ");
                    v7_1.append(v5_1);
                    android.util.Log.e("GmsClientSupervisor", v7_1.toString(), new Exception());
                    android.content.ComponentName v1_2 = v0_5.zzi();
                    if (v1_2 == null) {
                        v1_2 = v9_3.zzc();
                    }
                    if (v1_2 == null) {
                        String v9_4 = v9_3.zzb();
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(v9_4);
                        v1_2 = new android.content.ComponentName(v9_4, "unknown");
                    }
                    v0_5.onServiceDisconnected(v1_2);
                }
                return 1;
            } else {
                return 0;
            }
        }
    }
}
