package com.example.myapplication.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\bH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/example/myapplication/models/Employer;", "", "common", "Lcom/example/myapplication/models/Employer$Common;", "data", "", "Lcom/example/myapplication/models/Employer$Data;", "message", "", "statuscode", "(Lcom/example/myapplication/models/Employer$Common;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCommon", "()Lcom/example/myapplication/models/Employer$Common;", "getData", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getStatuscode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Common", "Data", "app_debug"})
public final class Employer {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "common")
    private final com.example.myapplication.models.Employer.Common common = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final java.util.List<com.example.myapplication.models.Employer.Data> data = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "message")
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "statuscode")
    private final java.lang.String statuscode = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.models.Employer copy(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.models.Employer.Common common, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.models.Employer.Data> data, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String statuscode) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Employer(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.models.Employer.Common common, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.models.Employer.Data> data, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String statuscode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.models.Employer.Common component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.models.Employer.Common getCommon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.myapplication.models.Employer.Data> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.myapplication.models.Employer.Data> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatuscode() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/myapplication/models/Employer$Common;", "", "totalRecordsFound", "", "totalpages", "(II)V", "getTotalRecordsFound", "()I", "getTotalpages", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class Common {
        @com.google.gson.annotations.SerializedName(value = "total_records_found")
        private final int totalRecordsFound = 0;
        @com.google.gson.annotations.SerializedName(value = "totalpages")
        private final int totalpages = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myapplication.models.Employer.Common copy(int totalRecordsFound, int totalpages) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Common(int totalRecordsFound, int totalpages) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getTotalRecordsFound() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getTotalpages() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001:\u0001-BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u000bH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u000bH\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012\u00a8\u0006."}, d2 = {"Lcom/example/myapplication/models/Employer$Data;", "", "deadline", "", "isFeatured", "", "jobDetails", "Lcom/example/myapplication/models/Employer$Data$JobDetails;", "jobTitle", "logo", "maxExperience", "", "maxSalary", "minExperience", "minSalary", "recruitingCompanysProfile", "(Ljava/lang/String;ZLcom/example/myapplication/models/Employer$Data$JobDetails;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDeadline", "()Ljava/lang/String;", "()Z", "getJobDetails", "()Lcom/example/myapplication/models/Employer$Data$JobDetails;", "getJobTitle", "getLogo", "getMaxExperience", "()I", "getMaxSalary", "getMinExperience", "getMinSalary", "getRecruitingCompanysProfile", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "JobDetails", "app_debug"})
    public static final class Data {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "deadline")
        private final java.lang.String deadline = null;
        @com.google.gson.annotations.SerializedName(value = "IsFeatured")
        private final boolean isFeatured = false;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "jobDetails")
        private final com.example.myapplication.models.Employer.Data.JobDetails jobDetails = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "jobTitle")
        private final java.lang.String jobTitle = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "logo")
        private final java.lang.String logo = null;
        @com.google.gson.annotations.SerializedName(value = "maxExperience")
        private final int maxExperience = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "maxSalary")
        private final java.lang.String maxSalary = null;
        @com.google.gson.annotations.SerializedName(value = "minExperience")
        private final int minExperience = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "minSalary")
        private final java.lang.String minSalary = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "recruitingCompany\'sProfile")
        private final java.lang.String recruitingCompanysProfile = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myapplication.models.Employer.Data copy(@org.jetbrains.annotations.NotNull()
        java.lang.String deadline, boolean isFeatured, @org.jetbrains.annotations.NotNull()
        com.example.myapplication.models.Employer.Data.JobDetails jobDetails, @org.jetbrains.annotations.NotNull()
        java.lang.String jobTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String logo, int maxExperience, @org.jetbrains.annotations.NotNull()
        java.lang.String maxSalary, int minExperience, @org.jetbrains.annotations.NotNull()
        java.lang.String minSalary, @org.jetbrains.annotations.NotNull()
        java.lang.String recruitingCompanysProfile) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Data(@org.jetbrains.annotations.NotNull()
        java.lang.String deadline, boolean isFeatured, @org.jetbrains.annotations.NotNull()
        com.example.myapplication.models.Employer.Data.JobDetails jobDetails, @org.jetbrains.annotations.NotNull()
        java.lang.String jobTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String logo, int maxExperience, @org.jetbrains.annotations.NotNull()
        java.lang.String maxSalary, int minExperience, @org.jetbrains.annotations.NotNull()
        java.lang.String minSalary, @org.jetbrains.annotations.NotNull()
        java.lang.String recruitingCompanysProfile) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDeadline() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isFeatured() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myapplication.models.Employer.Data.JobDetails component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myapplication.models.Employer.Data.JobDetails getJobDetails() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getJobTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLogo() {
            return null;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getMaxExperience() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMaxSalary() {
            return null;
        }
        
        public final int component8() {
            return 0;
        }
        
        public final int getMinExperience() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMinSalary() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRecruitingCompanysProfile() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/example/myapplication/models/Employer$Data$JobDetails;", "", "applyInstruction", "", "companyName", "lastDate", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplyInstruction", "()Ljava/lang/String;", "getCompanyName", "getLastDate", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
        public static final class JobDetails {
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "ApplyInstruction")
            private final java.lang.String applyInstruction = null;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "CompanyName")
            private final java.lang.String companyName = null;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "LastDate")
            private final java.lang.String lastDate = null;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "Title")
            private final java.lang.String title = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.myapplication.models.Employer.Data.JobDetails copy(@org.jetbrains.annotations.NotNull()
            java.lang.String applyInstruction, @org.jetbrains.annotations.NotNull()
            java.lang.String companyName, @org.jetbrains.annotations.NotNull()
            java.lang.String lastDate, @org.jetbrains.annotations.NotNull()
            java.lang.String title) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public JobDetails(@org.jetbrains.annotations.NotNull()
            java.lang.String applyInstruction, @org.jetbrains.annotations.NotNull()
            java.lang.String companyName, @org.jetbrains.annotations.NotNull()
            java.lang.String lastDate, @org.jetbrains.annotations.NotNull()
            java.lang.String title) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getApplyInstruction() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCompanyName() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLastDate() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTitle() {
                return null;
            }
        }
    }
}