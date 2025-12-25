package com.google.android.gms.signin;
public final class SignInOptions implements com.google.android.gms.common.api.Api$ApiOptions$Optional {
    public static final com.google.android.gms.signin.SignInOptions zaa;
    private final boolean zab;
    private final boolean zac;
    private final String zad;
    private final boolean zae;
    private final String zaf;
    private final String zag;
    private final boolean zah;
    private final Long zai;
    private final Long zaj;

    static SignInOptions()
    {
        com.google.android.gms.signin.SignInOptions.zaa = new com.google.android.gms.signin.SignInOptions(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        return;
    }

    public synthetic SignInOptions(boolean p1, boolean p2, String p3, boolean p4, String p5, String p6, boolean p7, Long p8, Long p9, com.google.android.gms.signin.zaf p10)
    {
        this.zab = 0;
        this.zac = 0;
        this.zad = 0;
        this.zae = 0;
        this.zah = 0;
        this.zaf = 0;
        this.zag = 0;
        this.zai = 0;
        this.zaj = 0;
        return;
    }

    public final boolean equals(Object p4)
    {
        if (p4 != this) {
            if ((p4 instanceof com.google.android.gms.signin.SignInOptions)) {
                if ((!com.google.android.gms.common.internal.Objects.equal(0, 0)) || ((!com.google.android.gms.common.internal.Objects.equal(0, 0)) || ((!com.google.android.gms.common.internal.Objects.equal(0, 0)) || ((!com.google.android.gms.common.internal.Objects.equal(0, 0)) || (!com.google.android.gms.common.internal.Objects.equal(0, 0)))))) {
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

    public final int hashCode()
    {
        int v0_0 = Boolean.FALSE;
        int v5 = 0;
        Boolean v1 = v0_0;
        Boolean v4 = v0_0;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {v0_0, 0}));
    }
}
