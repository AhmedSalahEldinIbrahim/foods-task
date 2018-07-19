package com.etisalat.sampletask.bases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.etisalat.sampletask.R;

public class FoodsActivity extends BaseActivity<FoodsPresenter> {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);

    }

    @Override
    protected FoodsPresenter setupPresenter() {
        return new FoodsPresenter(this);
    }


}
