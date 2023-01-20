package com.example.my_grocery_app.ui.delivery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.my_grocery_app.databinding.ActivityMain2Binding;
import com.example.my_grocery_app.databinding.ActivityMain3Binding;
import com.example.my_grocery_app.databinding.FragmentDeliverytrackBinding;

import com.example.my_grocery_app.ui.delivery.DeliveryTrackViewModel;

public class DeliveryTrackFragment extends Fragment{

    private FragmentDeliverytrackBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DeliveryTrackViewModel deliveryTrackViewModel=
                new ViewModelProvider(this).get(DeliveryTrackViewModel.class);

        binding = FragmentDeliverytrackBinding .inflate(inflater, container, false);
        View root = binding.getRoot();


        //final TextView textView = binding.track;
        //deliveryTrackViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}