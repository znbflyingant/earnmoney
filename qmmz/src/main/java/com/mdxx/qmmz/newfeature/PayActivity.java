package com.mdxx.qmmz.newfeature;

import com.mdxx.qmmz.R;

public class PayActivity extends BaseWebViewActivity {

    @Override
    protected String setMtitle() {
        return getString(R.string.pay);
    }

    @Override
    protected String setScheme() {
        return "alipays";
    }
}
