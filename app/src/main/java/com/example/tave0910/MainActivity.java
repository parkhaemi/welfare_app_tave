package com.example.tave0910;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // actionbar remove
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }


//    val url = "http://34.64.177.178/rest/welfare/read"
//
//    val retrofit = Retrofit.Builder()
//            .baseUrl(url)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//    var server = retrofit.create(APIInterface::class.java)
//
//            binding.btnGet.setOnClickListener {
//        server.getRequest("title", "summary").enqueue(object:Callback<ResponseDC>{
//            override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {
//
//            }
//
//            override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDC>) {
//                Log.d("response : ", response?.body().toString())
//            }
//
//        })
//    }
//        binding.btnPost.setOnClickListener {
//        server.postRequest("who", "criteria", "what". "how". "calls").enqueue((object:Callback<ResponseDC>{
//            override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {
//
//            }
//            override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDC>) {
//                Log.d("response : ", response?.body().toString())
//            }
//        }))
//    }
//        binding.btnUpdate.setOnClickListener {
//        server.putRequest("sites", "복지 신청하기").enqueue((object:Callback<ResponseDC>{
//            override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {
//
//            }
//            override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDC>) {
//                Log.d("response : ", response?.body().toString())
//            }
//        }))
//    }
//

}