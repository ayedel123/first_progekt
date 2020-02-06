package com.example.progektfirsttry.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.progektfirsttry.MainMainActivity;
import com.example.progektfirsttry.R;

public class top_button_fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // менеджер компоновки, который позволяет получать доступ к layout с наших ресурсов
        View view = inflater.inflate(R.layout.top_button_fragment, container, false);

        // теперь можем получить наши элементы, расположенные во фрагменте
          Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"aaaaa",Toast.LENGTH_LONG).show();
            }
        });
        Button button3 = (Button) view.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"fffffff",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
