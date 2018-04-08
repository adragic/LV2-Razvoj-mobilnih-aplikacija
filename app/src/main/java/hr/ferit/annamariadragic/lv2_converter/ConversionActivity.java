package hr.ferit.annamariadragic.lv2_converter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversionActivity extends Activity implements View.OnClickListener,AdapterView.OnItemSelectedListener {

    private Button bConvertButton;
    private EditText numberValue1;
    private Integer position1,position2,res1;
    private  Spinner spinner1,spinner2;
    private TextView resulttext1;
    //stringovi koristeni za prosljeđivanje na drugi activity
    public static final String TEMPERATURE_KEY1 = "input temp";
    public static final String TEMPERATURE_KEY2 = "input unit temp";
    public static final String TEMPERATURE_KEY3= "output temp";
    public static final String TEMPERATURE_KEY4 = "output unit temp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

//spinners
        this.spinner1 = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.temperatureArray, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(this);

        this.spinner2 = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.temperatureArray, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter1);
        spinner2.setOnItemSelectedListener(this);

        initializeUI();
    }
//method
    private void initializeUI() {
        this.bConvertButton = (Button) findViewById(R.id.button1);
        this.bConvertButton.setOnClickListener(this);
        this.numberValue1 = (EditText) findViewById(R.id.text1);
        this.resulttext1 = (TextView) findViewById(R.id.probnitemp);

    }

    @Override
    public void onClick(View view) {
        method(view);
        //prikaz rezultata na drugom aktivitiju
        String insertedValue1 = this.numberValue1.getText().toString();
        String insertedUnit1 = spinner1.getSelectedItem().toString();
        String resultValue1 = this.resulttext1.getText().toString();
        String resultUnit1 = spinner2.getSelectedItem().toString();
        Intent temperatureConversionIntent = new Intent();
        temperatureConversionIntent.setClass(getApplicationContext(),DisplayResultActivity.class);

        temperatureConversionIntent.putExtra(TEMPERATURE_KEY1,insertedValue1);
        temperatureConversionIntent.putExtra(TEMPERATURE_KEY2, insertedUnit1);
        temperatureConversionIntent.putExtra(TEMPERATURE_KEY3, resultValue1);
        temperatureConversionIntent.putExtra(TEMPERATURE_KEY4, resultUnit1);
        this.startActivity(temperatureConversionIntent);
    }

    //metoda pomoću koje se obavlja pretvorba jedinica iz jednih u druge
    private void method(View view) {
        double value = Double.parseDouble(numberValue1.getText().toString());
        double res;

        if(position1 == 0)
        {
            if(position2 == 0)
            {
                res = value;
                resulttext1.setText(Double.toString(res));

            }
            if(position2 == 1)
            {
                res = value + 273.15;
                resulttext1.setText(Double.toString(res));
            }
            if(position2 == 2)
            {
                res = (value * 1.8) +32;
                resulttext1.setText(Double.toString(res));
            }

        }
        if(position1 == 1)
        {
            if(position2 == 0)
            {
                res = value - 273.15;
                resulttext1.setText(Double.toString(res));
            }
            if(position2 == 1)
            {
                res = value;
                resulttext1.setText(Double.toString(res));
            }
            if(position2 == 2)
            {
                res = (value - 273.15)*1.8 +32;
                resulttext1.setText(Double.toString(res));
            }

        }
        if(position1 == 2)
        {
            if(position2 == 0)
            {
                res = (value - 32)*1.8 ;
                resulttext1.setText(Double.toString(res));
            }
            if(position2 == 1)
            {
                res = (value - 32)/1.8 +273.15;
                resulttext1.setText(Double.toString(res));
            }
            if(position2 == 2)
            {
                res = value;
                resulttext1.setText(Double.toString(res));
            }

        }
    }


    //kod sppinera postavljanje odabrane stavke da se prikaze
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        adapterView.getItemAtPosition(i);

        switch (adapterView.getId())
        {
            case R.id.spinner1:
                spinner1.setSelection(i);
                position1 = spinner1.getSelectedItemPosition();
                Log.e("from selected position:",String.valueOf(position1));
                break;
            case R.id.spinner2:
                spinner2.setSelection(i);
                position2 = spinner2.getSelectedItemPosition();
                Log.e("from selected position:",String.valueOf(position2));
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
