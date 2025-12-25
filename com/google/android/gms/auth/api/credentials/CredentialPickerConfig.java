package com.google.android.gms.auth.api.credentials;
public final class CredentialPickerConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zba;
    private final boolean zbb;
    private final boolean zbc;
    private final int zbd;

    static CredentialPickerConfig()
    {
        com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR = new com.google.android.gms.auth.api.credentials.zbb();
        return;
    }

    public CredentialPickerConfig(int p1, boolean p2, boolean p3, boolean p4, int p5)
    {
        this.zba = p1;
        this.zbb = p2;
        this.zbc = p3;
        if (p1 >= 2) {
            this.zbd = p5;
            return;
        } else {
            int v1_1 = 1;
            if (1 == p4) {
                v1_1 = 3;
            }
            this.zbd = v1_1;
            return;
        }
    }

    public boolean isForNewAccount()
    {
        if (this.zbd != 3) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean shouldShowAddAccountButton()
    {
        return this.zbb;
    }

    public boolean shouldShowCancelButton()
    {
        return this.zbc;
    }

    public void writeToParcel(android.os.Parcel p3, int p4)
    {
        p4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p3);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 1, this.shouldShowAddAccountButton());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 2, this.shouldShowCancelButton());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p3, 3, this.isForNewAccount());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 4, this.zbd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p3, 1000, this.zba);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p3, p4);
        return;
    }
}
