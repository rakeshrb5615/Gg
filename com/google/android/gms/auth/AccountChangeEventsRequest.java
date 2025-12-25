package com.google.android.gms.auth;
public class AccountChangeEventsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    final int zza;
    int zzb;
    String zzc;
    android.accounts.Account zzd;

    static AccountChangeEventsRequest()
    {
        com.google.android.gms.auth.AccountChangeEventsRequest.CREATOR = new com.google.android.gms.auth.zzb();
        return;
    }

    public AccountChangeEventsRequest()
    {
        this.zza = 1;
        return;
    }

    public AccountChangeEventsRequest(int p1, int p2, String p3, android.accounts.Account p4)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        if ((p4 != null) || (android.text.TextUtils.isEmpty(p3))) {
            this.zzd = p4;
            return;
        } else {
            this.zzd = new android.accounts.Account(p3, "com.google");
            return;
        }
    }

    public android.accounts.Account getAccount()
    {
        return this.zzd;
    }

    public String getAccountName()
    {
        return this.zzc;
    }

    public int getEventIndex()
    {
        return this.zzb;
    }

    public com.google.android.gms.auth.AccountChangeEventsRequest setAccount(android.accounts.Account p1)
    {
        this.zzd = p1;
        return this;
    }

    public com.google.android.gms.auth.AccountChangeEventsRequest setAccountName(String p1)
    {
        this.zzc = p1;
        return this;
    }

    public com.google.android.gms.auth.AccountChangeEventsRequest setEventIndex(int p1)
    {
        this.zzb = p1;
        return this;
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.zzc, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.zzd, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
