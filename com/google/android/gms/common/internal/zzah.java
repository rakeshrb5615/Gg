package com.google.android.gms.common.internal;
public final class zzah {
    private static final android.net.Uri zza;

    static zzah()
    {
        com.google.android.gms.common.internal.zzah.zza = new android.net.Uri$Builder().scheme("content").authority("com.google.android.gms.chimera").build();
        return;
    }

    public static android.content.Intent zza(android.content.Context p5, com.google.android.gms.common.internal.zzn p6)
    {
        int v1_0 = p6.zza();
        if (v1_0 != 0) {
            android.content.Intent v3 = 0;
            if (p6.zzd()) {
                StringBuilder v2_8 = new android.os.Bundle();
                v2_8.putString("serviceActionBundleKey", v1_0);
                String v5_2 = p5.getContentResolver().acquireUnstableContentProviderClient(com.google.android.gms.common.internal.zzah.zza);
                if (v5_2 == null) {
                    throw new android.os.RemoteException("Failed to acquire ContentProviderClient");
                } else {
                    StringBuilder v2_1 = v5_2.call("serviceIntentCall", 0, v2_8);
                    v5_2.release();
                    if (v2_1 != null) {
                        String v5_10 = ((android.content.Intent) v2_1.getParcelable("serviceResponseIntentKey"));
                        if (v5_10 == null) {
                            String v5_13 = ((android.app.PendingIntent) v2_1.getParcelable("serviceMissingResolutionIntentKey"));
                            if (v5_13 != null) {
                                StringBuilder v2_6 = new StringBuilder((v1_0.length() + 72));
                                v2_6.append("Dynamic lookup for intent failed for action ");
                                v2_6.append(v1_0);
                                v2_6.append(" but has possible resolution");
                                android.util.Log.w("ServiceBindIntentUtils", v2_6.toString());
                                throw new com.google.android.gms.common.internal.zzaf(new com.google.android.gms.common.ConnectionResult(25, v5_13));
                            }
                        } else {
                            v3 = v5_10;
                        }
                    }
                    if (v3 == null) {
                        android.util.Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(v1_0));
                    }
                }
            }
            if (v3 != null) {
                return v3;
            } else {
                return new android.content.Intent(v1_0).setPackage(p6.zzb());
            }
        } else {
            return new android.content.Intent().setComponent(p6.zzc());
        }
    }
}
