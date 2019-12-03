package com.example.listviewfragment.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.listviewfragment.R;

import java.util.ArrayList;
import java.util.List;

public class DrugsFragment extends Fragment {

    private ListView drugsListView;
    private List<String> drugsList;

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_drugs, viewGroup, false);
        drugsListView = rootView.findViewById(R.id.drugs_listview);
        drugsList = new ArrayList<>();
        drugsList.add("Drug 1");
        drugsList.add("Drug 2");
        drugsList.add("Drug 3");
        drugsList.add("Drug 4");
        drugsList.add("Drug 5");
        drugsList.add("Drug 6");
        drugsList.add("Drug 7");
        drugsList.add("Drug 8");
        drugsList.add("Drug 9");
        drugsList.add("Drug 10");
        ArrayAdapter adapter = new ArrayAdapter<>(getActivity(),R.layout.listview_item, R.id.item_name, drugsList);
        drugsListView.setAdapter(adapter);
        return rootView;
    }
}
