package com.example.cobauts1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cobauts1.R;
import com.example.cobauts1.models.Transaction;

import java.util.List;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder> {
    public interface OnItemTransactionListener {
        void onTransactionClicked(int index, Transaction item);
    }

    private List<Transaction> items;
    private OnItemTransactionListener listener;

    public TransactionAdapter(List<Transaction> items, OnItemTransactionListener listener) {
        this.items = items;
        this.listener = listener;
    }
//
//    public void refresh(List<Transaction> items){
//        if (this.items.size() != 0){
//            this.items.clear();
//        }
//        this.items = items;
//        notifyDataSetChanged();
//    }

    @NonNull
    @Override
    public TransactionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_join_class, parent, false);
        return new ViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.ViewHolder holder, int position) {
        Transaction item = items.get(position);
        holder.bind(position, item);
    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView classSchedule;
        TextView day;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            classSchedule = itemView.findViewById(R.id.text_classSch);
            day = itemView.findViewById(R.id.text_day);
        }

        public void bind(final int index, final Transaction item){
            classSchedule.setText(item.getClassSchedule());
            day.setText(item.getDay());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onTransactionClicked(index, item);
                }
            });
        }
    }

}
