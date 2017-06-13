package com.example.linhcao.demomvvmarchitecturecomponent.repositories;

import android.arch.lifecycle.LiveData;

import com.example.linhcao.demomvvmarchitecturecomponent.entities.ApiResponse;

public interface IssueRepository {
    LiveData<ApiResponse> getIssues(String owner, String repo);
}
