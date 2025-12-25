package r3;
public class c {
    public android.window.OnBackInvokedCallback a;

    public android.window.OnBackInvokedCallback a(r3.b p3)
    {
        java.util.Objects.requireNonNull(p3);
        return new h.v(p3, 2);
    }

    public void b(r3.b p2, android.view.View p3, boolean p4)
    {
        if (this.a == null) {
            android.window.OnBackInvokedDispatcher v3_1 = p3.findOnBackInvokedDispatcher();
            if (v3_1 != null) {
                int v4_1;
                android.window.OnBackInvokedCallback v2_1 = this.a(p2);
                this.a = v2_1;
                if (p4 == 0) {
                    v4_1 = 0;
                } else {
                    v4_1 = 1000000;
                }
                v3_1.registerOnBackInvokedCallback(v4_1, v2_1);
                return;
            }
        }
        return;
    }

    public void c(android.view.View p2)
    {
        if (this.a != null) {
            int v2_1 = p2.findOnBackInvokedDispatcher();
            if (v2_1 != 0) {
                v2_1.unregisterOnBackInvokedCallback(this.a);
                this.a = 0;
                return;
            }
        }
        return;
    }
}
