package com.vima.spinner.views;


import android.view.View;

public interface OnSpinnerItemSelectedListener {
    void onItemSelected(NiceSpinner parent, View view, int position, long id);
}
