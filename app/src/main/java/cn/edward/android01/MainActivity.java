package cn.edward.android01;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private IntentFilter intentFilter;
//    private NetworkChangeReceiver ncr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather", null) != null) {
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }

//        intentFilter = new IntentFilter();
//        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
//        ncr = new NetworkChangeReceiver();
//        registerReceiver(ncr, intentFilter);

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
//        unregisterReceiver(ncr);
    }


    public IntentFilter getIntentFilter() {
        return intentFilter;
    }

    public void setIntentFilter(IntentFilter intentFilter) {
        this.intentFilter = intentFilter;
    }


    //    class NetworkChangeReceiver extends BroadcastReceiver {
//        @Override
//        public void onReceive(Context context, Intent intent){
//            ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
//            NetworkInfo ni = cm.getActiveNetworkInfo();
//            if (ni != null && ni.isAvailable()){
//                Toast.makeText(context, "na", Toast.LENGTH_SHORT).show();
//
//            }else{
//                Toast.makeText(context, "nna", Toast.LENGTH_SHORT).show();
//            }
//        }
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.add_item:
//                Toast.makeText(this, R.string.menu_add, Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.remove_item:
//                Toast.makeText(this, R.string.menu_remove, Toast.LENGTH_SHORT).show();
//                break;
//            default:
//        }
//        return true;
//
//    }




}
