package com.cly.minevideoapplication.ui.videolist;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cly.minevideoapplication.BaseFragment;
import com.cly.minevideoapplication.R;
import com.cly.minevideoapplication.data.bean.AVBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoListFragment extends BaseFragment implements VideoListContract.View {


    RecyclerView rvVideoList;

    private VideoListContract.Presenter presenter;
    private VideoListAdapter adapter;

    public VideoListFragment() {
        // Required empty public constructor
    }

    public static VideoListFragment newInstance() {

        Bundle args = new Bundle();

        VideoListFragment fragment = new VideoListFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video_list, container, false);
        rvVideoList = ((RecyclerView) view.findViewById(R.id.rv_video_list));
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new VideoListAdapter(getActivity());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rvVideoList.setLayoutManager(layoutManager);
        rvVideoList.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.subscribe();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.unsubscribe();
    }

    @Override
    public void setPresenter(VideoListContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void setProgressState(boolean isShow) {

    }

    @Override
    public void loadDatas(List<AVBean> list) {
        adapter.setDatas(list);
    }

    @Override
    public void loadError(String message) {

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
