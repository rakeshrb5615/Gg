package kotlin.jvm.internal;
public abstract class u {

    public static void a(int p2, Object p3)
    {
        if ((p3 != null) && (!kotlin.jvm.internal.u.c(p2, p3))) {
            StringBuilder v0_2 = new StringBuilder("kotlin.jvm.functions.Function");
            v0_2.append(p2);
            kotlin.jvm.internal.u.e(p3, v0_2.toString());
            throw 0;
        } else {
            return;
        }
    }

    public static String b(String p1)
    {
        String v0_0 = p1.hashCode();
        switch (v0_0) {
            case -2061550653:
                if (p1.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                } else {
                }
            case -2056817302:
                if (p1.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                } else {
                }
            case -2034166429:
                if (p1.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                } else {
                }
            case -1979556166:
                if (p1.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                } else {
                }
            case -1571515090:
                if (p1.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                } else {
                }
            case -1383349348:
                if (p1.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                } else {
                }
            case -1383343454:
                if (p1.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                } else {
                }
            case -1325958191:
                if (p1.equals("double")) {
                    return "kotlin.Double";
                } else {
                }
            case -1182275604:
                if (p1.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                } else {
                }
            case -1062240117:
                if (p1.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                } else {
                }
            case -688322466:
                if (p1.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                } else {
                }
            case -527879800:
                if (p1.equals("java.lang.Float")) {
                    return "kotlin.Float";
                } else {
                }
            case -515992664:
                if (p1.equals("java.lang.Short")) {
                    return "kotlin.Short";
                } else {
                }
            case -246476834:
                if (p1.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                } else {
                }
            case -207262728:
                if (p1.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                } else {
                }
            case -165139126:
                if (p1.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                } else {
                }
            case 104431:
                if (p1.equals("int")) {
                    return "kotlin.Int";
                } else {
                }
            case 3039496:
                if (p1.equals("byte")) {
                    return "kotlin.Byte";
                } else {
                }
            case 3052374:
                if (p1.equals("char")) {
                    return "kotlin.Char";
                } else {
                }
            case 3327612:
                if (p1.equals("long")) {
                    return "kotlin.Long";
                } else {
                }
            case 64711720:
                if (p1.equals("boolean")) {
                    return "kotlin.Boolean";
                } else {
                }
            case 65821278:
                if (p1.equals("java.util.List")) {
                    return "kotlin.collections.List";
                } else {
                }
            case 77230534:
                if (p1.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                } else {
                }
            case 97526364:
                if (p1.equals("float")) {
                    return "kotlin.Float";
                } else {
                }
            case 109413500:
                if (p1.equals("short")) {
                    return "kotlin.Short";
                } else {
                }
            case 155276373:
                if (p1.equals("java.lang.Character")) {
                    return "kotlin.Char";
                } else {
                }
            case 226173651:
                if (p1.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                } else {
                }
            case 344809556:
                if (p1.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                } else {
                }
            case 398507100:
                if (p1.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                } else {
                }
            case 398585941:
                if (p1.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                } else {
                }
            case 398795216:
                if (p1.equals("java.lang.Long")) {
                    return "kotlin.Long";
                } else {
                }
            case 482629606:
                if (p1.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                } else {
                }
            case 499831342:
                if (p1.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                } else {
                }
            case 577341676:
                if (p1.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                } else {
                }
            case 599019395:
                if (p1.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                } else {
                }
            case 761287205:
                if (p1.equals("java.lang.Double")) {
                    return "kotlin.Double";
                } else {
                }
            case 1052881309:
                if (p1.equals("java.lang.Number")) {
                    return "kotlin.Number";
                } else {
                }
            case 1063877011:
                if (p1.equals("java.lang.Object")) {
                    return "kotlin.Any";
                } else {
                }
            case 1195259493:
                if (p1.equals("java.lang.String")) {
                    return "kotlin.String";
                } else {
                }
            case 1275614662:
                if (p1.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                } else {
                }
            case 1383693018:
                if (p1.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                } else {
                }
            case 1630335596:
                if (p1.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                } else {
                }
            case 1877171123:
                if (p1.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                } else {
                }
            default:
                switch (v0_0) {
                    case -1811142716:
                        if (p1.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        } else {
                        }
                    case -1811142715:
                        if (p1.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        } else {
                        }
                    case -1811142714:
                        if (p1.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        } else {
                        }
                    case -1811142713:
                        if (p1.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        } else {
                        }
                    case -1811142712:
                        if (p1.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        } else {
                        }
                    case -1811142711:
                        if (p1.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        } else {
                        }
                    case -1811142710:
                        if (p1.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        } else {
                        }
                    case -1811142709:
                        if (p1.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        } else {
                        }
                    case -1811142708:
                        if (p1.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        } else {
                        }
                    case -1811142707:
                        if (p1.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        } else {
                        }
                    default:
                        switch (v0_0) {
                            case -1811142685:
                                if (p1.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                } else {
                                }
                            case -1811142684:
                                if (p1.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                } else {
                                }
                            case -1811142683:
                                if (p1.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                } else {
                                }
                            default:
                                switch (v0_0) {
                                    case 80123371:
                                        if (p1.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        } else {
                                        }
                                    case 80123372:
                                        if (p1.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        } else {
                                        }
                                    case 80123373:
                                        if (p1.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        } else {
                                        }
                                    case 80123374:
                                        if (p1.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        } else {
                                        }
                                    case 80123375:
                                        if (p1.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        } else {
                                        }
                                    case 80123376:
                                        if (p1.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        } else {
                                        }
                                    case 80123377:
                                        if (p1.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        } else {
                                        }
                                    case 80123378:
                                        if (p1.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        } else {
                                        }
                                    case 80123379:
                                        if (p1.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        } else {
                                        }
                                    case 80123380:
                                        if (p1.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        } else {
                                        }
                                    default:
                                }
                        }
                }
        }
        return 0;
    }

