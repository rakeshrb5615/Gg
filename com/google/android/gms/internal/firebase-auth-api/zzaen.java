package com.google.android.gms.internal.firebase-auth-api;
public final class zzaen {
    private static final android.util.SparseArray zza;

    static zzaen()
    {
        android.util.SparseArray v0_1 = new android.util.SparseArray();
        com.google.android.gms.internal.firebase-auth-api.zzaen.zza = v0_1;
        v0_1.put(17000, new android.util.Pair("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation."));
        v0_1.put(17002, new android.util.Pair("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience."));
        v0_1.put(17004, new android.util.Pair("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is incorrect, malformed or has expired."));
        v0_1.put(17008, new android.util.Pair("ERROR_INVALID_EMAIL", "The email address is badly formatted."));
        v0_1.put(17009, new android.util.Pair("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password."));
        v0_1.put(17024, new android.util.Pair("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user."));
        v0_1.put(17014, new android.util.Pair("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request."));
        v0_1.put(17012, new android.util.Pair("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."));
        v0_1.put(17007, new android.util.Pair("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."));
        v0_1.put(17025, new android.util.Pair("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account."));
        v0_1.put(17005, new android.util.Pair("ERROR_USER_DISABLED", "The user account has been disabled by an administrator."));
        v0_1.put(17021, new android.util.Pair("ERROR_USER_TOKEN_EXPIRED", "The user\'s credential is no longer valid. The user must sign in again."));
        v0_1.put(17011, new android.util.Pair("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted."));
        v0_1.put(17017, new android.util.Pair("ERROR_INVALID_USER_TOKEN", "This user\'s credential isn\'t valid for this project. This can happen if the user\'s token has been tampered with, or if the user isn\'t for the project associated with this API key."));
        v0_1.put(17006, new android.util.Pair("ERROR_OPERATION_NOT_ALLOWED", "This operation is not allowed. This may be because the given sign-in provider is disabled for this Firebase project. Enable it in the Firebase console, under the sign-in method tab of the Auth section."));
        v0_1.put(17026, new android.util.Pair("ERROR_WEAK_PASSWORD", "The given password is invalid."));
        v0_1.put(17029, new android.util.Pair("ERROR_EXPIRED_ACTION_CODE", "The out of band code has expired."));
        v0_1.put(17030, new android.util.Pair("ERROR_INVALID_ACTION_CODE", "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used."));
        v0_1.put(17031, new android.util.Pair("ERROR_INVALID_MESSAGE_PAYLOAD", "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console."));
        v0_1.put(17033, new android.util.Pair("ERROR_INVALID_RECIPIENT_EMAIL", "The email corresponding to this action failed to send as the provided recipient email address is invalid."));
        v0_1.put(17032, new android.util.Pair("ERROR_INVALID_SENDER", "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console."));
        v0_1.put(17034, new android.util.Pair("ERROR_MISSING_EMAIL", "An email address must be provided."));
        v0_1.put(17035, new android.util.Pair("ERROR_MISSING_PASSWORD", "A password must be provided."));
        v0_1.put(17041, new android.util.Pair("ERROR_MISSING_PHONE_NUMBER", "To send verification codes, provide a phone number for the recipient."));
        v0_1.put(17042, new android.util.Pair("ERROR_INVALID_PHONE_NUMBER", "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code]."));
        v0_1.put(17043, new android.util.Pair("ERROR_MISSING_VERIFICATION_CODE", "The verification code from SMS/TOTP is empty. Please enter the verification code."));
        v0_1.put(17044, new android.util.Pair("ERROR_INVALID_VERIFICATION_CODE", "The verification code from SMS/TOTP is invalid. Please check and enter the correct verification code again."));
        v0_1.put(17045, new android.util.Pair("ERROR_MISSING_VERIFICATION_ID", "The Phone Auth Credential was created with an empty verification ID."));
        v0_1.put(17046, new android.util.Pair("ERROR_INVALID_VERIFICATION_ID", "The verification ID used to create the phone auth credential is invalid."));
        v0_1.put(17049, new android.util.Pair("ERROR_RETRY_PHONE_AUTH", "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication."));
        v0_1.put(17051, new android.util.Pair("ERROR_SESSION_EXPIRED", "The sms code has expired. Please re-send the verification code to try again."));
        v0_1.put(17052, new android.util.Pair("ERROR_QUOTA_EXCEEDED", "This project\'s quota for this operation has been exceeded."));
        v0_1.put(17028, new android.util.Pair("ERROR_APP_NOT_AUTHORIZED", "This app is not authorized to use Firebase Authentication. Please verify that the correct package name, SHA-1, and SHA-256 are configured in the Firebase Console."));
        v0_1.put(17063, new android.util.Pair("ERROR_API_NOT_AVAILABLE_WITHOUT_GOOGLE_PLAY", "The API that you are calling is not available on devices without Google Play services."));
        v0_1.put(17062, new android.util.Pair("ERROR_WEB_INTERNAL_ERROR", "There was an internal error in the web widget."));
        v0_1.put(17064, new android.util.Pair("ERROR_INVALID_CERT_HASH", "There was an error while trying to get your package certificate hash."));
        v0_1.put(17065, new android.util.Pair("ERROR_WEB_STORAGE_UNSUPPORTED", "This browser is not supported or 3rd party cookies and data may be disabled."));
        v0_1.put(17038, new android.util.Pair("ERROR_UNAUTHORIZED_DOMAIN", "The configured custom domain is not allowlisted. Please allowlist the domain in the Firebase console -> Authentication -> Settings -> Authorized domains tab."));
        v0_1.put(17040, new android.util.Pair("ERROR_MISSING_CONTINUE_URI", "A continue URL must be provided in the request."));
        v0_1.put(17068, new android.util.Pair("ERROR_DYNAMIC_LINK_NOT_ACTIVATED", "Please activate Dynamic Links in the Firebase Console and agree to the terms and conditions."));
        v0_1.put(17071, new android.util.Pair("ERROR_INVALID_PROVIDER_ID", "The provider ID provided for the attempted web operation is invalid."));
        v0_1.put(17057, new android.util.Pair("ERROR_WEB_CONTEXT_ALREADY_PRESENTED", "A headful operation is already in progress. Please wait for that to finish."));
        v0_1.put(17058, new android.util.Pair("ERROR_WEB_CONTEXT_CANCELED", "The web operation was canceled by the user."));
        v0_1.put(17072, new android.util.Pair("ERROR_TENANT_ID_MISMATCH", "The provided tenant ID does not match the Auth instance\'s tenant ID."));
        v0_1.put(17073, new android.util.Pair("ERROR_UNSUPPORTED_TENANT_OPERATION", "This operation is not supported in a multi-tenant context."));
        v0_1.put(17074, new android.util.Pair("ERROR_INVALID_DYNAMIC_LINK_DOMAIN", "The provided dynamic link domain is not configured or authorized for the current project."));
        v0_1.put(17214, new android.util.Pair("ERROR_INVALID_HOSTING_LINK_DOMAIN", "The provided hosting link domain is not configured in Firebase Hosting or is not owned by the current project. This cannot be a default hosting domain (web.app or firebaseapp.com). "));
        v0_1.put(17075, new android.util.Pair("ERROR_REJECTED_CREDENTIAL", "The request contains malformed or mismatching credentials."));
        v0_1.put(17077, new android.util.Pair("ERROR_PHONE_NUMBER_NOT_FOUND", "The provided phone number does not match any of the second factor phone numbers associated with this user."));
        v0_1.put(17079, new android.util.Pair("ERROR_INVALID_TENANT_ID", "The Auth instance\'s tenant ID is invalid."));
        v0_1.put(17078, new android.util.Pair("ERROR_SECOND_FACTOR_REQUIRED", "Please complete a second factor challenge to finish signing into this account."));
        v0_1.put(17080, new android.util.Pair("ERROR_API_NOT_AVAILABLE", "The API that you are calling is not available."));
        v0_1.put(17081, new android.util.Pair("ERROR_MISSING_MULTI_FACTOR_SESSION", "The request is missing proof of first factor successful sign-in."));
        v0_1.put(17082, new android.util.Pair("ERROR_MISSING_MULTI_FACTOR_INFO", "No second factor identifier is provided."));
        v0_1.put(17083, new android.util.Pair("ERROR_INVALID_MULTI_FACTOR_SESSION", "The request does not contain a valid proof of first factor successful sign-in."));
        v0_1.put(17084, new android.util.Pair("ERROR_MULTI_FACTOR_INFO_NOT_FOUND", "The user does not have a second factor matching the identifier provided."));
        v0_1.put(17085, new android.util.Pair("ERROR_ADMIN_RESTRICTED_OPERATION", "This operation is restricted to administrators only."));
        v0_1.put(17086, new android.util.Pair("ERROR_UNVERIFIED_EMAIL", "This operation requires a verified email."));
        v0_1.put(17087, new android.util.Pair("ERROR_SECOND_FACTOR_ALREADY_ENROLLED", "The second factor is already enrolled on this account."));
        v0_1.put(17088, new android.util.Pair("ERROR_MAXIMUM_SECOND_FACTOR_COUNT_EXCEEDED", "The maximum allowed number of second factors on a user has been exceeded."));
        v0_1.put(17089, new android.util.Pair("ERROR_UNSUPPORTED_FIRST_FACTOR", "Enrolling a second factor or signing in with a multi-factor account requires sign-in with a supported first factor."));
        v0_1.put(17090, new android.util.Pair("ERROR_EMAIL_CHANGE_NEEDS_VERIFICATION", "Multi-factor users must always have a verified email."));
        v0_1.put(17091, new android.util.Pair("ERROR_INTERNAL_SUCCESS_SIGN_OUT", "This is an internal error code indicating that the operation was successful but the user needs to be signed out."));
        v0_1.put(17093, new android.util.Pair("ERROR_MISSING_CLIENT_IDENTIFIER", "This request is missing a valid app identifier, meaning that Play Integrity checks, and reCAPTCHA checks were unsuccessful. Please try again, or check the logcat for more details."));
        v0_1.put(17209, new android.util.Pair("ERROR_PASSKEY_ENROLLMENT_NOT_FOUND", "Cannot find the passkey linked to the current account."));
        v0_1.put(17210, new android.util.Pair("ERROR_INVALID_AUTHENTICATOR_RESPONSE", "The response from Credential Manager is either not parseable, missing required fields or has invalid values for certain fields."));
        v0_1.put(18002, new android.util.Pair("ERROR_ALTERNATE_CLIENT_IDENTIFIER_REQUIRED", "This request contains an app identifier which could not be verified. Please try again with a different identifier(like reCAPTCHA). Check the logcat for more details."));
        v0_1.put(17094, new android.util.Pair("ERROR_MISSING_OR_INVALID_NONCE", "The request does not contain a valid nonce. This can occur if the SHA-256 hash of the provided raw nonce does not match the hashed nonce in the ID token payload."));
        v0_1.put(18001, new android.util.Pair("ERROR_USER_CANCELLED", "The user did not grant your application the permissions it requested."));
        v0_1.put(17095, new android.util.Pair("ERROR_UNSUPPORTED_PASSTHROUGH_OPERATION", "This operation is not supported while in passthrough mode."));
        v0_1.put(17096, new android.util.Pair("ERROR_TOKEN_REFRESH_UNAVAILABLE", "No refresh token is available."));
        v0_1.put(17201, new android.util.Pair("ERROR_MISSING_RECAPTCHA_TOKEN", "The request is missing a reCAPTCHA token."));
        v0_1.put(17202, new android.util.Pair("ERROR_INVALID_RECAPTCHA_TOKEN", "The request contains an invalid reCAPTCHA token."));
        v0_1.put(17203, new android.util.Pair("ERROR_INVALID_RECAPTCHA_ACTION", "The request contains an invalid ReCAPTCHA action."));
        v0_1.put(17200, new android.util.Pair("ERROR_RECAPTCHA_NOT_ENABLED", "ReCAPTCHA is not enabled."));
        v0_1.put(17204, new android.util.Pair("ERROR_MISSING_CLIENT_TYPE", "The request is missing the ReCAPTCHA client type."));
        v0_1.put(17205, new android.util.Pair("ERROR_MISSING_RECAPTCHA_VERSION", "The request is missing the ReCAPTCHA version."));
        v0_1.put(17206, new android.util.Pair("ERROR_INVALID_RECAPTCHA_VERSION", "The request contains an invalid ReCAPTCHA version."));
        v0_1.put(17207, new android.util.Pair("ERROR_INVALID_REQ_TYPE", "The request is invalid. This can occur if input parameters are missing or malformed."));
        v0_1.put(17056, new android.util.Pair("ERROR_CAPTCHA_CHECK_FAILED", "The ReCAPTCHA assessment failed for this request."));
        return;
    }

