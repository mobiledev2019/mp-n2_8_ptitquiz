package com.example.ptitquiz.MyAppPTITQuiz;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;
import com.example.ptitquiz.R;
public class start_quiz extends AppCompatActivity {
    Button btnPlay;
    String arr[]={ "Chọn mã đề", "Đề 1", "Đề 2", "Đề 3", "Đề 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
        //Lấy đối tượng Spinner ra
        Spinner spin=(Spinner) findViewById(R.id.spinner1);
        //Gán Data source (arr) vào Adapter
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,arr);
        //Hiển thị danh sách cho Spinner
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {
                final String made = arr[position];
                btnPlay = findViewById(R.id.btnPlay);
                btnPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(position!=0) {
                            Intent receive = getIntent();
                            Intent intent = new Intent(start_quiz.this, quiz_test.class);
                            intent.putExtra("Username", receive.getStringExtra("Username"));
                            intent.putExtra("truyendulieu", receive.getStringExtra("truyendulieu"));
                            intent.putExtra("made", made);
                            startActivity(intent);
                            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                        }
                        else Toast.makeText(getApplicationContext(), "Chọn mã đề", Toast.LENGTH_LONG).show();
                    }
                });

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            Intent intent = new Intent(start_quiz.this,selectsubject.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_out_right,android.R.anim.slide_in_left);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}
