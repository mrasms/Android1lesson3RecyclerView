package com.example.android1lesson3recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1lesson3recyclerview.databinding.ListHolderBinding;
import com.example.android1lesson3recyclerview.model.UserModel;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {
    ArrayList<UserModel> names;

    public UserAdapter(ArrayList<UserModel> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserHolder(ListHolderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UserHolder holder, int position) {
        holder.onBind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        ListHolderBinding binding;

        public UserHolder(@NonNull ListHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(UserModel userModel) {
            binding.tvValue.setText(userModel.getName());

        }
    }
}
