package com.google.android.gms.common;
public class AccountPicker$AccountChooserOptions$Builder {
    private android.accounts.Account zza;
    private java.util.ArrayList zzb;
    private java.util.ArrayList zzc;
    private boolean zzd;
    private String zze;
    private android.os.Bundle zzf;

    public AccountPicker$AccountChooserOptions$Builder()
    {
        this.zzd = 0;
        return;
    }

    public com.google.android.gms.common.AccountPicker$AccountChooserOptions build()
    {
        com.google.android.gms.common.internal.Preconditions.checkArgument(1, "We only support hostedDomain filter for account chip styled account picker");
        com.google.android.gms.common.internal.Preconditions.checkArgument(1, "Consent is only valid for account chip styled account picker");
        com.google.android.gms.common.AccountPicker$AccountChooserOptions v0_3 = new com.google.android.gms.common.AccountPicker$AccountChooserOptions();
        v0_3.zzf(this.zzc);
        v0_3.zzd(this.zzb);
        v0_3.zzh(this.zzd);
        v0_3.zzl(this.zzf);
        v0_3.zzb(this.zza);
        v0_3.zzj(this.zze);
        return v0_3;
    }

    public com.google.android.gms.common.AccountPicker$AccountChooserOptions$Builder setAllowableAccounts(java.util.List p2)
    {
        java.util.ArrayList v2_1;
        if (p2 != null) {
            v2_1 = new java.util.ArrayList(p2);
        } else {
            v2_1 = 0;
        }
        this.zzb = v2_1;
        return this;
    }

    public com.google.android.gms.common.AccountPicker$AccountChooserOptions$Builder setAllowableAccountsTypes(java.util.List p2)
    {
        java.util.ArrayList v2_1;
        if (p2 != null) {
            v2_1 = new java.util.ArrayList(p2);
        } else {
            v2_1 = 0;
        }
        this.zzc = v2_1;
        return this;
    }

    public com.google.android.gms.common.AccountPicker$AccountChooserOptions$Builder setAlwaysShowAccountPicker(boolean p1)
    {
        this.zzd = p1;
        return this;
    }

    public com.google.android.gms.common.AccountPicker$AccountChooserOptions$Builder setOptionsForAddingAccount(android.os.Bundle p1)
    {
        this.zzf = p1;
        return this;
    }

    public com.google.android.gms.common.AccountPicker$AccountChooserOptions$Builder setSelectedAccount(android.accounts.Account p1)
    {
        this.zza = p1;
        return this;
    }

    public com.google.android.gms.common.AccountPicker$AccountChooserOptions$Builder setTitleOverrideText(String p1)
    {
        this.zze = p1;
        return this;
    }
}
