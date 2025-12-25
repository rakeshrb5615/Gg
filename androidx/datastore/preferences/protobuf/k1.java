package androidx.datastore.preferences.protobuf;
public abstract class k1 {
    public static final a.a a;

    static k1()
    {
        if ((!androidx.datastore.preferences.protobuf.h1.e) || ((!androidx.datastore.preferences.protobuf.h1.d) || (androidx.datastore.preferences.protobuf.c.a()))) {
            androidx.datastore.preferences.protobuf.i1 v0_2 = new androidx.datastore.preferences.protobuf.i1(0);
        } else {
            v0_2 = new androidx.datastore.preferences.protobuf.i1(1);
        }
        androidx.datastore.preferences.protobuf.k1.a = v0_2;
        return;
    }

    public static int a(String p8)
    {
        String v0_0 = p8.length();
        int v1_0 = 0;
        int v2 = 0;
        while ((v2 < v0_0) && (p8.charAt(v2) < 128)) {
            v2++;
        }
        int v3_0 = v0_0;
        while (v2 < v0_0) {
            int v4_0 = p8.charAt(v2);
            if (v4_0 >= 2048) {
                int v4_1 = p8.length();
                while (v2 < v4_1) {
                    int v6_0 = p8.charAt(v2);
                    if (v6_0 >= 2048) {
                        v1_0 += 2;
                        if ((55296 <= v6_0) && (v6_0 <= 57343)) {
                            if (Character.codePointAt(p8, v2) < 65536) {
                                throw new androidx.datastore.preferences.protobuf.j1(v2, v4_1);
                            } else {
                                v2++;
                            }
                        }
                    } else {
                        v1_0 += ((127 - v6_0) >> 31);
                    }
                    v2++;
                }
                v3_0 += v1_0;
                break;
            } else {
                v3_0 += ((127 - v4_0) >> 31);
                v2++;
            }
        }
        if (v3_0 < v0_0) {
            String v0_2 = new StringBuilder("UTF-8 length does not fit in int: ");
            v0_2.append((((long) v3_0) + 4294967296));
            throw new IllegalArgumentException(v0_2.toString());
        } else {
            return v3_0;
        }
    }
}
