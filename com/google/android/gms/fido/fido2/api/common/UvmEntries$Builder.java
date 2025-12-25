package com.google.android.gms.fido.fido2.api.common;
public final class UvmEntries$Builder {
    private final java.util.List zza;

    public UvmEntries$Builder()
    {
        this.zza = new java.util.ArrayList();
        return;
    }

    public com.google.android.gms.fido.fido2.api.common.UvmEntries$Builder addAll(java.util.List p3)
    {
        java.util.List v0_4;
        if ((p3.size() + this.zza.size()) > 3) {
            v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        com.google.android.gms.internal.fido.zzap.zzc(v0_4);
        this.zza.addAll(p3);
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.UvmEntries$Builder addUvmEntry(com.google.android.gms.fido.fido2.api.common.UvmEntry p3)
    {
        if (this.zza.size() >= 3) {
            throw new IllegalStateException();
        } else {
            this.zza.add(p3);
            return this;
        }
    }

    public com.google.android.gms.fido.fido2.api.common.UvmEntries build()
    {
        return new com.google.android.gms.fido.fido2.api.common.UvmEntries(this.zza);
    }
}
