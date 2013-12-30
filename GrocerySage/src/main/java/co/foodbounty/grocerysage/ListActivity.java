package co.foodbounty.grocerysage;

import android.widget.EditText;

/**
 * Created by max on 12/29/13.
 */
public class ListActivity {//this is the Model layer for GeoQuiz
    private int mQuestion;




    private boolean mListQuestion;

    public ListActivity(int question, boolean listQuestion){
        mQuestion = question;
        mListQuestion = listQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean isListQuestion() {
        return mListQuestion;
    }

    public void setListQuestion(boolean mListQuestion) {
        this.mListQuestion = mListQuestion;
    }
}

