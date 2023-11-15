package com.example.mdiw;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    private TextView textView;
    private int textValue = 0;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        textView = rootView.findViewById(R.id.textview);
        Button increaseButton = rootView.findViewById(R.id.increase_button);
        Button decreaseButton = rootView.findViewById(R.id.decrease_button);
        textView.setText(String.valueOf(textValue));

        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textValue++;
                textView.setText(String.valueOf(textValue));
            }
        });

        decreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textValue--;
                textView.setText(String.valueOf(textValue));
            }
        });

        return rootView;
    }
}
