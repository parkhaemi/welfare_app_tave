package com.example.tave0910;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import me.relex.circleindicator.CircleIndicator3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class detailActivity extends AppCompatActivity {
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // actionbar remove
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        button4 = (Button) findViewById(R.id.back_btn_detail);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO : click event
                listActivity3();
            }
        });


    }

    public void listActivity3() {
        Intent intent = new Intent(this, homeActivity.class);
        startActivity(intent);
    }

}

//    @Override
//    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
//
//    }
//
//    public void requestLogin(String ID, String PW){
//        String url = "http://34.64.177.178/rest/welfare/read";
//
//        //JSON형식으로 데이터 통신을 진행
//        JSONObject testjson = new JSONObject();
//        try {
//            testjson.put("welfare_id", welfare_id);
//            String jsonString = testjson.toString(); //완성된 json 포맷
//
//            //전송
//            final RequestQueue requestQueue = Volley.newRequestQueue(LoginActivity.this);
//            final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url,testjson, new Response.Listener<JSONObject>() {
//
//                @Override
//                public void onResponse(JSONObject response) {
//                    try {
//                        //json형식의 응답
//                        JSONObject jsonObject = new JSONObject(response.toString());
//                        String resultId = jsonObject.getString("welfare_id");
//
//                        if(resultId.equals("OK") & resultPassword.equals("OK")){
//                            Toast.makeText(getApplicationContext(),"응답 수신 성공",Toast.LENGTH_SHORT).show();
//                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                            startActivity(intent);
//                            finish();
//                        }else{
//                            easyToast("응답" 실패");
//                        }
//
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//                //에러코드
//            }, new Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError error) {
//                    error.printStackTrace();
//                }
//            });
//            jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
//            requestQueue.add(jsonObjectRequest);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }
//
//    void easyToast(String str){
//        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
//    }
//}
