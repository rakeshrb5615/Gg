package com.google.android.gms.auth.api.credentials;
public class Credential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    private final String zba;
    private final String zbb;
    private final android.net.Uri zbc;
    private final java.util.List zbd;
    private final String zbe;
    private final String zbf;
    private final String zbg;
    private final String zbh;

    static Credential()
    {
        com.google.android.gms.auth.api.credentials.Credential.CREATOR = new com.google.android.gms.auth.api.credentials.zba();
        return;
    }

    public Credential(String p4, String p5, android.net.Uri p6, java.util.List p7, String p8, String p9, String p10, String p11)
    {
        IllegalArgumentException v4_5 = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "credential identifier cannot be null")).trim();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v4_5, "credential identifier cannot be empty");
        if ((p8 != null) && (android.text.TextUtils.isEmpty(p8))) {
            throw new IllegalArgumentException("Password must not be empty if set");
        } else {
            if (p9 != null) {
                Boolean v0_6;
                if (!android.text.TextUtils.isEmpty(p9)) {
                    Boolean v0_3 = android.net.Uri.parse(p9);
                    if ((v0_3.isAbsolute()) && ((v0_3.isHierarchical()) && ((!android.text.TextUtils.isEmpty(v0_3.getScheme())) && (!android.text.TextUtils.isEmpty(v0_3.getAuthority()))))) {
                        int v2_1 = 1;
                        if ((!"http".equalsIgnoreCase(v0_3.getScheme())) && (!"https".equalsIgnoreCase(v0_3.getScheme()))) {
                            v2_1 = 0;
                        }
                        v0_6 = Boolean.valueOf(v2_1);
                    } else {
                        v0_6 = Boolean.FALSE;
                    }
                } else {
                    v0_6 = Boolean.FALSE;
                }
                if (!v0_6.booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if ((!android.text.TextUtils.isEmpty(p9)) && (!android.text.TextUtils.isEmpty(p8))) {
                throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
            } else {
                if ((p5 != null) && (android.text.TextUtils.isEmpty(p5.trim()))) {
                    p5 = 0;
                }
                java.util.List v5_4;
                this.zbb = p5;
                this.zbc = p6;
                if (p7 != null) {
                    v5_4 = java.util.Collections.unmodifiableList(p7);
                } else {
                    v5_4 = java.util.Collections.EMPTY_LIST;
                }
                this.zbd = v5_4;
                this.zba = v4_5;
                this.zbe = p8;
                this.zbf = p9;
                this.zbg = p10;
                this.zbh = p11;
                return;
            }
        }
    }

    public static bridge synthetic android.net.Uri zba(com.google.android.gms.auth.api.credentials.Credential p0)
    {
        return p0.zbc;
    }

    public static bridge synthetic String zbb(com.google.android.gms.auth.api.credentials.Credential p0)
    {
        return p0.zbf;
    }

    public static bridge synthetic String zbc(com.google.android.gms.auth.api.credentials.Credential p0)
    {
        return p0.zbh;
    }

    public static bridge synthetic String zbd(com.google.android.gms.auth.api.credentials.Credential p0)
    {
        return p0.zbg;
    }

    public static bridge synthetic String zbe(com.google.android.gms.auth.api.credentials.Credential p0)
    {
        return p0.zba;
    }

    public static bridge synthetic String zbf(com.google.android.gms.auth.api.credentials.Credential p0)
    {
        return p0.zbb;
    }

    public static bridge synthetic String zbg(com.google.android.gms.auth.api.credentials.Credential p0)
    {
        return p0.zbe;
    }

    public static bridge synthetic java.util.List zbh(com.google.android.gms.auth.api.credentials.Credential p0)
    {
        return p0.zbd;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.auth.api.credentials.Credential)) {
                if ((!android.text.TextUtils.equals(this.zba, ((com.google.android.gms.auth.api.credentials.Credential) p5).zba)) || ((!android.text.TextUtils.equals(this.zbb, ((com.google.android.gms.auth.api.credentials.Credential) p5).zbb)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zbc, ((com.google.android.gms.auth.api.credentials.Credential) p5).zbc)) || ((!android.text.TextUtils.equals(this.zbe, ((com.google.android.gms.auth.api.credentials.Credential) p5).zbe)) || (!android.text.TextUtils.equals(this.zbf, ((com.google.android.gms.auth.api.credentials.Credential) p5).zbf)))))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public String getAccountType()
    {
        return this.zbf;
    }

    public String getFamilyName()
    {
        return this.zbh;
    }

    public String getGivenName()
    {
        return this.zbg;
    }

    public String getId()
    {
        return this.zba;
    }

    public java.util.List getIdTokens()
    {
        return this.zbd;
    }

    public String getName()
    {
        return this.zbb;
    }

    public String getPassword()
    {
        return this.zbe;
    }

    public android.net.Uri getProfilePictureUri()
    {
        return this.zbc;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zba, this.zbb, this.zbc, this.zbe, this.zbf}));
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 1, this.getId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.getName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.getProfilePictureUri(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 4, this.getIdTokens(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 5, this.getPassword(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 6, this.getAccountType(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 9, this.getGivenName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 10, this.getFamilyName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
