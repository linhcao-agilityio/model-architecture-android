package com.example.linhcao.demomvvmarchitecturecomponent.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.linhcao.demomvvmarchitecturecomponent.R;
import com.example.linhcao.demomvvmarchitecturecomponent.entities.Issue;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.Holder> {


    private final LayoutInflater mInflator;
    private List<Issue> mIssueList;

    public DataAdapter(LayoutInflater inflator) {
        mInflator = inflator;
        mIssueList = new ArrayList<>();
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Holder(mInflator.inflate(R.layout.issue_row, parent, false));
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.mTxtTitle.setText(mIssueList.get(position).getTitle());
        String id = mIssueList.get(position).getNumber().toString();
        holder.mTxtId.setText(id);
        holder.mTxtViewCreator.setText(mIssueList.get(position).getUser().getLogin());
    }

    @Override
    public int getItemCount() {
        return mIssueList.size();
    }

    public void addIssues(List<Issue> issues) {
        mIssueList.clear();
        mIssueList.addAll(issues);
        notifyDataSetChanged();
    }

    public void clearIssues() {
        mIssueList.clear();
        notifyDataSetChanged();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView mTxtTitle;
        TextView mTxtId;
        TextView mTxtViewCreator;

        public Holder(View view) {
            super(view);
            mTxtTitle = (TextView) view.findViewById(R.id.title);
            mTxtId = (TextView) view.findViewById(R.id.issue_id);
            mTxtViewCreator = (TextView) view.findViewById(R.id.creator_name);
        }
    }
}
