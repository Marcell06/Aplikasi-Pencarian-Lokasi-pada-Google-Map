package ac.id.atmaluhur.mahasiswa1811500088.ui.hospital;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HospitalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HospitalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is hospital fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}