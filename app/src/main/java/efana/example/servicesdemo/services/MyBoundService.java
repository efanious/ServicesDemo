package efana.example.servicesdemo.services;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class MyBoundService extends Service {

    private MyLocalBinder myLocalBinder = new MyLocalBinder();

    public class MyLocalBinder extends Binder {

        public MyBoundService getService() {
            return MyBoundService.this;
        }

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return myLocalBinder;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(int a, int b) {
        return (float)a / (float)b;
    }


}
