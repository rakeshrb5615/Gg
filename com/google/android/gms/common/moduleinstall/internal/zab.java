package com.google.android.gms.common.moduleinstall.internal;
public final synthetic class zab implements java.util.Comparator {
    public static final synthetic com.google.android.gms.common.moduleinstall.internal.zab zaa;

    static synthetic zab()
    {
        com.google.android.gms.common.moduleinstall.internal.zab.zaa = new com.google.android.gms.common.moduleinstall.internal.zab();
        return;
    }

    private synthetic zab()
    {
        return;
    }

    public final int compare(Object p3, Object p4)
    {
        if (((com.google.android.gms.common.Feature) p3).getName().equals(((com.google.android.gms.common.Feature) p4).getName())) {
            return ((com.google.android.gms.common.Feature) p3).getVersion() cmp ((com.google.android.gms.common.Feature) p4).getVersion();
        } else {
            return ((com.google.android.gms.common.Feature) p3).getName().compareTo(((com.google.android.gms.common.Feature) p4).getName());
        }
    }
}
