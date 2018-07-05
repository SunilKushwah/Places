package com.example.places;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.places.dialog.SelectPlacesDialogFragment;

public class ExploreFragment extends Fragment implements SelectPlacesDialogFragment.OnPlaceSelectedListener,View.OnClickListener {
    public static final String TAG = "SearchFragment";
    FragmentManager fragmentManager;
    Button getLocationButton,foodButton,shopButton,drinksButton,coffeeButton,artsButton,
            outdoorButton,sightButton,trendingButton;
    RecyclerView placesRecyclerView;


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
        getLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSelectPlacesDialog();
            }
        });
        return layout;
    }


    public void loadViews(View layout){
        getLocationButton = layout.findViewById(R.id.get_location_button);
        getLocationButton.setOnClickListener(this);
        foodButton = layout.findViewById(R.id.food_btn);
        foodButton.setOnClickListener(this);
        drinksButton = layout.findViewById(R.id.drinks_btn);
        drinksButton.setOnClickListener(this);
        coffeeButton = layout.findViewById(R.id.coffee_btn);
        coffeeButton.setOnClickListener(this);
        shopButton = layout.findViewById(R.id.shops_btn);
        shopButton.setOnClickListener(this);
        artsButton = layout.findViewById(R.id.arts_btn);
        artsButton.setOnClickListener(this);
        outdoorButton = layout.findViewById(R.id.outdoors_btn);
        outdoorButton.setOnClickListener(this);
        sightButton = layout.findViewById(R.id.sights_btn);
        sightButton.setOnClickListener(this);
        trendingButton = layout.findViewById(R.id.trending_btn);
        trendingButton.setOnClickListener(this);
        placesRecyclerView = layout.findViewById(R.id.places_rv);
    }

    private void showSelectPlacesDialog(){
        SelectPlacesDialogFragment dialog = SelectPlacesDialogFragment.newInstance();
        dialog.setTargetFragment(this,0);
        dialog.show(fragmentManager, "SelectPlacesDialogFragment");
    }

    @Override
    public void onInputData(String typedValue) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.get_location_button:
                break;
            case R.id.food_btn:
                break;
            case R.id.drinks_btn:
                break;
            case R.id.coffee_btn:
                break;
            case R.id.shops_btn:
                break;
            case R.id.arts_btn:
                break;
            case R.id.outdoors_btn:
                break;
            case R.id.sights_btn:
                break;
            case R.id.trending_btn:
                break;
        }
    }
}



