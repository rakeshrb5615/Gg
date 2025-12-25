package com.google.android.gms.common.api.internal;
final class zacl extends com.google.android.gms.common.api.internal.UnregisterListenerMethod {
    final synthetic com.google.android.gms.common.api.internal.RegistrationMethods$Builder zaa;

    public zacl(com.google.android.gms.common.api.internal.RegistrationMethods$Builder p1, com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey p2)
    {
        this.zaa = p1;
        super(p2);
        return;
    }

    public final void unregisterListener(com.google.android.gms.common.api.Api$AnyClient p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        com.google.android.gms.common.api.internal.RegistrationMethods$Builder.zab(this.zaa).accept(p2, p3);
        return;
    }
}
