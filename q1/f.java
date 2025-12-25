package q1;
public final class f extends q1.b {
    public final Object a;
    public final q1.e b;

    public f(androidx.lifecycle.u p2, androidx.lifecycle.a1 p3)
    {
        this.a = p2;
        this.b = ((q1.e) new androidx.lifecycle.z0(p3, q1.e.d).a(q1.e));
        return;
    }

    public final void b(String p10, java.io.FileDescriptor p11, java.io.PrintWriter p12, String[] p13)
    {
        q1.e v0 = this.b;
        if (v0.b.c > 0) {
            p12.print(p10);
            p12.println("Loaders:");
            String v1_5 = new StringBuilder();
            v1_5.append(p10);
            v1_5.append("    ");
            String v1_1 = v1_5.toString();
            int v3 = 0;
            while(true) {
                int v4_0 = v0.b;
                if (v3 >= v4_0.c) {
                    break;
                }
                int v4_2 = ((q1.c) v4_0.e(v3));
                p12.print(p10);
                p12.print("  #");
                p12.print(v0.b.a[v3]);
                p12.print(": ");
                p12.println(v4_2.toString());
                p12.print(v1_1);
                p12.print("mId=");
                p12.print(0);
                p12.print(" mArgs=");
                String v5_9 = 0;
                p12.println(0);
                p12.print(v1_1);
                p12.print("mLoader=");
                p12.println(v4_2.l);
                v4_2.l.dump(g2.g.d(v1_1, "  "), p11, p12, p13);
                if (v4_2.n != null) {
                    p12.print(v1_1);
                    p12.print("mCallbacks=");
                    p12.println(v4_2.n);
                    androidx.loader.content.e v6_6 = v4_2.n;
                    Object v8_2 = new StringBuilder();
                    v8_2.append(v1_1);
                    v8_2.append("  ");
                    Object v7_1 = v8_2.toString();
                    v6_6.getClass();
                    p12.print(v7_1);
                    p12.print("mDeliveredData=");
                    p12.println(v6_6.c);
                }
                p12.print(v1_1);
                p12.print("mData=");
                Object v7_3 = v4_2.e;
                if (v7_3 != androidx.lifecycle.c0.k) {
                    v5_9 = v7_3;
                }
                int v4_4;
                p12.println(v4_2.l.dataToString(v5_9));
                p12.print(v1_1);
                p12.print("mStarted=");
                if (v4_2.c <= 0) {
                    v4_4 = 0;
                } else {
                    v4_4 = 1;
                }
                p12.println(v4_4);
                v3++;
            }
        }
        return;
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder(128);
        v0_2.append("LoaderManager{");
        v0_2.append(Integer.toHexString(System.identityHashCode(this)));
        v0_2.append(" in ");
        p0.e.a(this.a, v0_2);
        v0_2.append("}}");
        return v0_2.toString();
    }
}
