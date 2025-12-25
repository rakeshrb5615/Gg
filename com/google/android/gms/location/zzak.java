package com.google.android.gms.location;
public final class zzak {
    public static final synthetic int zza;
    private static final java.text.DecimalFormat zzb;
    private static final java.text.DecimalFormat zzc;
    private static final StringBuilder zzd;

    static zzak()
    {
        java.math.RoundingMode v1_0 = java.util.Locale.ROOT;
        com.google.android.gms.location.zzak.zzb = new java.text.DecimalFormat(".000000", java.text.DecimalFormatSymbols.getInstance(v1_0));
        StringBuilder v0_1 = new java.text.DecimalFormat(".##", java.text.DecimalFormatSymbols.getInstance(v1_0));
        com.google.android.gms.location.zzak.zzc = v0_1;
        v0_1.setRoundingMode(java.math.RoundingMode.DOWN);
        com.google.android.gms.location.zzak.zzd = new StringBuilder();
        return;
    }

    public static StringBuilder zza(android.location.Location p6, StringBuilder p7)
    {
        p7.ensureCapacity(100);
        long v0_2 = 0;
        if (p6 != 0) {
            String v1_7;
            p7.append("{");
            p7.append(p6.getProvider());
            p7.append(", ");
            if (android.os.Build$VERSION.SDK_INT < 31) {
                v1_7 = p6.isFromMockProvider();
            } else {
                v1_7 = k0.a.a(p6);
            }
            if (v1_7 != null) {
                p7.append("mock, ");
            }
            String v1_9 = com.google.android.gms.location.zzak.zzb;
            p7.append(v1_9.format(p6.getLatitude()));
            p7.append(",");
            p7.append(v1_9.format(p6.getLongitude()));
            if (p6.hasAccuracy()) {
                p7.append("\u00b1");
                p7.append(com.google.android.gms.location.zzak.zzc.format(((double) p6.getAccuracy())));
                p7.append("m");
            }
            if (p6.hasAltitude()) {
                p7.append(", alt=");
                String v1_17 = com.google.android.gms.location.zzak.zzc;
                p7.append(v1_17.format(p6.getAltitude()));
                if (p6.hasVerticalAccuracy()) {
                    p7.append("\u00b1");
                    p7.append(v1_17.format(((double) p6.getVerticalAccuracyMeters())));
                }
                p7.append("m");
            }
            if (p6.hasSpeed()) {
                p7.append(", spd=");
                String v1_22 = com.google.android.gms.location.zzak.zzc;
                p7.append(v1_22.format(((double) p6.getSpeed())));
                if (p6.hasSpeedAccuracy()) {
                    p7.append("\u00b1");
                    p7.append(v1_22.format(((double) p6.getSpeedAccuracyMetersPerSecond())));
                }
                p7.append("m/s");
            }
            if (p6.hasBearing()) {
                p7.append(", brg=");
                String v1_28 = com.google.android.gms.location.zzak.zzc;
                p7.append(v1_28.format(((double) p6.getBearing())));
                if (p6.hasBearingAccuracy()) {
                    p7.append("\u00b1");
                    p7.append(v1_28.format(((double) p6.getBearingAccuracyDegrees())));
                }
                p7.append("\u00b0");
            }
            String v1_4;
            String v1_3 = p6.getExtras();
            if (v1_3 == null) {
                v1_4 = 0;
            } else {
                v1_4 = v1_3.getString("floorLabel");
            }
            if (v1_4 != null) {
                p7.append(", fl=");
                p7.append(v1_4);
            }
            String v1_5 = p6.getExtras();
            if (v1_5 != null) {
                v0_2 = v1_5.getString("levelId");
            }
            if (v0_2 != 0) {
                p7.append(", lv=");
                p7.append(v0_2);
            }
            long v0_4 = (System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime());
            p7.append(", ert=");
            p7.append(com.google.android.gms.internal.location.zzeo.zza((java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(p6.getElapsedRealtimeNanos()) + v0_4)));
            p7.append(125);
            return p7;
        } else {
            p7.append(0);
            return p7;
        }
    }
}
