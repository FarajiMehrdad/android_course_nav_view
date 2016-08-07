package ir.approom.androidnavigationview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        ExampleFragmentPagerAdapter adapter = new ExampleFragmentPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

    }


    static class ExampleFragmentPagerAdapter extends FragmentPagerAdapter{


        String[] pagerTitle = {"First" , "Second"};

        public ExampleFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            if (position ==0){

                FirstFragment firstFragment = new FirstFragment();
                return firstFragment;

            }else{

                SecondFragment secondFragment = new SecondFragment();
                return secondFragment;

            }

        }

        @Override
        public int getCount() {
            return pagerTitle.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            return pagerTitle[position];
        }
    }



}
