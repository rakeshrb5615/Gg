package h4;
public final class e extends d4.d {
    public final d4.l b;
    public final com.google.android.gms.tasks.TaskCompletionSource c;
    public final synthetic h4.f d;

    public e(h4.f p4, com.google.android.gms.tasks.TaskCompletionSource p5)
    {
        d4.l v0_1 = new d4.l("OnRequestInstallCallback", 3);
        this.d = p4;
        super(1);
        super.attachInterface(super, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        super.b = v0_1;
        super.c = p5;
        return;
    }
}
