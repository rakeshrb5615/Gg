package androidx.core.app;
public class RemoteActionCompatParcelizer {

    public RemoteActionCompatParcelizer()
    {
        return;
    }

    public static androidx.core.app.RemoteActionCompat read(h2.a p5)
    {
        androidx.core.app.RemoteActionCompat v0_1 = new androidx.core.app.RemoteActionCompat();
        int v1_4 = v0_1.a;
        int v2 = 1;
        if (p5.e(1)) {
            v1_4 = p5.g();
        }
        v0_1.a = ((androidx.core.graphics.drawable.IconCompat) v1_4);
        int v1_0 = v0_1.b;
        if (p5.e(2)) {
            v1_0 = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((h2.b) p5).e));
        }
        v0_1.b = v1_0;
        int v1_6 = v0_1.c;
        if (p5.e(3)) {
            v1_6 = ((CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((h2.b) p5).e));
        }
        v0_1.c = v1_6;
        v0_1.d = ((android.app.PendingIntent) p5.f(v0_1.d, 4));
        int v1_14 = v0_1.e;
        if (p5.e(5)) {
            if (((h2.b) p5).e.readInt() == 0) {
                v1_14 = 0;
            } else {
                v1_14 = 1;
            }
        }
        v0_1.e = v1_14;
        if (p5.e(6)) {
            if (((h2.b) p5).e.readInt() == 0) {
                v2 = 0;
            }
        } else {
            v2 = v0_1.f;
        }
        v0_1.f = v2;
        return v0_1;
    }

    public static void write(androidx.core.app.RemoteActionCompat p4, h2.a p5)
    {
        p5.getClass();
        int v0_0 = p4.a;
        p5.h(1);
        p5.i(v0_0);
        int v0_5 = p4.b;
        p5.h(2);
        android.os.Parcel v1_0 = ((h2.b) p5).e;
        android.text.TextUtils.writeToParcel(v0_5, v1_0, 0);
        int v0_1 = p4.c;
        p5.h(3);
        android.text.TextUtils.writeToParcel(v0_1, v1_0, 0);
        int v0_2 = p4.d;
        p5.h(4);
        v1_0.writeParcelable(v0_2, 0);
        int v0_3 = p4.e;
        p5.h(5);
        v1_0.writeInt(v0_3);
        boolean v4_1 = p4.f;
        p5.h(6);
        v1_0.writeInt(v4_1);
        return;
    }
}