    public static boolean c(int p3, Object p4)
    {
        if ((p4 instanceof h7.a)) {
            int v4_2;
            if (!(p4 instanceof kotlin.jvm.internal.g)) {
                if (!(p4 instanceof u7.a)) {
                    if (!(p4 instanceof u7.l)) {
                        if (!(p4 instanceof u7.p)) {
                            if (!(p4 instanceof u7.q)) {
                                v4_2 = -1;
                            } else {
                                v4_2 = 3;
                            }
                        } else {
                            v4_2 = 2;
                        }
                    } else {
                        v4_2 = 1;
                    }
                } else {
                    v4_2 = 0;
                }
            } else {
                v4_2 = ((kotlin.jvm.internal.g) p4).getArity();
            }
            if (v4_2 == p3) {
                return 1;
            }
        }
        return 0;
    }

    public static String d(String p1)
    {
        String v0_0 = p1.hashCode();
        switch (v0_0) {
            case -2061550653:
                if (p1.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                } else {
                }
            case -2056817302:
                if (p1.equals("java.lang.Integer")) {
                    return "Int";
                } else {
                }
            case -2034166429:
                if (p1.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                } else {
                }
            case -1979556166:
                if (p1.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                } else {
                }
            case -1571515090:
                if (p1.equals("java.lang.Comparable")) {
                    return "Comparable";
                } else {
                }
            case -1383349348:
                if (p1.equals("java.util.Map")) {
                    return "Map";
                } else {
                }
            case -1383343454:
                if (p1.equals("java.util.Set")) {
                    return "Set";
                } else {
                }
            case -1325958191:
                if (p1.equals("double")) {
                    return "Double";
                } else {
                }
            case -1182275604:
                if (p1.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                } else {
                }
            case -1062240117:
                if (p1.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                } else {
                }
            case -688322466:
                if (p1.equals("java.util.Collection")) {
                    return "Collection";
                } else {
                }
            case -527879800:
                if (p1.equals("java.lang.Float")) {
                    return "Float";
                } else {
                }
            case -515992664:
                if (p1.equals("java.lang.Short")) {
                    return "Short";
                } else {
                }
            case -246476834:
                if (p1.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                } else {
                }
            case -207262728:
                if (p1.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                } else {
                }
            case -165139126:
                if (p1.equals("java.util.Map$Entry")) {
                    return "Entry";
                } else {
                }
            case 104431:
                if (p1.equals("int")) {
                    return "Int";
                } else {
                }
            case 3039496:
                if (p1.equals("byte")) {
                    return "Byte";
                } else {
                }
            case 3052374:
                if (p1.equals("char")) {
                    return "Char";
                } else {
                }
            case 3327612:
                if (p1.equals("long")) {
                    return "Long";
                } else {
                }
            case 64711720:
                if (p1.equals("boolean")) {
                    return "Boolean";
                } else {
                }
            case 65821278:
                if (p1.equals("java.util.List")) {
                    return "List";
                } else {
                }
            case 77230534:
                if (p1.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                } else {
                }
            case 97526364:
                if (p1.equals("float")) {
                    return "Float";
                } else {
                }
            case 109413500:
                if (p1.equals("short")) {
                    return "Short";
                } else {
                }
            case 155276373:
                if (p1.equals("java.lang.Character")) {
                    return "Char";
                } else {
                }
            case 226173651:
                if (p1.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                } else {
                }
            case 344809556:
                if (p1.equals("java.lang.Boolean")) {
                    return "Boolean";
                } else {
                }
            case 398507100:
                if (p1.equals("java.lang.Byte")) {
                    return "Byte";
                } else {
                }
            case 398585941:
                if (p1.equals("java.lang.Enum")) {
                    return "Enum";
                } else {
                }
            case 398795216:
                if (p1.equals("java.lang.Long")) {
                    return "Long";
                } else {
                }
            case 482629606:
                if (p1.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                } else {
                }
            case 499831342:
                if (p1.equals("java.util.Iterator")) {
                    return "Iterator";
                } else {
                }
            case 577341676:
                if (p1.equals("java.util.ListIterator")) {
                    return "ListIterator";
                } else {
                }
            case 599019395:
                if (p1.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                } else {
                }
            case 761287205:
                if (p1.equals("java.lang.Double")) {
                    return "Double";
                } else {
                }
            case 1052881309:
                if (p1.equals("java.lang.Number")) {
                    return "Number";
                } else {
                }
            case 1063877011:
                if (p1.equals("java.lang.Object")) {
                    return "Any";
                } else {
                }
            case 1195259493:
                if (p1.equals("java.lang.String")) {
                    return "String";
                } else {
                }
            case 1275614662:
                if (p1.equals("java.lang.Iterable")) {
                    return "Iterable";
                } else {
                }
            case 1383693018:
                if (p1.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                } else {
                }
            case 1630335596:
                if (p1.equals("java.lang.Throwable")) {
                    return "Throwable";
                } else {
                }
            case 1877171123:
                if (p1.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                } else {
                }
            default:
                switch (v0_0) {
                    case -1811142716:
                        if (p1.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        } else {
                        }
                    case -1811142715:
                        if (p1.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        } else {
                        }
                    case -1811142714:
                        if (p1.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        } else {
                        }
                    case -1811142713:
                        if (p1.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        } else {
                        }
                    case -1811142712:
                        if (p1.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        } else {
                        }
                    case -1811142711:
                        if (p1.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        } else {
                        }
                    case -1811142710:
                        if (p1.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        } else {
                        }
                    case -1811142709:
                        if (p1.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        } else {
                        }
                    case -1811142708:
                        if (p1.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        } else {
                        }
                    case -1811142707:
                        if (p1.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        } else {
                        }
                    default:
                        switch (v0_0) {
                            case -1811142685:
                                if (p1.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                } else {
                                }
                            case -1811142684:
                                if (p1.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                } else {
                                }
                            case -1811142683:
                                if (p1.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                } else {
                                }
                            default:
                                switch (v0_0) {
                                    case 80123371:
                                        if (p1.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        } else {
                                        }
                                    case 80123372:
                                        if (p1.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        } else {
                                        }
                                    case 80123373:
                                        if (p1.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        } else {
                                        }
                                    case 80123374:
                                        if (p1.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        } else {
                                        }
                                    case 80123375:
                                        if (p1.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        } else {
                                        }
                                    case 80123376:
                                        if (p1.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        } else {
                                        }
                                    case 80123377:
                                        if (p1.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        } else {
                                        }
                                    case 80123378:
                                        if (p1.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        } else {
                                        }
                                    case 80123379:
                                        if (p1.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        } else {
                                        }
                                    case 80123380:
                                        if (p1.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        } else {
                                        }
                                    default:
                                }
                        }
                }
        }
        return 0;
    }

    public static void e(Object p1, String p2)
    {
        String v1_4;
        if (p1 != null) {
            v1_4 = p1.getClass().getName();
        } else {
            v1_4 = "null";
        }
        ClassCastException v2_1 = new ClassCastException(g2.g.e(v1_4, " cannot be cast to ", p2));
        kotlin.jvm.internal.j.h(v2_1, kotlin.jvm.internal.u.getName());
        throw v2_1;
    }
}
