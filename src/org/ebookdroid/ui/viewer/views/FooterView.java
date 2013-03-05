package org.ebookdroid.ui.viewer.views;

import org.ebookdroid.R;
import org.ebookdroid.ui.viewer.IActivityController;
import org.ebookdroid.ui.viewer.ViewerActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;


public class FooterView extends RelativeLayout{

    

    public FooterView(final ViewerActivity parent) {
        super(parent);
        
        LayoutInflater.from(parent).inflate(R.layout.footer_reader, this, true);
        // TODO Auto-generated constructor stub
    }

}
