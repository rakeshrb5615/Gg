package com.google.android.gms.auth.api.identity;
public class SaveAccountLinkingTokenResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final android.app.PendingIntent zba;

    static SaveAccountLinkingTokenResult()
    {
        com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult.CREATOR = new com.google.android.gms.auth.api.identity.zbq();
        return;
    }

    public SaveAccountLinkingTokenResult(android.app.PendingIntent p1)
    {
        this.zba = p1;
        return;
    }

    public boolean equals(Object p2)
    {
        if ((p2 instanceof com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult)) {
            return com.google.android.gms.common.internal.Objects.equal(this.zba, ((com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult) p2).zba);
        } else {
            return 0;
        }
    }

    public android.app.PendingIntent getPendingIntent()
    {
        return this.zba;
    }

    public boolean hasResolution()
    {
        if (this.zba == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zba}));
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 1, this.getPendingIntent(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
