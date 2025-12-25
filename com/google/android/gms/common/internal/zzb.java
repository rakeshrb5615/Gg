package com.google.android.gms.common.internal;
final class zzb extends com.google.android.gms.internal.common.zzg {
    final synthetic com.google.android.gms.common.internal.BaseGmsClient zza;

    public zzb(com.google.android.gms.common.internal.BaseGmsClient p1, android.os.Looper p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        super(p2);
        return;
    }

    private static final void zza(android.os.Message p0)
    {
        com.google.android.gms.common.internal.zzc v0_2 = ((com.google.android.gms.common.internal.zzc) p0.obj);
        if (v0_2 != null) {
            v0_2.zze();
        }
        return;
    }

    private static final boolean zzb(android.os.Message p2)
    {
        int v2_1 = p2.what;
        if ((v2_1 != 2) && ((v2_1 != 1) && (v2_1 != 7))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void handleMessage(android.os.Message p9)
    {
        Exception v0_0 = this.zza;
        if (v0_0.zzd.get() == p9.arg1) {
            String v1_11 = p9.what;
            if ((((v1_11 == 1) || ((v1_11 == 7) || ((v1_11 == 4) && (!v0_0.enableLocalFallback())))) || (p9.what == 5)) && (!v0_0.isConnecting())) {
                com.google.android.gms.common.internal.zzb.zza(p9);
                return;
            } else {
                String v1_6 = p9.what;
                android.app.PendingIntent v7_0 = 0;
                if (v1_6 != 4) {
                    if (v1_6 != 5) {
                        if (v1_6 != 3) {
                            if (v1_6 != 6) {
                                if ((v1_6 == 2) && (!v0_0.isConnected())) {
                                    com.google.android.gms.common.internal.zzb.zza(p9);
                                    return;
                                } else {
                                    if (!com.google.android.gms.common.internal.zzb.zzb(p9)) {
                                        String v9_6 = p9.what;
                                        android.util.Log.wtf("GmsClient", v1.a.m(new StringBuilder((String.valueOf(v9_6).length() + 34)), "Don\'t know how to handle message: ", v9_6), new Exception());
                                        return;
                                    } else {
                                        ((com.google.android.gms.common.internal.zzc) p9.obj).zzd();
                                        return;
                                    }
                                }
                            } else {
                                v0_0.zzd(5, 0);
                                if (v0_0.zzk() != null) {
                                    v0_0.zzk().onConnectionSuspended(p9.arg2);
                                }
                                v0_0.onConnectionSuspended(p9.arg2);
                                v0_0.zze(5, 1, 0);
                                return;
                            }
                        } else {
                            String v1_14 = p9.obj;
                            if ((v1_14 instanceof android.app.PendingIntent)) {
                                v7_0 = ((android.app.PendingIntent) v1_14);
                            }
                            String v1_16 = new com.google.android.gms.common.ConnectionResult(p9.arg2, v7_0);
                            v0_0.zzc.onReportServiceBinding(v1_16);
                            v0_0.onConnectionFailed(v1_16);
                            return;
                        }
                    } else {
                        String v9_15;
                        if (v0_0.zzm() == null) {
                            v9_15 = new com.google.android.gms.common.ConnectionResult(8);
                        } else {
                            v9_15 = v0_0.zzm();
                        }
                        v0_0.zzc.onReportServiceBinding(v9_15);
                        v0_0.onConnectionFailed(v9_15);
                        return;
                    }
                } else {
                    v0_0.zzn(new com.google.android.gms.common.ConnectionResult(p9.arg2));
                    if ((v0_0.zzg()) && (!v0_0.zzo())) {
                        v0_0.zzd(3, 0);
                        return;
                    } else {
                        String v9_5;
                        if (v0_0.zzm() == null) {
                            v9_5 = new com.google.android.gms.common.ConnectionResult(8);
                        } else {
                            v9_5 = v0_0.zzm();
                        }
                        v0_0.zzc.onReportServiceBinding(v9_5);
                        v0_0.onConnectionFailed(v9_5);
                        return;
                    }
                }
            }
        } else {
            if (com.google.android.gms.common.internal.zzb.zzb(p9)) {
                com.google.android.gms.common.internal.zzb.zza(p9);
            }
            return;
        }
    }
}
