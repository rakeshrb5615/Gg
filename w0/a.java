package w0;
public abstract class a {

    public static final void a(android.view.View p3)
    {
        kotlin.jvm.internal.j.e(p3, "<this>");
        java.util.ArrayList v0_6 = new q0.s0(p3, 0);
        ClassCastException v3_5 = new a8.g();
        v3_5.d = q4.b.k(v3_5, v3_5, v0_6);
        while (v3_5.hasNext()) {
            java.util.ArrayList v0_3 = ((android.view.View) v3_5.next());
            int v2_1 = ((w0.b) v0_3.getTag(2131362307));
            if (v2_1 == 0) {
                v2_1 = new w0.b();
                v0_3.setTag(2131362307, v2_1);
            }
            java.util.ArrayList v0_5 = v2_1.a;
            int v1_1 = a.a.y(v0_5);
            if (-1 < v1_1) {
                v0_5.get(v1_1).getClass();
                throw new ClassCastException();
            }
        }
        return;
    }

    public static com.google.android.gms.common.api.Status k(String p3)
    {
        if (!android.text.TextUtils.isEmpty(p3)) {
            com.google.android.gms.common.api.Status v3_10 = p3.split(":", 2);
            v3_10[0] = v3_10[0].trim();
            if (v3_10.length > 1) {
                String v1_2 = v3_10[1];
                if (v1_2 != null) {
                    v3_10[1] = v1_2.trim();
                }
            }
            com.google.android.gms.common.api.Status v3_1 = java.util.Arrays.asList(v3_10);
            if (v3_1.size() <= 1) {
                return w0.a.l(((String) v3_1.get(0)), 0);
            } else {
                return w0.a.l(((String) v3_1.get(0)), ((String) v3_1.get(1)));
            }
        } else {
            return new com.google.android.gms.common.api.Status(17499);
        }
    }

