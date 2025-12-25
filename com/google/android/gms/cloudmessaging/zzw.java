package com.google.android.gms.cloudmessaging;
public final class zzw {
    private final android.content.Context zza;
    private int zzb;
    private int zzc;

    public zzw(android.content.Context p2)
    {
        this.zzc = 0;
        this.zza = p2;
        return;
    }

    public final declared_synchronized int zza()
    {
        if (this.zzb == 0) {
            try {
                int v0_3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zza).getPackageInfo("com.google.android.gms", 0);
            } catch (int v0_8) {
                android.util.Log.w("Metadata", "Failed to find package ".concat(v0_8.toString()));
                v0_3 = 0;
            }
            if (v0_3 != 0) {
                this.zzb = v0_3.versionCode;
            }
        }
        return this.zzb;
    }

    public final declared_synchronized int zzb()
    {
        boolean v0_0 = this.zzc;
        if (!v0_0) {
            boolean v0_4 = this.zza;
            int v1_1 = v0_4.getPackageManager();
            if (com.google.android.gms.common.wrappers.Wrappers.packageManager(v0_4).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
                int v2_1 = 1;
                if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                    boolean v0_9 = new android.content.Intent("com.google.iid.TOKEN_REQUEST");
                    v0_9.setPackage("com.google.android.gms");
                    boolean v0_10 = v1_1.queryBroadcastReceivers(v0_9, 0);
                    if ((!v0_10) || (v0_10.isEmpty())) {
                        android.util.Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                        if (1 == com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                            v2_1 = 2;
                        } else {
                        }
                        this.zzc = v2_1;
                        return v2_1;
                    } else {
                        v2_1 = 2;
                    }
                } else {
                    boolean v0_5 = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
                    v0_5.setPackage("com.google.android.gms");
                    boolean v0_6 = v1_1.queryIntentServices(v0_5, 0);
                    if ((!v0_6) || (v0_6.isEmpty())) {
                    } else {
                    }
                }
                this.zzc = v2_1;
                return v2_1;
            } else {
                android.util.Log.e("Metadata", "Google Play services missing or without correct permission.");
                return 0;
            }
        } else {
            return v0_0;
        }
    }
}
