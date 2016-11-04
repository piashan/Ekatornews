package mpsoftware.ltd.ekatornews.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import mpsoftware.ltd.ekatornews.AnimationUtils;
import mpsoftware.ltd.ekatornews.R;

/**
 * Created by piash on 11/4/16.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.SNewsViewHolder> {

    private Context mContext;
    private List<String > mStringList;
    private int mPreviousPosition = 0;

    public RVAdapter(Context mContext, List<String> mStringList) {
        this.mContext = mContext;
        this.mStringList = mStringList;
    }

    @Override
    public SNewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_layout_snews, parent, false);

    return new SNewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SNewsViewHolder holder, int position) {

        holder.mTextViewSNews.setText(mStringList.get(position));
        if (position > mPreviousPosition) {
            AnimationUtils.animateSunblind(holder, true);
//            AnimationUtils.animateSunblind(holder, true);
//            AnimationUtils.animate1(holder, true);
//            AnimationUtils.animate(holder,true);
        } else {
            AnimationUtils.animateSunblind(holder, false);
//            AnimationUtils.animateSunblind(holder, false);
//            AnimationUtils.animate1(holder, false);
//            AnimationUtils.animate(holder, false);
        }

    }

    @Override
    public int getItemCount() {
        return mStringList.size();
    }

    public class SNewsViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextViewSNews;
        public SNewsViewHolder(View itemView) {
            super(itemView);
            mTextViewSNews = (TextView) itemView.findViewById(R.id.textViewSnews);
        }
    }
}
