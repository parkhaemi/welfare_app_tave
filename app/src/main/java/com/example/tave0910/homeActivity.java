package com.example.tave0910;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import me.relex.circleindicator.CircleIndicator3;

public class homeActivity extends AppCompatActivity {
    private ViewPager2 mPager;
    private FragmentStateAdapter pagerAdapter;
    private int num_page = 5;
    private CircleIndicator3 mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // actionbar remove
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        //상단 맞춤복지 코드



        //하단fragment 코드
/**
 * 가로 슬라이드 뷰 Fragment
 */

        //ViewPager2
        mPager = findViewById(R.id.viewpager);
        //Adapter
        pagerAdapter = new MyAdapter(this, num_page);
        mPager.setAdapter(pagerAdapter);
        //Indicator
        mIndicator = findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        mIndicator.createIndicators(num_page,0);
        //ViewPager Setting
        mPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        /**
         * 이 부분 조정하여 처음 시작하는 이미지 설정.
         * 2000장 생성하였으니 현재위치 1002로 설정하여
         * 좌 우로 슬라이딩 할 수 있게 함. 거의 무한대로
         */

        mPager.setCurrentItem(1000); //시작 지점
        mPager.setOffscreenPageLimit(4); //최대 이미지 수

        mPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                if (positionOffsetPixels == 0) {
                    mPager.setCurrentItem(position);
                }
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mIndicator.animatePageSelected(position%num_page);
            }
        });
    }


//    public class homeActivity extends AsyncTask<string, string,="" string="">{
//
//        @Override
//        protected String doInBackground(String... urls) {
//            try {
//                JSONObject jsonObject = new JSONObject();
//                jsonObject.accumulate("user_id", "androidTest");
//                jsonObject.accumulate("name", "yun");
//
//                HttpURLConnection con = null;
//                BufferedReader reader = null;
//
//                try{
//                    //URL url = new URL("http://34.64.177.178/rest/welfare/search");
//                    URL url = new URL(urls[0]);
//                    con = (HttpURLConnection) url.openConnection();
//                    con.connect();
//
//                    InputStream stream = con.getInputStream();
//
//                    reader = new BufferedReader(new InputStreamReader(stream));
//
//                    StringBuffer buffer = new StringBuffer();
//
//                    String line = "";
//                    while((line = reader.readLine()) != null){
//                        buffer.append(line);
//                    }
//
//                    return buffer.toString();
//
//                } catch (MalformedURLException e){
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } finally {
//                    if(con != null){
//                        con.disconnect();
//                    }
//                    try {
//                        if(reader != null){
//                            reader.close();
//                        }
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(String result) {
//            super.onPostExecute(result);
//            tvData.setText(result);
//        }
//    }
//
//
//    @Override
//    protected String doInBackground(String... urls) {
//        try {
//            JSONObject jsonObject = new JSONObject();
//            jsonObject.accumulate("user_id", "androidTest");
//            jsonObject.accumulate("name", "yun");
//
//            HttpURLConnection con = null;
//            BufferedReader reader = null;
//
//            try{
//                //URL url = new URL("http://34.64.177.178/rest/welfare/search");
//                URL url = new URL(urls[0]);
//                con = (HttpURLConnection) url.openConnection();
//                con.setRequestMethod("POST");
//                con.setRequestProperty("Cache-Control", "no-cache");
//                con.setRequestProperty("Content-Type", "application/json");
//                con.setRequestProperty("Accept", "text/html");
//                con.setDoOutput(true);
//                con.setDoInput(true);
//                con.connect();
//
//                OutputStream outStream = con.getOutputStream();
//                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outStream));
//                writer.write(jsonObject.toString());
//                writer.flush();
//                writer.close();
//
//                InputStream stream = con.getInputStream();
//
//                reader = new BufferedReader(new InputStreamReader(stream));
//
//                StringBuffer buffer = new StringBuffer();
//
//                String line = "";
//                while((line = reader.readLine()) != null){
//                    buffer.append(line);
//                }
//
//                return buffer.toString();
//
//            } catch (MalformedURLException e){
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                if(con != null){
//                    con.disconnect();
//                }
//                try {
//                    if(reader != null){
//                        reader.close();
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    @Override
//    protected void onPostExecute(String result) {
//        super.onPostExecute(result);
//        tvData.setText(result);
//    }
//}
}