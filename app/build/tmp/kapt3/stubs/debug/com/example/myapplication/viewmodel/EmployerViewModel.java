package com.example.myapplication.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myapplication/viewmodel/EmployerViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "employerLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/myapplication/models/Employer;", "getEmployerLiveData", "()Landroidx/lifecycle/MutableLiveData;", "repository", "Lcom/example/myapplication/repos/EmployerRepository;", "getRepository", "()Lcom/example/myapplication/repos/EmployerRepository;", "fetchData", "", "app_debug"})
public final class EmployerViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.myapplication.repos.EmployerRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.myapplication.models.Employer> employerLiveData = null;
    
    public EmployerViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.repos.EmployerRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.myapplication.models.Employer> getEmployerLiveData() {
        return null;
    }
    
    public final void fetchData() {
    }
}