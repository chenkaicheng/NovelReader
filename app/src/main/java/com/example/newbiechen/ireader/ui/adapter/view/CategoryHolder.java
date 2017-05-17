package com.example.newbiechen.ireader.ui.adapter.view;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;

import com.example.newbiechen.ireader.R;
import com.example.newbiechen.ireader.model.bean.BookChapterBean;
import com.example.newbiechen.ireader.model.local.CollBookManager;
import com.example.newbiechen.ireader.ui.base.adapter.ViewHolderImpl;

/**
 * Created by newbiechen on 17-5-16.
 */

public class CategoryHolder extends ViewHolderImpl<BookChapterBean> {

    private TextView mTvChapter;

    @Override
    public void initView() {
        mTvChapter = findById(R.id.category_tv_chapter);
    }

    @Override
    public void onBind(BookChapterBean value, int pos){
        //首先判断是否该章已下载
        Drawable drawable = null;
        if (value.getBookId() != null
                && CollBookManager.getInstance()
                .isChapterCached(value.getBookId(),value.getTitle())){
            drawable = ContextCompat.getDrawable(getContext(),R.drawable.ic_item_category_download);
        }
        else {
            drawable = ContextCompat.getDrawable(getContext(), R.drawable.selector_chapter_drawable);
        }
        mTvChapter.setSelected(false);
        mTvChapter.setCompoundDrawablesWithIntrinsicBounds(drawable,null,null,null);
        mTvChapter.setText(value.getTitle());
    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_category;
    }

    public void setSelectedChapter(){
        mTvChapter.setSelected(true);
    }
}