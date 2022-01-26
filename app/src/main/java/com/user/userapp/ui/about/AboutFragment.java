package com.user.userapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.user.userapp.R;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {


    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel>list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_about, container, false);

        list =new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp,"ComputerScience",  "Computer Science And Engineering started in the year 1999.At present intake sheet in I-year is 60 student and lateral entry is 10"));
        list.add(new BranchModel(R.drawable.ic_mech ,"MechanicalEngineering",  "Mechanical Engineering started in the year 1999.At present intake sheet in I-year is 60 student and lateral entry is 10"));


        adapter = new BranchAdapter(getContext(),list);



        viewPager= view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);


        ImageView imageView=view.findViewById(R.id.college_image);
        Glide.with(getContext()).load("https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.svec.education%2Fwp-content%2Fuploads%2F2019%2F12%2Fsvet_building.jpg&imgrefurl=https%3A%2F%2Fwww.svec.education%2F&tbnid=vnQvZhGksGgx3M&vet=1&docid=wtvW0zWyFT81hM&w=400&h=300&itg=1&source=sh%2Fx%2Fim").into(imageView);

        return  view;
    }
}