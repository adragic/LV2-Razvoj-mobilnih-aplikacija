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

public class DistanceConversion extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener{

    private Button bDistanceButton;
    private EditText numberValue;
    private Integer position5,position6,res;
    private  Spinner spinner5,spinner6;
    private  TextView resulttext;
    public static final String DISTANCE_KEY1 = "input distace";
    public static final String DISTANCE_KEY2 = "input unit distance";
    public static final String DISTANCE_KEY3 = "output distance";
    public static final String DISTANCE_KEY4 = "output unit distance";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_conversion);

        //spinners
        this.spinner5 = (Spinner)findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.distanceArray, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);
        spinner5.setOnItemSelectedListener(this);

        this.spinner6 = (Spinner)findViewById(R.id.spinner6);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,R.array.distanceArray, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);
        spinner6.setOnItemSelectedListener(this);
        initializeUI();



    }

    private void initializeUI() {
        this.numberValue = (EditText) findViewById(R.id.text3);
        this.bDistanceButton = (Button) findViewById(R.id.button3);
        this.bDistanceButton.setOnClickListener(this);

        this.resulttext = (TextView) findViewById(R.id.probnitext);
    }

    @Override
    public void onClick(View view) {
        method(view);
        //prikaz rezultata na drugom aktivitiju
        String insertedValue3 = this.numberValue.getText().toString();
        String insertedUnit3 = spinner5.getSelectedItem().toString();
        String resultValue3 = this.resulttext.getText().toString();
        String resultUnit3 = spinner6.getSelectedItem().toString();
        Intent distanceConversionIntent = new Intent();
        distanceConversionIntent.setClass(getApplicationContext(),DisplayResultActivity.class);

        distanceConversionIntent.putExtra(DISTANCE_KEY1,insertedValue3);
        distanceConversionIntent.putExtra(DISTANCE_KEY2, insertedUnit3);
        distanceConversionIntent.putExtra(DISTANCE_KEY3, resultValue3);
        distanceConversionIntent.putExtra(DISTANCE_KEY4, resultUnit3);
        this.startActivity(distanceConversionIntent);

    }

    private void method(View view) {
        double value = Double.parseDouble(numberValue.getText().toString());
        double res;

        if(position5 == 0)
        {
            if(position6 == 0)
            {
                res = value;
                resulttext.setText(Double.toString(res));

            }
            if(position6 == 1)
            {
                res = value * 100;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 2)
            {
                res = value * 1000;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 3)
            {
                res = value * 0.000621371;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 4)
            {
                res = value * 3.28084;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 5)
            {
                res = value * 39.3701;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 6)
            {
                res = value * 1.09361;
                resulttext.setText(Double.toString(res));
            }

        }

        if(position5 == 1)
        {
            if(position6 == 0)
            {
                res = value /100;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 1)
            {
                res = value;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 2)
            {
                res = value / 1000;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 3)
            {
                res = value * 6.2137e-6;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 4)
            {
                res = value * 0.0328084;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 5)
            {
                res = value * 0.0393701;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 6)
            {
                res = value * 0.0109361;
                resulttext.setText(Double.toString(res));
            }

        }

        if(position5 == 2)
        {
            if(position6 == 0)
            {
                res = value * 1000;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 1)
            {
                res = value * 100000;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 2)
            {
                res = value;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 3)
            {
                res = value * 0.621371;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 4)
            {
                res = value * 3280.84;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 5)
            {
                res = value * 39370.1;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 6)
            {
                res = value * 1093.61;
                resulttext.setText(Double.toString(res));
            }

        }

        if(position5 == 3)
        {
            if(position6 == 0)
            {
                res = value * 1609.34;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 1)
            {
                res = value * 160934;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 2)
            {
                res = value * 1.60934;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 3)
            {
                res = value;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 4)
            {
                res = value * 5280;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 5)
            {
                res = value * 63360;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 6)
            {
                res = value * 1760;
                resulttext.setText(Double.toString(res));
            }

        }

        if(position5 == 4)
        {
            if(position6 == 0)
            {
                res = value *0.3048;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 1)
            {
                res = value * 30.48;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 2)
            {
                res = value * 0.0003028;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 3)
            {
                res = value * 0.000189394;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 4)
            {
                res = value;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 5)
            {
                res = value * 12;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 6)
            {
                res = value * 6;
                resulttext.setText(Double.toString(res));
            }

        }

        if(position5 == 5)
        {
            if(position6 == 0)
            {
                res = value * 0.0254;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 1)
            {
                res = value * 2.54;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 2)
            {
                res = value * 2.54e-5;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 3)
            {
                res = value * 1.5783e-5 ;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 4)
            {
                res = value * 0.083333;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 5)
            {
                res = value;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 6)
            {
                res = value * 0.0277778;
                resulttext.setText(Double.toString(res));
            }

        }

        if(position5 == 6)
        {
            if(position6 == 0)
            {
                res = value * 0.9144;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 1)
            {
                res = value * 91.44;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 2)
            {
                res = value * 0.0009144;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 3)
            {
                res = value * 0.000568182;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 4)
            {
                res = value * 3;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 5)
            {
                res = value * 36;
                resulttext.setText(Double.toString(res));
            }
            if(position6 == 6)
            {
                res = value;
                resulttext.setText(Double.toString(res));
            }

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
       // String selectedDistance = adapterView.getItemAtPosition(i).toString();
adapterView.getItemAtPosition(i);

switch (adapterView.getId())
{
    case R.id.spinner5:
        spinner5.setSelection(i);
        position5 = spinner5.getSelectedItemPosition();
        Log.e("from selected position:",String.valueOf(position5));
        break;
    case R.id.spinner6:
        spinner6.setSelection(i);
        position6 = spinner6.getSelectedItemPosition();
        Log.e("from selected position:",String.valueOf(position6));
        break;

}

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
