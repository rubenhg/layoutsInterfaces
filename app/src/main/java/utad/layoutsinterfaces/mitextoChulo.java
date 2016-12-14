package utad.layoutsinterfaces;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by ruben.higuera on 14/12/2016.
 */
public class mitextoChulo extends TextView {

    public mitextoChulo(Context context){
        super(context);
        setTypeface(Typeface.createFromAsset(context.getAssets(),"assets/BurgerFrogDEMO.otf"));

    }
    public mitextoChulo(Context context , AttributeSet attrs, int defStyleAttr){
        super(context,attrs,defStyleAttr);
        setTypeface(Typeface.createFromAsset(context.getAssets(),"assets/BurgerFrogDEMO.otf"));
    }
    public mitextoChulo(Context context,AttributeSet attrs){
        super(context,attrs);
        setTypeface(Typeface.createFromAsset(context.getAssets(),"BurgerFrogDEMO.otf"));
    }
}
