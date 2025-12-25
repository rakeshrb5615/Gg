package androidx.appcompat.widget;
public class SearchView$SearchAutoComplete extends n.o {
    public int e;
    public boolean f;
    public final a2.l m;

    public SearchView$SearchAutoComplete(android.content.Context p1, android.util.AttributeSet p2)
    {
        super(p1, p2);
        super.m = new a2.l(super, 5);
        super.e = super.getThreshold();
        return;
    }

    private int getSearchViewTextMinWidthDp()
    {
        int v0_8 = this.getResources().getConfiguration();
        int v1 = v0_8.screenWidthDp;
        int v2 = v0_8.screenHeightDp;
        if ((v1 < 960) || ((v2 < 720) || (v0_8.orientation != 2))) {
            if ((v1 < 600) && ((v1 < 640) || (v2 < 480))) {
                return 160;
            } else {
                return 192;
            }
        } else {
            return 256;
        }
    }

    public final boolean enoughToFilter()
    {
        if ((this.e > 0) && (!super.enoughToFilter())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p2)
    {
        android.view.inputmethod.InputConnection v2_1 = super.onCreateInputConnection(p2);
        if (this.f) {
            a2.l v0_1 = this.m;
            this.removeCallbacks(v0_1);
            this.post(v0_1);
        }
        return v2_1;
    }

    public final void onFinishInflate()
    {
        super.onFinishInflate();
        this.setMinWidth(((int) android.util.TypedValue.applyDimension(1, ((float) this.getSearchViewTextMinWidthDp()), this.getResources().getDisplayMetrics())));
        return;
    }

    public final void onFocusChanged(boolean p1, int p2, android.graphics.Rect p3)
    {
        super.onFocusChanged(p1, p2, p3);
        throw 0;
    }

    public final boolean onKeyPreIme(int p3, android.view.KeyEvent p4)
    {
        if (p3 == 4) {
            if ((p4.getAction() != 0) || (p4.getRepeatCount() != 0)) {
                if (p4.getAction() == 1) {
                    boolean v0_2 = this.getKeyDispatcherState();
                    if (v0_2) {
                        v0_2.handleUpEvent(p4);
                    }
                    if ((p4.isTracking()) && (!p4.isCanceled())) {
                        throw 0;
                    }
                }
            } else {
                int v3_3 = this.getKeyDispatcherState();
                if (v3_3 != 0) {
                    v3_3.startTracking(p4, this);
                }
                return 1;
            }
        }
        return super.onKeyPreIme(p3, p4);
    }

    public final void onWindowFocusChanged(boolean p1)
    {
        super.onWindowFocusChanged(p1);
        if (p1 != 0) {
            throw 0;
        } else {
            return;
        }
    }

    public final void performCompletion()
    {
        return;
    }

    public final void replaceText(CharSequence p1)
    {
        return;
    }

    public void setImeVisibility(boolean p4)
    {
        android.view.inputmethod.InputMethodManager v0_2 = ((android.view.inputmethod.InputMethodManager) this.getContext().getSystemService("input_method"));
        a2.l v1_1 = this.m;
        if (p4 != 0) {
            if (!v0_2.isActive(this)) {
                this.f = 1;
                return;
            } else {
                this.f = 0;
                this.removeCallbacks(v1_1);
                v0_2.showSoftInput(this, 0);
                return;
            }
        } else {
            this.f = 0;
            this.removeCallbacks(v1_1);
            v0_2.hideSoftInputFromWindow(this.getWindowToken(), 0);
            return;
        }
    }

    public void setSearchView(n.r2 p1)
    {
        return;
    }

    public void setThreshold(int p1)
    {
        super.setThreshold(p1);
        this.e = p1;
        return;
    }
}
