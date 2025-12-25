package g1;
public final class l implements java.lang.Runnable {

    public final void run()
    {
        try {
            g1.i v0_3;
            android.os.Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
        } catch (g1.i v0_4) {
            android.os.Trace.endSection();
            throw v0_4;
        }
        if (g1.i.k == null) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        if (v0_3 != null) {
            g1.i.a().c();
        }
        android.os.Trace.endSection();
        return;
    }
}
