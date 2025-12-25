package com.google.android.gms.auth.api.signin.internal;
public class HashAccumulator {
    private int zaa;

    public HashAccumulator()
    {
        this.zaa = 1;
        return;
    }

    public com.google.android.gms.auth.api.signin.internal.HashAccumulator addObject(Object p2)
    {
        int v2_1;
        int v0_1 = (this.zaa * 31);
        if (p2 != 0) {
            v2_1 = p2.hashCode();
        } else {
            v2_1 = 0;
        }
        this.zaa = (v0_1 + v2_1);
        return this;
    }

    public int hash()
    {
        return this.zaa;
    }

    public final com.google.android.gms.auth.api.signin.internal.HashAccumulator zaa(boolean p2)
    {
        this.zaa = ((this.zaa * 31) + p2);
        return this;
    }
}
