package com.andview.ybrefreshview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * @author yangbo
 * @mail 903023560@qq.com
 */

public class XWebView extends WebView {

    public XWebView(Context context) {
        super(context);
    }

    public XWebView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public XWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean isBottom() {
        return computeVerticalScrollRange() == getHeight() + getScrollY();
    }

    @Override
    public int computeVerticalScrollRange() {
        return super.computeVerticalScrollRange();
    }
}
