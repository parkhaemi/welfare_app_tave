package com.example.tave0910;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class listActivity extends AppCompatActivity {
    private Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // actionbar remove
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        back_btn = (Button) findViewById(R.id.back_btn_list);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                listActivity();
            }
        });

    }
    public void listActivity(){
        Intent intent = new Intent(this, homeActivity.class);
        startActivity(intent);
    }

//    super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_main);
//    RequestButton= (Button) findViewById(R.id.RequestButton);
//    DataField= (EditText) findViewById(R.id.DataField);
//    DisplayText= (TextView) findViewById(R.id.DisplayText);
//    final RequestQueue queue= Volley.newRequestQueue(this);
//    final String url= "http://34.64.177.178/rest/welfare/read"; //your URL
//        queue.start();
//        RequestButton.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            HashMap<String, String> params= new HashMap<String,String>();
//            params.put("data", DataField.getText().toString()); //the entered data as the body.
//            JsonObjectRequest jsObjRequest= new
//                    JsonObjectRequest(Request.Method.POST,
//                    url,
//                    new JSONObject(params),
//                    new Response.Listener<JSONObject>() {
//                        @Override
//                        public void onResponse(JSONObject response) {
//                            try {
//                                DisplayText.setText(response.getString("message"));
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }, new Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError error) {
//                    DisplayText.setText("That didn't work!");
//                }
//            });
//            queue.add(jsObjRequest);
//        }
//    });
//}
}