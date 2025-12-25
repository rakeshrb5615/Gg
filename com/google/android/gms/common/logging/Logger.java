package com.google.android.gms.common.logging;
public class Logger {
    private final String zza;
    private final String zzb;
    private final com.google.android.gms.common.internal.GmsLogger zzc;
    private final int zzd;

    public varargs Logger(String p7, String[] p8)
    {
        boolean v8_1;
        int v0 = p8.length;
        if (v0 != 0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append(91);
            int v2_0 = 0;
            while (v2_0 < v0) {
                int v3 = p8[v2_0];
                if (v1_1.length() > 1) {
                    v1_1.append(",");
                }
                v1_1.append(v3);
                v2_0++;
            }
            v1_1.append("] ");
            v8_1 = v1_1.toString();
        } else {
            v8_1 = "";
        }
        this.zzb = v8_1;
        this.zza = p7;
        this.zzc = new com.google.android.gms.common.internal.GmsLogger(p7);
        int v7_1 = 2;
        while ((v7_1 <= 7) && (!android.util.Log.isLoggable(this.zza, v7_1))) {
            v7_1++;
        }
        this.zzd = v7_1;
        return;
    }

    public varargs void d(String p2, Object[] p3)
    {
        if (this.isLoggable(3)) {
            android.util.Log.d(this.zza, this.format(p2, p3));
        }
        return;
    }

    public varargs void e(String p2, Throwable p3, Object[] p4)
    {
        android.util.Log.e(this.zza, this.format(p2, p4), p3);
        return;
    }

    public varargs void e(String p2, Object[] p3)
    {
        android.util.Log.e(this.zza, this.format(p2, p3));
        return;
    }

    public varargs String format(String p2, Object[] p3)
    {
        if ((p3 != null) && (p3.length > 0)) {
            p2 = String.format(java.util.Locale.US, p2, p3);
        }
        return this.zzb.concat(p2);
    }

    public String getTag()
    {
        return this.zza;
    }

    public varargs void i(String p2, Object[] p3)
    {
        android.util.Log.i(this.zza, this.format(p2, p3));
        return;
    }

    public boolean isLoggable(int p2)
    {
        if (this.zzd > p2) {
            return 0;
        } else {
            return 1;
        }
    }

    public varargs void v(String p2, Throwable p3, Object[] p4)
    {
        if (this.isLoggable(2)) {
            android.util.Log.v(this.zza, this.format(p2, p4), p3);
        }
        return;
    }

    public varargs void v(String p2, Object[] p3)
    {
        if (this.isLoggable(2)) {
            android.util.Log.v(this.zza, this.format(p2, p3));
        }
        return;
    }

    public varargs void w(String p2, Object[] p3)
    {
        android.util.Log.w(this.zza, this.format(p2, p3));
        return;
    }

    public varargs void wtf(String p2, Throwable p3, Object[] p4)
    {
        android.util.Log.wtf(this.zza, this.format(p2, p4), p3);
        return;
    }

    public void wtf(Throwable p2)
    {
        android.util.Log.wtf(this.zza, p2);
        return;
    }
}
