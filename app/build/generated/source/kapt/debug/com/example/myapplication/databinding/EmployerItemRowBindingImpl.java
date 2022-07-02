package com.example.myapplication.databinding;
import com.example.myapplication.R;
import com.example.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EmployerItemRowBindingImpl extends EmployerItemRowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.flagIV, 5);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EmployerItemRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private EmployerItemRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.example.myapplication.models.Employer.Data) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.example.myapplication.models.Employer.Data Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String itemDeadline = null;
        java.lang.String itemRecruitingCompanysProfile = null;
        com.example.myapplication.models.Employer.Data item = mItem;
        java.lang.String itemLogo = null;
        java.lang.String javaLangStringEmployersProfileItemRecruitingCompanysProfile = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.deadline
                    itemDeadline = item.getDeadline();
                    // read item.recruitingCompanysProfile
                    itemRecruitingCompanysProfile = item.getRecruitingCompanysProfile();
                    // read item.logo
                    itemLogo = item.getLogo();
                }


                // read ("Employers profile:") + (item.recruitingCompanysProfile)
                javaLangStringEmployersProfileItemRecruitingCompanysProfile = ("Employers profile:") + (itemRecruitingCompanysProfile);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.myapplication.adapters.CustomBindingAdapterKt.setDateTime(this.mboundView1, itemDeadline);
            com.example.myapplication.adapters.CustomBindingAdapterKt.setIcon(this.mboundView2, itemLogo);
            com.example.myapplication.adapters.CustomBindingAdapterKt.setSalary(this.mboundView3, item);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, javaLangStringEmployersProfileItemRecruitingCompanysProfile);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}