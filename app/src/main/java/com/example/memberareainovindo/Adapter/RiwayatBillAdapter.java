package com.example.memberareainovindo.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.memberareainovindo.Model.response.bills.DataItem;
import com.example.memberareainovindo.databinding.ListRiwayatBillsBinding;

import java.util.List;

public class RiwayatBillAdapter extends RecyclerView.Adapter<RiwayatBillAdapter.ViewHolder> {
    final List<DataItem> lisItem;

    public RiwayatBillAdapter(List<DataItem> lisItem) {
        this.lisItem = lisItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ListRiwayatBillsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(lisItem.get(position));
        // jika ada item
    }

    @Override
    public int getItemCount() {
        return lisItem.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ListRiwayatBillsBinding binding;

        public ViewHolder(@NonNull ListRiwayatBillsBinding itemView) {
            super(itemView.getRoot());

            // deklarasi variable widget
        }

        public void bindData(DataItem dataItem) {
            binding.txtPNameB.setText(dataItem.getId());

        }
    }
}
