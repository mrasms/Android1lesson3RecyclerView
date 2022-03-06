package com.example.android1lesson3recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android1lesson3recyclerview.adapter.UserAdapter;
import com.example.android1lesson3recyclerview.data.UserData;
import com.example.android1lesson3recyclerview.databinding.ActivityMainBinding;
import com.example.android1lesson3recyclerview.model.UserModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ArrayList<UserModel> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialisation();

    }

    private void initialisation() {
        names = UserData.getNames();
        UserAdapter userAdapter = new UserAdapter(names);
        binding.recycler.setAdapter(userAdapter);
    }


}