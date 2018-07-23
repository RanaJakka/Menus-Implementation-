package menus.rana.com.menuimplementation.base.menus

import android.content.Context
import android.support.annotation.DrawableRes
import android.support.annotation.IdRes
import android.support.annotation.StyleRes
import android.view.Menu
import android.view.MenuItem

abstract class EmptyMenuHandler:MenuHandler {
    protected var menuList: MutableList<MyMenuItem> = mutableListOf()

    override fun onCreateOptionalMenu(context: Context, menu: Menu): Boolean {
        menuList.forEach {
            addToToolBar(menu,it)
        }

        return true

    }

    private fun addToToolBar(menu:Menu,myMenu: MyMenuItem){
        var item=menu.add(Menu.NONE,myMenu.id,myMenu.order,myMenu.title)
        item.setIcon(myMenu.icon)
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_WITH_TEXT)

    }

    data class MyMenuItem(@IdRes val id:Int, @StyleRes val title:String, @DrawableRes val icon:Int, var order:Int= Menu.NONE )
}