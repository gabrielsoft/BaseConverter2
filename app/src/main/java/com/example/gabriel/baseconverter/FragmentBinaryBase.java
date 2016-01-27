package com.example.gabriel.baseconverter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gabriel on 1/27/16.
 */
public class FragmentBinaryBase extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup parent,Bundle savedInstanceState){
        View layout = inflater.inflate(R.layout.fragment_binary,parent,false);
        return layout;
    }
}
