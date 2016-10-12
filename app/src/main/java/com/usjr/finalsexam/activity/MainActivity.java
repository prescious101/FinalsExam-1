package com.usjr.finalsexam.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.usjr.finalsexam.R;
import com.usjr.finalsexam.adapters.VideoListAdapter;
import com.usjr.finalsexam.entity.TestData;
import com.usjr.finalsexam.entity.Video;
import com.usjr.finalsexam.fragments.VideoListFragment;

public class MainActivity extends AppCompatActivity {

    TestData testData = new TestData();
    Video video = new Video();
    VideoListAdapter videoListAdapter   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        VideoListFragment videoListFragment =
                (VideoListFragment) fm.findFragmentById(R.id.videoListFragment);



        Fragment fragment = new VideoListFragment();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.videoListFragment,fragment);
        fragmentTransaction.commit();


    }
}
