package com.google.android.gms.location;
final class zzg implements java.util.Comparator {

    public zzg()
    {
        return;
    }

    public final bridge synthetic int compare(Object p5, Object p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.location.ActivityTransition) p5));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.location.ActivityTransition) p6));
        int v0 = ((com.google.android.gms.location.ActivityTransition) p5).getActivityType();
        int v1 = ((com.google.android.gms.location.ActivityTransition) p6).getActivityType();
        if (v0 == v1) {
            int v5_2 = ((com.google.android.gms.location.ActivityTransition) p5).getTransitionType();
            int v6_2 = ((com.google.android.gms.location.ActivityTransition) p6).getTransitionType();
            if (v5_2 != v6_2) {
                if (v5_2 < v6_2) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            if (v0 < v1) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
