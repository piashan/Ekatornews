package mpsoftware.ltd.ekatornews.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v13.app.FragmentStatePagerAdapter;

import mpsoftware.ltd.ekatornews.FirstFragment;

/**
 * Created by piash on 9/25/16.
 */

public class SampleFragmentPagerAdapter extends FragmentStatePagerAdapter {
    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[] { "Top Stories", "Latest" ,"Most Visited", "Photo" ,"My news", "Add Category" };
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Fragment getItem(int position) {
        /*if (position == 0){
            return new FirstFragment();
        }else if (position == 1){
            return new SecondFragment();
        }*/
        return new FirstFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        /*switch (position) {
            case 0:
                return "Home";
            case 1:
                return "Crazy";
        }
        return null;*/

        return tabTitles[position];
    }
}
