package g1;
public final class x implements android.text.Spannable {
    public boolean a;
    public android.text.Spannable b;

    public x(android.text.Spannable p2)
    {
        this.a = 0;
        this.b = p2;
        return;
    }

    public final void a()
    {
        int v0_0 = this.b;
        if (!this.a) {
            android.text.SpannableString v1_6;
            if (android.os.Build$VERSION.SDK_INT >= 28) {
                v1_6 = new g1.w();
            } else {
                v1_6 = new v3.f();
            }
            if (v1_6.n(v0_0)) {
                this.b = new android.text.SpannableString(v0_0);
            }
        }
        this.a = 1;
        return;
    }

    public final char charAt(int p2)
    {
        return this.b.charAt(p2);
    }

    public final java.util.stream.IntStream chars()
    {
        return this.b.chars();
    }

    public final java.util.stream.IntStream codePoints()
    {
        return this.b.codePoints();
    }

    public final int getSpanEnd(Object p2)
    {
        return this.b.getSpanEnd(p2);
    }

    public final int getSpanFlags(Object p2)
    {
        return this.b.getSpanFlags(p2);
    }

    public final int getSpanStart(Object p2)
    {
        return this.b.getSpanStart(p2);
    }

    public final Object[] getSpans(int p2, int p3, Class p4)
    {
        return this.b.getSpans(p2, p3, p4);
    }

    public final int length()
    {
        return this.b.length();
    }

    public final int nextSpanTransition(int p2, int p3, Class p4)
    {
        return this.b.nextSpanTransition(p2, p3, p4);
    }

    public final void removeSpan(Object p2)
    {
        this.a();
        this.b.removeSpan(p2);
        return;
    }

    public final void setSpan(Object p2, int p3, int p4, int p5)
    {
        this.a();
        this.b.setSpan(p2, p3, p4, p5);
        return;
    }

    public final CharSequence subSequence(int p2, int p3)
    {
        return this.b.subSequence(p2, p3);
    }

    public final String toString()
    {
        return this.b.toString();
    }
}
