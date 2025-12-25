package g1;
public final class t extends android.text.SpannableStringBuilder {
    public final Class a;
    public final java.util.ArrayList b;

    public t(Class p1, g1.t p2, int p3, int p4)
    {
        super(p2, p3, p4);
        super.b = new java.util.ArrayList();
        p0.e.d(p1, "watcherClass cannot be null");
        super.a = p1;
        return;
    }

    public t(Class p1, CharSequence p2)
    {
        super(p2);
        super.b = new java.util.ArrayList();
        p0.e.d(p1, "watcherClass cannot be null");
        super.a = p1;
        return;
    }

    public final void a()
    {
        int v0 = 0;
        while(true) {
            java.util.concurrent.atomic.AtomicInteger v1_0 = this.b;
            if (v0 >= v1_0.size()) {
                break;
            }
            ((g1.s) v1_0.get(v0)).b.incrementAndGet();
            v0++;
        }
        return;
    }

    public final android.text.Editable append(char p1)
    {
        super.append(p1);
        return this;
    }

    public final android.text.Editable append(CharSequence p1)
    {
        super.append(p1);
        return this;
    }

    public final android.text.Editable append(CharSequence p1, int p2, int p3)
    {
        super.append(p1, p2, p3);
        return this;
    }

    public final android.text.SpannableStringBuilder append(char p1)
    {
        super.append(p1);
        return this;
    }

    public final android.text.SpannableStringBuilder append(CharSequence p1)
    {
        super.append(p1);
        return this;
    }

    public final android.text.SpannableStringBuilder append(CharSequence p1, int p2, int p3)
    {
        super.append(p1, p2, p3);
        return this;
    }

    public final android.text.SpannableStringBuilder append(CharSequence p1, Object p2, int p3)
    {
        super.append(p1, p2, p3);
        return this;
    }

    public final Appendable append(char p1)
    {
        super.append(p1);
        return this;
    }

    public final Appendable append(CharSequence p1)
    {
        super.append(p1);
        return this;
    }

    public final Appendable append(CharSequence p1, int p2, int p3)
    {
        super.append(p1, p2, p3);
        return this;
    }

    public final void b()
    {
        this.e();
        int v1 = 0;
        while(true) {
            g1.s v2_1 = this.b;
            if (v1 >= v2_1.size()) {
                break;
            }
            ((g1.s) v2_1.get(v1)).onTextChanged(this, 0, this.length(), this.length());
            v1++;
        }
        return;
    }

    public final g1.s c(Object p4)
    {
        int v0 = 0;
        while(true) {
            g1.s v1_0 = this.b;
            if (v0 >= v1_0.size()) {
                return 0;
            } else {
                g1.s v1_2 = ((g1.s) v1_0.get(v0));
                if (v1_2.a == p4) {
                    break;
                }
                v0++;
            }
        }
        return v1_2;
    }

    public final boolean d(Object p2)
    {
        if ((p2 == 0) || (this.a != p2.getClass())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final android.text.Editable delete(int p1, int p2)
    {
        super.delete(p1, p2);
        return this;
    }

    public final android.text.SpannableStringBuilder delete(int p1, int p2)
    {
        super.delete(p1, p2);
        return this;
    }

    public final void e()
    {
        int v0 = 0;
        while(true) {
            java.util.concurrent.atomic.AtomicInteger v1_0 = this.b;
            if (v0 >= v1_0.size()) {
                break;
            }
            ((g1.s) v1_0.get(v0)).b.decrementAndGet();
            v0++;
        }
        return;
    }

    public final int getSpanEnd(Object p2)
    {
        if (this.d(p2)) {
            g1.s v0_1 = this.c(p2);
            if (v0_1 != null) {
                p2 = v0_1;
            }
        }
        return super.getSpanEnd(p2);
    }

    public final int getSpanFlags(Object p2)
    {
        if (this.d(p2)) {
            g1.s v0_1 = this.c(p2);
            if (v0_1 != null) {
                p2 = v0_1;
            }
        }
        return super.getSpanFlags(p2);
    }

    public final int getSpanStart(Object p2)
    {
        if (this.d(p2)) {
            g1.s v0_1 = this.c(p2);
            if (v0_1 != null) {
                p2 = v0_1;
            }
        }
        return super.getSpanStart(p2);
    }

    public final Object[] getSpans(int p2, int p3, Class p4)
    {
        if (this.a != p4) {
            return super.getSpans(p2, p3, p4);
        } else {
            Object[] v2_3 = ((g1.s[]) super.getSpans(p2, p3, g1.s));
            Object[] v3_2 = ((Object[]) reflect.Array.newInstance(p4, v2_3.length));
            int v4_1 = 0;
            while (v4_1 < v2_3.length) {
                v3_2[v4_1] = v2_3[v4_1].a;
                v4_1++;
            }
            return v3_2;
        }
    }

    public final android.text.Editable insert(int p1, CharSequence p2)
    {
        super.insert(p1, p2);
        return this;
    }

    public final android.text.Editable insert(int p1, CharSequence p2, int p3, int p4)
    {
        super.insert(p1, p2, p3, p4);
        return this;
    }

    public final android.text.SpannableStringBuilder insert(int p1, CharSequence p2)
    {
        super.insert(p1, p2);
        return this;
    }

    public final android.text.SpannableStringBuilder insert(int p1, CharSequence p2, int p3, int p4)
    {
        super.insert(p1, p2, p3, p4);
        return this;
    }

    public final int nextSpanTransition(int p2, int p3, Class p4)
    {
        if ((p4 == null) || (this.a == p4)) {
            p4 = g1.s;
        }
        return super.nextSpanTransition(p2, p3, p4);
    }

    public final void removeSpan(Object p2)
    {
        int v0_1;
        if (!this.d(p2)) {
            v0_1 = 0;
        } else {
            v0_1 = this.c(p2);
            if (v0_1 != 0) {
                p2 = v0_1;
            }
        }
        super.removeSpan(p2);
        if (v0_1 != 0) {
            this.b.remove(v0_1);
        }
        return;
    }

    public final bridge synthetic android.text.Editable replace(int p1, int p2, CharSequence p3)
    {
        this.replace(p1, p2, p3);
        return this;
    }

    public final bridge synthetic android.text.Editable replace(int p1, int p2, CharSequence p3, int p4, int p5)
    {
        this.replace(p1, p2, p3, p4, p5);
        return this;
    }

    public final android.text.SpannableStringBuilder replace(int p1, int p2, CharSequence p3)
    {
        this.a();
        super.replace(p1, p2, p3);
        this.e();
        return this;
    }

    public final android.text.SpannableStringBuilder replace(int p1, int p2, CharSequence p3, int p4, int p5)
    {
        this.a();
        super.replace(p1, p2, p3, p4, p5);
        this.e();
        return this;
    }

    public final void setSpan(Object p2, int p3, int p4, int p5)
    {
        if (this.d(p2)) {
            g1.s v0_2 = new g1.s(p2);
            this.b.add(v0_2);
            p2 = v0_2;
        }
        super.setSpan(p2, p3, p4, p5);
        return;
    }

    public final CharSequence subSequence(int p3, int p4)
    {
        return new g1.t(this.a, this, p3, p4);
    }
}
