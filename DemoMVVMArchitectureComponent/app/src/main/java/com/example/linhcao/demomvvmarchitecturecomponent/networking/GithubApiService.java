package com.example.linhcao.demomvvmarchitecturecomponent.networking;

import com.example.linhcao.demomvvmarchitecturecomponent.entities.Issue;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubApiService {

    @GET("/repos/{owner}/{repo}/issues")
    Call<List<Issue>> getIssues(@Path("owner") String owner, @Path("repo") String repo);
}
