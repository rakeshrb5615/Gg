package com.google.android.gms.common.api.internal;
public final class ApiKey {
    private final int zaa;
    private final com.google.android.gms.common.api.Api zab;
    private final com.google.android.gms.common.api.Api$ApiOptions zac;
    private final String zad;

    private ApiKey(com.google.android.gms.common.api.Api p1, com.google.android.gms.common.api.Api$ApiOptions p2, String p3)
    {
        this.zab = p1;
        this.zac = p2;
        this.zad = p3;
        this.zaa = com.google.android.gms.common.internal.Objects.hashCode(new Object[] {p1, p2, p3}));
        return;
    }

    public static com.google.android.gms.common.api.internal.ApiKey getSharedApiKey(com.google.android.gms.common.api.Api p1, com.google.android.gms.common.api.Api$ApiOptions p2, String p3)
    {
        return new com.google.android.gms.common.api.internal.ApiKey(p1, p2, p3);
    }

    public final boolean equals(Object p5)
    {
        if (p5) {
            if (p5 != this) {
                if ((p5 instanceof com.google.android.gms.common.api.internal.ApiKey)) {
                    if ((!com.google.android.gms.common.internal.Objects.equal(this.zab, ((com.google.android.gms.common.api.internal.ApiKey) p5).zab)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zac, ((com.google.android.gms.common.api.internal.ApiKey) p5).zac)) || (!com.google.android.gms.common.internal.Objects.equal(this.zad, ((com.google.android.gms.common.api.internal.ApiKey) p5).zad)))) {
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
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return this.zaa;
    }

    public final String zaa()
    {
        return this.zab.zad();
    }
}
