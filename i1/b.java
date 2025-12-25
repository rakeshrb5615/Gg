package i1;
public final class b extends android.view.inputmethod.InputConnectionWrapper {
    public final android.widget.EditText a;
    public final v3.f b;

    public b(android.widget.EditText p4, android.view.inputmethod.InputConnection p5, android.view.inputmethod.EditorInfo p6)
    {
        String v0_1 = new v3.f();
        super(p5, 0);
        super.a = p4;
        super.b = v0_1;
        if (g1.i.k != null) {
            android.os.Bundle v4_10 = g1.i.a();
            if (v4_10.b() == 1) {
                if (p6 != null) {
                    if (p6.extras == null) {
                        p6.extras = new android.os.Bundle();
                    }
                    android.os.Bundle v4_6;
                    android.os.Bundle v4_1 = v4_10.e;
                    v4_1.getClass();
                    String v5_5 = p6.extras;
                    android.os.Bundle v4_5 = ((h1.b) ((j6.s) v4_1.c).b);
                    String v0_4 = v4_5.b(4);
                    if (v0_4 == null) {
                        v4_6 = 0;
                    } else {
                        v4_6 = ((java.nio.ByteBuffer) v4_5.d).getInt((v0_4 + v4_5.a));
                    }
                    v5_5.putInt("android.support.text.emoji.emojiCompat_metadataVersion", v4_6);
                    p6.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", 0);
                } else {
                    return;
                }
            }
        }
        return;
    }

    public final boolean deleteSurroundingText(int p3, int p4)
    {
        boolean v0_1 = this.a.getEditableText();
        this.b.getClass();
        if ((!v3.f.m(this, v0_1, p3, p4, 0)) && (!super.deleteSurroundingText(p3, p4))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean deleteSurroundingTextInCodePoints(int p3, int p4)
    {
        boolean v0_1 = this.a.getEditableText();
        this.b.getClass();
        if ((!v3.f.m(this, v0_1, p3, p4, 1)) && (!super.deleteSurroundingTextInCodePoints(p3, p4))) {
            return 0;
        } else {
            return 1;
        }
    }
}
