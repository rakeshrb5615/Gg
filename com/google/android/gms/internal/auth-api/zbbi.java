package com.google.android.gms.internal.auth-api;
public final class zbbi {
    public static final com.google.android.gms.common.Feature zba;
    public static final com.google.android.gms.common.Feature zbb;
    public static final com.google.android.gms.common.Feature zbc;
    public static final com.google.android.gms.common.Feature zbd;
    public static final com.google.android.gms.common.Feature zbe;
    public static final com.google.android.gms.common.Feature zbf;
    public static final com.google.android.gms.common.Feature zbg;
    public static final com.google.android.gms.common.Feature zbh;
    public static final com.google.android.gms.common.Feature[] zbi;

    static zbbi()
    {
        com.google.android.gms.common.Feature[] v0_1 = new com.google.android.gms.common.Feature("auth_api_credentials_begin_sign_in", 8);
        com.google.android.gms.internal.auth-api.zbbi.zba = v0_1;
        com.google.android.gms.internal.auth-api.zbbi.zbb = new com.google.android.gms.common.Feature("auth_api_credentials_sign_out", 2);
        com.google.android.gms.internal.auth-api.zbbi.zbc = new com.google.android.gms.common.Feature("auth_api_credentials_authorize", 1);
        com.google.android.gms.internal.auth-api.zbbi.zbd = new com.google.android.gms.common.Feature("auth_api_credentials_revoke_access", 1);
        com.google.android.gms.internal.auth-api.zbbi.zbe = new com.google.android.gms.common.Feature("auth_api_credentials_save_password", 4);
        com.google.android.gms.internal.auth-api.zbbi.zbf = new com.google.android.gms.common.Feature("auth_api_credentials_get_sign_in_intent", 6);
        com.google.android.gms.internal.auth-api.zbbi.zbg = new com.google.android.gms.common.Feature("auth_api_credentials_save_account_linking_token", 3);
        com.google.android.gms.common.Feature v7_3 = new com.google.android.gms.common.Feature("auth_api_credentials_get_phone_number_hint_intent", 3);
        com.google.android.gms.internal.auth-api.zbbi.zbh = v7_3;
        com.google.android.gms.internal.auth-api.zbbi.zbi = new com.google.android.gms.common.Feature[] {v0_1, v7_3});
        return;
    }
}
