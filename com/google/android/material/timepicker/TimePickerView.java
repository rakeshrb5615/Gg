package com.google.android.material.timepicker;
 class TimePickerView extends androidx.constraintlayout.widget.ConstraintLayout {
    public static final synthetic int x;
    public final com.google.android.material.chip.Chip w;

    public TimePickerView(android.content.Context p5, android.util.AttributeSet p6)
    {
        super(p5, p6, 0);
        String v6_2 = new com.google.android.material.timepicker.j(super);
        android.view.LayoutInflater.from(p5).inflate(2131558484, super);
        super.findViewById(2131362187);
        ((com.google.android.material.button.MaterialButtonToggleGroup) super.findViewById(2131362192)).q.add(new com.google.android.material.timepicker.i());
        com.google.android.material.chip.Chip v5_8 = ((com.google.android.material.chip.Chip) super.findViewById(2131362197));
        com.google.android.material.chip.Chip v0_5 = ((com.google.android.material.chip.Chip) super.findViewById(2131362194));
        super.w = v0_5;
        super.findViewById(2131362188);
        int v2_2 = new com.google.android.material.timepicker.l(new android.view.GestureDetector(super.getContext(), new com.google.android.material.timepicker.k(super)));
        v5_8.setOnTouchListener(v2_2);
        v0_5.setOnTouchListener(v2_2);
        v5_8.setTag(2131362398, Integer.valueOf(12));
        v0_5.setTag(2131362398, Integer.valueOf(10));
        v5_8.setOnClickListener(v6_2);
        v0_5.setOnClickListener(v6_2);
        v5_8.setAccessibilityClassName("android.view.View");
        v0_5.setAccessibilityClassName("android.view.View");
        return;
    }

    public final void onVisibilityChanged(android.view.View p1, int p2)
    {
        super.onVisibilityChanged(p1, p2);
        if ((p1 == this) && (p2 == 0)) {
            this.w.sendAccessibilityEvent(8);
        }
        return;
    }
}
