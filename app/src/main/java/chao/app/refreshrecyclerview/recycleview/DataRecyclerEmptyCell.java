package chao.app.refreshrecyclerview.recycleview;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;

import chao.app.refreshrecyclerview.R;


/**
 * 默认的空单元格
 * 
 * @author solomon.wen
 * @since 2013-12-18
 */
public final class DataRecyclerEmptyCell extends DataRecyclerDataCell {
	@Override
	public final View createCellView() {
		View tmpView = super.createCellView();
		mTextView.setGravity(Gravity.CENTER);
		mTextView.setTextColor(ColorStateList.valueOf(Color.parseColor("#777777")));
		return tmpView;
	}

	@Override
	public final void bindData() {
		String message = mAdapter.getRecyclerData().message.trim();
		if (message.length() < 1) {
			message = mAdapter.getContext().getString(R.string.data_recycler_data_empty);
		}

		mTextView.setText(message);
//		if (mAdapter.getRecyclerView().getEnableAutoHeight()) {
//			mTextView.setMaxWidth(mAdapter.getRecyclerView().getWidth());
//		}
	}
}
