package a2;
public final class e1 {
    public int a;
    public int b;
    public int c;
    public int d;
    public android.view.animation.Interpolator e;
    public boolean f;
    public int g;

    public final void a(androidx.recyclerview.widget.RecyclerView p7)
    {
        String v0_0 = this.d;
        if (v0_0 < null) {
            if (!this.f) {
                this.g = 0;
                return;
            } else {
                String v0_6 = this.e;
                if ((v0_6 != null) && (this.c < 1)) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    int v3_1 = this.c;
                    if (v3_1 < 1) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    } else {
                        p7.h0.c(this.a, this.b, v3_1, v0_6);
                        String v7_7 = (this.g + 1);
                        this.g = v7_7;
                        if (v7_7 > 10) {
                            android.util.Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f = 0;
                        return;
                    }
                }
            }
        } else {
            this.d = -1;
            p7.Q(v0_0);
            this.f = 0;
            return;
        }
    }
}
