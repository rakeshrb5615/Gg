package n;
public class w extends android.widget.EditText implements q0.u {
    public final n.p a;
    public final n.x0 b;
    public final n.c0 c;
    public final t0.i d;
    public final n.c0 e;
    public n.v f;

    public w(android.content.Context p5, android.util.AttributeSet p6)
    {
        n.u2.a(p5);
        super(p5, p6, 2130969050);
        n.t2.a(super, super.getContext());
        android.text.method.KeyListener v5_12 = new n.p(super);
        super.a = v5_12;
        v5_12.q(p6, 2130969050);
        android.text.method.KeyListener v5_2 = new n.x0(super);
        super.b = v5_2;
        v5_2.f(p6, 2130969050);
        v5_2.b();
        android.text.method.KeyListener v5_4 = new n.c0();
        v5_4.b = super;
        super.c = v5_4;
        super.d = new t0.i();
        android.text.method.KeyListener v5_8 = new n.c0(super);
        super.e = v5_8;
        v5_8.b(p6, 2130969050);
        android.text.method.KeyListener v6_1 = super.getKeyListener();
        if (!(v6_1 instanceof android.text.method.NumberKeyListener)) {
            boolean v0_2 = super.isFocusable();
            boolean v1 = super.isClickable();
            boolean v2 = super.isLongClickable();
            int v3 = super.getInputType();
            android.text.method.KeyListener v5_9 = v5_8.a(v6_1);
            if (v5_9 != v6_1) {
                super.setKeyListener(v5_9);
                super.setRawInputType(v3);
                super.setFocusable(v0_2);
                super.setClickable(v1);
                super.setLongClickable(v2);
            }
        }
        return;
    }

    private n.v getSuperCaller()
    {
        if (this.f == null) {
            this.f = new n.v(this);
        }
        return this.f;
    }

    public final q0.g a(q0.g p2)
    {
        this.d.getClass();
        return t0.i.a(this, p2);
    }

    public final void drawableStateChanged()
    {
        super.drawableStateChanged();
        n.x0 v0_0 = this.a;
        if (v0_0 != null) {
            v0_0.a();
        }
        n.x0 v0_1 = this.b;
        if (v0_1 != null) {
            v0_1.b();
        }
        return;
    }

