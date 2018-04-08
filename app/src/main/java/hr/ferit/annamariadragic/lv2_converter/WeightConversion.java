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

public class WeightConversion extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener {

    private Button bWeightButton;
    private EditText numberValue2;
    private Integer position3,position4,res2;
    private  Spinner spinner3,spinner4;
    private TextView resulttext2;
    public static final String WEIGHT_KEY1 = "input weight";
    public static final String WEIGHT_KEY2 = "input unit weight";
    public static final String WEIGHT_KEY3 = "output weight";
    public static final String WEIGHT_KEY4 = "output unit weight";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_conversion);

        //spinners
        this.spinner3 = (Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.weightArray, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(this);

        this.spinner4 = (Spinner)findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.weightArray, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(this);

initializeUI();
    }

    private void initializeUI() {
        this.bWeightButton  = (Button) findViewById(R.id.button2);
        this.bWeightButton.setOnClickListener(this);
        this.numberValue2 = (EditText) findViewById(R.id.text2);
        this.resulttext2 = (TextView) findViewById(R.id.probniweight);
    }


    @Override
    public void onClick(View view) {
        method(view);
        //prikaz rezultata na drugom aktivitiju
        String insertedValue2 = this.numberValue2.getText().toString();
        String insertedUnit2 = spinner3.getSelectedItem().toString();
        String resultValue2 = this.resulttext2.getText().toString();
        String resultUnit2 = spinner4.getSelectedItem().toString();
        Intent weightConversionIntent = new Intent();
        weightConversionIntent.setClass(getApplicationContext(),DisplayResultActivity.class);

        weightConversionIntent.putExtra(WEIGHT_KEY1,insertedValue2);
        weightConversionIntent.putExtra(WEIGHT_KEY2, insertedUnit2);
        weightConversionIntent.putExtra(WEIGHT_KEY3, resultValue2);
        weightConversionIntent.putExtra(WEIGHT_KEY4, resultUnit2);
        this.startActivity(weightConversionIntent);
    }

    private void method(View view) {
        double value = Double.parseDouble(numberValue2.getText().toString());
        double res;

        if(position3 == 0)
        {
            if(position4 == 0)
            {
                res = value;
                resulttext2.setText(Double.toString(res));
            }
            if(position4 == 1)
            {
                res = value * 1000;
                resulttext2.setText(Double.toString(res));
            }
            if(position4 == 2)
            {
                res = value * 1000000;
                resulttext2.setText(Double.toString(res));
            }
            if(position4 == 3)
            {
                res = value * 1e+9;
                resulttext2.setText(Double.toString(res));
            }
            if(position4 == 4)
            {
                res = value * 2204.623;
                resulttext2.setText(Double.toString(res));
            }
        }
        if(position3 == 1)
        {
            if (position4 == 0) {
                res = value * 0.001;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 1) {
                res = value;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 2) {
                res = value * 1000;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 3) {
                res = value * 1000000;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 4) {
                res = value * 2.204623;
                resulttext2.setText(Double.toString(res));
            }
        }
        if(position3 == 2)
        {
            if (position4 == 0) {
                res = value * 0.000001;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 1) {
                res = value * 0.001;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 2) {
                res = value;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 3) {
                res = value * 1000;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 4) {
                res = value * 0.002204623;
                resulttext2.setText(Double.toString(res));
            }
        }
        if(position3 == 3)
        {
            if (position4 == 0) {
                res = value * 1e-9;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 1) {
                res = value * 0.000001;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 2) {
                res = value * 0.001;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 3) {
                res = value;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 4) {
                res = value * 0.000002204623;
                resulttext2.setText(Double.toString(res));
            }
        }
        if(position3 == 4)
        {
            if (position4 == 0) {
                res = value * 0.0004535924;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 1) {
                res = value * 0.4535924;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 2) {
                res = value * 453.5924;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 3) {
                res = value * 453592.4;
                resulttext2.setText(Double.toString(res));
            }
            if (position4 == 4) {
                res = value;
                resulttext2.setText(Double.toString(res));
            }
        }


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //String selectedWeight = adapterView.getItemAtPosition(i).toString();
        adapterView.getItemAtPosition(i);

        switch (adapterView.getId())
        {
            case R.id.spinner3:
                spinner3.setSelection(i);
                position3 = spinner3.getSelectedItemPosition();
                Log.e("from selected position:",String.valueOf(position3));
                break;
            case R.id.spinner4:
                spinner4.setSelection(i);
                position4 = spinner4.getSelectedItemPosition();
                Log.e("from selected position:",String.valueOf(position4));
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
