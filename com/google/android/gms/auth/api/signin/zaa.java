package com.google.android.gms.auth.api.signin;
public final synthetic class zaa implements java.util.Comparator {
    public static final synthetic com.google.android.gms.auth.api.signin.zaa zaa;

    static synthetic zaa()
    {
        com.google.android.gms.auth.api.signin.zaa.zaa = new com.google.android.gms.auth.api.signin.zaa();
        return;
    }

    private synthetic zaa()
    {
        return;
    }

    public final int compare(Object p2, Object p3)
    {
        return ((com.google.android.gms.common.api.Scope) p2).getScopeUri().compareTo(((com.google.android.gms.common.api.Scope) p3).getScopeUri());
    }
}
