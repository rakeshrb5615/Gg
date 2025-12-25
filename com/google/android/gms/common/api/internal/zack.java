package com.google.android.gms.common.api.internal;
final class zack extends com.google.android.gms.common.api.internal.RegisterListenerMethod {
    final synthetic com.google.android.gms.common.api.internal.RegistrationMethods$Builder zaa;

    public zack(com.google.android.gms.common.api.internal.RegistrationMethods$Builder p1, com.google.android.gms.common.api.internal.ListenerHolder p2, com.google.android.gms.common.Feature[] p3, boolean p4, int p5)
    {
        this.zaa = p1;
        super(p2, p3, p4, p5);
        return;
    }

    public final void registerListener(com.google.android.gms.common.api.Api$AnyClient p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        com.google.android.gms.common.api.internal.RegistrationMethods$Builder.zaa(this.zaa).accept(p2, p3);
        return;
    }
}
