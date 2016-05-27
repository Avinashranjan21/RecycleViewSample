package com.avinash.dummyrecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by avinash on 28/5/16.
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.RecycleViewHolder> {

    private LayoutInflater mLayoutInflater;
    private List<String> mData;

    public RecycleViewAdapter(Context mContext, List<String> mData) {
        this.mLayoutInflater=LayoutInflater.from(mContext);
        this.mData=mData;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = mLayoutInflater.inflate(R.layout.recycle_view_card,parent,false);
        RecycleViewHolder mRecycleViewHolder = new RecycleViewHolder(mView);
        return mRecycleViewHolder;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {

        holder.setData(mData.get(position));
    }



    @Override
    public int getItemCount() {
        return mData.size();
    }

    class RecycleViewHolder extends RecyclerView.ViewHolder{

        TextView tv_SampleText;

        public RecycleViewHolder(View itemView) {
            super(itemView);
            tv_SampleText= (TextView) itemView.findViewById(R.id.tv_SampleText);
        }

        public void setData(String text){
            tv_SampleText.setText(text);
        }
    }
}
