package cn.com.jdsc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter{
	public final static int TAB_COUNT = 5;
	public FragmentAdapter(FragmentManager fm) {
		super(fm);
	}

	
//	爱上了可敬的合肥奥斯卡京东方拉斯科京东方林肯郡 林肯郡的绿卡减肥的阿卡洛杉矶的分 
	
	@Override
	public Fragment getItem(int id) {
		switch (id) {
		case MainActivity.TAB_HOME:
			HomeFragment homeFragment = new HomeFragment();
			return homeFragment;
		case MainActivity.TAB_CATAGORY:
			CategoryFragment categoryFragment = new CategoryFragment();
			return categoryFragment;
		case MainActivity.TAB_CAR:
			CarFragment carFragment = new CarFragment();
			return carFragment;
		case MainActivity.TAB_BUY:
			BuyFragment buyFragment = new BuyFragment();
			return buyFragment;
		case MainActivity.TAB_MORE:
			MoreFragment moreFragment = new MoreFragment();
			return moreFragment;
		}
		return null;
	}

	@Override
	public int getCount() {
		return TAB_COUNT;
	}
}
