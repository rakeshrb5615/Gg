package com.google.android.gms.common.stats;
public class StatsUtils {

    public StatsUtils()
    {
        return;
    }

    public static String getEventKey(android.os.PowerManager$WakeLock p4, String p5)
    {
        String vtmp3 = String.valueOf(((((long) android.os.Process.myPid()) << 32) | ((long) System.identityHashCode(p4))));
        if (1 == android.text.TextUtils.isEmpty(p5)) {
            p5 = "";
        }
        return String.valueOf(vtmp3).concat(String.valueOf(p5));
    }
}
