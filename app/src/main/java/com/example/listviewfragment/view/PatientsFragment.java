package com.example.listviewfragment.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.listviewfragment.R;

import java.util.ArrayList;
import java.util.List;

public class PatientsFragment extends Fragment {

    private ListView patientsListView;
    private List<String> patientsList;

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_patients, viewGroup, false);
        patientsListView = rootView.findViewById(R.id.patients_listview);
        patientsList = new ArrayList<>();
        patientsList.add("Patient 1");
        patientsList.add("Patient 2");
        patientsList.add("Patient 3");
        patientsList.add("Patient 4");
        patientsList.add("Patient 5");
        patientsList.add("Patient 6");
        patientsList.add("Patient 7");
        patientsList.add("Patient 8");
        patientsList.add("Patient 9");
        patientsList.add("Patient 10");
        ArrayAdapter adapter = new ArrayAdapter<>(getActivity(),R.layout.listview_item,R.id.item_name,patientsList);
        patientsListView.setAdapter(adapter);
        return rootView;
    }
}
