package g1;
public final class s implements android.text.TextWatcher, android.text.SpanWatcher {
    public final Object a;
    public final java.util.concurrent.atomic.AtomicInteger b;

    public s(Object p3)
    {
        this.b = new java.util.concurrent.atomic.AtomicInteger(0);
        this.a = p3;
        return;
    }

    public final void afterTextChanged(android.text.Editable p2)
    {
        ((android.text.TextWatcher) this.a).afterTextChanged(p2);
        return;
    }

    public final void beforeTextChanged(CharSequence p2, int p3, int p4, int p5)
    {
        ((android.text.TextWatcher) this.a).beforeTextChanged(p2, p3, p4, p5);
        return;
    }

    public final void onSpanAdded(android.text.Spannable p2, Object p3, int p4, int p5)
    {
        if ((this.b.get() <= 0) || (!(p3 instanceof g1.v))) {
            ((android.text.SpanWatcher) this.a).onSpanAdded(p2, p3, p4, p5);
            return;
        } else {
            return;
        }
    }

    public final void onSpanChanged(android.text.Spannable p9, Object p10, int p11, int p12, int p13, int p14)
    {
        if ((this.b.get() <= 0) || (!(p10 instanceof g1.v))) {
            Object v4;
            int v6;
            if (android.os.Build$VERSION.SDK_INT >= 28) {
                v4 = p11;
                v6 = p13;
            } else {
                if (p11 > p12) {
                    p11 = 0;
                }
                if (p13 <= p14) {
                } else {
                    v4 = p11;
                    v6 = 0;
                }
            }
            ((android.text.SpanWatcher) this.a).onSpanChanged(p9, p10, v4, p12, v6, p14);
            return;
        } else {
            return;
        }
    }

    public final void onSpanRemoved(android.text.Spannable p2, Object p3, int p4, int p5)
    {
        if ((this.b.get() <= 0) || (!(p3 instanceof g1.v))) {
            ((android.text.SpanWatcher) this.a).onSpanRemoved(p2, p3, p4, p5);
            return;
        } else {
            return;
        }
    }

    public final void onTextChanged(CharSequence p2, int p3, int p4, int p5)
    {
        ((android.text.TextWatcher) this.a).onTextChanged(p2, p3, p4, p5);
        return;
    }
}
