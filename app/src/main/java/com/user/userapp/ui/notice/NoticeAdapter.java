package com.user.userapp.ui.notice;

import android.annotation.SuppressLint;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.user.userapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

import java.util.ArrayList;

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.NoticeViewAdapter> {

    private Context context;
    private ArrayList<NoticeData> list;
    private NoticeViewAdapter holder;
    private int position;

    public NoticeAdapter(Context context, ArrayList<NoticeData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public NoticeViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.newsfeed_item_layout,parent,false);

        return new NoticeViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoticeViewAdapter holder, @SuppressLint("RecyclerView") int position) {

        NoticeData currentItem=list.get(position);
        holder.deleteNoticeTitle.setText(currentItem.getTitle());
        holder.deleteNoticeTitle.setText(currentItem.getTitle());
        holder.date.setText(currentItem.getDate());
        holder.time.setText(currentItem.getTime());






        try {
            if(currentItem.getImage()!=null){
                Glide.with(context).load(currentItem.getImage()).into(holder.deleteNoticeImage);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class NoticeViewAdapter extends RecyclerView.ViewHolder {

        private TextView deleteNoticeTitle,date,time;
        private ImageView deleteNoticeImage;
        public NoticeViewAdapter(@NonNull View itemView) {
            super(itemView);


            deleteNoticeTitle=itemView.findViewById(R.id.deleteNoticeTitle);
            deleteNoticeImage=itemView.findViewById(R.id.deleteNoticeImage);
            date=itemView.findViewById(R.id.date);
            time=itemView.findViewById(R.id.dtime);


        }
    }
}