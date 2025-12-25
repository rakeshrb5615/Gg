package com.google.android.gms.common.api.internal;
public final class zaad {
    private final java.util.Map zaa;
    private final java.util.Map zab;

    public zaad()
    {
        this.zaa = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
        this.zab = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
        return;
    }

    public static bridge synthetic java.util.Map zaa(com.google.android.gms.common.api.internal.zaad p0)
    {
        return p0.zaa;
    }

    public static bridge synthetic java.util.Map zab(com.google.android.gms.common.api.internal.zaad p0)
    {
        return p0.zab;
    }

    private final void zah(boolean p5, com.google.android.gms.common.api.Status p6)
    {
        com.google.android.gms.tasks.TaskCompletionSource v1_6 = new java.util.HashMap(this.zaa);
        java.util.Iterator v0_3 = new java.util.HashMap(this.zab);
        com.google.android.gms.tasks.TaskCompletionSource v1_2 = v1_6.entrySet().iterator();
        while (v1_2.hasNext()) {
            com.google.android.gms.common.api.ApiException v2_8 = ((java.util.Map$Entry) v1_2.next());
            if ((p5 != null) || (((Boolean) v2_8.getValue()).booleanValue())) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) v2_8.getKey()).forceFailureUnlessReady(p6);
            }
        }
        java.util.Iterator v0_1 = v0_3.entrySet().iterator();
        while (v0_1.hasNext()) {
            com.google.android.gms.tasks.TaskCompletionSource v1_5 = ((java.util.Map$Entry) v0_1.next());
            if ((p5 != null) || (((Boolean) v1_5.getValue()).booleanValue())) {
                ((com.google.android.gms.tasks.TaskCompletionSource) v1_5.getKey()).trySetException(new com.google.android.gms.common.api.ApiException(p6));
            }
        }
        return;
    }

    public final void zac(com.google.android.gms.common.api.internal.BasePendingResult p2, boolean p3)
    {
        this.zaa.put(p2, Boolean.valueOf(p3));
        p2.addStatusListener(new com.google.android.gms.common.api.internal.zaab(this, p2));
        return;
    }

    public final void zad(com.google.android.gms.tasks.TaskCompletionSource p2, boolean p3)
    {
        this.zab.put(p2, Boolean.valueOf(p3));
        p2.getTask().addOnCompleteListener(new com.google.android.gms.common.api.internal.zaac(this, p2));
        return;
    }

    public final void zae(int p4, String p5)
    {
        int v0_2 = new StringBuilder("The connection to Google Play services was lost");
        if (p4 != 1) {
            if (p4 == 3) {
                v0_2.append(" due to dead object exception.");
            }
        } else {
            v0_2.append(" due to service disconnection.");
        }
        if (p5 != null) {
            v0_2.append(" Last reason for disconnect: ");
            v0_2.append(p5);
        }
        this.zah(1, new com.google.android.gms.common.api.Status(20, v0_2.toString()));
        return;
    }

    public final void zaf()
    {
        this.zah(0, com.google.android.gms.common.api.internal.GoogleApiManager.zaa);
        return;
    }

    public final boolean zag()
    {
        if ((this.zaa.isEmpty()) && (this.zab.isEmpty())) {
            return 0;
        } else {
            return 1;
        }
    }
}
