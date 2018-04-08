package hr.ferit.annamariadragic.lv2_converter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class VolumeConversion extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener{

    private Button bVolumeButton;
    private EditText numberValue4;
    private Integer position7,position8;
    private  Spinner spinner7,spinner8;
    private TextView resulttext4;
    public static final String VOLUME_KEY1 = "input volume";
    public static final String VOLUME_KEY2 = "input unit";
    public static final String VOLUME_KEY3 = "output volume";
    public static final String VOLUME_KEY4 = "output unit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_conversion);

        //spinners
        this.spinner7 = (Spinner)findViewById(R.id.spinner7);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,R.array.volumeArray, android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter7);
        spinner7.setOnItemSelectedListener(this);

        this.spinner8 = (Spinner)findViewById(R.id.spinner8);
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,R.array.volumeArray, android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adapter8);
        spinner8.setOnItemSelectedListener(this);
        initializeUI();
    }

    private void initializeUI() {
        this.bVolumeButton = (Button) findViewById(R.id.button4);
        this.bVolumeButton.setOnClickListener(this);
        this.numberValue4 = (EditText) findViewById(R.id.text4);
        this.resulttext4 = (TextView) findViewById(R.id.probnivolume);
    }

    @Override
    public void onClick(View view) {
        method(view);
        //prikaz rezultata na drugom aktivitiju
       String insertedValue4 = this.numberValue4.getText().toString();
       String insertedUnit4 = spinner7.getSelectedItem().toString();
       String resultValue4 = this.resulttext4.getText().toString();
       String resultUnit4 = spinner8.getSelectedItem().toString();
        Intent volumeConversionIntent = new Intent();
        volumeConversionIntent.setClass(getApplicationContext(),DisplayResultActivity.class);

        volumeConversionIntent.putExtra(VOLUME_KEY1,insertedValue4);
        volumeConversionIntent.putExtra(VOLUME_KEY2, insertedUnit4);
        volumeConversionIntent.putExtra(VOLUME_KEY3, resultValue4);
        volumeConversionIntent.putExtra(VOLUME_KEY4, resultUnit4);
        this.startActivity(volumeConversionIntent);

    }

    private void method(View view) {
        double value = Double.parseDouble(numberValue4.getText().toString());
        double res;

        if(position7 == 0)
        {
            if(position8 == 0)
            {
                res = value;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 1)
            {
                res = value * 1000;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 2)
            {
                res = value * 0.264172;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 3)
            {
                res = value * 0.219969;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 4)
            {
                res = value * 0.001;
                resulttext4.setText(Double.toString(res));
            }

        }
        if(position7 == 1)
        {
            if(position8 == 0)
            {
                res = value * 0.001;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 1)
            {
                res = value;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 2)
            {
                res = value * 0.000264172;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 3)
            {
                res = value * 0.000219969;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 4)
            {
                res = value * 1e-6;
                resulttext4.setText(Double.toString(res));
            }

        }
        if(position7 == 2)
        {
            if(position8 == 0)
            {
                res = value * 3.78541;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 1)
            {
                res = value * 3785.41;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 2)
            {
                res = value;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 3)
            {
                res = value * 0.832674;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 4)
            {
                res = value * 0.00378541;
                resulttext4.setText(Double.toString(res));
            }

        }
        if(position7 == 3)
        {
            if(position8 == 0)
            {
                res = value * 4.54609;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 1)
            {
                res = value * 4546.09;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 2)
            {
                res = value * 1.20095;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 3)
            {
                res = value;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 4)
            {
                res = value * 0.00454609;
                resulttext4.setText(Double.toString(res));
            }

        }
        if(position7 == 4)
        {
            if(position8 == 0)
            {
                res = value * 1000;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 1)
            {
                res = value * 1e+6;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 2)
            {
                res = value * 264.172;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 3)
            {
                res = value * 219.969;
                resulttext4.setText(Double.toString(res));
            }
            if(position8 == 4)
            {
                res = value;
                resulttext4.setText(Double.toString(res));
            }

        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
       // String selectedVolume = adapterView.getItemAtPosition(i).toString();
        adapterView.getItemAtPosition(i);

        switch (adapterView.getId())
        {
            case R.id.spinner7:
                spinner7.setSelection(i);
                position7 = spinner7.getSelectedItemPosition();
                Log.e("from selected position:",String.valueOf(position7));
                break;
            case R.id.spinner8:
                spinner8.setSelection(i);
                position8 = spinner8.getSelectedItemPosition();
                Log.e("from selected position:",String.valueOf(position8));
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