    public android.view.ActionMode$Callback getCustomSelectionActionModeCallback()
    {
        return c4.b.h0(super.getCustomSelectionActionModeCallback());
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.o();
        }
    }

    public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.p();
        }
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList()
    {
        return this.b.d();
    }

    public android.graphics.PorterDuff$Mode getSupportCompoundDrawablesTintMode()
    {
        return this.b.e();
    }

    public android.text.Editable getText()
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            return super.getEditableText();
        } else {
            return super.getText();
        }
    }

    public bridge synthetic CharSequence getText()
    {
        return this.getText();
    }

    public android.view.textclassifier.TextClassifier getTextClassifier()
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            android.view.textclassifier.TextClassifier v0_5 = this.c;
            if (v0_5 != null) {
                android.view.textclassifier.TextClassifier v1_2 = ((android.view.textclassifier.TextClassifier) v0_5.c);
                if (v1_2 != null) {
                    return v1_2;
                } else {
                    return n.s0.a(((android.widget.TextView) v0_5.b));
                }
            }
        }
        this.getSuperCaller();
        return super.getTextClassifier();
    }

    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p4)
    {
        s0.a v0 = super.onCreateInputConnection(p4);
        this.b.getClass();
        n.x0.h(p4, v0, this);
        a.a.M(p4, v0, this);
        if ((v0 != null) && (android.os.Build$VERSION.SDK_INT <= 30)) {
            a5.a v1_0 = q0.q0.h(this);
            if (v1_0 != null) {
                p4.contentMimeTypes = v1_0;
                v0 = new s0.a(v0, new a5.a(this, 17));
            }
        }
        return this.e.c(v0, p4);
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        android.view.inputmethod.InputMethodManager v0_0 = android.os.Build$VERSION.SDK_INT;
        if ((v0_0 >= 30) && (v0_0 < 33)) {
            ((android.view.inputmethod.InputMethodManager) this.getContext().getSystemService("input_method")).isActive(this);
        }
        return;
    }

    public final boolean onDragEvent(android.view.DragEvent p6)
    {
        boolean v3 = 0;
        if ((android.os.Build$VERSION.SDK_INT < 31) && ((p6.getLocalState() == null) && (q0.q0.h(this) != null))) {
            String v0_1 = this.getContext();
            while ((v0_1 instanceof android.content.ContextWrapper)) {
                if (!(v0_1 instanceof android.app.Activity)) {
                    v0_1 = ((android.content.ContextWrapper) v0_1).getBaseContext();
                } else {
                    String v0_2 = ((android.app.Activity) v0_1);
                }
                if (v0_2 != null) {
                    if ((p6.getAction() != 1) && (p6.getAction() == 3)) {
                        v3 = n.f0.a(p6, this, v0_2);
                    }
                } else {
                    String v0_5 = new StringBuilder("Can\'t handle drop: no activity: view=");
                    v0_5.append(this);
                    android.util.Log.i("ReceiveContent", v0_5.toString());
                }
            }
            v0_2 = 0;
        }
        if (!v3) {
            return super.onDragEvent(p6);
        } else {
            return 1;
        }
    }

    public final boolean onTextContextMenuItem(int p7)
    {
        q0.e v0_0 = android.os.Build$VERSION.SDK_INT;
        if ((v0_0 < 31) && ((q0.q0.h(this) != null) && ((p7 == 16908322) || (p7 == 16908337)))) {
            android.content.ClipData v3_3;
            android.content.ClipData v3_2 = ((android.content.ClipboardManager) this.getContext().getSystemService("clipboard"));
            if (v3_2 != null) {
                v3_3 = v3_2.getPrimaryClip();
            } else {
                v3_3 = 0;
            }
            if ((v3_3 != null) && (v3_3.getItemCount() > 0)) {
                q0.e v0_2;
                if (v0_0 < 31) {
                    v0_2 = new q0.e();
                    v0_2.b = v3_3;
                    v0_2.c = 1;
                } else {
                    v0_2 = new q0.c(v3_3, 1);
                }
                q0.g v7_1;
                if (p7 != 16908322) {
                    v7_1 = 1;
                } else {
                    v7_1 = 0;
                }
                v0_2.f(v7_1);
                q0.q0.j(this, v0_2.build());
            }
            return 1;
        } else {
            return super.onTextContextMenuItem(p7);
        }
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable p1)
    {
        super.setBackgroundDrawable(p1);
        n.p v1_1 = this.a;
        if (v1_1 != null) {
            v1_1.r();
        }
        return;
    }

    public void setBackgroundResource(int p2)
    {
        super.setBackgroundResource(p2);
        n.p v0 = this.a;
        if (v0 != null) {
            v0.s(p2);
        }
        return;
    }

    public final void setCompoundDrawables(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        super.setCompoundDrawables(p1, p2, p3, p4);
        n.x0 v1_1 = this.b;
        if (v1_1 != null) {
            v1_1.b();
        }
        return;
    }

    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        super.setCompoundDrawablesRelative(p1, p2, p3, p4);
        n.x0 v1_1 = this.b;
        if (v1_1 != null) {
            v1_1.b();
        }
        return;
    }

    public void setCustomSelectionActionModeCallback(android.view.ActionMode$Callback p1)
    {
        super.setCustomSelectionActionModeCallback(c4.b.i0(p1, this));
        return;
    }

    public void setEmojiCompatEnabled(boolean p2)
    {
        this.e.d(p2);
        return;
    }

    public void setKeyListener(android.text.method.KeyListener p2)
    {
        super.setKeyListener(this.e.a(p2));
        return;
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList p2)
    {
        n.p v0 = this.a;
        if (v0 != null) {
            v0.u(p2);
        }
        return;
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.p v0 = this.a;
        if (v0 != null) {
            v0.v(p2);
        }
        return;
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList p2)
    {
        n.x0 v0 = this.b;
        v0.l(p2);
        v0.b();
        return;
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.x0 v0 = this.b;
        v0.m(p2);
        v0.b();
        return;
    }

    public final void setTextAppearance(android.content.Context p2, int p3)
    {
        super.setTextAppearance(p2, p3);
        n.x0 v0 = this.b;
        if (v0 != null) {
            v0.g(p2, p3);
        }
        return;
    }

    public void setTextClassifier(android.view.textclassifier.TextClassifier p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            n.w v0_1 = this.c;
            if (v0_1 != null) {
                v0_1.c = p3;
                return;
            }
        }
        this.getSuperCaller();
        super.setTextClassifier(p3);
        return;
    }
}
