package fr.wherearethey.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class hello_screen extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView tv = (TextView) findViewById(R.id.maTextView);
        tv.setText("Plop");
    }
}