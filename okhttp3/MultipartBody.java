package okhttp3;
public final class MultipartBody extends okhttp3.RequestBody {
    public static final okhttp3.MediaType f;
    public static final okhttp3.MediaType g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final x8.j b;
    public final java.util.List c;
    public final okhttp3.MediaType d;
    public long e;

    static MultipartBody()
    {
        new okhttp3.MultipartBody$Companion(0);
        okhttp3.MediaType.e.getClass();
        okhttp3.MultipartBody.f = okhttp3.MediaType$Companion.a("multipart/mixed");
        okhttp3.MediaType$Companion.a("multipart/alternative");
        okhttp3.MediaType$Companion.a("multipart/digest");
        okhttp3.MediaType$Companion.a("multipart/parallel");
        okhttp3.MultipartBody.g = okhttp3.MediaType$Companion.a("multipart/form-data");
        byte[] v1_1 = new byte[2];
        v1_1 = {58, 32};
        okhttp3.MultipartBody.h = v1_1;
        byte[] v1_2 = new byte[2];
        v1_2 = {13, 10};
        okhttp3.MultipartBody.i = v1_2;
        byte[] v0_6 = new byte[2];
        v0_6 = {45, 45};
        okhttp3.MultipartBody.j = v0_6;
        return;
    }

    public MultipartBody(x8.j p2, okhttp3.MediaType p3, java.util.List p4)
    {
        kotlin.jvm.internal.j.e(p2, "boundaryByteString");
        kotlin.jvm.internal.j.e(p3, "type");
        this.b = p2;
        this.c = p4;
        StringBuilder v0_3 = new StringBuilder();
        v0_3.append(p3);
        v0_3.append("; boundary=");
        v0_3.append(p2.r());
        long v2_2 = v0_3.toString();
        okhttp3.MediaType.e.getClass();
        this.d = okhttp3.MediaType$Companion.a(v2_2);
        this.e = -1;
        return;
    }

    public final long a()
    {
        long v0_0 = this.e;
        if (v0_0 == -1) {
            v0_0 = this.e(0, 1);
            this.e = v0_0;
        }
        return v0_0;
    }

    public final okhttp3.MediaType b()
    {
        return this.d;
    }

    public final boolean c()
    {
        int v0 = 0;
        java.util.Iterator v1_0 = this.c;
        if ((v1_0 == null) || (!v1_0.isEmpty())) {
            java.util.Iterator v1_1 = v1_0.iterator();
            while (v1_1.hasNext()) {
                if (((okhttp3.MultipartBody$Part) v1_1.next()).b.c()) {
                    v0 = 1;
                    break;
                }
            }
            return v0;
        } else {
            return 0;
        }
    }

    public final void d(x8.h p2)
    {
        this.e(p2, 0);
        return;
    }

    public final long e(x8.h p17, boolean p18)
    {
        x8.h v1_1;
        int v2;
        if (!p18) {
            v2 = 0;
            v1_1 = p17;
        } else {
            v1_1 = new x8.g();
            v2 = v1_1;
        }
        long v3_1 = this.c;
        int v4 = v3_1.size();
        long v6 = 0;
        int v8 = 0;
        while(true) {
            long v9_0 = this.b;
            x8.h v10_0 = okhttp3.MultipartBody.j;
            byte[] v11 = okhttp3.MultipartBody.i;
            if (v8 >= v4) {
                break;
            }
            okhttp3.RequestBody v12_1 = ((okhttp3.MultipartBody$Part) v3_1.get(v8));
            long v13_0 = v12_1.a;
            okhttp3.RequestBody v12_2 = v12_1.b;
            kotlin.jvm.internal.j.b(v1_1);
            v1_1.write(v10_0);
            v1_1.j(v9_0);
            v1_1.write(v11);
            long v9_1 = v13_0.size();
            x8.h v10_1 = 0;
            while (v10_1 < v9_1) {
                v1_1.q(v13_0.c(v10_1)).write(okhttp3.MultipartBody.h).q(v13_0.e(v10_1)).write(v11);
                v10_1++;
            }
            long v9_2 = v12_2.b();
            if (v9_2 != 0) {
                v1_1.q("Content-Type: ").q(v9_2.a).write(v11);
            }
            long v9_5 = v12_2.a();
            if ((v9_5 != -1) || (!p18)) {
                v1_1.write(v11);
                if (!p18) {
                    v12_2.d(v1_1);
                } else {
                    v6 += v9_5;
                }
                v1_1.write(v11);
                v8++;
            } else {
                kotlin.jvm.internal.j.b(v2);
                v2.s();
                return -1;
            }
        }
        kotlin.jvm.internal.j.b(v1_1);
        v1_1.write(v10_0);
        v1_1.j(v9_0);
        v1_1.write(v10_0);
        v1_1.write(v11);
        if (p18) {
            kotlin.jvm.internal.j.b(v2);
            v6 += v2.b;
            v2.s();
        }
        return v6;
    }
}
