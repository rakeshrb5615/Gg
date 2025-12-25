package androidx.datastore.preferences.protobuf;
public abstract class c {
    public static final Class a;
    public static final boolean b;

    static c()
    {
        try {
            int v0_2 = Class.forName("libcore.io.Memory");
        } catch (Throwable) {
            v0_2 = 0;
        }
        androidx.datastore.preferences.protobuf.c.a = v0_2;
        try {
        } catch (Throwable) {
        }
        if (Class.forName("org.robolectric.Robolectric") == null) {
            int v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        androidx.datastore.preferences.protobuf.c.b = v0_1;
        return;
    }

    public static boolean a()
    {
        if ((androidx.datastore.preferences.protobuf.c.a == null) || (androidx.datastore.preferences.protobuf.c.b)) {
            return 0;
        } else {
            return 1;
        }
    }
}
