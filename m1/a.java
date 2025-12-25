package m1;
public abstract class a extends android.content.BroadcastReceiver {
    private static final String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static int mNextId;
    private static final android.util.SparseArray sActiveWakeLocks;

    static a()
    {
        m1.a.sActiveWakeLocks = new android.util.SparseArray();
        m1.a.mNextId = 1;
        return;
    }

    public static boolean completeWakefulIntent(android.content.Intent p5)
    {
        String v5_3 = p5.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (v5_3 != null) {
            android.util.SparseArray v1_1 = m1.a.sActiveWakeLocks;
            String v2_3 = ((android.os.PowerManager$WakeLock) v1_1.get(v5_3));
            if (v2_3 == null) {
                StringBuilder v4_1 = new StringBuilder("No active wake lock id #");
                v4_1.append(v5_3);
                android.util.Log.w("WakefulBroadcastReceiv.", v4_1.toString());
                return 1;
            } else {
                v2_3.release();
                v1_1.remove(v5_3);
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static android.content.ComponentName startWakefulService(android.content.Context p5, android.content.Intent p6)
    {
        int v2 = m1.a.mNextId;
        long v3_4 = (v2 + 1);
        m1.a.mNextId = v3_4;
        if (v3_4 <= 0) {
            m1.a.mNextId = 1;
        }
        p6.putExtra("androidx.contentpager.content.wakelockid", v2);
        android.content.ComponentName v6_1 = p5.startService(p6);
        if (v6_1 != null) {
            android.os.PowerManager$WakeLock v5_2 = ((android.os.PowerManager) p5.getSystemService("power"));
            long v3_2 = new StringBuilder("androidx.core:wake:");
            v3_2.append(v6_1.flattenToShortString());
            android.os.PowerManager$WakeLock v5_3 = v5_2.newWakeLock(1, v3_2.toString());
            v5_3.setReferenceCounted(0);
            v5_3.acquire(60000);
            m1.a.sActiveWakeLocks.put(v2, v5_3);
            return v6_1;
        } else {
            return 0;
        }
    }
}
