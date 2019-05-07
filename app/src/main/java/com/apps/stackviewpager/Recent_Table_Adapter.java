package com.apps.stackviewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Recent_Table_Adapter extends RecyclerView.Adapter<Recent_Table_Adapter.RecentTableViewHolder> {
//    private String[] mDataset;
//
//    // Provide a reference to the views for each data item
//    // Complex data items may need more than one view per item, and
//    // you provide access to all the views for a data item in a view holder
//    public static class MyViewHolder extends RecyclerView.ViewHolder {
//        public CardView mCardView;
//        public TextView mTextView;
//        public MyViewHolder(View v) {
//            super(v);
//
//            mCardView = (CardView) v.findViewById(R.id.card_view);
//            mTextView = (TextView) v.findViewById(R.id.tv_text);
//        }
//    }
//
//    // Provide a suitable constructor (depends on the kind of dataset)
//    public Recent_Table_Adapter(String[] myDataset) {
//        mDataset = myDataset;
//    }
//
//    // Create new views (invoked by the layout manager)
//    @Override
//    public Recent_Table_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
//                                                     int viewType) {
//        // create a new view
//        View v = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.nit_card_item, parent, false);
//        // set the view's size, margins, paddings and layout parameters
//        MyViewHolder vh = new MyViewHolder(v);
//        return vh;
//    }
//
//    @Override
//    public void onBindViewHolder(MyViewHolder holder, final int position) {
//        holder.mTextView.setText(mDataset[position]);
//        holder.mCardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String currentValue = mDataset[position];
//                Log.d("CardView", "CardView Clicked: " + currentValue);
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return mDataset.length;
//    }
//}

    private List<Recent_Model> mExampleList;

    public Recent_Table_Adapter(List<Recent_Model> modelitem, Context applicationContext) {
        mExampleList = modelitem;
    }

    public static class RecentTableViewHolder extends RecyclerView.ViewHolder {
        TextView tv01, tv11, tv21,
                tv31, tv41, tv51,
                tv61, tv71, tv81,
                tv91, tv101,
                tv111;

        public RecentTableViewHolder(@NonNull View itemView) {
            super(itemView);
            tv01 = itemView.findViewById(R.id.tv01);
            tv11 = itemView.findViewById(R.id.tv11);
            tv21 = itemView.findViewById(R.id.tv21);
            tv31 = itemView.findViewById(R.id.tv31);
            tv41 = itemView.findViewById(R.id.tv41);
            tv51 = itemView.findViewById(R.id.tv51);
            tv61 = itemView.findViewById(R.id.tv61);

            tv71 = itemView.findViewById(R.id.tv71);
            tv81 = itemView.findViewById(R.id.tv81);
            tv91 = itemView.findViewById(R.id.tv91);
            tv101 = itemView.findViewById(R.id.tv101);
            tv111 = itemView.findViewById(R.id.tv111);
        }
    }


    @NonNull
    @Override
    public Recent_Table_Adapter.RecentTableViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.nit_card_item, viewGroup, false);
        RecentTableViewHolder evh = new RecentTableViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull Recent_Table_Adapter.RecentTableViewHolder recentTableViewHolder, int i) {
        Recent_Model model = mExampleList.get(i);
        recentTableViewHolder.tv01.setText(model.getOrganisation_chain());
        recentTableViewHolder.tv11.setText(model.getTender_refrence_number());
        recentTableViewHolder.tv21.setText(model.getTender_id());
        recentTableViewHolder.tv31.setText(model.getTender_fee());
        recentTableViewHolder.tv41.setText(model.getEmd_amount_in());
        recentTableViewHolder.tv51.setText(model.getEmd_exemption_allowed());
        recentTableViewHolder.tv61.setText(model.getWork_description());
        recentTableViewHolder.tv71.setText(model.getTender_value_in());
        recentTableViewHolder.tv81.setText(model.getPeriod_of_work());
        recentTableViewHolder.tv91.setText(model.getPublished_date());
        recentTableViewHolder.tv101.setText(model.getSale_end_date());
        recentTableViewHolder.tv111.setText(model.getNit_document());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


}
