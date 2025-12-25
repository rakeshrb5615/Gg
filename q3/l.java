package q3;
public final class l implements android.view.View$OnAttachStateChangeListener {

    public final void onViewAttachedToWindow(android.view.View p1)
    {
        p1.removeOnAttachStateChangeListener(this);
        p1.requestApplyInsets();
        return;
    }

    public final void onViewDetachedFromWindow(android.view.View p1)
    {
        return;
    }
}
