package mx.edu.utng.dloza.sweettypical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
    }

    public void map(View v){

        //Usar la clase Intent para poder lanzar otro Activity
        Intent intent = new Intent(ShopActivity.this, MapActivity.class);
        startActivity(intent);
    }

}
