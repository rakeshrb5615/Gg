package androidx.loader.content;
public final class h extends java.util.concurrent.FutureTask {
    public final synthetic androidx.loader.content.a a;

    public h(androidx.loader.content.a p1, androidx.loader.content.g p2)
    {
        this.a = p1;
        super(p2);
        return;
    }

    public final void done()
    {
        Throwable v1_0 = this.a;
        RuntimeException v2_2 = v1_0.e;
        try {
            Object v3 = this.get();
        } catch (int v0_3) {
            android.util.Log.w("AsyncTask", v0_3);
            return;
        } catch (Throwable v1_1) {
            throw new RuntimeException("An error occurred while executing doInBackground()", v1_1.getCause());
        } catch (InterruptedException) {
            if (v2_2.get()) {
                return;
            } else {
                v1_0.a(0);
                return;
            }
        } catch (Throwable v1_4) {
            throw new RuntimeException("An error occurred while executing doInBackground()", v1_4);
        }
        if (v2_2.get()) {
            return;
        } else {
            v1_0.a(v3);
            return;
        }
    }
}
