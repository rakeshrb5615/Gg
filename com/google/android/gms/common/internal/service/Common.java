package com.google.android.gms.common.internal.service;
public final class Common {
    public static final com.google.android.gms.common.api.Api API;
    public static final com.google.android.gms.common.api.Api$ClientKey CLIENT_KEY;
    public static final com.google.android.gms.common.internal.service.zae zaa;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zab;

    static Common()
    {
        com.google.android.gms.common.internal.service.zae v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.common.internal.service.Common.CLIENT_KEY = v0_1;
        com.google.android.gms.common.internal.service.zab v1_1 = new com.google.android.gms.common.internal.service.zab();
        com.google.android.gms.common.internal.service.Common.zab = v1_1;
        com.google.android.gms.common.internal.service.Common.API = new com.google.android.gms.common.api.Api("Common.API", v1_1, v0_1);
        com.google.android.gms.common.internal.service.Common.zaa = new com.google.android.gms.common.internal.service.zae();
        return;
    }

    public Common()
    {
        return;
    }
}
