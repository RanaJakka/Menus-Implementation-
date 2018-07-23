package menus.rana.com.menuimplementation.base.menus

import android.content.Context
import android.util.Log
import android.view.MenuItem
import menus.rana.com.menuimplementation.R

class IndividualMenu: EmptyMenuHandler() {
    init {
        menuList.add(getDebugMenu())
        menuList.add(getDebugMenu())
        menuList.add(getDebugMenu())
    }
    override fun onOptionalItemSelected(context: Context, menuItem: MenuItem): Boolean {
        var item=getDebugMenu()
        if(menuItem.itemId==item.id){
            Log.v("MENU SELCTED","--> MENU SELECTED")
            return true
        }
        else return false
    }

    private fun getDebugMenu():MyMenuItem{
        return MyMenuItem(R.id.myMenuInfo,"RANA",R.drawable.abc_ic_star_black_48dp)
    }
}