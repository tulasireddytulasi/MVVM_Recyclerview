package com.example.mvvm_recyclerview;

import android.content.Context;
import androidx.databinding.DataBindingUtil;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.mvvm_recyclerview.databinding.RvlayoutBinding;

import java.util.List;

public class MyRecyclerviewAdapter extends RecyclerView.Adapter<MyRecyclerviewAdapter.ViewHolder> {

    private List<DataModel> dataModelList;
    private Context context;

    public MyRecyclerviewAdapter(Context ctx,List<DataModel> dataModelList) {
        this.dataModelList = dataModelList;
        context = ctx;
    }

    @NonNull
    @Override
    public MyRecyclerviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        RvlayoutBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.rvlayout, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataModel dataModel = dataModelList.get(position);
        holder.itemRowBinding.setDatamodel(dataModel);
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

//    @Override
//    public void cardClicked(DataModel f) {
//        Toast.makeText(context, "You clicked " + f.names,
//                Toast.LENGTH_LONG).show();
//    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public RvlayoutBinding itemRowBinding;

        public ViewHolder(@NonNull RvlayoutBinding itemRowBinding) {
            super(itemRowBinding.getRoot());
            this.itemRowBinding = itemRowBinding;
        }

//        public void bind(Object obj) {
//            itemRowBinding.setVariable(BR.usernames, obj);
//            itemRowBinding.executePendingBindings();
//        }
    }
}
