package com.google.android.gms.common;
public final class AccountPicker {

    private AccountPicker()
    {
        return;
    }

    public static android.content.Intent newChooseAccountIntent(android.accounts.Account p3, java.util.ArrayList p4, String[] p5, boolean p6, String p7, String p8, String[] p9, android.os.Bundle p10)
    {
        android.content.Intent v0_1 = new android.content.Intent();
        com.google.android.gms.common.internal.Preconditions.checkArgument(1, "We only support hostedDomain filter for account chip styled account picker");
        v0_1.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        v0_1.setPackage("com.google.android.gms");
        v0_1.putExtra("allowableAccounts", p4);
        v0_1.putExtra("allowableAccountTypes", p5);
        v0_1.putExtra("addAccountOptions", p10);
        v0_1.putExtra("selectedAccount", p3);
        v0_1.putExtra("alwaysPromptForAccount", p6);
        v0_1.putExtra("descriptionTextOverride", p7);
        v0_1.putExtra("authTokenType", p8);
        v0_1.putExtra("addAccountRequiredFeatures", p9);
        v0_1.putExtra("setGmsCoreAccount", 0);
        v0_1.putExtra("overrideTheme", 0);
        v0_1.putExtra("overrideCustomTheme", 0);
        v0_1.putExtra("hostedDomainFilter", 0);
        return v0_1;
    }

    public static android.content.Intent newChooseAccountIntent(com.google.android.gms.common.AccountPicker$AccountChooserOptions p4)
    {
        android.content.Intent v0_1 = new android.content.Intent();
        com.google.android.gms.common.internal.Preconditions.checkArgument(1, "We only support hostedDomain filter for account chip styled account picker");
        com.google.android.gms.common.internal.Preconditions.checkArgument(1, "Consent is only valid for account chip styled account picker");
        com.google.android.gms.common.internal.Preconditions.checkArgument(1, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        v0_1.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        v0_1.setPackage("com.google.android.gms");
        v0_1.putExtra("allowableAccounts", p4.zzc());
        if (p4.zze() != null) {
            String v3_0 = new String[0];
            v0_1.putExtra("allowableAccountTypes", ((String[]) p4.zze().toArray(v3_0)));
        }
        v0_1.putExtra("addAccountOptions", p4.zzk());
        v0_1.putExtra("selectedAccount", p4.zza());
        v0_1.putExtra("selectedAccountIsNotClickable", 0);
        v0_1.putExtra("alwaysPromptForAccount", p4.zzg());
        v0_1.putExtra("descriptionTextOverride", p4.zzi());
        v0_1.putExtra("setGmsCoreAccount", 0);
        v0_1.putExtra("realClientPackage", 0);
        v0_1.putExtra("overrideTheme", 0);
        v0_1.putExtra("overrideCustomTheme", 0);
        v0_1.putExtra("hostedDomainFilter", 0);
        android.os.Bundle v4_8 = new android.os.Bundle();
        if (!v4_8.isEmpty()) {
            v0_1.putExtra("first_party_options_bundle", v4_8);
        }
        return v0_1;
    }
}
