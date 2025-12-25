package t0;
public final class i {

    public static q0.g a(android.view.View p9, q0.g p10)
    {
        if (android.util.Log.isLoggable("ReceiveContent", 3)) {
            int v0_6 = new StringBuilder("onReceive: ");
            v0_6.append(p10);
            android.util.Log.d("ReceiveContent", v0_6.toString());
        }
        int v0_2 = p10.a;
        if (v0_2.a() != 2) {
            android.content.ClipData v10_1 = v0_2.b();
            int v0_3 = v0_2.c();
            android.text.Editable v1_3 = ((android.text.Editable) ((android.widget.TextView) p9).getText());
            int v9_2 = ((android.widget.TextView) p9).getContext();
            int v3 = 0;
            int v4_0 = 0;
            while (v3 < v10_1.getItemCount()) {
                String v5_2;
                String v5_1 = v10_1.getItemAt(v3);
                if ((v0_3 & 1) == 0) {
                    v5_2 = v5_1.coerceToStyledText(v9_2);
                } else {
                    v5_2 = v5_1.coerceToText(v9_2);
                    if ((v5_2 instanceof android.text.Spanned)) {
                        v5_2 = v5_2.toString();
                    }
                }
                if (v5_2 != null) {
                    if (v4_0 != 0) {
                        v1_3.insert(android.text.Selection.getSelectionEnd(v1_3), "\n");
                        v1_3.insert(android.text.Selection.getSelectionEnd(v1_3), v5_2);
                    } else {
                        int v4_1 = android.text.Selection.getSelectionStart(v1_3);
                        String v7_3 = android.text.Selection.getSelectionEnd(v1_3);
                        int v8_1 = Math.max(0, Math.min(v4_1, v7_3));
                        int v4_3 = Math.max(0, Math.max(v4_1, v7_3));
                        android.text.Selection.setSelection(v1_3, v4_3);
                        v1_3.replace(v8_1, v4_3, v5_2);
                        v4_0 = 1;
                    }
                }
                v3++;
            }
            return 0;
        } else {
            return p10;
        }
    }
}
