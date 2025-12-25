package com.google.android.gms.location;
final class zzk implements java.util.Comparator {

    public zzk()
    {
        return;
    }

    public final bridge synthetic int compare(Object p3, Object p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.location.DetectedActivity) p3));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.location.DetectedActivity) p4));
        int v0_0 = Integer.valueOf(((com.google.android.gms.location.DetectedActivity) p4).getConfidence()).compareTo(Integer.valueOf(((com.google.android.gms.location.DetectedActivity) p3).getConfidence()));
        if (v0_0 != 0) {
            return v0_0;
        } else {
            return Integer.valueOf(((com.google.android.gms.location.DetectedActivity) p3).getType()).compareTo(Integer.valueOf(((com.google.android.gms.location.DetectedActivity) p4).getType()));
        }
    }
}
