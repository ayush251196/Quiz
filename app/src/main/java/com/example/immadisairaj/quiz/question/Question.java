package com.example.immadisairaj.quiz.question;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.immadisairaj.quiz.Home_screen;
import com.example.immadisairaj.quiz.R;
import com.example.immadisairaj.quiz.api.Api;
import com.example.immadisairaj.quiz.api.QuizQuestions;
import com.example.immadisairaj.quiz.api.Result;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Question implements  Serializable {

    public transient Context context;
    public List<Result> results;

    public List<String> question;


    public List<String> optA;
    public List<String> optB;
    public List<String> optC;
    public List<String> optD;
    public List<Integer> Answer;

    public Question() {

    }

    public Question(Context context) {
        this.context = context;
        question = new ArrayList<>();
        results = new ArrayList<>();
        optA = new ArrayList<>();
        optB = new ArrayList<>();
        optC = new ArrayList<>();
        optD = new ArrayList<>();
        Answer = new ArrayList<>();
    }

}

