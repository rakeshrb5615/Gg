package com.google.android.gms.auth.api.signin;
public interface GoogleSignInOptionsExtension {
    public static final int FITNESS = 3;
    public static final int GAMES = 1;

    public abstract int getExtensionType();

    public abstract java.util.List getImpliedScopes();

    public abstract android.os.Bundle toBundle();
}
