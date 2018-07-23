package menus.rana.com.menuimplementation.base.activity

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.CoordinatorLayout
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.FrameMetrics
import android.view.Menu
import android.widget.FrameLayout
import android.widget.Toolbar
import menus.rana.com.menuimplementation.R
import menus.rana.com.menuimplementation.base.menus.MenuHandler

abstract class BaseActivity:AppCompatActivity() {
    var menuHandler:MenuHandler?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme1)

    }

    override fun setContentView(@LayoutRes layoutResID: Int) {
        super.setContentView(R.layout.activity_main)
        var frameLayout=findViewById<FrameLayout>(R.id.contentFrame)
        val toolbar=findViewById<android.support.v7.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        layoutInflater.inflate(layoutResID,frameLayout,true)

    }

    open fun makeActionBar(menuHandler: MenuHandler){
        this.menuHandler=menuHandler

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuHandler?.apply {
            Log.v("CREATE MENU ITEMS","-->")
            return onCreateOptionalMenu(this@BaseActivity,menu)

        }
        return super.onCreateOptionsMenu(menu)

    }
}