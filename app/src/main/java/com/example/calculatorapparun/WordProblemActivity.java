package com.example.calculatorapparun;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import okhttp3.*;
import java.io.IOException;

import androidx.appcompat.app.AppCompatActivity;

public class WordProblemActivity extends AppCompatActivity {
    String question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_problem);
        Intent intent = getIntent();

    }

    //Some code for the requestbody using HTTPok from RapidAPIHub
    public void sendApiRequest(View v) throws Exception {
        EditText questionET = findViewById(R.id.wordProblemEditText);
        question = questionET.getText().toString();

        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json");

        String requestBody = "{\r\n" +
                "    \"model\": \"gpt-3.5-turbo\",\r\n" +
                "    \"messages\": [\r\n" +
                "        {\r\n" +
                "            \"role\": \"user\",\r\n" +
                "            \"content\": \"" + question + "\"\r\n" +
                "        }\r\n" +
                "    ]\r\n" +
                "}";

        RequestBody body = RequestBody.create(mediaType, requestBody);

        Request request = new Request.Builder()
                .url("https://chatgpt-best-price.p.rapidapi.com/v1/chat/completions")
                .post(body)
                .addHeader("content-type", "application/json")
                .addHeader("X-RapidAPI-Key", "a41195d370msh7d4b5a40c6dffe7p1cab4cjsn01da0f9acd93")
                .addHeader("X-RapidAPI-Host", "chatgpt-best-price.p.rapidapi.com")
                .build();

        Response response = client.newCall(request).execute();
        String output = response.body().toString();
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + output);
        }

        TextView infoTVOutput = findViewById(R.id.outputWordProblemTextView);
        infoTVOutput.setText(output);

    }
}
