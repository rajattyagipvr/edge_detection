package com.sample.edgedetection.base

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    protected val TAG = this.javaClass.simpleName
    var use_internal_storage = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var intent = getIntent()
        use_internal_storage = intent.getBooleanExtra("use_internal_storage", false)
        setContentView(provideContentViewId())
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        initPresenter()
        prepare()
    }

    fun showMessage(id: Int) {
        Toast.makeText(this, id, Toast.LENGTH_SHORT).show();
    }

    abstract fun provideContentViewId(): Int

    abstract fun initPresenter()

    abstract fun prepare()
}
