package com.google.android.gms.auth.api;
public class Auth$AuthCredentialsOptions implements com.google.android.gms.common.api.Api$ApiOptions$Optional {
    public static final com.google.android.gms.auth.api.Auth$AuthCredentialsOptions zba;
    private final String zbb;
    private final boolean zbc;
    private final String zbd;

    static Auth$AuthCredentialsOptions()
    {
        com.google.android.gms.auth.api.Auth$AuthCredentialsOptions.zba = new com.google.android.gms.auth.api.Auth$AuthCredentialsOptions(new com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder());
        return;
    }

    public Auth$AuthCredentialsOptions(com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder p2)
    {
        this.zbb = 0;
        this.zbc = p2.zba.booleanValue();
        this.zbd = p2.zbb;
        return;
    }

    public static bridge synthetic String zbb(com.google.android.gms.auth.api.Auth$AuthCredentialsOptions p0)
    {
        return 0;
    }

    public static bridge synthetic String zbc(com.google.android.gms.auth.api.Auth$AuthCredentialsOptions p0)
    {
        return p0.zbd;
    }

    public static bridge synthetic boolean zbe(com.google.android.gms.auth.api.Auth$AuthCredentialsOptions p0)
    {
        return p0.zbc;
    }

    public boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof com.google.android.gms.auth.api.Auth$AuthCredentialsOptions)) {
                if ((!com.google.android.gms.common.internal.Objects.equal(0, 0)) || ((this.zbc != ((com.google.android.gms.auth.api.Auth$AuthCredentialsOptions) p5).zbc) || (!com.google.android.gms.common.internal.Objects.equal(this.zbd, ((com.google.android.gms.auth.api.Auth$AuthCredentialsOptions) p5).zbd)))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {0, Boolean.valueOf(this.zbc), this.zbd}));
    }

    public final android.os.Bundle zba()
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        v0_1.putString("consumer_package", 0);
        v0_1.putBoolean("force_save_dialog", this.zbc);
        v0_1.putString("log_session_id", this.zbd);
        return v0_1;
    }

    public final String zbd()
    {
        return this.zbd;
    }
}
