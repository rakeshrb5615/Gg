package com.google.android.gms.auth.api.signin;
public final class GoogleSignIn {

    private GoogleSignIn()
    {
        return;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount getAccountForExtension(android.content.Context p1, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "please provide a valid Context object");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "please provide valid GoogleSignInOptionsExtension");
        com.google.android.gms.auth.api.signin.GoogleSignInAccount v1_2 = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(p1);
        if (v1_2 == null) {
            v1_2 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.createDefault();
        }
        return v1_2.requestExtraScopes(com.google.android.gms.auth.api.signin.GoogleSignIn.zbb(p2.getImpliedScopes()));
    }

    public static varargs com.google.android.gms.auth.api.signin.GoogleSignInAccount getAccountForScopes(android.content.Context p1, com.google.android.gms.common.api.Scope p2, com.google.android.gms.common.api.Scope[] p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "please provide a valid Context object");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "please provide at least one valid scope");
        com.google.android.gms.auth.api.signin.GoogleSignInAccount v1_1 = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(p1);
        if (v1_1 == null) {
            v1_1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.createDefault();
        }
        v1_1.requestExtraScopes(new com.google.android.gms.common.api.Scope[] {p2}));
        v1_1.requestExtraScopes(p3);
        return v1_1;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInClient getClient(android.app.Activity p1, com.google.android.gms.auth.api.signin.GoogleSignInOptions p2)
    {
        return new com.google.android.gms.auth.api.signin.GoogleSignInClient(p1, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2)));
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInClient getClient(android.content.Context p1, com.google.android.gms.auth.api.signin.GoogleSignInOptions p2)
    {
        return new com.google.android.gms.auth.api.signin.GoogleSignInClient(p1, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2)));
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount getLastSignedInAccount(android.content.Context p0)
    {
        return com.google.android.gms.auth.api.signin.internal.zbn.zbc(p0).zba();
    }

    public static com.google.android.gms.tasks.Task getSignedInAccountFromIntent(android.content.Intent p2)
    {
        com.google.android.gms.tasks.Task v2_1 = com.google.android.gms.auth.api.signin.internal.zbm.zbd(p2);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount v0 = v2_1.getSignInAccount();
        if ((v2_1.getStatus().isSuccess()) && (v0 != null)) {
            return com.google.android.gms.tasks.Tasks.forResult(v0);
        } else {
            return com.google.android.gms.tasks.Tasks.forException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(v2_1.getStatus()));
        }
    }

    public static boolean hasPermissions(com.google.android.gms.auth.api.signin.GoogleSignInAccount p1, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Please provide a non-null GoogleSignInOptionsExtension");
        return com.google.android.gms.auth.api.signin.GoogleSignIn.hasPermissions(p1, com.google.android.gms.auth.api.signin.GoogleSignIn.zbb(p2.getImpliedScopes()));
    }

    public static varargs boolean hasPermissions(com.google.android.gms.auth.api.signin.GoogleSignInAccount p1, com.google.android.gms.common.api.Scope[] p2)
    {
        if (p1) {
            java.util.HashSet v0_1 = new java.util.HashSet();
            java.util.Collections.addAll(v0_1, p2);
            return p1.getGrantedScopes().containsAll(v0_1);
        } else {
            return 0;
        }
    }

    public static void requestPermissions(android.app.Activity p1, int p2, com.google.android.gms.auth.api.signin.GoogleSignInAccount p3, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "Please provide a non-null Activity");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "Please provide a non-null GoogleSignInOptionsExtension");
        com.google.android.gms.auth.api.signin.GoogleSignIn.requestPermissions(p1, p2, p3, com.google.android.gms.auth.api.signin.GoogleSignIn.zbb(p4.getImpliedScopes()));
        return;
    }

    public static varargs void requestPermissions(android.app.Activity p1, int p2, com.google.android.gms.auth.api.signin.GoogleSignInAccount p3, com.google.android.gms.common.api.Scope[] p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "Please provide a non-null Activity");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "Please provide at least one scope");
        p1.startActivityForResult(com.google.android.gms.auth.api.signin.GoogleSignIn.zba(p1, p3, p4), p2);
        return;
    }

    public static void requestPermissions(androidx.fragment.app.e0 p1, int p2, com.google.android.gms.auth.api.signin.GoogleSignInAccount p3, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "Please provide a non-null Fragment");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "Please provide a non-null GoogleSignInOptionsExtension");
        com.google.android.gms.auth.api.signin.GoogleSignIn.requestPermissions(p1, p2, p3, com.google.android.gms.auth.api.signin.GoogleSignIn.zbb(p4.getImpliedScopes()));
        return;
    }

    public static varargs void requestPermissions(androidx.fragment.app.e0 p1, int p2, com.google.android.gms.auth.api.signin.GoogleSignInAccount p3, com.google.android.gms.common.api.Scope[] p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "Please provide a non-null Fragment");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "Please provide at least one scope");
        p1.startActivityForResult(com.google.android.gms.auth.api.signin.GoogleSignIn.zba(p1.getActivity(), p3, p4), p2);
        return;
    }

    private static varargs android.content.Intent zba(android.app.Activity p2, com.google.android.gms.auth.api.signin.GoogleSignInAccount p3, com.google.android.gms.common.api.Scope[] p4)
    {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder v0_1 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder();
        if (p4.length > 0) {
            v0_1.requestScopes(p4[0], p4);
        }
        if ((p3 != null) && (!android.text.TextUtils.isEmpty(p3.getEmail()))) {
            v0_1.setAccountName(((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3.getEmail())));
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInClient(p2, v0_1.build()).getSignInIntent();
    }

    private static com.google.android.gms.common.api.Scope[] zbb(java.util.List p1)
    {
        if (p1 != null) {
            com.google.android.gms.common.api.Scope[] v0_1 = new com.google.android.gms.common.api.Scope[p1.size()];
            return ((com.google.android.gms.common.api.Scope[]) p1.toArray(v0_1));
        } else {
            com.google.android.gms.common.api.Scope[] v1_4 = new com.google.android.gms.common.api.Scope[0];
            return v1_4;
        }
    }
}
