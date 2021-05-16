package id.itunud.progmobTubes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//class untuk fragment rapid antigen
public class RapidAntigenFragment extends Fragment {


    public RapidAntigenFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rapid_antigen, container, false);
        return view;
    }
}