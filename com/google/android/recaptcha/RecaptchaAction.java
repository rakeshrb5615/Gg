package com.google.android.recaptcha;
public final class RecaptchaAction {
    public static final com.google.android.recaptcha.RecaptchaAction$Companion Companion;
    public static final com.google.android.recaptcha.RecaptchaAction LOGIN;
    public static final com.google.android.recaptcha.RecaptchaAction SIGNUP;
    private final String action;

    static RecaptchaAction()
    {
        com.google.android.recaptcha.RecaptchaAction.Companion = new com.google.android.recaptcha.RecaptchaAction$Companion(0);
        com.google.android.recaptcha.RecaptchaAction.LOGIN = new com.google.android.recaptcha.RecaptchaAction("login");
        com.google.android.recaptcha.RecaptchaAction.SIGNUP = new com.google.android.recaptcha.RecaptchaAction("signup");
        return;
    }

    private RecaptchaAction(String p1)
    {
        this.action = p1;
        return;
    }

    public synthetic RecaptchaAction(String p1, kotlin.jvm.internal.f p2)
    {
        this(p1);
        return;
    }

    public static synthetic com.google.android.recaptcha.RecaptchaAction copy$default(com.google.android.recaptcha.RecaptchaAction p0, String p1, int p2, Object p3)
    {
        if ((p2 & 1) != 0) {
            p1 = p0.action;
        }
        return p0.copy(p1);
    }

    public static final com.google.android.recaptcha.RecaptchaAction custom(String p1)
    {
        return com.google.android.recaptcha.RecaptchaAction.Companion.custom(p1);
    }

    public final String component1()
    {
        return this.action;
    }

    public final com.google.android.recaptcha.RecaptchaAction copy(String p2)
    {
        return new com.google.android.recaptcha.RecaptchaAction(p2);
    }

    public boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof com.google.android.recaptcha.RecaptchaAction)) {
                if (kotlin.jvm.internal.j.a(this.action, ((com.google.android.recaptcha.RecaptchaAction) p4).action)) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final String getAction()
    {
        return this.action;
    }

    public int hashCode()
    {
        return this.action.hashCode();
    }

    public String toString()
    {
        return v1.a.n(new StringBuilder("RecaptchaAction(action="), this.action, ")");
    }
}
