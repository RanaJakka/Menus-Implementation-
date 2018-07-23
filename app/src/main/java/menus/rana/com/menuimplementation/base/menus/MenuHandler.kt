package menus.rana.com.menuimplementation.base.menus

import android.content.Context
import android.view.Menu
import android.view.MenuItem

interface MenuHandler {
    fun onCreateOptionalMenu(context: Context, menu: Menu): Boolean
    fun onOptionalItemSelected(context: Context, menu: MenuItem): Boolean
}