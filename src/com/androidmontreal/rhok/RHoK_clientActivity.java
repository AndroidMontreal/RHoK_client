package com.androidmontreal.rhok;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

/**
 * <p>NOTE: Don't get confused, the "AndroidApplication" class actually extends Activity, it's got nothing to do with what
 * we usually call an "Application" on Android.
 */
public class RHoK_clientActivity extends RoboGdxActivity {
	
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new WaterSupplyGame(), config);
	}
	
}