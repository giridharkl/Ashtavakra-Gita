package com.ashtavakra.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("न पृथ्वी न जलं नाग्निर्न वायुर्द्यौर्न वा भवान्।\n" +
                "एषां साक्षिणमात्मानं चिद्रूपं विध्दि मुक्तये ॥\n\n" +
                "भवान् You पृथ्वी earth न not जलं water न not अग्निः fire न not वायुः air न not द्यौः ether न not वा or (त्वं you) मुक्तणं witness चिद्रूपं consciousness itself विध्दि know\n\n" +
                "You are neither earth, nor water, nor fire, nor air, nor ether. In order to attain liberation, know the Self as the witness of all these and Consciousness itself\n");
    }

    public LiveData<String> getText() {
        return mText;
    }
}