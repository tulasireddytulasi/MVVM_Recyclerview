package com.example.mvvm_recyclerview;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.databinding.DataBindingUtil;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mvvm_recyclerview.ViewModel.RecyclerViewModel;
import com.example.mvvm_recyclerview.databinding.ActivityMainBinding;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private RecyclerViewModel viewModel;
    private MyRecyclerviewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = ViewModelProviders.of(MainActivity.this).get(RecyclerViewModel.class);
        viewModel.init();
        viewModel.getData().observe(this, new Observer<List<DataModel>>() {
            @Override
            public void onChanged(@Nullable List<DataModel> dataModels) {
                adapter.notifyDataSetChanged();
            }
        });
        activityMainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        activityMainBinding.recyclerView.setHasFixedSize(true);
        adapter = new MyRecyclerviewAdapter(this, viewModel.getData().getValue());
        activityMainBinding.recyclerView.setAdapter(adapter);
    }
}
