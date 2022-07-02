package com.example.myapplication.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"setDateTime", "", "textView", "Landroid/widget/TextView;", "dt", "", "setIcon", "imageView", "Landroid/widget/ImageView;", "icon", "setSalary", "item", "Lcom/example/myapplication/models/Employer$Data;", "app_debug"})
public final class CustomBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"app:setDate"})
    public static final void setDateTime(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    java.lang.String dt) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:setSalary"})
    public static final void setSalary(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    com.example.myapplication.models.Employer.Data item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:setLogo"})
    public static final void setIcon(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String icon) {
    }
}