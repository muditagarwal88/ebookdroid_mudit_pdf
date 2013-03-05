package org.ebookdroid;

import org.ebookdroid.ui.viewer.ViewerActivityController;

import android.content.Context;
import android.widget.Toast;


public class EBookDroidMethods {
    ViewerActivityController vac;

    public EBookDroidMethods(ViewerActivityController c, Context context) {
        Toast.makeText(context, "contristor", Toast.LENGTH_SHORT).show();
        this.vac=c;
        
    }

    
    public void gotoPage()
    {
        vac.getOrCreateAction(R.id.mainmenu_goto_page).run();
    }
    
    public void showSearch()
    {
        vac.getOrCreateAction(R.id.actions_doSearch).run();
        
    }
    
    
    
}
