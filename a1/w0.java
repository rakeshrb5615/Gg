package a1;
public final class w0 extends kotlin.jvm.internal.k implements u7.a {
    public final synthetic int a;
    public final synthetic a1.z0 b;

    public synthetic w0(a1.z0 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        super(0);
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                int v0_5 = this.b;
                java.io.IOException v1_8 = v0_5.e;
                a1.g1 v3_6 = new StringBuilder();
                v3_6.append(v0_5.b.getAbsolutePath());
                v3_6.append(v1_8);
                String v2_4 = new java.io.File(v3_6.toString());
                a1.z0.f(v0_5, v2_4);
                return v2_4;
            case 1:
                System.loadLibrary("datastore_shared_counter");
                try {
                    int v0_2 = android.os.ParcelFileDescriptor.open(((java.io.File) new a1.w0(this.b, 0).invoke()), 939524096);
                    try {
                        java.io.IOException v1_2 = v0_2.getFd();
                        String v2_0 = a1.g1.b;
                    } catch (java.io.IOException v1_1) {
                        if (v0_2 != 0) {
                            v0_2.close();
                        }
                        throw v1_1;
                    }
                    if (v2_0.nativeTruncateFile(v1_2) != 0) {
                        throw new java.io.IOException("Failed to truncate counter file");
                    } else {
                        java.io.IOException v1_5 = v2_0.nativeCreateSharedCounter(v1_2);
                        if (v1_5 < 0) {
                            throw new java.io.IOException("Failed to mmap counter file");
                        } else {
                            a1.g1 v3_4 = new a1.g1(v1_5);
                            v0_2.close();
                            return v3_4;
                        }
                    }
                } catch (java.io.IOException v1_1) {
                    v0_2 = 0;
                }
            default:
                int v0_6 = this.b;
                java.io.IOException v1_11 = v0_6.d;
                a1.g1 v3_8 = new StringBuilder();
                v3_8.append(v0_6.b.getAbsolutePath());
                v3_8.append(v1_11);
                String v2_7 = new java.io.File(v3_8.toString());
                a1.z0.f(v0_6, v2_7);
                return v2_7;
        }
    }
}
