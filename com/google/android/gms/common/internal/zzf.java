package com.google.android.gms.common.internal;
public final class zzf extends com.google.android.gms.common.internal.zza {
    public final android.os.IBinder zze;
    final synthetic com.google.android.gms.common.internal.BaseGmsClient zzf;

    public zzf(com.google.android.gms.common.internal.BaseGmsClient p1, int p2, android.os.IBinder p3, android.os.Bundle p4)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzf = p1;
        super(p1, p2, p4);
        super.zze = p3;
        return;
    }

    public final boolean zza()
    {
        try {
            int v2_1 = this.zze;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_1);
            int v2_6 = ((android.os.IBinder) v2_1).getInterfaceDescriptor();
            String v3_2 = this.zzf;
        } catch (android.os.RemoteException) {
            android.util.Log.w("GmsClient", "service probably died");
            return 0;
        }
        if (v3_2.getServiceDescriptor().equals(v2_6)) {
            int v0_2 = v3_2.createServiceInterface(this.zze);
            if ((v0_2 == 0) || ((!v3_2.zze(2, 4, v0_2)) && (!v3_2.zze(3, 4, v0_2)))) {
                return 0;
            } else {
                v3_2.zzn(0);
                int v0_5 = v3_2.zzk();
                android.os.Bundle v1_1 = v3_2.getConnectionHint();
                if (v0_5 != 0) {
                    v3_2.zzk().onConnected(v1_1);
                }
                return 1;
            }
        } else {
            String v3_0 = v3_2.getServiceDescriptor();
            StringBuilder v6_1 = new StringBuilder(((String.valueOf(v3_0).length() + 34) + String.valueOf(v2_6).length()));
            v6_1.append("service descriptor mismatch: ");
            v6_1.append(v3_0);
            v6_1.append(" vs. ");
            v6_1.append(v2_6);
            android.util.Log.w("GmsClient", v6_1.toString());
            return 0;
        }
    }

    public final void zzb(com.google.android.gms.common.ConnectionResult p3)
    {
        com.google.android.gms.common.internal.BaseGmsClient v0 = this.zzf;
        if (v0.zzl() != null) {
            v0.zzl().onConnectionFailed(p3);
        }
        v0.onConnectionFailed(p3);
        return;
    }
}
