package com.google.android.gms.auth.api.signin;
public class GoogleSignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final com.google.android.gms.common.util.Clock zaa;
    final int zab;
    final java.util.List zac;
    private final String zad;
    private final String zae;
    private final String zaf;
    private final String zag;
    private final android.net.Uri zah;
    private String zai;
    private final long zaj;
    private final String zak;
    private final String zal;
    private final String zam;
    private final java.util.Set zan;

    static GoogleSignInAccount()
    {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR = new com.google.android.gms.auth.api.signin.zab();
        com.google.android.gms.auth.api.signin.GoogleSignInAccount.zaa = com.google.android.gms.common.util.DefaultClock.getInstance();
        return;
    }

    public GoogleSignInAccount(int p2, String p3, String p4, String p5, String p6, android.net.Uri p7, String p8, long p9, String p11, java.util.List p12, String p13, String p14)
    {
        this.zan = new java.util.HashSet();
        this.zab = p2;
        this.zad = p3;
        this.zae = p4;
        this.zaf = p5;
        this.zag = p6;
        this.zah = p7;
        this.zai = p8;
        this.zaj = p9;
        this.zak = p11;
        this.zac = p12;
        this.zal = p13;
        this.zam = p14;
        return;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount createDefault()
    {
        return com.google.android.gms.auth.api.signin.GoogleSignInAccount.zae(new android.accounts.Account("<<default account>>", "com.google"), new java.util.HashSet());
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount fromAccount(android.accounts.Account p2)
    {
        return com.google.android.gms.auth.api.signin.GoogleSignInAccount.zae(p2, new r.f(0));
    }

    public static varargs com.google.android.gms.auth.api.signin.GoogleSignInAccount fromAccountAndScopes(android.accounts.Account p1, com.google.android.gms.common.api.Scope p2, com.google.android.gms.common.api.Scope[] p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        java.util.HashSet v0_1 = new java.util.HashSet();
        v0_1.add(p2);
        v0_1.addAll(java.util.Arrays.asList(p3));
        return com.google.android.gms.auth.api.signin.GoogleSignInAccount.zae(p1, v0_1);
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount zaa(String p14, String p15, String p16, String p17, String p18, String p19, android.net.Uri p20, Long p21, String p22, java.util.Set p23)
    {
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(3, p14, p15, p16, p17, p20, 0, p21.longValue(), com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p22), new java.util.ArrayList(((java.util.Collection) com.google.android.gms.common.internal.Preconditions.checkNotNull(p23))), p18, p19);
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount zab(String p12)
    {
        String v1 = 0;
        if (!android.text.TextUtils.isEmpty(p12)) {
            int v8;
            org.json.JSONObject v0_2 = new org.json.JSONObject(p12);
            com.google.android.gms.auth.api.signin.GoogleSignInAccount v12_9 = v0_2.optString("photoUrl");
            if (android.text.TextUtils.isEmpty(v12_9)) {
                v8 = 0;
            } else {
                v8 = android.net.Uri.parse(v12_9);
            }
            String v2_1 = Long.parseLong(v0_2.getString("expirationTime"));
            java.util.HashSet v11_1 = new java.util.HashSet();
            com.google.android.gms.auth.api.signin.GoogleSignInAccount v12_5 = v0_2.getJSONArray("grantedScopes");
            int v4_0 = v12_5.length();
            int v5_0 = 0;
            while (v5_0 < v4_0) {
                v11_1.add(new com.google.android.gms.common.api.Scope(v12_5.getString(v5_0)));
                v5_0++;
            }
            int v4_2;
            com.google.android.gms.auth.api.signin.GoogleSignInAccount v12_7 = v0_2.optString("id");
            if (!v0_2.has("tokenId")) {
                v4_2 = 0;
            } else {
                v4_2 = v0_2.optString("tokenId");
            }
            int v5_3;
            if (!v0_2.has("email")) {
                v5_3 = 0;
            } else {
                v5_3 = v0_2.optString("email");
            }
            int v6_2;
            if (!v0_2.has("displayName")) {
                v6_2 = 0;
            } else {
                v6_2 = v0_2.optString("displayName");
            }
            int v7_2;
            if (!v0_2.has("givenName")) {
                v7_2 = 0;
            } else {
                v7_2 = v0_2.optString("givenName");
            }
            Long v9_2;
            if (!v0_2.has("familyName")) {
                v9_2 = 0;
            } else {
                v9_2 = v0_2.optString("familyName");
            }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount v12_10 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.zaa(v12_7, v4_2, v5_3, v6_2, v7_2, v9_2, v8, Long.valueOf(v2_1), v0_2.getString("obfuscatedIdentifier"), v11_1);
            if (v0_2.has("serverAuthCode")) {
                v1 = v0_2.optString("serverAuthCode");
            }
            v12_10.zai = v1;
            return v12_10;
        } else {
            return 0;
        }
    }

    private static com.google.android.gms.auth.api.signin.GoogleSignInAccount zae(android.accounts.Account p10, java.util.Set p11)
    {
        return com.google.android.gms.auth.api.signin.GoogleSignInAccount.zaa(0, 0, p10.name, 0, 0, 0, 0, Long.valueOf(0), p10.name, p11);
    }

    public boolean equals(Object p5)
    {
        if (p5) {
            if (p5 != this) {
                if ((p5 instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
                    if ((!((com.google.android.gms.auth.api.signin.GoogleSignInAccount) p5).zak.equals(this.zak)) || (!((com.google.android.gms.auth.api.signin.GoogleSignInAccount) p5).getRequestedScopes().equals(this.getRequestedScopes()))) {
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
        } else {
            return 0;
        }
    }

    public android.accounts.Account getAccount()
    {
        int v0_0 = this.zaf;
        if (v0_0 != 0) {
            return new android.accounts.Account(v0_0, "com.google");
        } else {
            return 0;
        }
    }

    public String getDisplayName()
    {
        return this.zag;
    }

    public String getEmail()
    {
        return this.zaf;
    }

    public String getFamilyName()
    {
        return this.zam;
    }

    public String getGivenName()
    {
        return this.zal;
    }

    public java.util.Set getGrantedScopes()
    {
        return new java.util.HashSet(this.zac);
    }

    public String getId()
    {
        return this.zad;
    }

    public String getIdToken()
    {
        return this.zae;
    }

    public android.net.Uri getPhotoUrl()
    {
        return this.zah;
    }

    public java.util.Set getRequestedScopes()
    {
        java.util.HashSet v0_1 = new java.util.HashSet(this.zac);
        v0_1.addAll(this.zan);
        return v0_1;
    }

    public String getServerAuthCode()
    {
        return this.zai;
    }

    public int hashCode()
    {
        return (((this.zak.hashCode() + 527) * 31) + this.getRequestedScopes().hashCode());
    }

    public boolean isExpired()
    {
        if ((com.google.android.gms.auth.api.signin.GoogleSignInAccount.zaa.currentTimeMillis() / 1000) < (this.zaj + -300)) {
            return 0;
        } else {
            return 1;
        }
    }

    public varargs com.google.android.gms.auth.api.signin.GoogleSignInAccount requestExtraScopes(com.google.android.gms.common.api.Scope[] p2)
    {
        if (p2 != null) {
            java.util.Collections.addAll(this.zan, p2);
        }
        return this;
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p5, 1, this.zab);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.getId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.getIdToken(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 4, this.getEmail(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 5, this.getDisplayName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 6, this.getPhotoUrl(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 7, this.getServerAuthCode(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(p5, 8, this.zaj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 9, this.zak, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 10, this.zac, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 11, this.getGivenName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 12, this.getFamilyName(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final String zac()
    {
        return this.zak;
    }

    public final String zad()
    {
        String v0_1 = new org.json.JSONObject();
        if (this.getId() != null) {
            v0_1.put("id", this.getId());
        }
        if (this.getIdToken() != null) {
            v0_1.put("tokenId", this.getIdToken());
        }
        if (this.getEmail() != null) {
            v0_1.put("email", this.getEmail());
        }
        if (this.getDisplayName() != null) {
            v0_1.put("displayName", this.getDisplayName());
        }
        if (this.getGivenName() != null) {
            v0_1.put("givenName", this.getGivenName());
        }
        if (this.getFamilyName() != null) {
            v0_1.put("familyName", this.getFamilyName());
        }
        org.json.JSONArray v1_11 = this.getPhotoUrl();
        if (v1_11 != null) {
            v0_1.put("photoUrl", v1_11.toString());
        }
        if (this.getServerAuthCode() != null) {
            v0_1.put("serverAuthCode", this.getServerAuthCode());
        }
        v0_1.put("expirationTime", this.zaj);
        v0_1.put("obfuscatedIdentifier", this.zak);
        org.json.JSONArray v1_19 = new org.json.JSONArray();
        String v3_2 = this.zac;
        int v4_1 = new com.google.android.gms.common.api.Scope[v3_2.size()];
        String v3_4 = ((com.google.android.gms.common.api.Scope[]) v3_2.toArray(v4_1));
        java.util.Arrays.sort(v3_4, com.google.android.gms.auth.api.signin.zaa.zaa);
        int v4_3 = v3_4.length;
        int v5 = 0;
        while (v5 < v4_3) {
            v1_19.put(v3_4[v5].getScopeUri());
            v5++;
        }
        v0_1.put("grantedScopes", v1_19);
        v0_1.remove("serverAuthCode");
        return v0_1.toString();
    }
}
