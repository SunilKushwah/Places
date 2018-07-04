package com.example.places;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ExploreFragment extends Fragment {
    public static final String TAG = "SearchFragment";
    FragmentManager fragmentManager;

    public static ExploreFragment newInstance() {
        ExploreFragment f = new ExploreFragment();
        return f;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG,"onAttach");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG,"OnStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,"Resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG,"pause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"stop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG,"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"destroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG,"detach");
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_explore, container, false);
        Log.d(TAG,"onCreateView");
        fragmentManager = getActivity().getSupportFragmentManager();
        loadViews(layout);
        return layout;
    }


    public void loadViews(View layout){

    }

}