    public static com.google.android.gms.common.api.Status l(String p3, String p4)
    {
        p3.getClass();
        int v1_0 = -1;
        switch (p3.hashCode()) {
            case -2130504259:
                if (p3.equals("USER_CANCELLED")) {
                    v1_0 = 0;
                } else {
                }
                break;
            case -2065866930:
                if (p3.equals("INVALID_RECIPIENT_EMAIL")) {
                    v1_0 = 1;
                } else {
                }
                break;
            case -2014808264:
                if (p3.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    v1_0 = 2;
                } else {
                }
                break;
            case -2005236790:
                if (p3.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    v1_0 = 3;
                } else {
                }
                break;
            case -2001169389:
                if (p3.equals("INVALID_IDP_RESPONSE")) {
                    v1_0 = 4;
                } else {
                }
                break;
            case -1944433728:
                if (p3.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    v1_0 = 5;
                } else {
                }
                break;
            case -1800638118:
                if (p3.equals("QUOTA_EXCEEDED")) {
                    v1_0 = 6;
                } else {
                }
                break;
            case -1774756919:
                if (p3.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    v1_0 = 7;
                } else {
                }
                break;
            case -1699246888:
                if (p3.equals("INVALID_RECAPTCHA_VERSION")) {
                    v1_0 = 8;
                } else {
                }
                break;
            case -1603818979:
                if (p3.equals("RECAPTCHA_NOT_ENABLED")) {
                    v1_0 = 9;
                } else {
                }
                break;
            case -1587614300:
                if (p3.equals("EXPIRED_OOB_CODE")) {
                    v1_0 = 10;
                } else {
                }
                break;
            case -1584641425:
                if (p3.equals("UNAUTHORIZED_DOMAIN")) {
                    v1_0 = 11;
                } else {
                }
                break;
            case -1583894766:
                if (p3.equals("INVALID_OOB_CODE")) {
                    v1_0 = 12;
                } else {
                }
                break;
            case -1458751677:
                if (p3.equals("MISSING_EMAIL")) {
                    v1_0 = 13;
                } else {
                }
                break;
            case -1421414571:
                if (p3.equals("INVALID_CODE")) {
                    v1_0 = 14;
                } else {
                }
                break;
            case -1368998244:
                if (p3.equals("INVALID_HOSTING_LINK_DOMAIN")) {
                    v1_0 = 15;
                } else {
                }
                break;
            case -1345867105:
                if (p3.equals("TOKEN_EXPIRED")) {
                    v1_0 = 16;
                } else {
                }
                break;
            case -1340100504:
                if (p3.equals("INVALID_TENANT_ID")) {
                    v1_0 = 17;
                } else {
                }
                break;
            case -1242922234:
                if (p3.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    v1_0 = 18;
                } else {
                }
                break;
            case -1232010689:
                if (p3.equals("INVALID_SESSION_INFO")) {
                    v1_0 = 19;
                } else {
                }
                break;
            case -1202691903:
                if (p3.equals("SECOND_FACTOR_EXISTS")) {
                    v1_0 = 20;
                } else {
                }
                break;
            case -1112393964:
                if (p3.equals("INVALID_EMAIL")) {
                    v1_0 = 21;
                } else {
                }
                break;
            case -1063710844:
                if (p3.equals("ADMIN_ONLY_OPERATION")) {
                    v1_0 = 22;
                } else {
                }
                break;
            case -974503964:
                if (p3.equals("MISSING_OR_INVALID_NONCE")) {
                    v1_0 = 23;
                } else {
                }
                break;
            case -863830559:
                if (p3.equals("INVALID_CERT_HASH")) {
                    v1_0 = 24;
                } else {
                }
                break;
            case -828507413:
                if (p3.equals("NO_SUCH_PROVIDER")) {
                    v1_0 = 25;
                } else {
                }
                break;
            case -749743758:
                if (p3.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    v1_0 = 26;
                } else {
                }
                break;
            case -736207500:
                if (p3.equals("MISSING_PASSWORD")) {
                    v1_0 = 27;
                } else {
                }
                break;
            case -646022241:
                if (p3.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    v1_0 = 28;
                } else {
                }
                break;
            case -595928767:
                if (p3.equals("TIMEOUT")) {
                    v1_0 = 29;
                } else {
                }
                break;
            case -505579581:
                if (p3.equals("INVALID_REQ_TYPE")) {
                    v1_0 = 30;
                } else {
                }
                break;
            case -406804866:
                if (p3.equals("INVALID_LOGIN_CREDENTIALS")) {
                    v1_0 = 31;
                } else {
                }
                break;
            case -380728810:
                if (p3.equals("INVALID_RECAPTCHA_ACTION")) {
                    v1_0 = 32;
                } else {
                }
                break;
            case -333672188:
                if (p3.equals("OPERATION_NOT_ALLOWED")) {
                    v1_0 = 33;
                } else {
                }
                break;
            case -294485423:
                if (p3.equals("WEB_INTERNAL_ERROR")) {
                    v1_0 = 34;
                } else {
                }
                break;
            case -217128228:
                if (p3.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    v1_0 = 35;
                } else {
                }
                break;
            case -122667194:
                if (p3.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    v1_0 = 36;
                } else {
                }
                break;
            case -75433118:
                if (p3.equals("USER_NOT_FOUND")) {
                    v1_0 = 37;
                } else {
                }
                break;
            case -52772551:
                if (p3.equals("CAPTCHA_CHECK_FAILED")) {
                    v1_0 = 38;
                } else {
                }
                break;
            case -40686718:
                if (p3.equals("WEAK_PASSWORD")) {
                    v1_0 = 39;
                } else {
                }
                break;
            case 15352275:
                if (p3.equals("EMAIL_NOT_FOUND")) {
                    v1_0 = 40;
                } else {
                }
                break;
            case 210308040:
                if (p3.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    v1_0 = 41;
                } else {
                }
                break;
            case 269327773:
                if (p3.equals("INVALID_SENDER")) {
                    v1_0 = 42;
                } else {
                }
                break;
            case 278802867:
                if (p3.equals("MISSING_PHONE_NUMBER")) {
                    v1_0 = 43;
                } else {
                }
                break;
            case 408411681:
                if (p3.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    v1_0 = 44;
                } else {
                }
                break;
            case 423563023:
                if (p3.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    v1_0 = 45;
                } else {
                }
                break;
            case 429251986:
                if (p3.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    v1_0 = 46;
                } else {
                }
                break;
            case 483847807:
                if (p3.equals("EMAIL_EXISTS")) {
                    v1_0 = 47;
                } else {
                }
                break;
            case 491979549:
                if (p3.equals("INVALID_ID_TOKEN")) {
                    v1_0 = 48;
                } else {
                }
                break;
            case 492072102:
                if (p3.equals("WEB_STORAGE_UNSUPPORTED")) {
                    v1_0 = 49;
                } else {
                }
                break;
            case 492515765:
                if (p3.equals("MISSING_CLIENT_TYPE")) {
                    v1_0 = 50;
                } else {
                }
                break;
            case 530628231:
                if (p3.equals("MISSING_RECAPTCHA_VERSION")) {
                    v1_0 = 51;
                } else {
                }
                break;
            case 542728406:
                if (p3.equals("PASSWORD_LOGIN_DISABLED")) {
                    v1_0 = 52;
                } else {
                }
                break;
            case 582457886:
                if (p3.equals("UNVERIFIED_EMAIL")) {
                    v1_0 = 53;
                } else {
                }
                break;
            case 605031096:
                if (p3.equals("REJECTED_CREDENTIAL")) {
                    v1_0 = 54;
                } else {
                }
                break;
            case 745638750:
                if (p3.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    v1_0 = 55;
                } else {
                }
                break;
            case 786916712:
                if (p3.equals("INVALID_VERIFICATION_PROOF")) {
                    v1_0 = 56;
                } else {
                }
                break;
            case 799258561:
                if (p3.equals("INVALID_PROVIDER_ID")) {
                    v1_0 = 57;
                } else {
                }
                break;
            case 819646646:
                if (p3.equals("CREDENTIAL_MISMATCH")) {
                    v1_0 = 58;
                } else {
                }
                break;
            case 844240628:
                if (p3.equals("WEB_CONTEXT_CANCELED")) {
                    v1_0 = 59;
                } else {
                }
                break;
            case 886186878:
                if (p3.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    v1_0 = 60;
                } else {
                }
                break;
            case 895302372:
                if (p3.equals("MISSING_CLIENT_IDENTIFIER")) {
                    v1_0 = 61;
                } else {
                }
                break;
            case 922685102:
                if (p3.equals("INVALID_MESSAGE_PAYLOAD")) {
                    v1_0 = 62;
                } else {
                }
                break;
            case 989000548:
                if (p3.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    v1_0 = 63;
                } else {
                }
                break;
            case 1034932393:
                if (p3.equals("INVALID_PENDING_TOKEN")) {
                    v1_0 = 64;
                } else {
                }
                break;
            case 1072360691:
                if (p3.equals("INVALID_CUSTOM_TOKEN")) {
                    v1_0 = 65;
                } else {
                }
                break;
            case 1094975491:
                if (p3.equals("INVALID_PASSWORD")) {
                    v1_0 = 66;
                } else {
                }
                break;
            case 1107081238:
                if (p3.equals("<<Network Error>>")) {
                    v1_0 = 67;
                } else {
                }
                break;
            case 1113992697:
                if (p3.equals("INVALID_RECAPTCHA_TOKEN")) {
                    v1_0 = 68;
                } else {
                }
                break;
            case 1141576252:
                if (p3.equals("SESSION_EXPIRED")) {
                    v1_0 = 69;
                } else {
                }
                break;
            case 1199811910:
                if (p3.equals("MISSING_CODE")) {
                    v1_0 = 70;
                } else {
                }
                break;
            case 1226505451:
                if (p3.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    v1_0 = 71;
                } else {
                }
                break;
            case 1308491624:
                if (p3.equals("MISSING_RECAPTCHA_TOKEN")) {
                    v1_0 = 72;
                } else {
                }
                break;
            case 1388786705:
                if (p3.equals("INVALID_IDENTIFIER")) {
                    v1_0 = 73;
                } else {
                }
                break;
            case 1433767024:
                if (p3.equals("USER_DISABLED")) {
                    v1_0 = 74;
                } else {
                }
                break;
            case 1442968770:
                if (p3.equals("INVALID_PHONE_NUMBER")) {
                    v1_0 = 75;
                } else {
                }
                break;
            case 1494923453:
                if (p3.equals("INVALID_APP_CREDENTIAL")) {
                    v1_0 = 76;
                } else {
                }
                break;
            case 1497901284:
                if (p3.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    v1_0 = 77;
                } else {
                }
                break;
            case 1803454477:
                if (p3.equals("MISSING_CONTINUE_URI")) {
                    v1_0 = 78;
                } else {
                }
                break;
            case 1898790704:
                if (p3.equals("MISSING_SESSION_INFO")) {
                    v1_0 = 79;
                } else {
                }
                break;
            case 2063209097:
                if (p3.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    v1_0 = 80;
                } else {
                }
                break;
            case 2082564316:
                if (p3.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    v1_0 = 81;
                } else {
                }
                break;
            default:
        }
        int v1_1;
        switch (v1_0) {
            case 0:
                v1_1 = 18001;
                break;
            case 1:
                v1_1 = 17033;
                break;
            case 2:
                v1_1 = 17057;
                break;
            case 3:
                v1_1 = 17091;
                break;
            case 4:
            case 31:
            case 64:
                v1_1 = 17004;
                break;
            case 5:
                v1_1 = 17068;
                break;
            case 6:
                v1_1 = 17052;
                break;
            case 7:
                v1_1 = 17061;
                break;
            case 8:
                v1_1 = 17206;
                break;
            case 9:
                v1_1 = 17200;
                break;
            case 10:
                v1_1 = 17029;
                break;
            case 11:
                v1_1 = 17038;
                break;
            case 12:
                v1_1 = 17030;
                break;
            case 13:
                v1_1 = 17034;
                break;
            case 14:
                v1_1 = 17044;
                break;
            case 15:
                v1_1 = 17214;
                break;
            case 16:
                v1_1 = 17021;
                break;
            case 17:
                v1_1 = 17079;
                break;
            case 18:
                v1_1 = 18002;
                break;
            case 19:
                v1_1 = 17046;
                break;
            case 20:
                v1_1 = 17087;
                break;
            case 21:
            case 73:
                v1_1 = 17008;
                break;
            case 22:
                v1_1 = 17085;
                break;
            case 23:
                v1_1 = 17094;
                break;
            case 24:
                v1_1 = 17064;
                break;
            case 25:
                v1_1 = 17016;
                break;
            case 26:
                v1_1 = 17084;
                break;
            case 27:
                v1_1 = 17035;
                break;
            case 28:
                v1_1 = 17014;
                break;
            case 29:
            case 67:
                v1_1 = 17020;
                break;
            case 30:
                v1_1 = 17207;
                break;
            case 32:
                v1_1 = 17203;
                break;
            case 33:
            case 52:
                v1_1 = 17006;
                break;
            case 34:
                v1_1 = 17062;
                break;
            case 35:
                v1_1 = 17088;
                break;
            case 36:
                v1_1 = 17082;
                break;
            case 37:
            case 40:
                v1_1 = 17011;
                break;
            case 38:
                v1_1 = 17056;
                break;
            case 39:
                v1_1 = 17026;
                break;
            case 41:
                v1_1 = 17089;
                break;
            case 42:
                v1_1 = 17032;
                break;
            case 43:
                v1_1 = 17041;
                break;
            case 44:
                v1_1 = 17074;
                break;
            case 45:
                v1_1 = 17081;
                break;
            case 46:
                v1_1 = 17095;
                break;
            case 47:
                v1_1 = 17007;
                break;
            case 48:
                v1_1 = 17017;
                break;
            case 49:
                v1_1 = 17065;
                break;
            case 50:
                v1_1 = 17204;
                break;
            case 51:
                v1_1 = 17205;
                break;
            case 53:
                v1_1 = 17086;
                break;
            case 54:
                v1_1 = 17075;
                break;
            case 55:
                v1_1 = 17083;
                break;
            case 56:
                v1_1 = 17049;
                break;
            case 57:
                v1_1 = 17071;
                break;
            case 58:
                v1_1 = 17002;
                break;
            case 59:
                v1_1 = 17058;
                break;
            case 60:
                v1_1 = 17078;
                break;
            case 61:
                v1_1 = 17093;
                break;
            case 62:
                v1_1 = 17031;
                break;
            case 63:
            case 77:
                v1_1 = 17010;
                break;
            case 65:
                v1_1 = 17000;
                break;
            case 66:
                v1_1 = 17009;
                break;
            case 68:
                v1_1 = 17202;
                break;
            case 69:
                v1_1 = 17051;
                break;
            case 70:
                v1_1 = 17043;
                break;
            case 71:
                v1_1 = 17025;
                break;
            case 72:
                v1_1 = 17201;
                break;
            case 74:
                v1_1 = 17005;
                break;
            case 75:
                v1_1 = 17042;
                break;
            case 76:
                v1_1 = 17028;
                break;
            case 78:
                v1_1 = 17040;
                break;
            case 79:
                v1_1 = 17045;
                break;
            case 80:
                v1_1 = 17090;
                break;
            case 81:
                v1_1 = 17073;
                break;
            default:
                v1_1 = 17499;
        }
        if (v1_1 != 17499) {
            return new com.google.android.gms.common.api.Status(v1_1, p4);
        } else {
            if (p4 == null) {
                return new com.google.android.gms.common.api.Status(v1_1, p3);
            } else {
                return new com.google.android.gms.common.api.Status(v1_1, g2.g.e(p3, ":", p4));
            }
        }
    }

    public abstract int b();

    public abstract int c();

    public int d(android.view.View p1)
    {
        return 0;
    }

    public int e()
    {
        return 0;
    }

    public void f(android.view.View p1, int p2)
    {
        return;
    }

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract boolean j();
}
