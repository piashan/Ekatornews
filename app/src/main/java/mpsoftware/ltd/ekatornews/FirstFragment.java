package mpsoftware.ltd.ekatornews;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import jp.wasabeef.recyclerview.animators.FlipInTopXAnimator;
import mpsoftware.ltd.ekatornews.adapter.RVAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private RecyclerView mRecyclerViewSNews;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<String> mStringList = new ArrayList<>();
    private RVAdapter mRVAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);
        mRecyclerViewSNews = (RecyclerView)view.findViewById(R.id.recyclerViewSubNews);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerViewSNews.setLayoutManager(mLayoutManager);

        for (int i = 0; i <10 ; i++) {
            mStringList.add("Bangla new 24. com " +i);
        }
        //FlipInTopXAnimator animator = new FlipInTopXAnimator();
        //animator.setAddDuration(500);
        //animator.setRemoveDuration(500);
        mRVAdapter = new RVAdapter(getActivity(), mStringList);
        //mRecyclerViewSNews.setItemAnimator(animator);
        mRecyclerViewSNews.setAdapter(mRVAdapter);


        return view;
    }

}
