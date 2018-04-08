package hr.ferit.annamariadragic.lv2_converter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ButtonShowcaseActivity extends Activity implements View.OnClickListener  {


    private ImageButton bFirstImage, bSecondImage, bThirdImage, bFourthImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_showcase);
        initializeUI();

    }

    //method to be called when first image button is pressed.
    public void onClickTemperature (View view){

        DisplayToast("Temperature Conversion");
        Intent StartTemperatureActivity = new Intent(this, ConversionActivity.class);
        this.startActivity(StartTemperatureActivity);
    }
    private void initializeUI() {
        this.bFirstImage = (ImageButton) findViewById(R.id.image1);
        this.bSecondImage =(ImageButton) findViewById(R.id.image2);
        this.bThirdImage = (ImageButton) findViewById(R.id.image3);
        this.bFourthImage = (ImageButton) findViewById(R.id.image4);
        this.bSecondImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        DisplayToast("Weight Conversion");
        Intent explicitIntent = new Intent();
        explicitIntent.setClass(getApplicationContext(), WeightConversion.class);
        this.startActivity(explicitIntent);
    }
    private void DisplayToast(String Msg) {
        Toast.makeText(this,Msg,Toast.LENGTH_SHORT).show();
    }

    //method to call when third image button is pressed.
    public void onClickDistance(View view) {
        DisplayToast("Distance Conversion");
        Intent StartDistanceActivity = new Intent();
        StartDistanceActivity.setClass(getApplicationContext(), DistanceConversion.class);
        this.startActivity(StartDistanceActivity);
    }
 // method to be called when fourth image btn is pressed
    public void onClickVolume(View view) {
        DisplayToast("Volume Conversion");
        Intent StartVolumeActivity = new Intent(this, VolumeConversion.class);
        this.startActivity(StartVolumeActivity);
    }
}
