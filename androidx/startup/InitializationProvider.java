package androidx.startup;
public class InitializationProvider extends android.content.ContentProvider {

    public InitializationProvider()
    {
        return;
    }

    public final int delete(android.net.Uri p1, String p2, String[] p3)
    {
        throw new IllegalStateException("Not allowed.");
    }

    public final String getType(android.net.Uri p2)
    {
        throw new IllegalStateException("Not allowed.");
    }

    public final android.net.Uri insert(android.net.Uri p1, android.content.ContentValues p2)
    {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate()
    {
        Throwable v0_0 = this.getContext();
        if (v0_0 == null) {
            throw new a5.o("Context cannot be null");
        } else {
            if (v0_0.getApplicationContext() != null) {
                Throwable v0_1 = d2.a.c(v0_0);
                a5.o v1_0 = this.getClass();
                int v2_0 = v0_1.c;
                try {
                    j5.t1.c("Startup");
                    v0_1.a(v2_0.getPackageManager().getProviderInfo(new android.content.ComponentName(v2_0, v1_0), 128).metaData);
                    android.os.Trace.endSection();
                } catch (Throwable v0_2) {
                    throw new a5.o(v0_2);
                } catch (Throwable v0_4) {
                    android.os.Trace.endSection();
                    throw v0_4;
                }
            }
            return 1;
        }
    }

    public final android.database.Cursor query(android.net.Uri p1, String[] p2, String p3, String[] p4, String p5)
    {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(android.net.Uri p1, android.content.ContentValues p2, String p3, String[] p4)
    {
        throw new IllegalStateException("Not allowed.");
    }
}
