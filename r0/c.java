package r0;
public final class c {
    public final android.view.accessibility.AccessibilityNodeInfo a;
    public int b;

    public c(android.view.accessibility.AccessibilityNodeInfo p2)
    {
        this.b = -1;
        this.a = p2;
        return;
    }

    public static String d(int p1)
    {
        if (p1 == 1) {
            return "ACTION_FOCUS";
        } else {
            if (p1 == 2) {
                return "ACTION_CLEAR_FOCUS";
            } else {
                switch (p1) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908382:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (p1) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (p1) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (p1) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
        }
    }

    public final void a(int p2)
    {
        this.a.addAction(p2);
        return;
    }

    public final void b(r0.b p2)
    {
        this.a.addAction(((android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction) p2.a));
        return;
    }

    public final java.util.ArrayList c(String p3)
    {
        android.os.Bundle v0_0 = this.a;
        java.util.ArrayList v1_1 = v0_0.getExtras().getIntegerArrayList(p3);
        if (v1_1 == null) {
            v1_1 = new java.util.ArrayList();
            v0_0.getExtras().putIntegerArrayList(p3, v1_1);
        }
        return v1_1;
    }

    public final boolean e(int p4)
    {
        int v0_1 = this.a.getExtras();
        if ((v0_1 == 0) || ((v0_1.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & p4) != p4)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 != 0) && ((p4 instanceof r0.c))) {
                int v1_3 = ((r0.c) p4).a;
                android.view.accessibility.AccessibilityNodeInfo v2 = this.a;
                if (v2 != null) {
                    if (!v2.equals(v1_3)) {
                        return 0;
                    }
                } else {
                    if (v1_3 != 0) {
                        return 0;
                    }
                }
                if (this.b == ((r0.c) p4).b) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final void f(android.graphics.Rect p2)
    {
        this.a.getBoundsInParent(p2);
        return;
    }

    public final CharSequence g()
    {
        android.view.accessibility.AccessibilityNodeInfo v2 = this.a;
        if (this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            return v2.getText();
        } else {
            CharSequence v0_1 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            java.util.ArrayList v1_1 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            java.util.ArrayList v3_1 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            java.util.ArrayList v4_1 = this.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            int v8 = 0;
            android.text.SpannableString v5_1 = new android.text.SpannableString(android.text.TextUtils.substring(v2.getText(), 0, v2.getText().length()));
            while (v8 < v0_1.size()) {
                v5_1.setSpan(new r0.a(((Integer) v4_1.get(v8)).intValue(), this, v2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) v0_1.get(v8)).intValue(), ((Integer) v1_1.get(v8)).intValue(), ((Integer) v3_1.get(v8)).intValue());
                v8++;
            }
            return v5_1;
        }
    }

    public final void h(int p6, boolean p7)
    {
        android.os.Bundle v0_1 = this.a.getExtras();
        if (v0_1 != null) {
            int v3_1 = (v0_1.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~ p6));
            if (!p7) {
                p6 = 0;
            }
            v0_1.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (p6 | v3_1));
        }
        return;
    }

    public final int hashCode()
    {
        int v0_0 = this.a;
        if (v0_0 != 0) {
            return v0_0.hashCode();
        } else {
            return 0;
        }
    }

    public final void i(CharSequence p2)
    {
        this.a.setClassName(p2);
        return;
    }

    public final void j(k4.i p2)
    {
        this.a.setCollectionItemInfo(((android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo) p2.b));
        return;
    }

    public final void k(boolean p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            this.h(2, p3);
            return;
        } else {
            this.a.setHeading(p3);
            return;
        }
    }

    public final void l(CharSequence p4)
    {
        android.view.accessibility.AccessibilityNodeInfo v2 = this.a;
        if (android.os.Build$VERSION.SDK_INT < 28) {
            v2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", p4);
            return;
        } else {
            v2.setPaneTitle(p4);
            return;
        }
    }

    public final void m(boolean p3)
    {
        if (android.os.Build$VERSION.SDK_INT < 28) {
            this.h(1, p3);
            return;
        } else {
            this.a.setScreenReaderFocusable(p3);
            return;
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(super.toString());
        String v1_29 = new android.graphics.Rect();
        this.f(v1_29);
        java.util.ArrayList v2_0 = new StringBuilder("; boundsInParent: ");
        v2_0.append(v1_29);
        v0_1.append(v2_0.toString());
        java.util.ArrayList v2_2 = this.a;
        v2_2.getBoundsInScreen(v1_29);
        String v3_1 = new StringBuilder("; boundsInScreen: ");
        v3_1.append(v1_29);
        v0_1.append(v3_1.toString());
        String v3_4 = android.os.Build$VERSION.SDK_INT;
        if (v3_4 < 34) {
            CharSequence v5_47 = ((android.graphics.Rect) v2_2.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY"));
            if (v5_47 != null) {
                v1_29.set(v5_47.left, v5_47.top, v5_47.right, v5_47.bottom);
            }
        } else {
            q0.a0.c(v2_2, v1_29);
        }
        String v1_38;
        CharSequence v5_50 = new StringBuilder("; boundsInWindow: ");
        v5_50.append(v1_29);
        v0_1.append(v5_50.toString());
        v0_1.append("; packageName: ");
        v0_1.append(v2_2.getPackageName());
        v0_1.append("; className: ");
        v0_1.append(v2_2.getClassName());
        v0_1.append("; text: ");
        v0_1.append(this.g());
        v0_1.append("; error: ");
        v0_1.append(v2_2.getError());
        v0_1.append("; maxTextLength: ");
        v0_1.append(v2_2.getMaxTextLength());
        v0_1.append("; stateDescription: ");
        if (v3_4 < 30) {
            v1_38 = v2_2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        } else {
            v1_38 = e0.b.f(v2_2);
        }
        String v1_44;
        v0_1.append(v1_38);
        v0_1.append("; contentDescription: ");
        v0_1.append(v2_2.getContentDescription());
        v0_1.append("; tooltipText: ");
        if (v3_4 < 28) {
            v1_44 = v2_2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        } else {
            v1_44 = v2_2.getTooltipText();
        }
        CharSequence v5_1;
        v0_1.append(v1_44);
        v0_1.append("; viewIdResName: ");
        v0_1.append(v2_2.getViewIdResourceName());
        v0_1.append("; uniqueId: ");
        if (v3_4 < 33) {
            v5_1 = v2_2.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        } else {
            v5_1 = m0.b.b(v2_2);
        }
        CharSequence v5_30;
        v0_1.append(v5_1);
        v0_1.append("; checkable: ");
        v0_1.append(v2_2.isCheckable());
        v0_1.append("; checked: ");
        v0_1.append(v2_2.isChecked());
        v0_1.append("; fieldRequired: ");
        v0_1.append(v2_2.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        v0_1.append("; focusable: ");
        v0_1.append(v2_2.isFocusable());
        v0_1.append("; focused: ");
        v0_1.append(v2_2.isFocused());
        v0_1.append("; selected: ");
        v0_1.append(v2_2.isSelected());
        v0_1.append("; clickable: ");
        v0_1.append(v2_2.isClickable());
        v0_1.append("; longClickable: ");
        v0_1.append(v2_2.isLongClickable());
        v0_1.append("; contextClickable: ");
        v0_1.append(v2_2.isContextClickable());
        v0_1.append("; enabled: ");
        v0_1.append(v2_2.isEnabled());
        v0_1.append("; password: ");
        v0_1.append(v2_2.isPassword());
        CharSequence v5_26 = new StringBuilder("; scrollable: ");
        v5_26.append(v2_2.isScrollable());
        v0_1.append(v5_26.toString());
        v0_1.append("; containerTitle: ");
        if (v3_4 < 34) {
            v5_30 = v2_2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        } else {
            v5_30 = q0.a0.d(v2_2);
        }
        String v1_5;
        v0_1.append(v5_30);
        v0_1.append("; granularScrollingSupported: ");
        v0_1.append(this.e(67108864));
        v0_1.append("; importantForAccessibility: ");
        v0_1.append(v2_2.isImportantForAccessibility());
        v0_1.append("; visible: ");
        v0_1.append(v2_2.isVisibleToUser());
        v0_1.append("; isTextSelectable: ");
        if (v3_4 < 33) {
            v1_5 = this.e(8388608);
        } else {
            v1_5 = m0.b.c(v2_2);
        }
        String v1_8;
        v0_1.append(v1_5);
        v0_1.append("; accessibilityDataSensitive: ");
        if (v3_4 < 34) {
            v1_8 = this.e(64);
        } else {
            v1_8 = q0.a0.g(v2_2);
        }
        v0_1.append(v1_8);
        v0_1.append("; [");
        String v1_10 = v2_2.getActionList();
        java.util.ArrayList v2_4 = new java.util.ArrayList();
        String v3_3 = v1_10.size();
        int v4_1 = 0;
        CharSequence v5_39 = 0;
        while (v5_39 < v3_3) {
            v2_4.add(new r0.b(v1_10.get(v5_39), 0, 0, 0, 0));
            v5_39++;
        }
        while (v4_1 < v2_4.size()) {
            String v1_14 = ((r0.b) v2_4.get(v4_1));
            String v1_15 = v1_14.a;
            String v3_6 = r0.c.d(v1_14.a());
            if ((v3_6.equals("ACTION_UNKNOWN")) && (((android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction) v1_15).getLabel() != null)) {
                v3_6 = ((android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction) v1_15).getLabel().toString();
            }
            v0_1.append(v3_6);
            if (v4_1 != (v2_4.size() - 1)) {
                v0_1.append(", ");
            }
            v4_1++;
        }
        v0_1.append("]");
        return v0_1.toString();
    }
}
