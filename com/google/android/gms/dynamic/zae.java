package com.google.android.gms.dynamic;
final class zae implements android.view.View$OnClickListener {
    final synthetic android.content.Context zaa;
    final synthetic android.content.Intent zab;

    public zae(android.content.Context p1, android.content.Intent p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public final void onClick(android.view.View p3)
    {
        try {
            this.zaa.startActivity(this.zab);
            return;
        } catch (android.content.ActivityNotFoundException v3_1) {
            android.util.Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", v3_1);
            return;
        }
    }
}
