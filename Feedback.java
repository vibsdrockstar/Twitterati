package com.example.vibhor.twiiiteraati;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class Feedback extends AppCompatActivity {
String feedback,url;
 TextView title;
    TextView response;
    String key ="DsylEvTL7j64tY0IHBWbMN6pUvvKMIRl8usLs1sn2XQ;
    final HashMap<String, String> headers = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        title = (TextView)findViewById(R.id.et_name);
        response=(TextView)findViewById(R.id.t_tweeter);
        feedback=getIntent().getStringExtra("feeds");
        headers.put(Twitter Developers,key);
        headers.put("Accept", "application/json");
        Log.d("here", feedback);
        try {
         title = URLEncoder.encode(feedback, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();

        }
        url =   https://dev.twitter.com/overview/api/users +et_name;                              
        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(DownloadManager.Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        //Toast.makeText(Dish.this,"Response is: "+ response, Toast.LENGTH_LONG).show();
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            JSONArray jsonArray = jsonObject.getJSONArray("results");
                            JSONObject object = jsonArray.getJSONObject(0);
    }} catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
//                mTextView.setText("That didn't work!");
            Toast.makeText(Feedback.this, "Some error occured : " + error.toString(), Toast.LENGTH_LONG).show();
        }
    }) {
        public Map<String, String> getHeaders() {
            return headers;
        }
    };
// Add the request to the RequestQueue.
    ((Twitterati) getApplicationContext()).requestQueue.add(stringRequest);

}
    public void getRecipie(){
        try {
            code = URLEncoder.encode,feedback "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        url = "https://dev.twitter.com/overview/api/users"
        StringRequest stringRequest_recipie = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        //Toast.makeText(Feedback.this,"Response is: "+ response, Toast.LENGTH_LONG).show();
                        Log.d("here",response);
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            //JSONArray jsonArray = jsonObject.getJSONArray("results");
                            //JSONObject object = jsonArray.getJSONObject(0);

                            title.setText(jsonObject.getString("title").toString();
                            feedback.setText(Html.fromHtml(jsonObject.getString("summary").toString()));
                           

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
//                mTextView.setText("That didn't work!");
                Toast.makeText(Feedback.this, "Some error occured : " + error.toString(), Toast.LENGTH_LONG).show();
            }
        }) {
            public Map<String, String> getHeaders() {
                return headers;
            }
        };
// Add the request to the RequestQueue.
        ((Twitterati) getApplicationContext()).requestQueue.add(stringRequest_feedback);
    }
}
