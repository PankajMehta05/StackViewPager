package com.apps.stackviewpager.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.apps.stackviewpager.R;
import com.apps.stackviewpager.Recent_Model;
import com.apps.stackviewpager.Recent_Table_Adapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class NitFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    List<Recent_Model> modelitem;
    private RecyclerView.LayoutManager mLayoutManager;
    private String url = "http://stage.c2a.in/tender/get_tender.php?favourite_ids_by_user=true&unique_id=%2B911111111111";

    public NitFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.frag_nit, container, false);


        modelitem = new ArrayList<>();
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray array = jsonObject.getJSONArray("data");

                    for (int i = 0; i < array.length(); i++) {
                        JSONObject o = array.getJSONObject(i);
                        Recent_Model model = new Recent_Model
                                (o.getString("organisation_chain"),
                                        o.getString("tender_reference_no"),
                                        o.getString("tender_id"),

                                        o.getString("tender_fee_in"),
                                        o.getString("emd_amount_in"),
                                        o.getString("emd_exemption_allowed"),

                                        o.getString("work_description"),
                                        o.getString("tender_value_in"),
                                        o.getString("period_of_workdays"),

                                        o.getString("published_date"),
                                        o.getString("document_download_sale_end_date"),
                                        o.getString("tender_pdf")

                                );

                        modelitem.add(model);


                    }

                    mRecyclerView = rootView.findViewById(R.id.rv_recycler_view);
                    mRecyclerView.setHasFixedSize(true);

                    mLayoutManager = new LinearLayoutManager(getActivity());

                    mAdapter=new Recent_Table_Adapter(modelitem,getActivity());
                    mRecyclerView.setLayoutManager(mLayoutManager);
                    mRecyclerView.setAdapter(mAdapter);


                } catch (JSONException e1) {
                    e1.printStackTrace();
                }

            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley", error.toString());

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        requestQueue.add(stringRequest);
        Log.d("prq", "xyz");



//        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
//        rv.setHasFixedSize(true);
//     //   Recent_Table_Adapter adapter = new Recent_Table_Adapter(new String[]{"test one", "test two", "test three", "test four", "test five" , "test six" , "test seven"});
//      //  rv.setAdapter(adapter);
//
//        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
//        rv.setLayoutManager(llm);

        return rootView;
    }

}