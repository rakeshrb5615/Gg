package okhttp3;
public final class RequestBody$Companion$toRequestBody$2 extends okhttp3.RequestBody {

    public final okhttp3.MediaType b()
    {
        return 0;
    }

    public final void d(x8.h p4)
    {
        java.io.FileInputStream v0_1 = new java.io.FileInputStream(0);
        try {
            p4.a().L(new x8.t(v0_1, new x8.j0()));
            v0_1.close();
            return;
        } catch (Throwable v4_1) {
            try {
                throw v4_1;
            } catch (Throwable v1_1) {
                j5.t1.f(v0_1, v4_1);
                throw v1_1;
            }
        }
    }
}
