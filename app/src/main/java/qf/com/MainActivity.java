package qf.com;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.tv);
//        logsensor();

        SensorManager manager= (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor sensor=manager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        //传感器监听器
        SensorEventListener listener=new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                float x=event.values[0];
                float y=event.values[0];
                float z=event.values[0];
                tv.setText(x+"--"+y+"--"+z);
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }
        };
        //注册监听
        manager.registerListener(listener,sensor,SensorManager.SENSOR_DELAY_GAME);



    }


    //取消监听
    @Override
    protected void onStop() {
        super.onStop();
    }

    private void logsensor() {
        //获得传感器的管理对象
        SensorManager manager= (SensorManager) getSystemService(SENSOR_SERVICE);

        //得到当前手机支持的所有传感器
        List<Sensor> sensors=manager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor:sensors){
            //传感器公司名和传感器名字
            String str=sensor.getVendor()+"---"+sensor.getName();
            tv.setText(str);
//            Log.e("tag", "传感器"+str);
        }

    }
}