    private static String zza(int p1)
    {
        String v1_2 = ((android.util.Pair) com.google.android.gms.internal.firebase-auth-api.zzaen.zza.get(p1));
        if (v1_2 == null) {
            return "INTERNAL_ERROR";
        } else {
            return ((String) v1_2.first);
        }
    }

    private static String zza(String p1, com.google.android.gms.common.api.Status p2)
    {
        if (!android.text.TextUtils.isEmpty(p2.getStatusMessage())) {
            return String.format(g2.g.d(p1, " [ %s ]"), new Object[] {p2.getStatusMessage()}));
        } else {
            return p1;
        }
    }

    public static q4.h zza(com.google.android.gms.common.api.Status p3)
    {
        q4.i v0_0 = p3.getStatusCode();
        String v1_1 = com.google.android.gms.internal.firebase-auth-api.zzaen.zza(com.google.android.gms.internal.firebase-auth-api.zzaen.zzb(v0_0), p3);
        if (v0_0 == 17020) {
            return new q4.i(com.google.android.gms.internal.firebase-auth-api.zzaen.zza("A network error (such as timeout, interrupted connection or unreachable host) has occurred.", p3));
        } else {
            if (v0_0 != 17021) {
                if (v0_0 != 17051) {
                    if (v0_0 == 17052) {
                        return new i6.a(v1_1);
                    } else {
                        switch (v0_0) {
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                                break;
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                                break;
                            case 17005:
                            case 17011:
                                break;
                            case 17006:
                            case 17038:
                            case 17068:
                            case 17079:
                            case 17085:
                            case 17086:
                            case 17087:
                            case 17088:
                            case 17089:
                            case 17090:
                            case 17091:
                            case 17093:
                            case 17095:
                            case 17096:
                            case 17201:
                            case 17202:
                            case 17203:
                            case 17204:
                            case 17205:
                            case 17206:
                            case 17207:
                            case 17209:
                            case 17210:
                            case 17214:
                            case 18001:
                            case 18002:
                                return new y4.i(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                            case 17007:
                            case 17012:
                                return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                                break;
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                                break;
                            case 17010:
                                return new i6.a(com.google.android.gms.internal.firebase-auth-api.zzaen.zza("We have blocked all requests from this device due to unusual activity. Try again later.", p3));
                            case 17005:
                            case 17011:
                                break;
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                                break;
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                                break;
                            case 17080:
                                return new i6.a(v1_1);
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                                break;
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                                break;
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                                break;
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                                break;
                            case 17000:
                            case 17002:
                            case 17004:
                            case 17008:
                            case 17009:
                            case 17049:
                            case 17077:
                            case 17081:
                            case 17082:
                            case 17083:
                            case 17084:
                            case 17094:
                                break;
                            case 17200:
                                return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                            case 17495:
                                return new i6.a(com.google.android.gms.internal.firebase-auth-api.zzaen.zza("Please sign in before trying to get a token.", p3));
                            case 17499:
                                return new q4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza("An internal error has occurred.", p3));
                            default:
                                switch (v0_0) {
                                    case 17014:
                                        return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                                    case 17015:
                                        return new q4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza("User has already been linked to the given provider.", p3));
                                    case 17016:
                                        return new q4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza("User was not linked to an account with the given provider.", p3));
                                    case 17017:
                                        break;
                                    default:
                                        switch (v0_0) {
                                            case 17024:
                                                break;
                                            case 17026:
                                                q4.i v0_26 = com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0);
                                                p3.getStatusMessage();
                                                return new y4.k(v0_26, v1_1);
                                            default:
                                                switch (v0_0) {
                                                    case 17029:
                                                    case 17030:
                                                        return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                                                    case 17031:
                                                    case 17032:
                                                    case 17033:
                                                        return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                                                    case 17034:
                                                    case 17035:
                                                        break;
                                                    case 17034:
                                                    case 17035:
                                                        break;
                                                    default:
                                                        switch (v0_0) {
                                                            case 17041:
                                                            case 17042:
                                                            case 17043:
                                                            case 17044:
                                                            case 17045:
                                                            case 17046:
                                                                break;
                                                            case 17041:
                                                            case 17042:
                                                            case 17043:
                                                            case 17044:
                                                            case 17045:
                                                            case 17046:
                                                                break;
                                                            case 17041:
                                                            case 17042:
                                                            case 17043:
                                                            case 17044:
                                                            case 17045:
                                                            case 17046:
                                                                break;
                                                            case 17041:
                                                            case 17042:
                                                            case 17043:
                                                            case 17044:
                                                            case 17045:
                                                            case 17046:
                                                                break;
                                                            case 17041:
                                                            case 17042:
                                                            case 17043:
                                                            case 17044:
                                                            case 17045:
                                                            case 17046:
                                                                break;
                                                            case 17041:
                                                            case 17042:
                                                            case 17043:
                                                            case 17044:
                                                            case 17045:
                                                            case 17046:
                                                                break;
                                                            default:
                                                                switch (v0_0) {
                                                                    case 17056:
                                                                        return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                                                                    case 17057:
                                                                    case 17058:
                                                                        break;
                                                                    case 17057:
                                                                    case 17058:
                                                                        break;
                                                                    default:
                                                                        switch (v0_0) {
                                                                            case 17061:
                                                                                return new q4.i(com.google.android.gms.internal.firebase-auth-api.zzaen.zza("There was a failure in the connection between the web widget and the Firebase Auth backend.", p3));
                                                                            case 17062:
                                                                            case 17065:
                                                                                return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                                                                            default:
                                                                                switch (v0_0) {
                                                                                    case 17075:
                                                                                        break;
                                                                                    default:
                                                                                        return new q4.h("An internal error has occurred.");
                                                                                }
                                                                        }
                                                                        return new y4.i(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                                                                }
                                                                return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                                                        }
                                                }
                                        }
                                        return new y4.i(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                                }
                        }
                        return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
                    }
                }
                return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
            }
            return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v0_0), v1_1);
        }
    }

    public static q4.h zza(com.google.android.gms.common.api.Status p0, y4.c p1, String p2, String p3)
    {
        String v1_0 = p0.getStatusCode();
        if ((v1_0 != 17012) && ((v1_0 != 17007) && (v1_0 != 17025))) {
            return com.google.android.gms.internal.firebase-auth-api.zzaen.zza(p0);
        } else {
            return new y4.h(com.google.android.gms.internal.firebase-auth-api.zzaen.zza(v1_0), com.google.android.gms.internal.firebase-auth-api.zzaen.zza(com.google.android.gms.internal.firebase-auth-api.zzaen.zzb(v1_0), p0));
        }
    }

    public static y4.j zza(com.google.firebase.auth.FirebaseAuth p11, com.google.android.gms.internal.firebase-auth-api.zzaas p12, y4.l p13)
    {
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(p11);
        com.google.android.gms.internal.firebase-auth-api.zzu.zza(p12);
        String v0_4 = ((android.util.Pair) com.google.android.gms.internal.firebase-auth-api.zzaen.zza.get(17078));
        String v2_1 = ((String) v0_4.first);
        String v0_1 = ((String) v0_4.second);
        java.util.Iterator v3_0 = p12.zzc();
        java.util.ArrayList v5_1 = new java.util.ArrayList();
        java.util.Iterator v3_1 = v3_0.iterator();
        while (v3_1.hasNext()) {
            z4.g v4_8 = ((y4.p) v3_1.next());
            if ((v4_8 instanceof y4.w)) {
                v5_1.add(((y4.w) v4_8));
            }
        }
        java.util.Iterator v3_2 = p12.zzc();
        java.util.ArrayList v10_1 = new java.util.ArrayList();
        java.util.Iterator v3_3 = v3_2.iterator();
        while (v3_3.hasNext()) {
            z4.g v4_5 = ((y4.p) v3_3.next());
            if ((v4_5 instanceof y4.z)) {
                v10_1.add(((y4.z) v4_5));
            }
        }
        java.util.Iterator v3_4 = p12.zzc();
        z4.g v4_2 = p12.zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_4);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v4_2);
        z4.h v6_1 = new z4.h();
        v6_1.c = new java.util.ArrayList();
        v6_1.d = new java.util.ArrayList();
        java.util.Iterator v3_5 = v3_4.iterator();
        while (v3_5.hasNext()) {
            y4.z v7_7 = ((y4.p) v3_5.next());
            if (!(v7_7 instanceof y4.w)) {
                if (!(v7_7 instanceof y4.z)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ".concat(v7_7.x()));
                } else {
                    v6_1.d.add(((y4.z) v7_7));
                }
            } else {
                v6_1.c.add(((y4.w) v7_7));
            }
        }
        v6_1.b = v4_2;
        IllegalArgumentException v11_1 = p11.a;
        v11_1.a();
        new z4.g(v5_1, v6_1, v11_1.b, p12.zza(), ((z4.e) p13), v10_1);
        return new y4.j(v2_1, v0_1);
    }

    public static boolean zza(Exception p1)
    {
        if (!(p1 instanceof y4.i)) {
            return 0;
        } else {
            return ((y4.i) p1).a.endsWith("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED");
        }
    }

    private static String zzb(int p1)
    {
        String v1_2 = ((android.util.Pair) com.google.android.gms.internal.firebase-auth-api.zzaen.zza.get(p1));
        if (v1_2 == null) {
            return "An internal error has occurred.";
        } else {
            return ((String) v1_2.second);
        }
    }

    public static boolean zzb(Exception p1)
    {
        if (!(p1 instanceof y4.i)) {
            return 0;
        } else {
            return ((y4.i) p1).a.endsWith("APP_NOT_AUTHORIZED");
        }
    }

    public static boolean zzc(Exception p1)
    {
        if (!(p1 instanceof y4.i)) {
            return 0;
        } else {
            return ((y4.i) p1).a.endsWith("INVALID_RECAPTCHA_TOKEN");
        }
    }

    public static boolean zzd(Exception p1)
    {
        if (!(p1 instanceof y4.i)) {
            return 0;
        } else {
            return ((y4.i) p1).a.endsWith("MISSING_RECAPTCHA_TOKEN");
        }
    }
}
