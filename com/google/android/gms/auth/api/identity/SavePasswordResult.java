package com.google.android.gms.auth.api.identity;
public class SavePasswordResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final android.app.PendingIntent zba;

    static SavePasswordResult()
    {
        com.google.android.gms.auth.api.identity.SavePasswordResult.CREATOR = new com.google.android.gms.auth.api.identity.zbs();
        return;
    }

    public SavePasswordResult(android.app.PendingIntent p1)
    {
        this.zba = ((android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return;
    }

    public boolean equals(Object p2)
    {
        if ((p2 instanceof com.google.android.gms.auth.api.identity.SavePasswordResult)) {
            return com.google.android.gms.common.internal.Objects.equal(this.zba, ((com.google.android.gms.auth.api.identity.SavePasswordResult) p2).zba);
        } else {
            return 0;
        }
    }

    public android.app.PendingIntent getPendingIntent()
    {
        return this.zba;
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
