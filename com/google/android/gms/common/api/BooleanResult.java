package com.google.android.gms.common.api;
public class BooleanResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zaa;
    private final boolean zab;

    public BooleanResult(com.google.android.gms.common.api.Status p2, boolean p3)
    {
        this.zaa = ((com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Status must not be null"));
        this.zab = p3;
        return;
    }

    public final boolean equals(Object p5)
    {
        if (p5) {
            if (p5 != this) {
                if ((p5 instanceof com.google.android.gms.common.api.BooleanResult)) {
                    if ((!this.zaa.equals(((com.google.android.gms.common.api.BooleanResult) p5).zaa)) || (this.zab != ((com.google.android.gms.common.api.BooleanResult) p5).zab)) {
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

    public com.google.android.gms.common.api.Status getStatus()
    {
        return this.zaa;
    }

    public boolean getValue()
    {
        return this.zab;
    }

    public final int hashCode()
    {
        return (((this.zaa.hashCode() + 527) * 31) + this.zab);
    }
}
