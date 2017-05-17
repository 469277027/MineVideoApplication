package com.cly.minevideoapplication.ui.videolist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cly.minevideoapplication.R;
import com.cly.minevideoapplication.data.bean.AVBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 2017/5/16.
 */

public class VideoListAdapter extends RecyclerView.Adapter<VideoListAdapter.ViewHolder> {

    private Context context;
    private List<AVBean> list;

    public VideoListAdapter(Context context) {
        this.context = context;
        list = new ArrayList<>();
    }

    public void setDatas(List<AVBean> list) {
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.item_video_list, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.loadDatas(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView pic;
        private TextView name, time, space;

        public ViewHolder(View itemView) {
            super(itemView);
            pic = ((ImageView) itemView.findViewById(R.id.iv_img));
            name = ((TextView) itemView.findViewById(R.id.tv_name));
            time = ((TextView) itemView.findViewById(R.id.tv_time));
            space = ((TextView) itemView.findViewById(R.id.tv_space));
        }

        public void loadDatas(int position) {
            AVBean bean = list.get(position);
            Glide.with(context)
                    .load(bean.getPic())
                    .into(pic);

            name.setText(bean.getName());
            time.setText(bean.getTime());
            space.setText(String.valueOf(bean.getSpace()) + "M");
        }
    }
}
