package i1;
public final class c extends g1.g implements java.lang.Runnable {
    public final ref.WeakReference a;
    public final ref.WeakReference b;

    public c(android.widget.TextView p2, i1.d p3)
    {
        this.a = new ref.WeakReference(p2);
        this.b = new ref.WeakReference(p3);
        return;
    }

    public final void b()
    {
        android.os.Handler v0_2 = ((android.widget.TextView) this.a.get());
        if (v0_2 != null) {
            android.os.Handler v0_3 = v0_2.getHandler();
            if (v0_3 != null) {
                v0_3.post(this);
            }
        }
        return;
    }

    public final void run()
    {
        boolean v0_2 = ((android.widget.TextView) this.a.get());
        int v1_5 = ((android.text.InputFilter) this.b.get());
        if ((v1_5 != 0) && (v0_2)) {
            android.text.Spannable v2_0 = v0_2.getFilters();
            if (v2_0 != null) {
                int v4_0 = 0;
                while (v4_0 < v2_0.length) {
                    if (v2_0[v4_0] != v1_5) {
                        v4_0++;
                    } else {
                        if (!v0_2.isAttachedToWindow()) {
                            break;
                        }
                        int v4_1;
                        int v1_1 = v0_2.getText();
                        android.text.Spannable v2_1 = g1.i.a();
                        if (v1_1 != 0) {
                            v2_1.getClass();
                            v4_1 = v1_1.length();
                        } else {
                            v4_1 = 0;
                        }
                        android.text.Spannable v2_2 = v2_1.e(v1_1, 0, v4_1);
                        if (v1_1 == v2_2) {
                            break;
                        }
                        int v1_2 = android.text.Selection.getSelectionStart(v2_2);
                        int v3_1 = android.text.Selection.getSelectionEnd(v2_2);
                        v0_2.setText(v2_2);
                        if (!(v2_2 instanceof android.text.Spannable)) {
                            break;
                        }
                        android.text.Spannable v2_3 = ((android.text.Spannable) v2_2);
                        if ((v1_2 < 0) || (v3_1 < 0)) {
                            if (v1_2 < 0) {
                                if (v3_1 < 0) {
                                    break;
                                }
                                android.text.Selection.setSelection(v2_3, v3_1);
                                return;
                            } else {
                                android.text.Selection.setSelection(v2_3, v1_2);
                                return;
                            }
                        } else {
                            android.text.Selection.setSelection(v2_3, v1_2, v3_1);
                            return;
                        }
                    }
                }
            }
        }
        return;
    }
}
