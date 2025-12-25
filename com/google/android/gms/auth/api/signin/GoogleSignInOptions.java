package com.google.android.gms.auth.api.signin;
public class GoogleSignInOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Api$ApiOptions$Optional, com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions DEFAULT_SIGN_IN;
    public static final com.google.android.gms.common.api.Scope zaa;
    public static final com.google.android.gms.common.api.Scope zab;
    public static final com.google.android.gms.common.api.Scope zac;
    public static final com.google.android.gms.common.api.Scope zad;
    public static final com.google.android.gms.common.api.Scope zae;
    private static final java.util.Comparator zag;
    final int zaf;
    private final java.util.ArrayList zah;
    private android.accounts.Account zai;
    private boolean zaj;
    private final boolean zak;
    private final boolean zal;
    private String zam;
    private String zan;
    private java.util.ArrayList zao;
    private String zap;
    private java.util.Map zaq;

    static GoogleSignInOptions()
    {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.zaa = new com.google.android.gms.common.api.Scope("profile");
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.zab = new com.google.android.gms.common.api.Scope("email");
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.zac = new com.google.android.gms.common.api.Scope("openid");
        com.google.android.gms.auth.api.signin.zac v0_3 = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/games_lite");
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.zad = v0_3;
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.zae = new com.google.android.gms.common.api.Scope("https://www.googleapis.com/auth/games");
        com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder v1_5 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder();
        v1_5.requestId();
        v1_5.requestProfile();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN = v1_5.build();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder v1_8 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder();
        com.google.android.gms.common.api.Scope[] v2_2 = new com.google.android.gms.common.api.Scope[0];
        v1_8.requestScopes(v0_3, v2_2);
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN = v1_8.build();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR = new com.google.android.gms.auth.api.signin.zae();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.zag = new com.google.android.gms.auth.api.signin.zac();
        return;
    }

    public GoogleSignInOptions(int p12, java.util.ArrayList p13, android.accounts.Account p14, boolean p15, boolean p16, boolean p17, String p18, String p19, java.util.ArrayList p20, String p21)
    {
        this(p12, p13, p14, p15, p16, p17, p18, p19, com.google.android.gms.auth.api.signin.GoogleSignInOptions.zam(p20), p21);
        return;
    }

    private GoogleSignInOptions(int p1, java.util.ArrayList p2, android.accounts.Account p3, boolean p4, boolean p5, boolean p6, String p7, String p8, java.util.Map p9, String p10)
    {
        this.zaf = p1;
        this.zah = p2;
        this.zai = p3;
        this.zaj = p4;
        this.zak = p5;
        this.zal = p6;
        this.zam = p7;
        this.zan = p8;
        this.zao = new java.util.ArrayList(p9.values());
        this.zaq = p9;
        this.zap = p10;
        return;
    }

    public synthetic GoogleSignInOptions(int p1, java.util.ArrayList p2, android.accounts.Account p3, boolean p4, boolean p5, boolean p6, String p7, String p8, java.util.Map p9, String p10, com.google.android.gms.auth.api.signin.zad p11)
    {
        this(3, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        return;
    }

    public static bridge synthetic android.accounts.Account zaa(com.google.android.gms.auth.api.signin.GoogleSignInOptions p0)
    {
        return p0.zai;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInOptions zab(String p17)
    {
        String v1 = 0;
        if (!android.text.TextUtils.isEmpty(p17)) {
            org.json.JSONObject v0_2 = new org.json.JSONObject(p17);
            String v2_8 = new java.util.HashSet();
            boolean v3_0 = v0_2.getJSONArray("scopes");
            android.accounts.Account v4_0 = v3_0.length();
            String v5_0 = 0;
            while (v5_0 < v4_0) {
                v2_8.add(new com.google.android.gms.common.api.Scope(v3_0.getString(v5_0)));
                v5_0++;
            }
            boolean v3_2;
            if (!v0_2.has("accountName")) {
                v3_2 = 0;
            } else {
                v3_2 = v0_2.optString("accountName");
            }
            int v9;
            if (android.text.TextUtils.isEmpty(v3_2)) {
                v9 = 0;
            } else {
                v9 = new android.accounts.Account(v3_2, "com.google");
            }
            int v13;
            java.util.ArrayList v8_1 = new java.util.ArrayList(v2_8);
            boolean v10 = v0_2.getBoolean("idTokenRequested");
            boolean v11 = v0_2.getBoolean("serverAuthRequested");
            boolean v12 = v0_2.getBoolean("forceCodeForRefreshToken");
            if (!v0_2.has("serverClientId")) {
                v13 = 0;
            } else {
                v13 = v0_2.optString("serverClientId");
            }
            if (v0_2.has("hostedDomain")) {
                v1 = v0_2.optString("hostedDomain");
            }
            return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, v8_1, v9, v10, v11, v12, v13, v1, new java.util.HashMap(), 0);
        } else {
            return 0;
        }
    }

    public static bridge synthetic String zac(com.google.android.gms.auth.api.signin.GoogleSignInOptions p0)
    {
        return p0.zan;
    }

    public static bridge synthetic String zad(com.google.android.gms.auth.api.signin.GoogleSignInOptions p0)
    {
        return p0.zap;
    }

    public static bridge synthetic String zae(com.google.android.gms.auth.api.signin.GoogleSignInOptions p0)
    {
        return p0.zam;
    }

    public static bridge synthetic java.util.ArrayList zag(com.google.android.gms.auth.api.signin.GoogleSignInOptions p0)
    {
        return p0.zao;
    }

    public static bridge synthetic java.util.ArrayList zah(com.google.android.gms.auth.api.signin.GoogleSignInOptions p0)
    {
        return p0.zah;
    }

    public static bridge synthetic java.util.Map zai(java.util.List p0)
    {
        return com.google.android.gms.auth.api.signin.GoogleSignInOptions.zam(p0);
    }

    public static bridge synthetic boolean zaj(com.google.android.gms.auth.api.signin.GoogleSignInOptions p0)
    {
        return p0.zal;
    }

    public static bridge synthetic boolean zak(com.google.android.gms.auth.api.signin.GoogleSignInOptions p0)
    {
        return p0.zaj;
    }

    public static bridge synthetic boolean zal(com.google.android.gms.auth.api.signin.GoogleSignInOptions p0)
    {
        return p0.zak;
    }

    private static java.util.Map zam(java.util.List p3)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        if (p3 != null) {
            java.util.Iterator v3_1 = p3.iterator();
            while (v3_1.hasNext()) {
                com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable v1_0 = ((com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable) v3_1.next());
                v0_1.put(Integer.valueOf(v1_0.getType()), v1_0);
            }
        }
        return v0_1;
    }

    public boolean equals(Object p4)
    {
        if (p4 != 0) {
            try {
                if (this.zao.isEmpty()) {
                    if (((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p4).zao.isEmpty()) {
                        if (this.zah.size() == ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p4).getScopes().size()) {
                            if (this.zah.containsAll(((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p4).getScopes())) {
                                String v1_4 = this.zai;
                                if (v1_4 != null) {
                                    if (!v1_4.equals(((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p4).getAccount())) {
                                    }
                                } else {
                                    if (((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p4).getAccount() != null) {
                                    } else {
                                    }
                                }
                                if (!android.text.TextUtils.isEmpty(this.zam)) {
                                    if (!this.zam.equals(((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p4).getServerClientId())) {
                                    }
                                } else {
                                    if (!android.text.TextUtils.isEmpty(((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p4).getServerClientId())) {
                                    } else {
                                    }
                                }
                                if ((this.zal == ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p4).isForceCodeForRefreshToken()) && ((this.zaj == ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p4).isIdTokenRequested()) && ((this.zak == ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p4).isServerAuthCodeRequested()) && (android.text.TextUtils.equals(this.zap, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p4).getLogSessionId()))))) {
                                    return 1;
                                }
                            } else {
                            }
                        }
                    } else {
                    }
                }
            } catch (ClassCastException) {
            }
            return 0;
        } else {
            return 0;
        }
    }

    public android.accounts.Account getAccount()
    {
        return this.zai;
    }

    public java.util.ArrayList getExtensions()
    {
        return this.zao;
    }

    public String getLogSessionId()
    {
        return this.zap;
    }

    public com.google.android.gms.common.api.Scope[] getScopeArray()
    {
        com.google.android.gms.common.api.Scope[] v0_2 = new com.google.android.gms.common.api.Scope[this.zah.size()];
        return ((com.google.android.gms.common.api.Scope[]) this.zah.toArray(v0_2));
    }

    public java.util.ArrayList getScopes()
    {
        return new java.util.ArrayList(this.zah);
    }

    public String getServerClientId()
    {
        return this.zam;
    }

    public int hashCode()
    {
        int v0_1 = new java.util.ArrayList();
        com.google.android.gms.auth.api.signin.internal.HashAccumulator v1_0 = this.zah;
        int v2 = v1_0.size();
        int v3 = 0;
        while (v3 < v2) {
            v0_1.add(((com.google.android.gms.common.api.Scope) v1_0.get(v3)).getScopeUri());
            v3++;
        }
        java.util.Collections.sort(v0_1);
        com.google.android.gms.auth.api.signin.internal.HashAccumulator v1_2 = new com.google.android.gms.auth.api.signin.internal.HashAccumulator();
        v1_2.addObject(v0_1);
        v1_2.addObject(this.zai);
        v1_2.addObject(this.zam);
        v1_2.zaa(this.zal);
        v1_2.zaa(this.zaj);
        v1_2.zaa(this.zak);
        v1_2.addObject(this.zap);
        return v1_2.hash();
    }

    public boolean isForceCodeForRefreshToken()
    {
        return this.zal;
    }

    public boolean isIdTokenRequested()
    {
        return this.zaj;
    }

    public boolean isServerAuthCodeRequested()
    {
        return this.zak;
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        String v0_0 = this.zaf;
        int v1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, v0_0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 2, this.getScopes(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.getAccount(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 4, this.isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 5, this.isServerAuthCodeRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(p5, 6, this.isForceCodeForRefreshToken());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 7, this.getServerClientId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 8, this.zan, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 9, this.getExtensions(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 10, this.getLogSessionId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v1);
        return;
    }

    public final String zaf()
    {
        String v0_1 = new org.json.JSONObject();
        String v1_7 = new org.json.JSONArray();
        java.util.Collections.sort(this.zah, com.google.android.gms.auth.api.signin.GoogleSignInOptions.zag);
        String v2_8 = this.zah;
        int v3_1 = v2_8.size();
        int v4 = 0;
        while (v4 < v3_1) {
            String v5_0 = v2_8.get(v4);
            v4++;
            v1_7.put(((com.google.android.gms.common.api.Scope) v5_0).getScopeUri());
        }
        v0_1.put("scopes", v1_7);
        String v1_0 = this.zai;
        if (v1_0 != null) {
            v0_1.put("accountName", v1_0.name);
        }
        v0_1.put("idTokenRequested", this.zaj);
        v0_1.put("forceCodeForRefreshToken", this.zal);
        v0_1.put("serverAuthRequested", this.zak);
        if (!android.text.TextUtils.isEmpty(this.zam)) {
            v0_1.put("serverClientId", this.zam);
        }
        if (!android.text.TextUtils.isEmpty(this.zan)) {
            v0_1.put("hostedDomain", this.zan);
        }
        return v0_1.toString();
    }
}
