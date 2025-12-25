package s0;
public final class a extends android.view.inputmethod.InputConnectionWrapper {
    public final synthetic a5.a a;

    public a(android.view.inputmethod.InputConnection p1, a5.a p2)
    {
        this.a = p2;
        super(p1, 0);
        return;
    }

    public final boolean commitContent(android.view.inputmethod.InputContentInfo p8, int p9, android.os.Bundle p10)
    {
        q0.g v0_7;
        if (p8 != 0) {
            v0_7 = new j6.o(new j6.o(p8, 13), 14);
        } else {
            v0_7 = 0;
        }
        android.os.Bundle v3_0;
        String v1_0 = ((n.w) this.a.b);
        if ((p9 & 1) == 0) {
            v3_0 = p10;
            q0.e v4_4;
            q0.g v0_5 = ((android.view.inputmethod.InputContentInfo) ((j6.o) v0_7.b).b);
            android.content.ClipData v2_12 = new android.content.ClipData(v0_5.getDescription(), new android.content.ClipData$Item(v0_5.getContentUri()));
            if (android.os.Build$VERSION.SDK_INT < 31) {
                v4_4 = new q0.e();
                v4_4.b = v2_12;
                v4_4.c = 2;
            } else {
                v4_4 = new q0.c(v2_12, 2);
            }
            v4_4.e(v0_5.getLinkUri());
            v4_4.setExtras(v3_0);
            if (q0.q0.j(v1_0, v4_4.build()) == null) {
                return 1;
            }
        } else {
            try {
                ((android.view.inputmethod.InputContentInfo) ((j6.o) v0_7.b).b).requestPermission();
                android.content.ClipData v2_8 = ((android.view.inputmethod.InputContentInfo) ((j6.o) v0_7.b).b);
                android.os.Bundle v3_1 = new android.os.Bundle;
            } catch (q0.g v0_1) {
                android.util.Log.w("InputConnectionCompat", "Can\'t insert content from IME; requestPermission() failed", v0_1);
            }
            if (p10 != null) {
                v3_0 = v3_1(p10);
            } else {
                v3_0 = v3_1();
            }
            v3_0.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", v2_8);
        }
        return super.commitContent(p8, p9, p10);
    }
}
