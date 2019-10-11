package com.example.mvvm_recyclerview.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.mvvm_recyclerview.DataModel;
import com.example.mvvm_recyclerview.Repository.RepoClass;

import java.util.List;

public class RecyclerViewModel extends ViewModel {

    private MutableLiveData<List<DataModel>> mLiveData;
    private RepoClass repoClass;

    public void init() {

        if(mLiveData != null)
            return;

        repoClass = RepoClass.getInstance();
        mLiveData = repoClass.getData();
    }

    public LiveData<List<DataModel>> getData(){
        return mLiveData;
    }
}
