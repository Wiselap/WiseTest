/**
 * 
 */
package com.pawan.dpTester;

import org.slf4j.LoggerFactory;

import com.pawan.utils.AppConstants;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Toast;

/**
 * @author pawan
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		


		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		switch(metrics.densityDpi){
		
		case DisplayMetrics.DENSITY_LOW:
			AppConstants.logger.debug("Some log message. Details: {}", metrics.densityDpi); 
			Toast.makeText(MainActivity.this, "Low Density.", 100).show();
			break;
		case DisplayMetrics.DENSITY_MEDIUM:
			AppConstants.logger.debug("Some log message. Details: {}", metrics.densityDpi);
			Toast.makeText(MainActivity.this, "Medium Density.", 100).show();
			break;
		case DisplayMetrics.DENSITY_HIGH:
			AppConstants.logger.debug("Some log message. Details: {}", metrics.densityDpi);
			Toast.makeText(MainActivity.this, "High Density.", 100).show();
			break;
		case DisplayMetrics.DENSITY_XHIGH:
			AppConstants.logger.debug("Some log message. Details: {}", metrics.densityDpi);
			Toast.makeText(MainActivity.this, "X-High Density.", 100).show();
			break;
		case DisplayMetrics.DENSITY_XXHIGH:
			AppConstants.logger.debug("Some log message. Details: {}", metrics.densityDpi);
			Toast.makeText(MainActivity.this, "XX-High Density.", 100).show();
			break;
		case DisplayMetrics.DENSITY_XXXHIGH:
			AppConstants.logger.debug("Some log message. Details: {}", metrics.densityDpi);
			Toast.makeText(MainActivity.this, "XXX-High Density.", 100).show();
			break;
		case DisplayMetrics.DENSITY_280:
			AppConstants.logger.debug("Some log message. Details: {}", metrics.densityDpi);
			Toast.makeText(MainActivity.this, "280 Density.", 100).show();
			break;
		case DisplayMetrics.DENSITY_400:
			AppConstants.logger.debug("Some log message. Details: {}", metrics.densityDpi);
			Toast.makeText(MainActivity.this, "480 Density.", 100).show();
			break;
		case DisplayMetrics.DENSITY_560:
			AppConstants.logger.debug("Some log message. Details: {}", metrics.densityDpi);
			Toast.makeText(MainActivity.this, "560 Density.", 100).show();
			break;
		case DisplayMetrics.DENSITY_TV:
			AppConstants.logger.debug("Some log message. Details: {}", metrics.densityDpi);
			Toast.makeText(MainActivity.this, "TV Density.", 100).show();
			break;
		default:
			AppConstants.logger.debug("Some log message. Details: {}", metrics.densityDpi);
			break;
		}
	}
}
