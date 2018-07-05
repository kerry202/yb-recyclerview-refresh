package com.andview.ybrefreshview.recyclerview;

import android.support.v7.widget.GridLayoutManager;

/**
 * @author yangbo
 * @mail 903023560@qq.com
 */
public class XSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {

    private BaseRecyclerAdapter adapter;
    private int mSpanSize = 1;

    public XSpanSizeLookup(BaseRecyclerAdapter adapter, int spanSize) {
        this.adapter = adapter;
        this.mSpanSize = spanSize;
    }

    @Override
    public int getSpanSize(int position) {
        boolean isHeaderOrFooter = adapter.isFooter(position) || adapter.isHeader(position);
        return isHeaderOrFooter ? mSpanSize : 1;
    }
}