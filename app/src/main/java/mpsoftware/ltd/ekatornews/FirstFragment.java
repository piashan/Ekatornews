package mpsoftware.ltd.ekatornews;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

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

        getDataSet();
/*
        for (int i = 0; i <10 ; i++) {
            mStringList.add("Bangla new 24. com " +i);
        }*/
        //FlipInTopXAnimator animator = new FlipInTopXAnimator();
        //animator.setAddDuration(500);
        //animator.setRemoveDuration(500);
        mRVAdapter = new RVAdapter(getActivity(), mStringList);
        //mRecyclerViewSNews.setItemAnimator(animator);
        mRecyclerViewSNews.setAdapter(mRVAdapter);

        mRVAdapter.setOnClickListener(new RVAdapter.RVClickListener() {
            @Override
            public void onItemClick(int position, View view) {
                Toast.makeText(getActivity(), "CLick is ok", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

    public void getDataSet(){
        mStringList.add("Separation of judiciary from the executive organs of the State was announced as one of the fundamental principles of the State policy in Article 22 of the new constitution of Independent Bangladesh. " );
        mStringList.add("The government is creating a land bank of 100,000 acres to help domestic and foreign investors set up their factories without any");
        mStringList.add("First-time claims for US unemployment benefits rose in the final week of October but the extended trend of low levels persisted, the");
        mStringList.add("German sportswear group Adidas on Thursday reported a jump in third-quarter profits, lifted by a surge in sales of its own-brand trainers");
        mStringList.add("Facebook on Wednesday delivered another blockbuster earnings performance, showing solid growth in mobile ad revenues as the social");
        mStringList.add("After Mashrafe Bin Mortaza, Mushfiqur Rahim and Shakib Al Hasan reached the 10-year mark in their cricketing careers,");
        mStringList.add("England is a known power in the cricketing world. Bangladesh, for the most part of its 16 years since attaining Test status, has struggled to keep its nose above water, sometimes to the condescending stare of cricket gurus.");
        mStringList.add("With India in the foreground, you get another measure to evaluate on a tripartite scale the cricketing prowess of two sub-continental countries versus England. This is the beauty of successive cricketing clashes, Test matches in particular, that we should be having by way value addition to world cricket.");
        mStringList.add("Negligence, callousness and a lack of farsightedness of the local...");
        mStringList.add("First-time claims for US unemployment benefits rose in the final week of October but the extended trend of low levels persisted, the");
        mStringList.add("German sportswear group Adidas on Thursday reported a jump in third-quarter profits, lifted by a surge in sales of its own-brand trainers");
        mStringList.add("Facebook on Wednesday delivered another blockbuster earnings performance, showing solid growth in mobile ad revenues as the social");
        mStringList.add("After Mashrafe Bin Mortaza, Mushfiqur Rahim and Shakib Al Hasan reached the 10-year mark in their cricketing careers,");
        mStringList.add("England is a known power in the cricketing world. Bangladesh, for the most part of its 16 years since attaining Test status, has struggled to keep its nose above water, sometimes to the condescending stare of cricket gurus.");
        mStringList.add("With India in the foreground, you get another measure to evaluate on a tripartite scale the cricketing prowess of two sub-continental countries versus England. This is the beauty of successive cricketing clashes, Test matches in particular, that we should be having by way value addition to world cricket.");
        mStringList.add("Negligence, callousness and a lack of farsightedness of the local...");
    }

}
