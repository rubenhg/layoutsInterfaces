package utad.layoutsinterfaces;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    public ImageView image1,image2,image3,image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // EjemploToggle();
       // EjemploImageView();
       // EjemploTextView();
       // EjemploEditText();
        EjemploRadioButtons();
    }

    public void EjemploToggle() {
        setContentView(R.layout.activity_main);

        ToggleButton toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton);
        ToggleButton toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        ToggleButton toggleButton3 = (ToggleButton) findViewById(R.id.toggleButton3);

        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, " Toggle 1 Activado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, " Toggle 1 Desactivado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        toggleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isChecked = ((ToggleButton) v).isChecked();
                if (isChecked) {
                    Toast.makeText(MainActivity.this, " Toggle 2 Activado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, " Toggle 2 Desactivado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        toggleButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, " Toggle 3 Activado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, " Toggle 3 Desactivado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void EjemploImageView() {
        setContentView(R.layout.imageview);

         image1 = (ImageView) findViewById(R.id.imagelufi);
         image2 = (ImageView) findViewById(R.id.imageminion);
         image3 = (ImageView) findViewById(R.id.imageoptimus);
         image4 = (ImageView) findViewById(R.id.imagepollo);

        initImages();

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initImages();
                    image2.setImageDrawable(getResources().getDrawable(R.drawable.lufi));

            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    image3.setImageDrawable(getResources().getDrawable(R.drawable.pollo));
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    image2.setImageDrawable(getResources().getDrawable(R.drawable.minion));
            }
        });
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    image2.setImageDrawable(getResources().getDrawable(R.drawable.pollo));
            }
        });
    }
    public void EjemploTextView(){
        setContentView(R.layout.fuentetxt);

        TextView textview2 = (TextView)findViewById(R.id.textView2);
        textview2.setText(Html.fromHtml("<h2>Titulo</h2>"));
        TextView textview3 = (TextView)findViewById(R.id.textView3);
        textview3.setText("Certeza de muerte... mínima esperanza de éxito... ¿a que esperamos?");
        //textview3.setTypeface(Typeface.DEFAULT_BOLD);

        textview3.setTypeface(Typeface.createFromAsset(getAssets(),"BurgerFrogDEMO.otf"));
    }
    public void EjemploEditText(){
        setContentView(R.layout.edittext);

        final EditText etEmail=(EditText)findViewById(R.id.editTextEmail);
        final EditText etPassword=(EditText)findViewById(R.id.editTextPassword);
        Button btnSend=(Button)findViewById(R.id.btnEnviar);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                if(email.equals("Ruben.hg@hotmail.com")&& password.equals("1234")){
                    Toast.makeText(MainActivity.this,"Login OK", Toast.LENGTH_SHORT);
                }else{
                    Toast.makeText(MainActivity.this,"Login FAILED", Toast.LENGTH_SHORT);
                }

            }
        });


    }
    public void EjemploRadioButtons(){
        setContentView(R.layout.radiobuttons);
        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        radioGroup.check(R.id.radioGroup);

        int selected = radioGroup.getCheckedRadioButtonId();
        switch (selected){
            case R.id.radioButton1:
                break;
            case R.id.radioButton2:
                break;
            case R.id.radioButton3:
                break;
        }
    }
    public void initImages(){
            image1.setImageDrawable(getResources().getDrawable(R.drawable.optimis));
            image2.setImageDrawable(getResources().getDrawable(R.drawable.optimis));
            image3.setImageDrawable(getResources().getDrawable(R.drawable.optimis));
            image4.setImageDrawable(getResources().getDrawable(R.drawable.optimis));
    }

}
