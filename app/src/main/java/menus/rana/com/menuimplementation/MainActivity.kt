package menus.rana.com.menuimplementation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

import menus.rana.com.menuimplementation.base.activity.BaseActivity
import menus.rana.com.menuimplementation.base.menus.IndividualMenu

class MainActivity:BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.text_info)
        makeActionBar(IndividualMenu())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        return super.onCreateOptionsMenu(menu)
    }
}
