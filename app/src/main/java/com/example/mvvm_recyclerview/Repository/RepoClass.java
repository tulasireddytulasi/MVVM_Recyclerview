package com.example.mvvm_recyclerview.Repository;

import androidx.lifecycle.MutableLiveData;
import com.example.mvvm_recyclerview.DataModel;
import java.util.ArrayList;
import java.util.List;

public class RepoClass {

    private static RepoClass instance;
    private ArrayList<DataModel> modelclass = new ArrayList<>();

    public static RepoClass getInstance() {
        if (instance == null)
            instance = new RepoClass();
        return instance;
    }

    public MutableLiveData<List<DataModel>> getData() {

        setData();
        MutableLiveData<List<DataModel>> data = new MutableLiveData<>();
        data.setValue(modelclass);
        return data;
    }

    private void setData() {

        modelclass = new ArrayList<>();
        modelclass.add(new DataModel("Tulasi Reddy","https://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-212.jpg"));
        modelclass.add(new DataModel("Raju Kumar","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-17.jpg"));
        modelclass.add(new DataModel("Vinod","https://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-34.jpg"));
        modelclass.add(new DataModel("Suresh","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-12-1.jpg"));
        modelclass.add(new DataModel("Nowshad","https://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-7.jpg"));
        modelclass.add(new DataModel("Katrina Kaif","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-1-2.jpg"));
        modelclass.add(new DataModel("Aliya Bhatt","http://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-3-1.jpg"));
        modelclass.add(new DataModel("Sharukh","https://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-2-1.jpg"));
        modelclass.add(new DataModel("Mahesh","https://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-2.jpg"));
        modelclass.add(new DataModel("Will Smith","https://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-and-Tamannaah-2.jpg"));
        modelclass.add(new DataModel("Raju Kumar","https://www.suryanfm.in/wp-content/uploads/2019/05/Kajal-Aggarwal-and-Tamannaah-1.jpg"));
        modelclass.add(new DataModel("Vinod","https://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-4-1.jpg"));
        modelclass.add(new DataModel("Suresh","https://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-3-1.jpg"));
        modelclass.add(new DataModel("Nowshad","https://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-6.jpg"));
        modelclass.add(new DataModel("Katrina Kaif","https://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-5.jpg"));
        modelclass.add(new DataModel("Aliya Bhatt","https://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-4.jpg"));
        modelclass.add(new DataModel("Sharukh","https://www.suryanfm.in/wp-content/uploads/2019/04/Kajal-Aggarwal-2.jpg"));
        modelclass.add(new DataModel("Mahesh","https://www.suryanfm.in/wp-content/uploads/2019/03/Kajal-Aggarwal-111.jpg"));
        modelclass.add(new DataModel("Will Smith","https://www.suryanfm.in/wp-content/uploads/2019/02/Kajal-Aggarwal-Tamannaah-Aditi-Rao-Hydari-Rana-Daggubatti-Maha-Sivaratri-1.jpg"));
    }
}
