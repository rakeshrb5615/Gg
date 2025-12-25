package androidx.core.graphics.drawable;
public class IconCompatParcelizer {

    public IconCompatParcelizer()
    {
        return;
    }

    public static androidx.core.graphics.drawable.IconCompat read(h2.a p5)
    {
        String v0_1 = new androidx.core.graphics.drawable.IconCompat();
        int v1_0 = v0_1.a;
        if (p5.e(1)) {
            v1_0 = ((h2.b) p5).e.readInt();
        }
        v0_1.a = v1_0;
        int v1_1 = v0_1.c;
        if (p5.e(2)) {
            int v1_4 = ((h2.b) p5).e;
            int v3_3 = v1_4.readInt();
            if (v3_3 >= 0) {
                int v3_4 = new byte[v3_3];
                v1_4.readByteArray(v3_4);
                v1_1 = v3_4;
            } else {
                v1_1 = 0;
            }
        }
        v0_1.c = v1_1;
        v0_1.d = p5.f(v0_1.d, 3);
        int v1_7 = v0_1.e;
        if (p5.e(4)) {
            v1_7 = ((h2.b) p5).e.readInt();
        }
        v0_1.e = v1_7;
        int v1_11 = v0_1.f;
        if (p5.e(5)) {
            v1_11 = ((h2.b) p5).e.readInt();
        }
        v0_1.f = v1_11;
        v0_1.g = ((android.content.res.ColorStateList) p5.f(v0_1.g, 6));
        int v1_18 = v0_1.i;
        if (p5.e(7)) {
            v1_18 = ((h2.b) p5).e.readString();
        }
        v0_1.i = v1_18;
        int v1_23 = v0_1.j;
        if (p5.e(8)) {
            v1_23 = ((h2.b) p5).e.readString();
        }
        v0_1.j = v1_23;
        v0_1.h = android.graphics.PorterDuff$Mode.valueOf(v0_1.i);
        switch (v0_1.a) {
            case -1:
                String v5_6 = v0_1.d;
                if (v5_6 == null) {
                    throw new IllegalArgumentException("Invalid icon");
                } else {
                    v0_1.b = v5_6;
                    return v0_1;
                }
            case 0:
            default:
                break;
            case 1:
            case 5:
                String v5_3 = v0_1.d;
                if (v5_3 == null) {
                    String v5_4 = v0_1.c;
                    v0_1.b = v5_4;
                    v0_1.a = 3;
                    v0_1.e = 0;
                    v0_1.f = v5_4.length;
                    return v0_1;
                } else {
                    v0_1.b = v5_3;
                    return v0_1;
                }
            case 2:
            case 4:
            case 6:
                String v5_16 = new String(v0_1.c, java.nio.charset.Charset.forName("UTF-16"));
                v0_1.b = v5_16;
                if ((v0_1.a != 2) || (v0_1.j != null)) {
                } else {
                    v0_1.j = v5_16.split(":", -1)[0];
                }
                break;
            case 3:
                v0_1.b = v0_1.c;
                return v0_1;
        }
        return v0_1;
    }

    public static void write(androidx.core.graphics.drawable.IconCompat p3, h2.a p4)
    {
        p4.getClass();
        p3.i = p3.h.name();
        switch (p3.a) {
            case -1:
                p3.d = ((android.os.Parcelable) p3.b);
                break;
            case 0:
            default:
                break;
            case 1:
            case 5:
                p3.d = ((android.os.Parcelable) p3.b);
                break;
            case 2:
                p3.c = ((String) p3.b).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
            case 3:
                p3.c = ((byte[]) p3.b);
                break;
            case 4:
            case 6:
                p3.c = p3.b.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
        }
        int v0_13 = p3.a;
        if (-1 != v0_13) {
            p4.h(1);
            ((h2.b) p4).e.writeInt(v0_13);
        }
        int v0_14 = p3.c;
        if (v0_14 != 0) {
            p4.h(2);
            android.os.Parcel v1_10 = ((h2.b) p4).e;
            v1_10.writeInt(v0_14.length);
            v1_10.writeByteArray(v0_14);
        }
        int v0_16 = p3.d;
        if (v0_16 != 0) {
            p4.h(3);
            ((h2.b) p4).e.writeParcelable(v0_16, 0);
        }
        int v0_17 = p3.e;
        if (v0_17 != 0) {
            p4.h(4);
            ((h2.b) p4).e.writeInt(v0_17);
        }
        int v0_18 = p3.f;
        if (v0_18 != 0) {
            p4.h(5);
            ((h2.b) p4).e.writeInt(v0_18);
        }
        int v0_19 = p3.g;
        if (v0_19 != 0) {
            p4.h(6);
            ((h2.b) p4).e.writeParcelable(v0_19, 0);
        }
        int v0_21 = p3.i;
        if (v0_21 != 0) {
            p4.h(7);
            ((h2.b) p4).e.writeString(v0_21);
        }
        String v3_1 = p3.j;
        if (v3_1 != null) {
            p4.h(8);
            ((h2.b) p4).e.writeString(v3_1);
        }
        return;
    }
}
