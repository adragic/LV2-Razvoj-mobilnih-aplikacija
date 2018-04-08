package hr.ferit.annamariadragic.lv2_converter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayResultActivity extends AppCompatActivity {
TextView textValue1, textTitle1,textValue2, textTitle2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
        this.setUpUI();

        //back button- goes back to ButtonShowcaseActivity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void setUpUI() {
        this.textValue1 = (TextView) findViewById(R.id.displaytext1);
        this.textTitle1 = (TextView) findViewById(R.id.displaytext2);
        this.textValue2 = (TextView) findViewById(R.id.displaytext3);
        this.textTitle2 = (TextView) findViewById(R.id.displaytext4);

        Intent myintent =this.getIntent();

        //prikaz rezultata iz ConversionActivity (konverzija temperature)
        if (myintent.hasExtra(ConversionActivity.TEMPERATURE_KEY1)) {
            String inputedValue1= myintent.getStringExtra(ConversionActivity.TEMPERATURE_KEY1);
            textValue1.setText(inputedValue1);
        }
        if(myintent.hasExtra(ConversionActivity.TEMPERATURE_KEY2)) {
            String inputedUnit1 = myintent.getStringExtra(ConversionActivity.TEMPERATURE_KEY2);
            textTitle1.setText(inputedUnit1);
        }
        if(myintent.hasExtra(ConversionActivity.TEMPERATURE_KEY3)) {
            String resultValue1 = myintent.getStringExtra(ConversionActivity.TEMPERATURE_KEY3);
            textValue2.setText(resultValue1);
        }
        if(myintent.hasExtra(ConversionActivity.TEMPERATURE_KEY4)) {
            String resultUnit1 = myintent.getStringExtra(ConversionActivity.TEMPERATURE_KEY4);
            textTitle2.setText(resultUnit1);
        }

        //prikaz rezultata iz WeightConversion
        if (myintent.hasExtra(WeightConversion.WEIGHT_KEY1)) {
            String inputedValue2= myintent.getStringExtra(WeightConversion.WEIGHT_KEY1);
            textValue1.setText(inputedValue2);
        }
        if(myintent.hasExtra(WeightConversion.WEIGHT_KEY2)) {
            String inputedUnit2 = myintent.getStringExtra(WeightConversion.WEIGHT_KEY2);
            textTitle1.setText(inputedUnit2);
        }
        if(myintent.hasExtra(WeightConversion.WEIGHT_KEY3)) {
            String resultValue2 = myintent.getStringExtra(WeightConversion.WEIGHT_KEY3);
            textValue2.setText(resultValue2);
        }
        if(myintent.hasExtra(WeightConversion.WEIGHT_KEY4)) {
            String resultUnit2 = myintent.getStringExtra(WeightConversion.WEIGHT_KEY4);
            textTitle2.setText(resultUnit2);
        }

        //prikaz rezultata iz DistanceConversion
        if (myintent.hasExtra(DistanceConversion.DISTANCE_KEY1)) {
            String inputedValue3= myintent.getStringExtra(DistanceConversion.DISTANCE_KEY1);
            textValue1.setText(inputedValue3);
        }
        if(myintent.hasExtra(DistanceConversion.DISTANCE_KEY2)) {
            String inputedUnit3 = myintent.getStringExtra(DistanceConversion.DISTANCE_KEY2);
            textTitle1.setText(inputedUnit3);
        }
        if(myintent.hasExtra(DistanceConversion.DISTANCE_KEY3)) {
            String resultValue3 = myintent.getStringExtra(DistanceConversion.DISTANCE_KEY3);
            textValue2.setText(resultValue3);
        }
        if(myintent.hasExtra(DistanceConversion.DISTANCE_KEY4)) {
            String resultUnit3 = myintent.getStringExtra(DistanceConversion.DISTANCE_KEY4);
            textTitle2.setText(resultUnit3);
        }

        //prikaz rezultata iz VolumeConversion activitija
        if (myintent.hasExtra(VolumeConversion.VOLUME_KEY1)) {
            String inputedValue4= myintent.getStringExtra(VolumeConversion.VOLUME_KEY1);
            textValue1.setText(inputedValue4);
        }
        if(myintent.hasExtra(VolumeConversion.VOLUME_KEY2)) {
            String inputedUnit4 = myintent.getStringExtra(VolumeConversion.VOLUME_KEY2);
            textTitle1.setText(inputedUnit4);
        }
        if(myintent.hasExtra(VolumeConversion.VOLUME_KEY3)) {
            String resultValue4 = myintent.getStringExtra(VolumeConversion.VOLUME_KEY3);
            textValue2.setText(resultValue4);
        }
        if(myintent.hasExtra(VolumeConversion.VOLUME_KEY4)) {
            String resultUnit4 = myintent.getStringExtra(VolumeConversion.VOLUME_KEY4);
            textTitle2.setText(resultUnit4);
        }

    }

}
