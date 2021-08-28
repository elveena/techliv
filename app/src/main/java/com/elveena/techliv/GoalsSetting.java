package com.elveena.techliv;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class GoalsSetting extends AppCompatActivity implements View.OnClickListener {

    SeekBar socialSeekbar, productivitySeekbar, financeSeekbar, entertainmentSeekbar;
    TextView socialPercent, productivityPercent, financePercent, entertainmentPercent;
    Button setGoals, btnDatePicker, btnFromTimePicker, btnToTimePicker;
    int socialProg, prodProg, financeProg, entProg;
    EditText txtDate, txtFromTime, txtToTime;
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals_setting);

        socialSeekbar = (SeekBar) findViewById(R.id.seekbar_social);
        productivitySeekbar = (SeekBar) findViewById(R.id.seekbar_productivity);
        financeSeekbar = (SeekBar) findViewById(R.id.seekbar_finance);
        entertainmentSeekbar = (SeekBar) findViewById(R.id.seekbar_entertainment);

        socialPercent = findViewById(R.id.tv_social_percent);
        productivityPercent = findViewById(R.id.tv_prod_percent);
        financePercent = findViewById(R.id.tv_finance_percent);
        entertainmentPercent = findViewById(R.id.tv_ent_percent);

        setGoals = findViewById(R.id.btn_set_goals);

        btnDatePicker=(Button)findViewById(R.id.btn_date);
        btnFromTimePicker=(Button)findViewById(R.id.btn_from_time);
        btnToTimePicker=(Button)findViewById(R.id.btn_to_time);
        txtDate=(EditText)findViewById(R.id.in_date);
        txtFromTime=(EditText)findViewById(R.id.from_time);
        txtToTime=(EditText)findViewById(R.id.to_time);

        btnDatePicker.setOnClickListener(this);
        btnFromTimePicker.setOnClickListener(this);
        btnToTimePicker.setOnClickListener(this);

        socialSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                socialPercent.setText(progress + "mins");
                socialProg = progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        productivitySeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                productivityPercent.setText(progress + "mins");
                prodProg = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        financeSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                financePercent.setText(progress + "mins");
                financeProg = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        entertainmentSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                entertainmentPercent.setText(progress + "mins");
                entProg = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        setGoals.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Goals set successfully",Toast.LENGTH_SHORT).show();
                   Intent intent = new Intent(getApplicationContext(),SelectApps.class);
                   startActivity(intent);
            }
       });


    }

    @Override
    public void onClick(View v) {
        if (v == btnDatePicker) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    },
                    mYear,
                    mMonth,
                    mDay);
            datePickerDialog.show();
        }
        if (v == btnFromTimePicker) {

            // Get Current Time
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            // Launch Time Picker Dialog
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            txtFromTime.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour, mMinute, false);
            timePickerDialog.show();
        }
        if (v == btnToTimePicker) {

            // Get Current Time
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            // Launch Time Picker Dialog
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            txtToTime.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour, mMinute, false);
            timePickerDialog.show();
        }
    }

    }
