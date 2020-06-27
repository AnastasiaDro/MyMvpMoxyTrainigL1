package com.trainings.mymvpmoxytrainigl1.moxy.moxyView;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MoxyView extends MvpView {



    @StateStrategyType(value = AddToEndStrategy.class)
    void setTextToTextView(String madeString);
    void clearEditText();
    void saveEnteredText();

}
