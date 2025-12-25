package com.google.android.gms.common.wrappers;
public class PackageManagerWrapper {
    protected final android.content.Context zza;

    public PackageManagerWrapper(android.content.Context p1)
    {
        this.zza = p1;
        return;
    }

    public int checkCallingOrSelfPermission(String p2)
    {
        return this.zza.checkCallingOrSelfPermission(p2);
    }

    public int checkPermission(String p2, String p3)
    {
        return this.zza.getPackageManager().checkPermission(p2, p3);
    }

    public android.content.pm.ApplicationInfo getApplicationInfo(String p2, int p3)
    {
        return this.zza.getPackageManager().getApplicationInfo(p2, p3);
    }

    public CharSequence getApplicationLabel(String p4)
    {
        android.content.pm.PackageManager v0_0 = this.zza;
        return v0_0.getPackageManager().getApplicationLabel(v0_0.getPackageManager().getApplicationInfo(p4, 0));
    }

    public p0.b getApplicationLabelAndIcon(String p4)
    {
        p0.b v0_0 = this.zza;
        android.graphics.drawable.Drawable v4_2 = v0_0.getPackageManager().getApplicationInfo(p4, 0);
        return new p0.b(v0_0.getPackageManager().getApplicationLabel(v4_2), v0_0.getPackageManager().getApplicationIcon(v4_2));
    }

    public android.content.pm.PackageInfo getPackageInfo(String p2, int p3)
    {
        return this.zza.getPackageManager().getPackageInfo(p2, p3);
    }

    public String[] getPackagesForUid(int p2)
    {
        return this.zza.getPackageManager().getPackagesForUid(p2);
    }

    public boolean isCallerInstantApp()
    {
        if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                boolean v0_7 = this.zza;
                String v1_1 = v0_7.getPackageManager().getNameForUid(android.os.Binder.getCallingUid());
                if (v1_1 != null) {
                    return v0_7.getPackageManager().isInstantApp(v1_1);
                }
            }
            return 0;
        } else {
            return com.google.android.gms.common.wrappers.InstantApps.isInstantApp(this.zza);
        }
    }

    public final boolean zza(int p3, String p4)
    {
        try {
            android.app.AppOpsManager v0_2 = ((android.app.AppOpsManager) this.zza.getSystemService("appops"));
        } catch (SecurityException) {
            return 0;
        }
        if (v0_2 == null) {
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } else {
            v0_2.checkPackage(p3, p4);
            return 1;
        }
    }
}
