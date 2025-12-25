package com.google.android.gms.common.internal;
public final class GmsLogger {
    private final String zza;
    private final String zzb;

    public GmsLogger(String p2)
    {
        this(p2, 0);
        return;
    }

    public GmsLogger(String p4, String p5)
    {
        int v0_1;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "log tag cannot be null");
        int v0_3 = p4.length();
        Object[] v2_0 = Integer.valueOf(23);
        if (v0_3 > 23) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_1, "tag \"%s\" is longer than the %d character maximum", new Object[] {p4, v2_0}));
        this.zza = p4;
        if ((p5 == 0) || (p5.length() <= 0)) {
            p5 = 0;
        }
        this.zzb = p5;
        return;
    }

    private final String zza(String p2)
    {
        String v0 = this.zzb;
        if (v0 != null) {
            return v0.concat(p2);
        } else {
            return p2;
        }
    }

    private final varargs String zzb(String p2, Object[] p3)
    {
        String v0 = this.zzb;
        String v2_1 = String.format(p2, p3);
        if (v0 != null) {
            return v0.concat(v2_1);
        } else {
            return v2_1;
        }
    }

    public boolean canLog(int p2)
    {
        return android.util.Log.isLoggable(this.zza, p2);
    }

    public boolean canLogPii()
    {
        return 0;
    }

    public void d(String p2, String p3)
    {
        if (this.canLog(3)) {
            android.util.Log.d(p2, this.zza(p3));
        }
        return;
    }

    public void d(String p2, String p3, Throwable p4)
    {
        if (this.canLog(3)) {
            android.util.Log.d(p2, this.zza(p3), p4);
        }
        return;
    }

    public void e(String p2, String p3)
    {
        if (this.canLog(6)) {
            android.util.Log.e(p2, this.zza(p3));
        }
        return;
    }

    public void e(String p2, String p3, Throwable p4)
    {
        if (this.canLog(6)) {
            android.util.Log.e(p2, this.zza(p3), p4);
        }
        return;
    }

    public varargs void efmt(String p2, String p3, Object[] p4)
    {
        if (this.canLog(6)) {
            android.util.Log.e(p2, this.zzb(p3, p4));
        }
        return;
    }

    public void i(String p2, String p3)
    {
        if (this.canLog(4)) {
            android.util.Log.i(p2, this.zza(p3));
        }
        return;
    }

    public void i(String p2, String p3, Throwable p4)
    {
        if (this.canLog(4)) {
            android.util.Log.i(p2, this.zza(p3), p4);
        }
        return;
    }

    public void pii(String p1, String p2)
    {
        return;
    }

    public void pii(String p1, String p2, Throwable p3)
    {
        return;
    }

    public void v(String p2, String p3)
    {
        if (this.canLog(2)) {
            android.util.Log.v(p2, this.zza(p3));
        }
        return;
    }

    public void v(String p2, String p3, Throwable p4)
    {
        if (this.canLog(2)) {
            android.util.Log.v(p2, this.zza(p3), p4);
        }
        return;
    }

    public void w(String p2, String p3)
    {
        if (this.canLog(5)) {
            android.util.Log.w(p2, this.zza(p3));
        }
        return;
    }

    public void w(String p2, String p3, Throwable p4)
    {
        if (this.canLog(5)) {
            android.util.Log.w(p2, this.zza(p3), p4);
        }
        return;
    }

    public varargs void wfmt(String p1, String p2, Object[] p3)
    {
        if (this.canLog(5)) {
            android.util.Log.w(this.zza, this.zzb(p2, p3));
        }
        return;
    }

    public void wtf(String p2, String p3, Throwable p4)
    {
        if (this.canLog(7)) {
            android.util.Log.e(p2, this.zza(p3), p4);
            android.util.Log.wtf(p2, this.zza(p3), p4);
        }
        return;
    }
}
