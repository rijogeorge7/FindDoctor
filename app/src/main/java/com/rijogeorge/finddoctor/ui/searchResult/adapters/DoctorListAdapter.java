package com.rijogeorge.finddoctor.ui.searchResult.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rijogeorge.finddoctor.R;
import com.rijogeorge.network.model.Profile;

import java.util.List;

public class DoctorListAdapter extends RecyclerView.Adapter<DoctorListAdapter.ViewHolder> {
    List<Profile> profiles;
    public DoctorListAdapter(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.doctor_list_raw, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(profiles.get(position).getSlug());
        holder.title.setText(profiles.get(position).getTitle());
        holder.gender.setText(profiles.get(position).getGender());
        Glide.with(holder.profilePic)
                .load(profiles.get(position).getImage_url())
                .into(holder.profilePic);
    }

    @Override
    public int getItemCount() {
        if(profiles != null)
            return profiles.size();
        return 0;
    }

    public void updateProfiles(List<Profile> profiles) {
        this.profiles = profiles;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profilePic;
        TextView name, title, gender;
        public ViewHolder(View itemView) {
            super(itemView);
            profilePic = itemView.findViewById(R.id.profilePic);
            name = itemView.findViewById(R.id.name);
            title = itemView.findViewById(R.id.title);
            gender = itemView.findViewById(R.id.gender);
        }
    }
}
